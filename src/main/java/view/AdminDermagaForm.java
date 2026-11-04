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
import repository.DBConnection;

/**
 * ArgoPort | Admin Workspace - Kelola Dermaga.
 * Tampilan diatur lewat NetBeans Design (AdminDermagaForm.form); logika ada di luar blok GEN.
 */
public class AdminDermagaForm extends javax.swing.JFrame {
    private final AdminController controller = new AdminController();

    public AdminDermagaForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
        jalankan(this::muatDermaga, "Gagal memuat data");
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
        pnlDermaga = new javax.swing.JPanel();
        scrollDermaga = new javax.swing.JScrollPane();
        tblDermaga = new javax.swing.JTable();
        lblKodeDermaga = new javax.swing.JLabel();
        lblNamaDermaga = new javax.swing.JLabel();
        lblKapasitasDermaga = new javax.swing.JLabel();
        txtKodeDermaga = new javax.swing.JTextField();
        txtNamaDermaga = new javax.swing.JTextField();
        txtKapasitasDermaga = new javax.swing.JTextField();
        btnTambahDermaga = new javax.swing.JButton();
        btnUbahDermaga = new javax.swing.JButton();
        btnStatusDermaga = new javax.swing.JButton();
        btnHapusDermaga = new javax.swing.JButton();
        btnMuatDermaga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Admin Workspace - Kelola Dermaga");
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

        btnMenuDermaga.setBackground(new java.awt.Color(0, 140, 160));
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
        lblHeading.setText("Kelola Dermaga");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Kelola dan pantau data kelola dermaga.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));

        pnlDermaga.setBackground(new java.awt.Color(255, 255, 255));
        pnlDermaga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollDermaga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblDermaga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDermaga.setGridColor(new java.awt.Color(237, 241, 245));
        tblDermaga.setRowHeight(30);
        tblDermaga.setForeground(new java.awt.Color(43, 57, 73));
        tblDermaga.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblDermaga.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblDermaga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DERMAGA", "NAMA DERMAGA", "KAPASITAS MAKSIMAL (TON)", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDermaga.setViewportView(tblDermaga);

        pnlDermaga.add(scrollDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 961, 300));

        lblKodeDermaga.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKodeDermaga.setForeground(new java.awt.Color(93, 108, 125));
        lblKodeDermaga.setText("Kode dermaga");
        pnlDermaga.add(lblKodeDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 335, 220, 18));

        lblNamaDermaga.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblNamaDermaga.setForeground(new java.awt.Color(93, 108, 125));
        lblNamaDermaga.setText("Nama dermaga");
        pnlDermaga.add(lblNamaDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 335, 220, 18));

        lblKapasitasDermaga.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKapasitasDermaga.setForeground(new java.awt.Color(93, 108, 125));
        lblKapasitasDermaga.setText("Kapasitas maksimal (ton)");
        pnlDermaga.add(lblKapasitasDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 335, 220, 18));

        txtKodeDermaga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtKodeDermaga.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlDermaga.add(txtKodeDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 357, 200, 36));

        txtNamaDermaga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNamaDermaga.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlDermaga.add(txtNamaDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 357, 360, 36));

        txtKapasitasDermaga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtKapasitasDermaga.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlDermaga.add(txtKapasitasDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 357, 200, 36));

        btnTambahDermaga.setBackground(new java.awt.Color(27, 93, 145));
        btnTambahDermaga.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnTambahDermaga.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahDermaga.setText("Tambah");
        btnTambahDermaga.setBorderPainted(false);
        btnTambahDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahDermaga.setFocusPainted(false);
        btnTambahDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDermagaActionPerformed(evt);
            }
        });
        pnlDermaga.add(btnTambahDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, 130, 36));

        btnUbahDermaga.setBackground(new java.awt.Color(235, 241, 247));
        btnUbahDermaga.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnUbahDermaga.setForeground(new java.awt.Color(43, 73, 101));
        btnUbahDermaga.setText("Ubah nama & kapasitas");
        btnUbahDermaga.setBorderPainted(false);
        btnUbahDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbahDermaga.setFocusPainted(false);
        btnUbahDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDermagaActionPerformed(evt);
            }
        });
        pnlDermaga.add(btnUbahDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 415, 190, 36));

        btnStatusDermaga.setBackground(new java.awt.Color(235, 241, 247));
        btnStatusDermaga.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnStatusDermaga.setForeground(new java.awt.Color(43, 73, 101));
        btnStatusDermaga.setText("Ubah status");
        btnStatusDermaga.setBorderPainted(false);
        btnStatusDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStatusDermaga.setFocusPainted(false);
        btnStatusDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusDermagaActionPerformed(evt);
            }
        });
        pnlDermaga.add(btnStatusDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 415, 130, 36));

        btnHapusDermaga.setBackground(new java.awt.Color(253, 236, 234));
        btnHapusDermaga.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnHapusDermaga.setForeground(new java.awt.Color(176, 48, 38));
        btnHapusDermaga.setText("Hapus");
        btnHapusDermaga.setBorderPainted(false);
        btnHapusDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusDermaga.setFocusPainted(false);
        btnHapusDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDermagaActionPerformed(evt);
            }
        });
        pnlDermaga.add(btnHapusDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 415, 110, 36));

        btnMuatDermaga.setBackground(new java.awt.Color(235, 241, 247));
        btnMuatDermaga.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMuatDermaga.setForeground(new java.awt.Color(43, 73, 101));
        btnMuatDermaga.setText("Muat ulang");
        btnMuatDermaga.setBorderPainted(false);
        btnMuatDermaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuatDermaga.setFocusPainted(false);
        btnMuatDermaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatDermagaActionPerformed(evt);
            }
        });
        pnlDermaga.add(btnMuatDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 415, 120, 36));

        pnlMain.add(pnlDermaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 65, 1065, 755));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDashboardActionPerformed
        new AdminDashboardForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuDashboardActionPerformed

    private void btnMenuDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDermagaActionPerformed
        // sudah berada di menu ini
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
        new AdminLaporanForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuLaporanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        repository.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHapusDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDermagaActionPerformed
        jalankan(this::hapusDermaga, "Dermaga tidak dapat dihapus");
    }//GEN-LAST:event_btnHapusDermagaActionPerformed

    private void btnMuatDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatDermagaActionPerformed
        jalankan(this::muatDermaga, "Gagal memuat data");
    }//GEN-LAST:event_btnMuatDermagaActionPerformed

    private void btnStatusDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusDermagaActionPerformed
        jalankan(this::ubahStatusDermaga, "Status dermaga gagal diubah");
    }//GEN-LAST:event_btnStatusDermagaActionPerformed

    private void btnTambahDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDermagaActionPerformed
        jalankan(this::tambahDermaga, "Data dermaga tidak valid");
    }//GEN-LAST:event_btnTambahDermagaActionPerformed

    private void btnUbahDermagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDermagaActionPerformed
        jalankan(this::ubahDermaga, "Data dermaga tidak valid");
    }//GEN-LAST:event_btnUbahDermagaActionPerformed

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
        gayaTabel(tblDermaga, scrollDermaga);
        tblDermaga.getSelectionModel().addListSelectionListener(e -> {
            int r = tblDermaga.getSelectedRow();
            if (e.getValueIsAdjusting() || r < 0) return;
            txtKodeDermaga.setText(String.valueOf(tblDermaga.getValueAt(r, 0)));
            txtNamaDermaga.setText(String.valueOf(tblDermaga.getValueAt(r, 1)));
            txtKapasitasDermaga.setText(String.valueOf(tblDermaga.getValueAt(r, 2)));
        });
    }

    private void muatDermaga() throws Exception { isi(tblDermaga, controller.getDaftarDermaga()); }

    private void tambahDermaga() throws Exception {
        controller.tambahDermaga(txtKodeDermaga.getText(), txtNamaDermaga.getText(), angka(txtKapasitasDermaga, "Kapasitas"));
        info("Data Dermaga Berhasil Disimpan!");
        muatDermaga();
    }

    private void ubahDermaga() throws Exception {
        String id = dipilih(tblDermaga, 0, "Pilih dermaga dari tabel terlebih dahulu.");
        controller.ubahDermaga(id, txtNamaDermaga.getText(), angka(txtKapasitasDermaga, "Kapasitas"));
        info("Data Dermaga Berhasil Diubah!");
        muatDermaga();
    }

    private void ubahStatusDermaga() throws Exception {
        String id = dipilih(tblDermaga, 0, "Pilih dermaga dari tabel terlebih dahulu.");
        Object status = JOptionPane.showInputDialog(this, "Status baru untuk dermaga " + id + ":", "Ubah status dermaga",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Tersedia", "Terisi", "Perbaikan"}, "Tersedia");
        if (status == null) return;
        controller.ubahStatusDermaga(id, status.toString());
        info("Status dermaga berhasil diubah.");
        muatDermaga();
    }

    private void hapusDermaga() throws Exception {
        String id = dipilih(tblDermaga, 0, "Pilih dermaga dari tabel terlebih dahulu.");
        if (!konfirmasi("Hapus dermaga " + id + "?")) return;
        controller.hapusDermaga(id);
        info("Data Dermaga Berhasil Dihapus!");
        muatDermaga();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusDermaga;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuAkun;
    private javax.swing.JButton btnMenuBilling;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuDermaga;
    private javax.swing.JButton btnMenuLaporan;
    private javax.swing.JButton btnMenuSlot;
    private javax.swing.JButton btnMenuTarif;
    private javax.swing.JButton btnMuatDermaga;
    private javax.swing.JButton btnStatusDermaga;
    private javax.swing.JButton btnTambahDermaga;
    private javax.swing.JButton btnUbahDermaga;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblKapasitasDermaga;
    private javax.swing.JLabel lblKodeDermaga;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNamaDermaga;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlDermaga;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scrollDermaga;
    private javax.swing.JTable tblDermaga;
    private javax.swing.JTextField txtKapasitasDermaga;
    private javax.swing.JTextField txtKodeDermaga;
    private javax.swing.JTextField txtNamaDermaga;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
