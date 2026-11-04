package view;

import controller.AdminController;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;
import model.Pengguna;
import config.DBConnection;

/**
 * ArgoPort | Admin Workspace - Billing & Pembayaran.
 * Tampilan diatur lewat NetBeans Design (AdminBillingForm.form); logika ada di luar blok GEN.
 */
public class AdminBillingForm extends javax.swing.JFrame {
    private final AdminController controller = new AdminController();

    public AdminBillingForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
        jalankan(this::muatBilling, "Gagal memuat data");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSidebar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblSection = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnMenuDashboard = new javax.swing.JButton();
        btnMenuDermaga = new javax.swing.JButton();
        btnMenuSlot = new javax.swing.JButton();
        btnMenuTarif = new javax.swing.JButton();
        btnMenuBilling = new javax.swing.JButton();
        btnMenuAkun = new javax.swing.JButton();
        btnMenuLaporan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlHeader = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblSubheading = new javax.swing.JLabel();
        pnlBilling = new javax.swing.JPanel();
        scrollBilling = new javax.swing.JScrollPane();
        tblBilling = new javax.swing.JTable();
        btnBayar = new javax.swing.JButton();
        btnMuatBilling = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Admin Workspace - Billing & Pembayaran");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSidebar.setBackground(new java.awt.Color(17, 39, 67));
        pnlSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_sidebar.png"))); // NOI18N
        pnlSidebar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, 42, 42));

        lblBrand.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setText("ARGOPORT");
        pnlSidebar.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 34, 175, 35));

        lblSection.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblSection.setForeground(new java.awt.Color(113, 145, 173));
        lblSection.setText("ADMINISTRATION");
        pnlSidebar.add(lblSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, 220, 20));

        lblRole.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Menu Admin");
        pnlSidebar.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 200, 22));

        btnMenuDashboard.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuDashboard.setText("Dashboard");
        btnMenuDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuDashboard.setContentAreaFilled(false);
        btnMenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuDashboard.setFocusPainted(false);
        btnMenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDashboard.setOpaque(true);
        btnMenuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDashboardActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 190, 219, 39));

        btnMenuDermaga.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuDermaga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuDermaga.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuDermaga.setText("Kelola Dermaga");
        btnMenuDermaga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuDermaga.setContentAreaFilled(false);
        btnMenuDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuDermaga.setFocusPainted(false);
        btnMenuDermaga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDermaga.setOpaque(true);
        btnMenuDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDermagaActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 238, 219, 39));

        btnMenuSlot.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuSlot.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuSlot.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuSlot.setText("Kelola Slot Gudang");
        btnMenuSlot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuSlot.setContentAreaFilled(false);
        btnMenuSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuSlot.setFocusPainted(false);
        btnMenuSlot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuSlot.setOpaque(true);
        btnMenuSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSlotActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 286, 219, 39));

        btnMenuTarif.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuTarif.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuTarif.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuTarif.setText("Kelola Tarif");
        btnMenuTarif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuTarif.setContentAreaFilled(false);
        btnMenuTarif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuTarif.setFocusPainted(false);
        btnMenuTarif.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuTarif.setOpaque(true);
        btnMenuTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTarifActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 334, 219, 39));

        btnMenuBilling.setBackground(new java.awt.Color(0, 140, 160));
        btnMenuBilling.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuBilling.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuBilling.setText("Billing & Pembayaran");
        btnMenuBilling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuBilling.setContentAreaFilled(false);
        btnMenuBilling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuBilling.setFocusPainted(false);
        btnMenuBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuBilling.setOpaque(true);
        btnMenuBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBillingActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 382, 219, 39));

        btnMenuAkun.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuAkun.setText("Kelola Akun Operator");
        btnMenuAkun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuAkun.setContentAreaFilled(false);
        btnMenuAkun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuAkun.setFocusPainted(false);
        btnMenuAkun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuAkun.setOpaque(true);
        btnMenuAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAkunActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 430, 219, 39));

        btnMenuLaporan.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuLaporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuLaporan.setText("Laporan");
        btnMenuLaporan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuLaporan.setContentAreaFilled(false);
        btnMenuLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuLaporan.setFocusPainted(false);
        btnMenuLaporan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuLaporan.setOpaque(true);
        btnMenuLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuLaporanActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 478, 219, 39));

        btnLogout.setBackground(new java.awt.Color(17, 39, 67));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(220, 231, 241));
        btnLogout.setText("Keluar");
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 735, 205, 35));

        getContentPane().add(pnlSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 820));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(105, 121, 140));
        lblWelcome.setText("ADMIN WORKSPACE");
        pnlHeader.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 300, 18));

        userLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(37, 54, 74));
        userLabel.setText("Administrator");
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 18, 340, 25));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 1065, 65));

        pnlMain.setBackground(new java.awt.Color(246, 248, 251));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(24, 41, 61));
        lblHeading.setText("Billing & Pembayaran");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Kelola dan pantau data billing & pembayaran.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));

        pnlBilling.setBackground(new java.awt.Color(255, 255, 255));
        pnlBilling.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollBilling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblBilling.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblBilling.setGridColor(new java.awt.Color(237, 241, 245));
        tblBilling.setRowHeight(30);
        tblBilling.setForeground(new java.awt.Color(43, 57, 73));
        tblBilling.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblBilling.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblBilling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID KAPAL", "NAMA KAPAL", "STATUS KAPAL", "STATUS BAYAR", "TOTAL TAGIHAN (RP)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollBilling.setViewportView(tblBilling);

        pnlBilling.add(scrollBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 961, 400));

        btnBayar.setBackground(new java.awt.Color(27, 93, 145));
        btnBayar.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Lihat rincian & proses pembayaran");
        btnBayar.setBorderPainted(false);
        btnBayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBayar.setFocusPainted(false);
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        pnlBilling.add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 36));

        btnMuatBilling.setBackground(new java.awt.Color(235, 241, 247));
        btnMuatBilling.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMuatBilling.setForeground(new java.awt.Color(43, 73, 101));
        btnMuatBilling.setText("Muat ulang");
        btnMuatBilling.setBorderPainted(false);
        btnMuatBilling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuatBilling.setFocusPainted(false);
        btnMuatBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatBillingActionPerformed(evt);
            }
        });
        pnlBilling.add(btnMuatBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 440, 120, 36));

        pnlMain.add(pnlBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 65, 1065, 755));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDashboardActionPerformed
        new AdminDashboardForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuDashboardActionPerformed

    private void btnMenuDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDermagaActionPerformed
        new AdminDermagaForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuDermagaActionPerformed

    private void btnMenuSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSlotActionPerformed
        new AdminSlotForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuSlotActionPerformed

    private void btnMenuTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTarifActionPerformed
        new AdminTarifForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuTarifActionPerformed

    private void btnMenuBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBillingActionPerformed
        // sudah berada di menu ini
    }//GEN-LAST:event_btnMenuBillingActionPerformed

    private void btnMenuAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAkunActionPerformed
        new AdminAkunForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuAkunActionPerformed

    private void btnMenuLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLaporanActionPerformed
        new AdminLaporanForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuLaporanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        config.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        jalankan(this::prosesBayar, "Pembayaran gagal");
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnMuatBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatBillingActionPerformed
        jalankan(this::muatBilling, "Gagal memuat data");
    }//GEN-LAST:event_btnMuatBillingActionPerformed

    // ---------- util ----------
    private interface Aksi { void jalankan() throws Exception; }

    private void jalankan(Aksi a, String judulError) {
        try {
            a.jalankan();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), judulError, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void isi(JTable tabel, List<Object[]> baris) {
        DefaultTableModel m = (DefaultTableModel) tabel.getModel();
        m.setRowCount(0);
        for (Object[] r : baris) m.addRow(r);
    }

    private String dipilih(JTable tabel, int kolom, String pesan) throws Exception {
        int r = tabel.getSelectedRow();
        if (r < 0) throw new Exception(pesan);
        return String.valueOf(tabel.getModel().getValueAt(tabel.convertRowIndexToModel(r), kolom));
    }

    private double angka(JTextField f, String nama) throws Exception {
        try {
            return Double.parseDouble(f.getText().trim().replace(',', '.'));
        } catch (NumberFormatException ex) {
            throw new Exception(nama + " harus berupa angka.");
        }
    }

    private boolean konfirmasi(String pesan) {
        return JOptionPane.showConfirmDialog(this, pesan, "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    private void info(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }

    private void gayaTabel(JTable t, JScrollPane sp) {
        t.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 10));
        t.getTableHeader().setBackground(new java.awt.Color(246, 248, 251));
        sp.getViewport().setBackground(java.awt.Color.WHITE);
    }

    // ---------- inisialisasi (di luar Design) ----------
    private void siapkan() {
        if (util.Sesi.pengguna != null) userLabel.setText(util.Sesi.pengguna.getNama() + "   \u00b7   Administrator");
        util.Navigasi.gayaSidebar(btnMenuDashboard, btnMenuDermaga, btnMenuSlot, btnMenuTarif, btnMenuBilling, btnMenuAkun, btnMenuLaporan);
        gayaTabel(tblBilling, scrollBilling);
    }

    private void muatBilling() throws Exception { isi(tblBilling, controller.getKapalSandar()); }

    private void prosesBayar() throws Exception {
        String id = dipilih(tblBilling, 0, "Pilih kapal dari tabel terlebih dahulu.");
        AdminController.Tagihan t = controller.hitungRincian(id);
        if ("Lunas".equalsIgnoreCase(t.statusBayar)) {
            info("Retribusi kapal " + id + " sudah lunas.\n\n" + t.rincian());
            return;
        }
        int pilih = JOptionPane.showConfirmDialog(this,
                "Rincian tagihan kapal " + id + "\n\n" + t.rincian() + "\n\nApakah retribusi telah dibayar lunas?\n"
                + "(Ya = Lunas, Tidak = catat Belum Lunas)",
                "Rincian Tagihan", JOptionPane.YES_NO_CANCEL_OPTION);
        if (pilih == JOptionPane.CANCEL_OPTION || pilih == JOptionPane.CLOSED_OPTION) return;
        boolean lunas = pilih == JOptionPane.YES_OPTION;
        controller.prosesPembayaran(id, util.Sesi.pengguna.getIdPengguna(), lunas);
        info(lunas ? "Pembayaran Lunas & Transaksi Berhasil!" : "Status pembayaran diperbarui menjadi Belum Lunas.");
        muatBilling();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuAkun;
    private javax.swing.JButton btnMenuBilling;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuDermaga;
    private javax.swing.JButton btnMenuLaporan;
    private javax.swing.JButton btnMenuSlot;
    private javax.swing.JButton btnMenuTarif;
    private javax.swing.JButton btnMuatBilling;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlBilling;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scrollBilling;
    private javax.swing.JTable tblBilling;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
