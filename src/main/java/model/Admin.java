package model;

public class Admin extends Pengguna {
    private String nip;

    public Admin(String idPengguna, String nama, String username, String password, String nip) {
        super(idPengguna, nama, username, password, "Admin");
        this.nip = nip;
    }

    public String getNip() { return nip; }
}