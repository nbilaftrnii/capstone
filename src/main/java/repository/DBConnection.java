package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Koneksi database aplikasi. Kredensial dapat diatur melalui environment variable. */
public final class DBConnection {
    private static final String URL = System.getenv().getOrDefault("ARGOPORT_DB_URL", "jdbc:mysql://localhost:3306/argoport_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Makassar");
    private static final String DB_USER = System.getenv().getOrDefault("ARGOPORT_DB_USER", "root");
    private static final String DB_PASSWORD = System.getenv().getOrDefault("ARGOPORT_DB_PASSWORD", "");
    private static String activeUsername;
    private static String activeRole;
    private DBConnection() {}
    public static synchronized Connection authenticate(String username, String password) throws SQLException {
        Connection c = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
        activeUsername = username;
        return c;
    }
    public static synchronized Connection getConnection() throws SQLException {
        if (activeUsername == null) throw new SQLException("Sesi login belum aktif. Silakan login kembali.");
        return DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
    }
    public static synchronized void setActiveRole(String role) { activeRole = role; }
    public static synchronized String getActiveUsername() { return activeUsername; }
    public static synchronized boolean isAdminSession() { return "Admin".equalsIgnoreCase(activeRole); }
    public static synchronized void logout() { activeUsername = null; activeRole = null; }
}
