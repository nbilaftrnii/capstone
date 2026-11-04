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
 * ArgoPort | Admin Workspace - Kelola Slot Gudang.
 * Tampilan diatur lewat NetBeans Design (AdminSlotForm.form); logika ada di luar blok GEN.
 */
public class AdminSlotForm extends javax.swing.JFrame {
    private final AdminController controller = new AdminController();

    public AdminSlotForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
        jalankan(this::muatSlot, "Gagal memuat data");
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
        pnlSlot = new javax.swing.JPanel();
        scrollSlot = new javax.swing.JScrollPane();
        tblSlot = new javax.swing.JTable();
        lblKodeBlok = new javax.swing.JLabel();
        lblKapasitasSlot = new javax.swing.JLabel();
        lblOperatorSlot = new javax.swing.JLabel();
        txtKodeBlok = new javax.swing.JTextField();
        txtKapasitasSlot = new javax.swing.JTextField();
        txtOperatorSlot = new javax.swing.JTextField();
        btnTambahSlot = new javax.swing.JButton();
        btnUbahSlot = new javax.swing.JButton();
        btnHapusSlot = new javax.swing.JButton();
        btnMuatSlot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Admin Workspace - Kelola Slot Gudang");
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

        btnMenuSlot.setBackground(new java.awt.Color(0, 140, 160));
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
        lblHeading.setText("Kelola Slot Gudang");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Kelola dan pantau data kelola slot gudang.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));

        pnlSlot.setBackground(new java.awt.Color(255, 255, 255));
        pnlSlot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollSlot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblSlot.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblSlot.setGridColor(new java.awt.Color(237, 241, 245));
        tblSlot.setRowHeight(30);
        tblSlot.setForeground(new java.awt.Color(43, 57, 73));
        tblSlot.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblSlot.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblSlot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SLOT", "KODE BLOK", "KAPASITAS (M3)", "SISA (M3)", "STATUS", "ID OPERATOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollSlot.setViewportView(tblSlot);

        pnlSlot.add(scrollSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 961, 300));

        lblKodeBlok.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKodeBlok.setForeground(new java.awt.Color(93, 108, 125));
        lblKodeBlok.setText("Kode blok");
        pnlSlot.add(lblKodeBlok, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 335, 220, 18));

        lblKapasitasSlot.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKapasitasSlot.setForeground(new java.awt.Color(93, 108, 125));
        lblKapasitasSlot.setText("Kapasitas volume (m3)");
        pnlSlot.add(lblKapasitasSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 335, 220, 18));

        lblOperatorSlot.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblOperatorSlot.setForeground(new java.awt.Color(93, 108, 125));
        lblOperatorSlot.setText("ID operator penanggung jawab");
        pnlSlot.add(lblOperatorSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 335, 240, 18));

        txtKodeBlok.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtKodeBlok.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlSlot.add(txtKodeBlok, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 357, 200, 36));

        txtKapasitasSlot.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtKapasitasSlot.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlSlot.add(txtKapasitasSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 357, 200, 36));

        txtOperatorSlot.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtOperatorSlot.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(5, 9, 5, 9)));
        pnlSlot.add(txtOperatorSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 357, 200, 36));

        btnTambahSlot.setBackground(new java.awt.Color(27, 93, 145));
        btnTambahSlot.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnTambahSlot.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahSlot.setText("Tambah");
        btnTambahSlot.setBorderPainted(false);
        btnTambahSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahSlot.setFocusPainted(false);
        btnTambahSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahSlotActionPerformed(evt);
            }
        });
        pnlSlot.add(btnTambahSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, 130, 36));

        btnUbahSlot.setBackground(new java.awt.Color(235, 241, 247));
        btnUbahSlot.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnUbahSlot.setForeground(new java.awt.Color(43, 73, 101));
        btnUbahSlot.setText("Ubah kapasitas");
        btnUbahSlot.setBorderPainted(false);
        btnUbahSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbahSlot.setFocusPainted(false);
        btnUbahSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahSlotActionPerformed(evt);
            }
        });
        pnlSlot.add(btnUbahSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 415, 150, 36));

        btnHapusSlot.setBackground(new java.awt.Color(253, 236, 234));
        btnHapusSlot.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnHapusSlot.setForeground(new java.awt.Color(176, 48, 38));
        btnHapusSlot.setText("Hapus");
        btnHapusSlot.setBorderPainted(false);
        btnHapusSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusSlot.setFocusPainted(false);
        btnHapusSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSlotActionPerformed(evt);
            }
        });
        pnlSlot.add(btnHapusSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 415, 110, 36));

        btnMuatSlot.setBackground(new java.awt.Color(235, 241, 247));
        btnMuatSlot.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMuatSlot.setForeground(new java.awt.Color(43, 73, 101));
        btnMuatSlot.setText("Muat ulang");
        btnMuatSlot.setBorderPainted(false);
        btnMuatSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuatSlot.setFocusPainted(false);
        btnMuatSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatSlotActionPerformed(evt);
            }
        });
        pnlSlot.add(btnMuatSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 415, 120, 36));

        pnlMain.add(pnlSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

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
        // sudah berada di menu ini
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
        config.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHapusSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSlotActionPerformed
        jalankan(this::hapusSlot, "Slot gudang tidak dapat dihapus");
    }//GEN-LAST:event_btnHapusSlotActionPerformed

    private void btnMuatSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatSlotActionPerformed
        jalankan(this::muatSlot, "Gagal memuat data");
    }//GEN-LAST:event_btnMuatSlotActionPerformed

    private void btnTambahSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahSlotActionPerformed
        jalankan(this::tambahSlot, "Data slot gudang tidak valid");
    }//GEN-LAST:event_btnTambahSlotActionPerformed

    private void btnUbahSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahSlotActionPerformed
        jalankan(this::ubahSlot, "Data slot gudang tidak valid");
    }//GEN-LAST:event_btnUbahSlotActionPerformed

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
        gayaTabel(tblSlot, scrollSlot);
        tblSlot.getSelectionModel().addListSelectionListener(e -> {
            int r = tblSlot.getSelectedRow();
            if (e.getValueIsAdjusting() || r < 0) return;
            txtKodeBlok.setText(String.valueOf(tblSlot.getValueAt(r, 1)));
            txtKapasitasSlot.setText(String.valueOf(tblSlot.getValueAt(r, 2)));
            txtOperatorSlot.setText(String.valueOf(tblSlot.getValueAt(r, 5)));
        });
    }

    private void muatSlot() throws Exception { isi(tblSlot, controller.getDaftarSlot()); }

    private void tambahSlot() throws Exception {
        controller.tambahSlotGudang(txtKodeBlok.getText(), angka(txtKapasitasSlot, "Kapasitas"), txtOperatorSlot.getText());
        info("Data Slot Gudang Berhasil Disimpan!");
        muatSlot();
    }

    private void ubahSlot() throws Exception {
        String id = dipilih(tblSlot, 0, "Pilih slot gudang dari tabel terlebih dahulu.");
        controller.ubahKapasitasSlot(id, angka(txtKapasitasSlot, "Kapasitas"));
        info("Data Slot Gudang Berhasil Disimpan!");
        muatSlot();
    }

    private void hapusSlot() throws Exception {
        String id = dipilih(tblSlot, 0, "Pilih slot gudang dari tabel terlebih dahulu.");
        if (!konfirmasi("Hapus slot gudang " + id + "?")) return;
        controller.hapusSlotGudang(id);
        info("Data Slot Gudang Berhasil Dihapus!");
        muatSlot();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusSlot;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuAkun;
    private javax.swing.JButton btnMenuBilling;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuDermaga;
    private javax.swing.JButton btnMenuLaporan;
    private javax.swing.JButton btnMenuSlot;
    private javax.swing.JButton btnMenuTarif;
    private javax.swing.JButton btnMuatSlot;
    private javax.swing.JButton btnTambahSlot;
    private javax.swing.JButton btnUbahSlot;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblKapasitasSlot;
    private javax.swing.JLabel lblKodeBlok;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOperatorSlot;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlSlot;
    private javax.swing.JScrollPane scrollSlot;
    private javax.swing.JTable tblSlot;
    private javax.swing.JTextField txtKapasitasSlot;
    private javax.swing.JTextField txtKodeBlok;
    private javax.swing.JTextField txtOperatorSlot;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
