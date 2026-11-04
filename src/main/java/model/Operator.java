package model;

public class Operator extends Pengguna {
    private String divisi;

    public Operator(String idPengguna, String nama, String username, String password, String divisi) {
        super(idPengguna, nama, username, password, "Operator");
        this.divisi = divisi;
    }

    public String getDivisi() { return divisi; }
}