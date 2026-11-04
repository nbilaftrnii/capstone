package view;

import controller.OperatorController;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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
 * ArgoPort | Operator Workspace - Dashboard.
 * Tampilan diatur lewat NetBeans Design (OperatorDashboardForm.form); logika ada di luar blok GEN.
 */
public class OperatorDashboardForm extends javax.swing.JFrame {
    private final OperatorController controller = new OperatorController();

    public OperatorDashboardForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
        jalankan(this::muatDashboard, "Gagal memuat data");
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
        btnMenuPendaftaran = new javax.swing.JButton();
        btnMenuDaftarKapal = new javax.swing.JButton();
        btnMenuPenambatan = new javax.swing.JButton();
        btnMenuBongkarMuat = new javax.swing.JButton();
        btnMenuKargo = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlHeader = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblSubheading = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        pnlCard1 = new javax.swing.JPanel();
        lblCardTitle1 = new javax.swing.JLabel();
        lblCardValue1 = new javax.swing.JLabel();
        pnlCard2 = new javax.swing.JPanel();
        lblCardTitle2 = new javax.swing.JLabel();
        lblCardValue2 = new javax.swing.JLabel();
        pnlCard3 = new javax.swing.JPanel();
        lblCardTitle3 = new javax.swing.JLabel();
        lblCardValue3 = new javax.swing.JLabel();
        pnlCard4 = new javax.swing.JPanel();
        lblCardTitle4 = new javax.swing.JLabel();
        lblCardValue4 = new javax.swing.JLabel();
        lblRecent = new javax.swing.JLabel();
        scrollDashboard = new javax.swing.JScrollPane();
        tblDashboard = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Operator Workspace - Dashboard");
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
        lblSection.setText("OPERATIONS");
        pnlSidebar.add(lblSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, 220, 20));

        lblRole.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Menu Operator");
        pnlSidebar.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 200, 22));

        btnMenuDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuDashboard.setBackground(new java.awt.Color(0, 140, 160));
        btnMenuDashboard.setText("Dashboard");
        btnMenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuDashboard.setBorderPainted(true);
        btnMenuDashboard.setContentAreaFilled(false);
        btnMenuDashboard.setOpaque(true);
        btnMenuDashboard.setFocusPainted(false);
        btnMenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDashboardActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 190, 219, 39));

        btnMenuPendaftaran.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuPendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPendaftaran.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuPendaftaran.setText("Pendaftaran Kapal Baru");
        btnMenuPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPendaftaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuPendaftaran.setBorderPainted(true);
        btnMenuPendaftaran.setContentAreaFilled(false);
        btnMenuPendaftaran.setOpaque(true);
        btnMenuPendaftaran.setFocusPainted(false);
        btnMenuPendaftaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPendaftaranActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 238, 219, 39));

        btnMenuDaftarKapal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuDaftarKapal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuDaftarKapal.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuDaftarKapal.setText("Lihat Daftar Kapal");
        btnMenuDaftarKapal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDaftarKapal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuDaftarKapal.setBorderPainted(true);
        btnMenuDaftarKapal.setContentAreaFilled(false);
        btnMenuDaftarKapal.setOpaque(true);
        btnMenuDaftarKapal.setFocusPainted(false);
        btnMenuDaftarKapal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuDaftarKapal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDaftarKapalActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuDaftarKapal, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 286, 219, 39));

        btnMenuPenambatan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuPenambatan.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPenambatan.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuPenambatan.setText("Penambatan Kapal");
        btnMenuPenambatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPenambatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuPenambatan.setBorderPainted(true);
        btnMenuPenambatan.setContentAreaFilled(false);
        btnMenuPenambatan.setOpaque(true);
        btnMenuPenambatan.setFocusPainted(false);
        btnMenuPenambatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPenambatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPenambatanActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuPenambatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 334, 219, 39));

        btnMenuBongkarMuat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuBongkarMuat.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuBongkarMuat.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuBongkarMuat.setText("Bongkar Muat Kargo");
        btnMenuBongkarMuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuBongkarMuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuBongkarMuat.setBorderPainted(true);
        btnMenuBongkarMuat.setContentAreaFilled(false);
        btnMenuBongkarMuat.setOpaque(true);
        btnMenuBongkarMuat.setFocusPainted(false);
        btnMenuBongkarMuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuBongkarMuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBongkarMuatActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuBongkarMuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 382, 219, 39));

        btnMenuKargo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuKargo.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuKargo.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuKargo.setText("Kelola Data Kargo");
        btnMenuKargo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuKargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuKargo.setBorderPainted(true);
        btnMenuKargo.setContentAreaFilled(false);
        btnMenuKargo.setOpaque(true);
        btnMenuKargo.setFocusPainted(false);
        btnMenuKargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuKargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuKargoActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuKargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 430, 219, 39));

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
        lblWelcome.setText("OPERATOR WORKSPACE");
        pnlHeader.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 300, 18));

        userLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(37, 54, 74));
        userLabel.setText("Operator");
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 18, 340, 25));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 1065, 65));

        pnlMain.setBackground(new java.awt.Color(246, 248, 251));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(24, 41, 61));
        lblHeading.setText("Dashboard Operator");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Ringkasan aktivitas kapal dan kargo.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));


        pnlDashboard.setBackground(new java.awt.Color(246, 248, 251));
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCard1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlCard1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardTitle1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblCardTitle1.setForeground(new java.awt.Color(105, 121, 140));
        lblCardTitle1.setText("TOTAL KAPAL");
        pnlCard1.add(lblCardTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 190, 18));

        lblCardValue1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblCardValue1.setForeground(new java.awt.Color(0, 140, 160));
        lblCardValue1.setText("-");
        pnlCard1.add(lblCardValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 34, 190, 35));
        pnlDashboard.add(pnlCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 222, 82));

        pnlCard2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlCard2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardTitle2.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblCardTitle2.setForeground(new java.awt.Color(105, 121, 140));
        lblCardTitle2.setText("KAPAL ANTRE");
        pnlCard2.add(lblCardTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 190, 18));

        lblCardValue2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblCardValue2.setForeground(new java.awt.Color(27, 93, 145));
        lblCardValue2.setText("-");
        pnlCard2.add(lblCardValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 34, 190, 35));
        pnlDashboard.add(pnlCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 18, 222, 82));

        pnlCard3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlCard3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardTitle3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblCardTitle3.setForeground(new java.awt.Color(105, 121, 140));
        lblCardTitle3.setText("KAPAL SANDAR");
        pnlCard3.add(lblCardTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 190, 18));

        lblCardValue3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblCardValue3.setForeground(new java.awt.Color(25, 115, 105));
        lblCardValue3.setText("-");
        pnlCard3.add(lblCardValue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 34, 190, 35));
        pnlDashboard.add(pnlCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 18, 222, 82));

        pnlCard4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlCard4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardTitle4.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblCardTitle4.setForeground(new java.awt.Color(105, 121, 140));
        lblCardTitle4.setText("TOTAL DATA KARGO");
        pnlCard4.add(lblCardTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 190, 18));

        lblCardValue4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblCardValue4.setForeground(new java.awt.Color(0, 115, 135));
        lblCardValue4.setText("-");
        pnlCard4.add(lblCardValue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 34, 190, 35));
        pnlDashboard.add(pnlCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 18, 222, 82));

        lblRecent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblRecent.setForeground(new java.awt.Color(34, 55, 77));
        lblRecent.setText("Data Kapal Terbaru");
        pnlDashboard.add(lblRecent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 600, 25));

        scrollDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));

        tblDashboard.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblDashboard.setRowHeight(27);

        tblDashboard.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
        
                },
                new String [] {
                    "ID KAPAL",
                    "NAMA KAPAL",
                    "JENIS",
                    "GT",
                    "DRAF",
                    "KEDATANGAN",
                    "STATUS",
                    "DERMAGA",
                    "WAKTU SANDAR"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
                };
        
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        scrollDashboard.setViewportView(tblDashboard);
        pnlDashboard.add(scrollDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 152, 950, 390));
        pnlMain.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 65, 1065, 755));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDashboardActionPerformed
        // sudah berada di menu ini
    }//GEN-LAST:event_btnMenuDashboardActionPerformed

    private void btnMenuPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPendaftaranActionPerformed
        new OperatorPendaftaranForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPendaftaranActionPerformed

    private void btnMenuDaftarKapalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDaftarKapalActionPerformed
        new OperatorDaftarKapalForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuDaftarKapalActionPerformed

    private void btnMenuPenambatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPenambatanActionPerformed
        new OperatorPenambatanForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPenambatanActionPerformed

    private void btnMenuBongkarMuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBongkarMuatActionPerformed
        new OperatorBongkarMuatForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuBongkarMuatActionPerformed

    private void btnMenuKargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuKargoActionPerformed
        new OperatorKargoForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuKargoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        repository.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
        if (util.Sesi.pengguna != null) userLabel.setText(util.Sesi.pengguna.getNama() + "   \u00b7   Operator");
        util.Navigasi.gayaSidebar(btnMenuDashboard, btnMenuPendaftaran, btnMenuDaftarKapal, btnMenuPenambatan, btnMenuBongkarMuat, btnMenuKargo);
        gayaTabel(tblDashboard, scrollDashboard);
    }

    private void muatDashboard() throws Exception {
        List<Object[]> kapal = controller.getDaftarKapal();
        lblCardValue1.setText(String.valueOf(kapal.size()));
        lblCardValue2.setText(String.valueOf(controller.getKapalByStatus("Antre").size()));
        lblCardValue3.setText(String.valueOf(controller.getKapalByStatus("Sandar").size()));
        lblCardValue4.setText(String.valueOf(controller.getDaftarKargo().size()));
        tampilkanTabelDashboard(new String[] {"ID KAPAL",
                    "NAMA KAPAL",
                    "JENIS",
                    "GT",
                    "DRAF",
                    "KEDATANGAN",
                    "STATUS",
                    "DERMAGA",
                    "WAKTU SANDAR"}, kapal);
    }

    private void tampilkanTabelDashboard(String[] kolom, List<Object[]> baris) {
        DefaultTableModel m = new DefaultTableModel(kolom, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        for (int i = 0; i < Math.min(8, baris.size()); i++) m.addRow(baris.get(i));
        tblDashboard.setModel(m);
        tblDashboard.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 10));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuBongkarMuat;
    private javax.swing.JButton btnMenuDaftarKapal;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuKargo;
    private javax.swing.JButton btnMenuPenambatan;
    private javax.swing.JButton btnMenuPendaftaran;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCardTitle1;
    private javax.swing.JLabel lblCardTitle2;
    private javax.swing.JLabel lblCardTitle3;
    private javax.swing.JLabel lblCardTitle4;
    private javax.swing.JLabel lblCardValue1;
    private javax.swing.JLabel lblCardValue2;
    private javax.swing.JLabel lblCardValue3;
    private javax.swing.JLabel lblCardValue4;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRecent;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlCard1;
    private javax.swing.JPanel pnlCard2;
    private javax.swing.JPanel pnlCard3;
    private javax.swing.JPanel pnlCard4;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scrollDashboard;
    private javax.swing.JTable tblDashboard;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
