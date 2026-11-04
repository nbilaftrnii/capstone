package model;

public class Retribusi {
    private String idRetribusi;
    private double totalBiaya;
    private double tarif;
    private String tanggalBayar;
    private String statusBayar;
    private String idAdmin;
    private String idKapal;

    public Retribusi(String idRetribusi, double totalBiaya, double tarif, String tanggalBayar, String statusBayar, String idAdmin, String idKapal) {
        this.idRetribusi = idRetribusi;
        this.totalBiaya = totalBiaya;
        this.tarif = tarif;
        this.tanggalBayar = tanggalBayar;
        this.statusBayar = statusBayar;
        this.idAdmin = idAdmin;
        this.idKapal = idKapal;
    }

    public String getIdRetribusi() { return idRetribusi; }
    public double getTotalBiaya() { return totalBiaya; }
    public double getTarif() { return tarif; }
    public String getTanggalBayar() { return tanggalBayar; }
    public String getStatusBayar() { return statusBayar; }
    public String getIdAdmin() { return idAdmin; }
    public String getIdKapal() { return idKapal; }
}