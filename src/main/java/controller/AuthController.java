package controller;

import model.Pengguna;
import repository.DBConnection;
import java.sql.*;
import java.security.SecureRandom;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.util.Base64;

/** Autentikasi akun aplikasi (bukan akun MySQL per pengguna). */
public class AuthController {
    private static final int ITERATIONS = 120000;
    private static final int MAX_GAGAL = 3;
    private static long blockedUntil = 0L;
    private static int loginFailCount = 0;

    public Pengguna login(String username, String password) throws Exception {
        long now=System.currentTimeMillis();
        if (now < blockedUntil) throw new Exception("Login diblokir sementara. Coba lagi dalam " + ((blockedUntil-now+999)/1000) + " detik.");
        try (Connection c=DBConnection.authenticate(username,password);
             PreparedStatement ps=c.prepareStatement("SELECT id_akun,nama_lengkap,username,password_hash,salt,peran,status_akun FROM akun_aplikasi WHERE username=?")) {
            ps.setString(1,username);
            try(ResultSet rs=ps.executeQuery()) {
                if(!rs.next() || !"Aktif".equalsIgnoreCase(rs.getString("status_akun")) || !verify(password,rs.getString("salt"),rs.getString("password_hash"))) {
                    DBConnection.logout (); loginFailCount++;
                    if(loginFailCount>=MAX_GAGAL){blockedUntil=System.currentTimeMillis()+60000;loginFailCount=0;throw new Exception("Terlalu banyak percobaan. Coba lagi dalam 60 detik.");}
                    throw new Exception("Username atau password salah.");
                }
                loginFailCount=0; blockedUntil=0;
                String role=rs.getString("peran"); DBConnection.setActiveSession(username, role);
                return new Pengguna(String.valueOf(rs.getInt("id_akun")),rs.getString("nama_lengkap"),username,"",role);
            }
        } catch(SQLException ex) { DBConnection.logout(); throw new Exception("Database tidak dapat diakses. Pastikan MySQL aktif, migrasi akun sudah dijalankan, dan konfigurasi database benar. Detail: "+ex.getMessage()); }
    }

    public void register(String nama,String username,String password) throws Exception {
        if(nama==null||nama.trim().length()<3) throw new Exception("Nama lengkap minimal 3 karakter.");
        if(username==null||!username.matches("[A-Za-z0-9._-]{4,30}")) throw new Exception("Username 4-30 karakter (huruf, angka, titik, _ atau -).");
        if(password==null||password.length()<8) throw new Exception("Password minimal 8 karakter.");
        byte[] salt=new byte[16]; new SecureRandom().nextBytes(salt);
        String salt64=Base64.getEncoder().encodeToString(salt), hash=hash(password,salt64);
        try(Connection c=DriverManager.getConnection(System.getenv().getOrDefault("ARGOPORT_DB_URL","jdbc:mysql://localhost:3306/argoport_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Makassar"),System.getenv().getOrDefault("ARGOPORT_DB_USER","root"),System.getenv().getOrDefault("ARGOPORT_DB_PASSWORD",""));
            PreparedStatement ps=c.prepareStatement("INSERT INTO akun_aplikasi(nama_lengkap,username,password_hash,salt,peran,status_akun) VALUES(?,?,?,?,'Operator','Aktif')")) {
            ps.setString(1,nama.trim()); ps.setString(2,username.trim()); ps.setString(3,hash); ps.setString(4,salt64); ps.executeUpdate();
        } catch(SQLException ex) { if(ex.getErrorCode()==1062) throw new Exception("Username sudah digunakan. Pilih username lain."); throw new Exception("Registrasi gagal: "+ex.getMessage()); }
    }
    private static String hash(String password,String salt64) throws Exception {
        byte[] salt=Base64.getDecoder().decode(salt64); PBEKeySpec spec=new PBEKeySpec(password.toCharArray(),salt,ITERATIONS,256);
        byte[] out=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).getEncoded(); spec.clearPassword(); return Base64.getEncoder().encodeToString(out);
    }
    private static boolean verify(String password,String salt,String expected) throws Exception { return java.security.MessageDigest.isEqual(hash(password,salt).getBytes(java.nio.charset.StandardCharsets.UTF_8),expected.getBytes(java.nio.charset.StandardCharsets.UTF_8)); }
}
