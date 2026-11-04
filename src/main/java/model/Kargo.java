package model;

public class Kargo {
    private String idKargo;
    private String namaBarang;
    private double beratTon;
    private String statusKargo;
    private String idKapal;
    private String idSlot;

    public Kargo(String idKargo, String namaBarang, double beratTon, String statusKargo, String idKapal, String idSlot) {
        this.idKargo = idKargo;
        this.namaBarang = namaBarang;
        this.beratTon = beratTon;
        this.statusKargo = statusKargo;
        this.idKapal = idKapal;
        this.idSlot = idSlot;
    }

    public String getIdKargo() { return idKargo; }
    public String getNamaBarang() { return namaBarang; }
    public double getBeratTon() { return beratTon; }
    public String getStatusKargo() { return statusKargo; }
    public String getIdKapal() { return idKapal; }
    public String getIdSlot() { return idSlot; }
}