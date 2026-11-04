package model;

public class Pengguna {
    private String idPengguna;
    private String nama;
    private String username;
    private String password;
    private String peran;

    public Pengguna(String idPengguna, String nama, String username, String password, String peran) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.peran = peran;
    }

    public String getIdPengguna() { return idPengguna; }
    public String getNama() { return nama; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPeran() { return peran; }
    public void setPassword(String password) { this.password = password; }
}