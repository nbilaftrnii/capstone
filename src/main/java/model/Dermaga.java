package model;

public class Dermaga {
    private String idDermaga;
    private String namaDermaga;
    private double kapasitasMaksimal;
    private String statusDermaga;

    public Dermaga(String idDermaga, String namaDermaga, double kapasitasMaksimal, String statusDermaga) {
        this.idDermaga = idDermaga;
        this.namaDermaga = namaDermaga;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.statusDermaga = statusDermaga;
    }

    public String getIdDermaga() { return idDermaga; }
    public String getNamaDermaga() { return namaDermaga; }
    public double getKapasitasMaksimal() { return kapasitasMaksimal; }
    public String getStatusDermaga() { return statusDermaga; }
    public void setStatusDermaga(String statusDermaga) { this.statusDermaga = statusDermaga; }
}