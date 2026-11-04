package controller;

import config.DBConnection;
import config.SlotRepository;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Logika menu Admin sesuai flowchart: dermaga, slot gudang, tarif, billing, akun operator, laporan. */
public class AdminController {

    private static String fmt(Timestamp t) { return t == null ? "-" : t.toLocalDateTime().toString().replace('T', ' '); }

    // ===================== Kelola Dermaga =====================
    public List<Object[]> getDaftarDermaga() throws SQLException {
        List<Object[]> out = new ArrayList<>();
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "SELECT id_dermaga,nama_dermaga,kapasitas_maksimal,status_dermaga FROM dermaga ORDER BY id_dermaga");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) out.add(new Object[]{rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4)});
        }
        return out;
    }

    public void tambahDermaga(String kode, String nama, double kapasitasTon) throws Exception {
        if (kode == null || kode.isBlank() || nama == null || nama.isBlank() || kapasitasTon <= 0)
            throw new Exception("Data tidak valid! Kode, nama, dan kapasitas (> 0) wajib diisi.");
        if (kode.trim().length() > 10) throw new Exception("Data tidak valid! Kode dermaga maksimal 10 karakter.");
        try (Connection c = DBConnection.getConnection()) {
            try (PreparedStatement ps = c.prepareStatement("SELECT 1 FROM dermaga WHERE id_dermaga=?")) {
                ps.setString(1, kode.trim());
                try (ResultSet rs = ps.executeQuery()) { if (rs.next()) throw new Exception("Data tidak valid! Kode dermaga sudah dipakai."); }
            }
            try (PreparedStatement ps = c.prepareStatement(
                    "INSERT INTO dermaga(id_dermaga,nama_dermaga,status_dermaga,kapasitas_maksimal) VALUES(?,?,'Tersedia',?)")) {
                ps.setString(1, kode.trim()); ps.setString(2, nama.trim()); ps.setDouble(3, kapasitasTon); ps.executeUpdate();
            }
        }
    }

    public void ubahDermaga(String id, String namaBaru, double kapasitasBaru) throws Exception {
        if (id == null || id.isBlank()) throw new Exception("Pilih dermaga terlebih dahulu.");
        if (namaBaru == null || namaBaru.isBlank() || kapasitasBaru <= 0) throw new Exception("Data tidak valid!");
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "UPDATE dermaga SET nama_dermaga=?,kapasitas_maksimal=? WHERE id_dermaga=?")) {
            ps.setString(1, namaBaru.trim()); ps.setDouble(2, kapasitasBaru); ps.setString(3, id);
            if (ps.executeUpdate() == 0) throw new Exception("Dermaga tidak ditemukan.");
        }
    }

    /** Use case "Ubah Status Dermaga": Tersedia / Terisi / Perbaikan. Tidak boleh bertentangan dengan kapal yang sedang sandar. */
    public void ubahStatusDermaga(String id, String status) throws Exception {
        if (id == null || id.isBlank()) throw new Exception("Pilih dermaga terlebih dahulu.");
        if (!List.of("Tersedia", "Terisi", "Perbaikan").contains(status)) throw new Exception("Status dermaga tidak valid.");
        try (Connection c = DBConnection.getConnection()) {
            if (dipakaiKapal(c, id) && !"Terisi".equals(status))
                throw new Exception("Dermaga masih dipakai kapal, status tidak dapat diubah menjadi " + status + ".");
            try (PreparedStatement ps = c.prepareStatement("UPDATE dermaga SET status_dermaga=? WHERE id_dermaga=?")) {
                ps.setString(1, status); ps.setString(2, id);
                if (ps.executeUpdate() == 0) throw new Exception("Dermaga tidak ditemukan.");
            }
        }
    }

    private boolean dipakaiKapal(Connection c, String idDermaga) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement(
                "SELECT COUNT(*) FROM jadwal_sandar j JOIN kapal k ON k.id_kapal=j.Kapal_id_kapal " +
                "WHERE j.Dermaga_id_dermaga=? AND j.waktu_lepas IS NULL AND k.status_kapal='Sandar'")) {
            ps.setString(1, idDermaga);
            try (ResultSet rs = ps.executeQuery()) { rs.next(); return rs.getInt(1) > 0; }
        }
    }

    /** Flowchart: cek dermaga tidak sedang dipakai kapal; bila kosong baru dihapus. */
    public void hapusDermaga(String id) throws Exception {
        if (id == null || id.isBlank()) throw new Exception("Pilih dermaga terlebih dahulu.");
        try (Connection c = DBConnection.getConnection()) {
            String status;
            try (PreparedStatement ps = c.prepareStatement("SELECT status_dermaga FROM dermaga WHERE id_dermaga=?")) {
                ps.setString(1, id);
                try (ResultSet rs = ps.executeQuery()) { if (!rs.next()) throw new Exception("Dermaga tidak ditemukan."); status = rs.getString(1); }
            }
            if (dipakaiKapal(c, id) || "Terisi".equalsIgnoreCase(status)) throw new Exception("Dermaga Masih Dipakai Kapal!");
            try (PreparedStatement ps = c.prepareStatement("DELETE FROM dermaga WHERE id_dermaga=?")) {
                ps.setString(1, id); ps.executeUpdate();
            } catch (SQLIntegrityConstraintViolationException ex) {
                throw new Exception("Dermaga memiliki riwayat jadwal sandar sehingga tidak dapat dihapus.");
            }
        }
    }

    // ===================== Kelola Slot Gudang =====================
    public List<Object[]> getDaftarSlot() throws SQLException {
        List<Object[]> out = new ArrayList<>();
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "SELECT id_slot,kode_blok,kapasitas_volume_m3,sisa_volume_m3,status_slot,Operator_id_pengguna FROM slot_gudang ORDER BY id_slot");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) out.add(new Object[]{rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getString(5), rs.getString(6)});
        }
        return out;
    }

    public void tambahSlotGudang(String kodeBlok, double kapasitasM3, String idOperator) throws Exception {
        if (kodeBlok == null || kodeBlok.isBlank() || kapasitasM3 <= 0) throw new Exception("Data tidak valid!");
        if (idOperator == null || idOperator.isBlank()) throw new Exception("ID operator penanggung jawab wajib diisi.");
        try (Connection c = DBConnection.getConnection()) {
            try (PreparedStatement ps = c.prepareStatement("SELECT 1 FROM operator WHERE id_pengguna=?")) {
                ps.setString(1, idOperator.trim());
                try (ResultSet rs = ps.executeQuery()) { if (!rs.next()) throw new Exception("Data tidak valid! ID operator tidak ditemukan."); }
            }
            try (PreparedStatement ps = c.prepareStatement("SELECT 1 FROM slot_gudang WHERE kode_blok=?")) {
                ps.setString(1, kodeBlok.trim());
                try (ResultSet rs = ps.executeQuery()) { if (rs.next()) throw new Exception("Data tidak valid! Kode blok sudah dipakai."); }
            }
            String id = SlotRepository.idBerikutnya(c, "slot_gudang", "id_slot", "SG", 2);
            try (PreparedStatement ps = c.prepareStatement(
                    "INSERT INTO slot_gudang(id_slot,kode_blok,status_slot,Operator_id_pengguna,kapasitas_volume_m3,sisa_volume_m3) VALUES(?,?,'Kosong',?,?,?)")) {
                ps.setString(1, id); ps.setString(2, kodeBlok.trim()); ps.setString(3, idOperator.trim());
                ps.setDouble(4, kapasitasM3); ps.setDouble(5, kapasitasM3); ps.executeUpdate();
            }
        }
    }

    public void ubahKapasitasSlot(String idSlot, double kapasitasBaru) throws Exception {
        if (idSlot == null || idSlot.isBlank()) throw new Exception("Pilih slot gudang terlebih dahulu.");
        if (kapasitasBaru <= 0) throw new Exception("Data tidak valid! Kapasitas harus lebih dari 0.");
        try (Connection c = DBConnection.getConnection()) {
            c.setAutoCommit(false);
            try {
                double terpakai;
                try (PreparedStatement ps = c.prepareStatement(
                        "SELECT COALESCE(SUM(volume_m3),0) FROM kargo WHERE Slot_Gudang_id_slot=?")) {
                    ps.setString(1, idSlot);
                    try (ResultSet rs = ps.executeQuery()) { rs.next(); terpakai = rs.getDouble(1); }
                }
                if (kapasitasBaru < terpakai) throw new Exception("Data tidak valid! Kapasitas baru lebih kecil dari volume terpakai (" + terpakai + " m3).");
                try (PreparedStatement ps = c.prepareStatement("UPDATE slot_gudang SET kapasitas_volume_m3=? WHERE id_slot=?")) {
                    ps.setDouble(1, kapasitasBaru); ps.setString(2, idSlot);
                    if (ps.executeUpdate() == 0) throw new Exception("Slot gudang tidak ditemukan.");
                }
                SlotRepository.hitungUlang(c, idSlot);
                c.commit();
            } catch (Exception ex) { c.rollback(); throw ex; } finally { c.setAutoCommit(true); }
        }
    }

    public void hapusSlotGudang(String idSlot) throws Exception {
        if (idSlot == null || idSlot.isBlank()) throw new Exception("Pilih slot gudang terlebih dahulu.");
        try (Connection c = DBConnection.getConnection()) {
            try (PreparedStatement ps = c.prepareStatement("SELECT COUNT(*) FROM kargo WHERE Slot_Gudang_id_slot=?")) {
                ps.setString(1, idSlot);
                try (ResultSet rs = ps.executeQuery()) { rs.next(); if (rs.getInt(1) > 0) throw new Exception("Slot Gudang Masih Berisi Kargo!"); }
            }
            try (PreparedStatement ps = c.prepareStatement("DELETE FROM slot_gudang WHERE id_slot=?")) {
                ps.setString(1, idSlot);
                if (ps.executeUpdate() == 0) throw new Exception("Slot gudang tidak ditemukan.");
            }
        }
    }

    // ===================== Kelola Tarif Retribusi =====================
    /** @return {tarif tambat per hari, tarif muatan per ton} */
    public double[] getTarif() throws SQLException {
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "SELECT tarif_tambat_per_hari,tarif_muatan_per_ton FROM tarif_pelabuhan WHERE id_tarif=1");
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return new double[]{rs.getDouble(1), rs.getDouble(2)};
        }
        return new double[]{500000.0, 15000.0};
    }

    public void updateTarif(double tarifTambat, double tarifMuatan) throws Exception {
        if (tarifTambat <= 0 || tarifMuatan <= 0) throw new Exception("Input Tarif Tidak Valid! Tarif harus lebih dari 0.");
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "INSERT INTO tarif_pelabuhan(id_tarif,tarif_tambat_per_hari,tarif_muatan_per_ton) VALUES(1,?,?) " +
                "ON DUPLICATE KEY UPDATE tarif_tambat_per_hari=VALUES(tarif_tambat_per_hari),tarif_muatan_per_ton=VALUES(tarif_muatan_per_ton)")) {
            ps.setDouble(1, tarifTambat); ps.setDouble(2, tarifMuatan); ps.executeUpdate();
        }
    }

    // ===================== Billing & Pembayaran =====================
    public static final class Tagihan {
        public double tonKargo, tarifMuatan, tarifTambat, total;
        public long hariTambat;
        public String statusBayar = "Belum Ditagih";
        public String idRetribusi;

        public String rincian() {
            return String.format("Muatan : %,.2f ton x Rp %,.2f = Rp %,.2f%nTambat : %d hari x Rp %,.2f = Rp %,.2f%n%nTOTAL  : Rp %,.2f%nStatus : %s",
                    tonKargo, tarifMuatan, tonKargo * tarifMuatan, hariTambat, tarifTambat, hariTambat * tarifTambat, total, statusBayar);
        }
    }

    /** Kapal yang sedang sandar: id, nama, jenis, status bayar. */
    public List<Object[]> getKapalSandar() throws Exception {
        List<Object[]> out = new ArrayList<>();
        List<String[]> kapal = new ArrayList<>();
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "SELECT id_kapal,nama_kapal,status_kapal FROM kapal WHERE status_kapal='Sandar' ORDER BY id_kapal");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) kapal.add(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
        }
        try (Connection c = DBConnection.getConnection()) {
            for (String[] k : kapal) {
                Tagihan t = hitungRincian(c, k[0]);
                out.add(new Object[]{k[0], k[1], k[2], t.statusBayar, String.format("%,.2f", t.total)});
            }
        }
        return out;
    }

    /** Rincian otomatis: (Ton Kargo x Tarif Muatan) + (Hari Tambat x Tarif Tambat). */
    public Tagihan hitungRincian(String idKapal) throws Exception {
        try (Connection c = DBConnection.getConnection()) { return hitungRincian(c, idKapal); }
    }

    private Tagihan hitungRincian(Connection c, String idKapal) throws SQLException {
        Tagihan t = new Tagihan();
        double[] tarif = {500000.0, 15000.0};
        try (PreparedStatement ps = c.prepareStatement("SELECT tarif_tambat_per_hari,tarif_muatan_per_ton FROM tarif_pelabuhan WHERE id_tarif=1");
             ResultSet rs = ps.executeQuery()) { if (rs.next()) { tarif[0] = rs.getDouble(1); tarif[1] = rs.getDouble(2); } }
        t.tarifTambat = tarif[0]; t.tarifMuatan = tarif[1];
        try (PreparedStatement ps = c.prepareStatement("SELECT COALESCE(SUM(berat_ton),0) FROM kargo WHERE Kapal_id_kapal=?")) {
            ps.setString(1, idKapal);
            try (ResultSet rs = ps.executeQuery()) { rs.next(); t.tonKargo = rs.getDouble(1); }
        }
        Timestamp sandar = null;
        try (PreparedStatement ps = c.prepareStatement(
                "SELECT waktu_sandar,GREATEST(1,DATEDIFF(COALESCE(waktu_lepas,NOW()),waktu_sandar)) FROM jadwal_sandar " +
                "WHERE Kapal_id_kapal=? ORDER BY waktu_sandar DESC LIMIT 1")) {
            ps.setString(1, idKapal);
            try (ResultSet rs = ps.executeQuery()) { if (rs.next()) { sandar = rs.getTimestamp(1); t.hariTambat = rs.getLong(2); } else t.hariTambat = 1; }
        }
        t.total = t.tonKargo * t.tarifMuatan + t.hariTambat * t.tarifTambat;
        // Status bayar untuk masa sandar saat ini: retribusi terakhir pada/ setelah tanggal sandar.
        String sql = "SELECT id_retribusi,status_bayar FROM retribusi WHERE Kapal_id_kapal=? " +
                (sandar != null ? "AND (tanggal_bayar IS NULL OR tanggal_bayar>=?) " : "") + "ORDER BY id_retribusi DESC LIMIT 1";
        try (PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, idKapal);
            if (sandar != null) ps.setDate(2, new java.sql.Date(sandar.getTime()));
            try (ResultSet rs = ps.executeQuery()) { if (rs.next()) { t.idRetribusi = rs.getString(1); t.statusBayar = rs.getString(2); } }
        }
        return t;
    }

    /**
     * Flowchart Billing. lunas=true: proses transaksi (retribusi Lunas, kapal Berlayar, dermaga Tersedia).
     * lunas=false: status pembayaran dicatat Belum Lunas. Semua perubahan atomik; gagal -> rollback.
     */
    public void prosesPembayaran(String idKapal, String idAdmin, boolean lunas) throws Exception {
        if (idKapal == null || idKapal.isBlank()) throw new Exception("Pilih kapal terlebih dahulu.");
        try (Connection c = DBConnection.getConnection()) {
            c.setAutoCommit(false);
            try {
                try (PreparedStatement ps = c.prepareStatement("SELECT status_kapal FROM kapal WHERE id_kapal=? FOR UPDATE")) {
                    ps.setString(1, idKapal);
                    try (ResultSet rs = ps.executeQuery()) { if (!rs.next() || !"Sandar".equalsIgnoreCase(rs.getString(1))) throw new Exception("Kapal tidak sedang sandar."); }
                }
                Tagihan t = hitungRincian(c, idKapal);
                if ("Lunas".equalsIgnoreCase(t.statusBayar)) throw new Exception("Retribusi kapal ini sudah lunas.");
                String status = lunas ? "Lunas" : "Belum Lunas";
                if (t.idRetribusi != null) {
                    try (PreparedStatement ps = c.prepareStatement(
                            "UPDATE retribusi SET total_biaya=?,tarif=?,tanggal_bayar=?,status_bayar=?,Admin_id_pengguna=? WHERE id_retribusi=?")) {
                        ps.setDouble(1, t.total); ps.setDouble(2, t.tarifTambat);
                        if (lunas) ps.setDate(3, java.sql.Date.valueOf(LocalDate.now())); else ps.setNull(3, Types.DATE);
                        ps.setString(4, status); ps.setString(5, idAdmin); ps.setString(6, t.idRetribusi); ps.executeUpdate();
                    }
                } else {
                    String id = SlotRepository.idBerikutnya(c, "retribusi", "id_retribusi", "R", 3);
                    try (PreparedStatement ps = c.prepareStatement(
                            "INSERT INTO retribusi(id_retribusi,total_biaya,tarif,tanggal_bayar,status_bayar,Admin_id_pengguna,Kapal_id_kapal) VALUES(?,?,?,?,?,?,?)")) {
                        ps.setString(1, id); ps.setDouble(2, t.total); ps.setDouble(3, t.tarifTambat);
                        if (lunas) ps.setDate(4, java.sql.Date.valueOf(LocalDate.now())); else ps.setNull(4, Types.DATE);
                        ps.setString(5, status); ps.setString(6, idAdmin); ps.setString(7, idKapal); ps.executeUpdate();
                    }
                }
                if (lunas) {
                    String dermaga = null;
                    try (PreparedStatement ps = c.prepareStatement(
                            "SELECT id_jadwal,Dermaga_id_dermaga FROM jadwal_sandar WHERE Kapal_id_kapal=? AND waktu_lepas IS NULL ORDER BY waktu_sandar DESC LIMIT 1")) {
                        ps.setString(1, idKapal);
                        try (ResultSet rs = ps.executeQuery()) {
                            if (rs.next()) {
                                dermaga = rs.getString(2);
                                try (PreparedStatement up = c.prepareStatement("UPDATE jadwal_sandar SET waktu_lepas=NOW() WHERE id_jadwal=?")) {
                                    up.setString(1, rs.getString(1)); up.executeUpdate();
                                }
                            }
                        }
                    }
                    try (PreparedStatement ps = c.prepareStatement("UPDATE kapal SET status_kapal='Berlayar' WHERE id_kapal=?")) { ps.setString(1, idKapal); ps.executeUpdate(); }
                    if (dermaga != null) {
                        try (PreparedStatement ps = c.prepareStatement("UPDATE dermaga SET status_dermaga='Tersedia' WHERE id_dermaga=? AND status_dermaga='Terisi'")) {
                            ps.setString(1, dermaga); ps.executeUpdate();
                        }
                    }
                }
                c.commit();
            } catch (Exception ex) {
                c.rollback();
                throw new Exception("Transaksi Gagal, Data Dikembalikan ke Kondisi Semula! (" + ex.getMessage() + ")");
            } finally { c.setAutoCommit(true); }
        }
    }

    // ===================== Kelola Akun Operator =====================
    public List<Object[]> getDaftarOperator() throws SQLException {
        List<Object[]> out = new ArrayList<>();
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(
                "SELECT p.id_pengguna,p.nama,o.divisi FROM pengguna p JOIN operator o ON o.id_pengguna=p.id_pengguna ORDER BY p.id_pengguna");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) out.add(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
        }
        return out;
    }

    /** Flowchart: periksa apakah akun masih memiliki transaksi terkait (slot gudang) sebelum dihapus. */
    public void hapusAkunOperator(String idPengguna) throws Exception {
        if (idPengguna == null || idPengguna.isBlank()) throw new Exception("Pilih akun operator terlebih dahulu.");
        try (Connection c = DBConnection.getConnection()) {
            c.setAutoCommit(false);
            try {
                try (PreparedStatement ps = c.prepareStatement("SELECT COUNT(*) FROM slot_gudang WHERE Operator_id_pengguna=?")) {
                    ps.setString(1, idPengguna);
                    try (ResultSet rs = ps.executeQuery()) {
                        rs.next();
                        if (rs.getInt(1) > 0) throw new Exception("Akun masih memiliki transaksi terkait (slot gudang yang dikelola).");
                    }
                }
                try (PreparedStatement ps = c.prepareStatement("DELETE FROM operator WHERE id_pengguna=?")) {
                    ps.setString(1, idPengguna);
                    if (ps.executeUpdate() == 0) throw new Exception("Akun operator tidak ditemukan.");
                }
                try (PreparedStatement ps = c.prepareStatement("DELETE FROM pengguna WHERE id_pengguna=? AND peran='Operator'")) { ps.setString(1, idPengguna); ps.executeUpdate(); }
                c.commit();
            } catch (Exception ex) { c.rollback(); throw ex; } finally { c.setAutoCommit(true); }
        }
    }

    // ===================== Laporan =====================
    public static final class Laporan {
        public long jumlahKapal; public double totalTonase, totalPendapatan;
        public List<Object[]> detail = new ArrayList<>(); // id retribusi, id kapal, nama kapal, tanggal, total, status
    }

    /** Periode berdasarkan tanggal kedatangan kapal (jumlah kapal, tonase) dan tanggal bayar Lunas (pendapatan). */
    public Laporan buatLaporan(LocalDate mulai, LocalDate akhir) throws Exception {
        if (mulai == null || akhir == null || akhir.isBefore(mulai)) throw new Exception("Periode laporan tidak valid.");
        Laporan l = new Laporan();
        Date m = Date.valueOf(mulai), a = Date.valueOf(akhir);
        try (Connection c = DBConnection.getConnection()) {
            try (PreparedStatement ps = c.prepareStatement(
                    "SELECT COUNT(*), COALESCE((SELECT SUM(g.berat_ton) FROM kargo g JOIN kapal k2 ON k2.id_kapal=g.Kapal_id_kapal " +
                    "WHERE DATE(k2.waktu_kedatangan) BETWEEN ? AND ?),0) FROM kapal k WHERE DATE(k.waktu_kedatangan) BETWEEN ? AND ?")) {
                ps.setDate(1, m); ps.setDate(2, a); ps.setDate(3, m); ps.setDate(4, a);
                try (ResultSet rs = ps.executeQuery()) { rs.next(); l.jumlahKapal = rs.getLong(1); l.totalTonase = rs.getDouble(2); }
            }
            try (PreparedStatement ps = c.prepareStatement(
                    "SELECT r.id_retribusi,r.Kapal_id_kapal,k.nama_kapal,r.tanggal_bayar,r.total_biaya,r.status_bayar FROM retribusi r " +
                    "JOIN kapal k ON k.id_kapal=r.Kapal_id_kapal WHERE r.status_bayar='Lunas' AND r.tanggal_bayar BETWEEN ? AND ? ORDER BY r.tanggal_bayar,r.id_retribusi")) {
                ps.setDate(1, m); ps.setDate(2, a);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        l.totalPendapatan += rs.getDouble(5);
                        l.detail.add(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), String.valueOf(rs.getDate(4)), rs.getDouble(5), rs.getString(6)});
                    }
                }
            }
        }
        return l;
    }

    /** Flowchart: Proses Generate File Laporan (CSV, dapat dibuka di Excel). */
    public void eksporLaporan(File file, LocalDate mulai, LocalDate akhir, Laporan l) throws Exception {
        try (PrintWriter w = new PrintWriter(file, StandardCharsets.UTF_8)) {
            w.write('\uFEFF');
            w.println("LAPORAN ARGOPORT");
            w.println("Periode," + mulai + " s/d " + akhir);
            w.println("Jumlah kapal," + l.jumlahKapal);
            w.println(String.format(java.util.Locale.US, "Total tonase muatan (ton),%.2f", l.totalTonase));
            w.println(String.format(java.util.Locale.US, "Total pendapatan (Rp),%.2f", l.totalPendapatan));
            w.println();
            w.println("ID Retribusi,ID Kapal,Nama Kapal,Tanggal Bayar,Total Biaya,Status");
            for (Object[] r : l.detail) {
                w.println(String.format(java.util.Locale.US, "%s,%s,\"%s\",%s,%.2f,%s", r[0], r[1], String.valueOf(r[2]).replace("\"", "\"\""), r[3], (Double) r[4], r[5]));
            }
        }
    }
}
