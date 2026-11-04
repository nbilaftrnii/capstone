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
 * ArgoPort | Admin Workspace - Laporan.
 * Tampilan diatur lewat NetBeans Design (AdminLaporanForm.form); logika ada di luar blok GEN.
 */
public class AdminLaporanForm extends javax.swing.JFrame {
    private final AdminController controller = new AdminController();
    private AdminController.Laporan laporanTerakhir;
    private LocalDate laporanMulai, laporanAkhir;

    public AdminLaporanForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
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
        pnlLaporan = new javax.swing.JPanel();
        lblDari = new javax.swing.JLabel();
        lblSampai = new javax.swing.JLabel();
        txtDari = new javax.swing.JTextField();
        txtSampai = new javax.swing.JTextField();
        btnTampilLaporan = new javax.swing.JButton();
        btnEkspor = new javax.swing.JButton();
        lblKapalTitle = new javax.swing.JLabel();
        lblTonaseTitle = new javax.swing.JLabel();
        lblPendapatanTitle = new javax.swing.JLabel();
        lblNilaiKapal = new javax.swing.JLabel();
        lblNilaiTonase = new javax.swing.JLabel();
        lblNilaiPendapatan = new javax.swing.JLabel();
        scrollLaporan = new javax.swing.JScrollPane();
        tblLaporan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Admin Workspace - Laporan");
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

        btnMenuBilling.setBackground(new java.awt.Color(28, 58, 95));
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

        btnMenuLaporan.setBackground(new java.awt.Color(0, 140, 160));
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
        lblHeading.setText("Laporan");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Kelola dan pantau data laporan.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));

        pnlLaporan.setBackground(new java.awt.Color(255, 255, 255));
        pnlLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDari.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblDari.setForeground(new java.awt.Color(93, 108, 125));
        lblDari.setText("Dari tanggal (yyyy-MM-dd)");
        pnlLaporan.add(lblDari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 18));

        lblSampai.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblSampai.setForeground(new java.awt.Color(93, 108, 125));
        lblSampai.setText("Sampai tanggal (yyyy-MM-dd)");
        pnlLaporan.add(lblSampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 18));

        txtDari.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDari.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlLaporan.add(txtDari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 200, 36));

        txtSampai.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtSampai.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlLaporan.add(txtSampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 42, 200, 36));

        btnTampilLaporan.setBackground(new java.awt.Color(27, 93, 145));
        btnTampilLaporan.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnTampilLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilLaporan.setText("Tampilkan laporan");
        btnTampilLaporan.setBorderPainted(false);
        btnTampilLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTampilLaporan.setFocusPainted(false);
        btnTampilLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilLaporanActionPerformed(evt);
            }
        });
        pnlLaporan.add(btnTampilLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 42, 160, 36));

        btnEkspor.setBackground(new java.awt.Color(24, 116, 108));
        btnEkspor.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnEkspor.setForeground(new java.awt.Color(255, 255, 255));
        btnEkspor.setText("Ekspor ke Excel");
        btnEkspor.setBorderPainted(false);
        btnEkspor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEkspor.setFocusPainted(false);
        btnEkspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEksporActionPerformed(evt);
            }
        });
        pnlLaporan.add(btnEkspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 42, 140, 36));

        lblKapalTitle.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKapalTitle.setForeground(new java.awt.Color(93, 108, 125));
        lblKapalTitle.setText("Jumlah kapal");
        pnlLaporan.add(lblKapalTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 18));

        lblTonaseTitle.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblTonaseTitle.setForeground(new java.awt.Color(93, 108, 125));
        lblTonaseTitle.setText("Total tonase muatan (ton)");
        pnlLaporan.add(lblTonaseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 220, 18));

        lblPendapatanTitle.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblPendapatanTitle.setForeground(new java.awt.Color(93, 108, 125));
        lblPendapatanTitle.setText("Total pendapatan (Rp)");
        pnlLaporan.add(lblPendapatanTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 220, 18));

        lblNilaiKapal.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblNilaiKapal.setForeground(new java.awt.Color(34, 55, 77));
        lblNilaiKapal.setText("-");
        pnlLaporan.add(lblNilaiKapal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 32));

        lblNilaiTonase.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblNilaiTonase.setForeground(new java.awt.Color(34, 55, 77));
        lblNilaiTonase.setText("-");
        pnlLaporan.add(lblNilaiTonase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, 32));

        lblNilaiPendapatan.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblNilaiPendapatan.setForeground(new java.awt.Color(34, 55, 77));
        lblNilaiPendapatan.setText("-");
        pnlLaporan.add(lblNilaiPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 400, 32));

        scrollLaporan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblLaporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblLaporan.setGridColor(new java.awt.Color(237, 241, 245));
        tblLaporan.setRowHeight(30);
        tblLaporan.setForeground(new java.awt.Color(43, 57, 73));
        tblLaporan.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblLaporan.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RETRIBUSI", "ID KAPAL", "NAMA KAPAL", "TANGGAL BAYAR", "TOTAL BIAYA (RP)", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollLaporan.setViewportView(tblLaporan);

        pnlLaporan.add(scrollLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 961, 400));

        pnlMain.add(pnlLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

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
        new AdminBillingForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuBillingActionPerformed

    private void btnMenuAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAkunActionPerformed
        new AdminAkunForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuAkunActionPerformed

    private void btnMenuLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLaporanActionPerformed
        // sudah berada di menu ini
    }//GEN-LAST:event_btnMenuLaporanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        config.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEksporActionPerformed
        jalankan(this::eksporLaporan, "Ekspor gagal");
    }//GEN-LAST:event_btnEksporActionPerformed

    private void btnTampilLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilLaporanActionPerformed
        jalankan(this::tampilLaporan, "Laporan gagal dibuat");
    }//GEN-LAST:event_btnTampilLaporanActionPerformed

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
        gayaTabel(tblLaporan, scrollLaporan);
        txtDari.setText(LocalDate.now().withDayOfMonth(1).toString());
        txtSampai.setText(LocalDate.now().toString());
    }

    private void tampilLaporan() throws Exception {
        try {
            laporanMulai = LocalDate.parse(txtDari.getText().trim());
            laporanAkhir = LocalDate.parse(txtSampai.getText().trim());
        } catch (java.time.format.DateTimeParseException ex) {
            throw new Exception("Format tanggal harus yyyy-MM-dd, contoh 2026-10-31.");
        }
        laporanTerakhir = controller.buatLaporan(laporanMulai, laporanAkhir);
        lblNilaiKapal.setText(String.valueOf(laporanTerakhir.jumlahKapal));
        lblNilaiTonase.setText(String.format("%,.2f", laporanTerakhir.totalTonase));
        lblNilaiPendapatan.setText(String.format("%,.2f", laporanTerakhir.totalPendapatan));
        isi(tblLaporan, laporanTerakhir.detail);
    }

    private void eksporLaporan() throws Exception {
        if (laporanTerakhir == null) throw new Exception("Tampilkan laporan terlebih dahulu sebelum diekspor.");
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File("laporan_argoport_" + laporanMulai + "_" + laporanAkhir + ".csv"));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        controller.eksporLaporan(fc.getSelectedFile(), laporanMulai, laporanAkhir, laporanTerakhir);
        info("File Laporan Berhasil Diunduh!\n" + fc.getSelectedFile().getAbsolutePath());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkspor;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuAkun;
    private javax.swing.JButton btnMenuBilling;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuDermaga;
    private javax.swing.JButton btnMenuLaporan;
    private javax.swing.JButton btnMenuSlot;
    private javax.swing.JButton btnMenuTarif;
    private javax.swing.JButton btnTampilLaporan;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblDari;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblKapalTitle;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNilaiKapal;
    private javax.swing.JLabel lblNilaiPendapatan;
    private javax.swing.JLabel lblNilaiTonase;
    private javax.swing.JLabel lblPendapatanTitle;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSampai;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblTonaseTitle;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLaporan;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scrollLaporan;
    private javax.swing.JTable tblLaporan;
    private javax.swing.JTextField txtDari;
    private javax.swing.JTextField txtSampai;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
