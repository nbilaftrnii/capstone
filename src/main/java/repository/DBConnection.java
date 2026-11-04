
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Koneksi database aplikasi. */
public final class DBConnection {

    private static final String URL = System.getenv().getOrDefault(
        "ARGOPORT_DB_URL",
        "jdbc:mysql://localhost:3306/argoport_db"
    );

    private static final String DB_USER =
        System.getenv().getOrDefault("ARGOPORT_DB_USER", "root");

    private static final String DB_PASSWORD =
        System.getenv().getOrDefault("ARGOPORT_DB_PASSWORD", "");

    private static String activeUsername;
    private static String activeRole;

    private DBConnection() {}

    // Membuka koneksi database sebelum autentikasi aplikasi.
    public static Connection openConnection() throws SQLException {
        return DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
    }

    // Dipakai saat proses login.
    // Tidak mengaktifkan sesi sebelum password terverifikasi.
    public static Connection authenticate(String username, String password)
            throws SQLException {
        return openConnection();
    }

    // Koneksi untuk proses setelah login berhasil.
    public static synchronized Connection getConnection()
            throws SQLException {

        if (activeUsername == null) {
            throw new SQLException(
                "Sesi login belum aktif. Silakan login kembali."
            );
        }

        return openConnection();
    }

    // Mengaktifkan sesi setelah login berhasil.
    public static synchronized void setActiveSession(
            String username, String role) {

        activeUsername = username;
        activeRole = role;
    }

    public static synchronized void setActiveRole(String role) {
        activeRole = role;
    }

    public static synchronized String getActiveUsername() {
        return activeUsername;
    }

    public static synchronized boolean isAdminSession() {
        return "Admin".equalsIgnoreCase(activeRole);
    }

    public static synchronized void logout() {
        activeUsername = null;
        activeRole = null;
    }
}
