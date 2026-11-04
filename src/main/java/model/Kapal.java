package model;

public class Kapal {
    private String idKapal;
    private String namaKapal;
    private String jenisKapal;
    private double grossTonnage;
    private double drafKapal;
    private String statusKapal;
    private String waktuKedatangan;

    public Kapal(String idKapal, String namaKapal, String jenisKapal, double grossTonnage, double drafKapal, String statusKapal, String waktuKedatangan) {
        this.idKapal = idKapal;
        this.namaKapal = namaKapal;
        this.jenisKapal = jenisKapal;
        this.grossTonnage = grossTonnage;
        this.drafKapal = drafKapal;
        this.statusKapal = statusKapal;
        this.waktuKedatangan = waktuKedatangan;
    }

    public String getIdKapal() { return idKapal; }
    public String getNamaKapal() { return namaKapal; }
    public String getJenisKapal() { return jenisKapal; }
    public double getGrossTonnage() { return grossTonnage; }
    public double getDrafKapal() { return drafKapal; }
    public String getStatusKapal() { return statusKapal; }
    public String getWaktuKedatangan() { return waktuKedatangan; }
    public void setStatusKapal(String statusKapal) { this.statusKapal = statusKapal; }
}