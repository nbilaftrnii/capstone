package model;

public class SlotGudang {
    private String idSlot;
    private String kodeBlok;
    private double kapasitasM3;
    private String statusSlot;
    private String idOperator;

    public SlotGudang(String idSlot, String kodeBlok, double kapasitasM3, String statusSlot, String idOperator) {
        this.idSlot = idSlot;
        this.kodeBlok = kodeBlok;
        this.kapasitasM3 = kapasitasM3;
        this.statusSlot = statusSlot;
        this.idOperator = idOperator;
    }

    public String getIdSlot() { return idSlot; }
    public String getKodeBlok() { return kodeBlok; }
    public double getKapasitasM3() { return kapasitasM3; }
    public String getStatusSlot() { return statusSlot; }
    public String getIdOperator() { return idOperator; }
    public void setStatusSlot(String statusSlot) { this.statusSlot = statusSlot; }
}