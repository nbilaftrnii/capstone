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
import config.DBConnection;

/**
 * ArgoPort | Operator Workspace - Penambatan Kapal.
 * Tampilan diatur lewat NetBeans Design (OperatorPenambatanForm.form); logika ada di luar blok GEN.
 */
public class OperatorPenambatanForm extends javax.swing.JFrame {
    private final OperatorController controller = new OperatorController();

    public OperatorPenambatanForm() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        siapkan();
        jalankan(this::muatDocking, "Gagal memuat data");
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
        pnlDocking = new javax.swing.JPanel();
        lblAntreTitle = new javax.swing.JLabel();
        lblDermagaKosongTitle = new javax.swing.JLabel();
        scrollAntre = new javax.swing.JScrollPane();
        tblAntre = new javax.swing.JTable();
        scrollDermagaKosong = new javax.swing.JScrollPane();
        tblDermagaKosong = new javax.swing.JTable();
        btnDocking = new javax.swing.JButton();
        btnMuatDocking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Operator Workspace - Penambatan Kapal");
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

        btnMenuPendaftaran.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuPendaftaran.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuPendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPendaftaran.setText("Pendaftaran Kapal Baru");
        btnMenuPendaftaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuPendaftaran.setContentAreaFilled(false);
        btnMenuPendaftaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPendaftaran.setFocusPainted(false);
        btnMenuPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPendaftaran.setOpaque(true);
        btnMenuPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPendaftaranActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 238, 219, 39));

        btnMenuDaftarKapal.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuDaftarKapal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuDaftarKapal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuDaftarKapal.setText("Lihat Daftar Kapal");
        btnMenuDaftarKapal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuDaftarKapal.setContentAreaFilled(false);
        btnMenuDaftarKapal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuDaftarKapal.setFocusPainted(false);
        btnMenuDaftarKapal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDaftarKapal.setOpaque(true);
        btnMenuDaftarKapal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDaftarKapalActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuDaftarKapal, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 286, 219, 39));

        btnMenuPenambatan.setBackground(new java.awt.Color(0, 140, 160));
        btnMenuPenambatan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuPenambatan.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPenambatan.setText("Penambatan Kapal");
        btnMenuPenambatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuPenambatan.setContentAreaFilled(false);
        btnMenuPenambatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPenambatan.setFocusPainted(false);
        btnMenuPenambatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPenambatan.setOpaque(true);
        btnMenuPenambatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPenambatanActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuPenambatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 334, 219, 39));

        btnMenuBongkarMuat.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuBongkarMuat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuBongkarMuat.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuBongkarMuat.setText("Bongkar Muat Kargo");
        btnMenuBongkarMuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuBongkarMuat.setContentAreaFilled(false);
        btnMenuBongkarMuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuBongkarMuat.setFocusPainted(false);
        btnMenuBongkarMuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuBongkarMuat.setOpaque(true);
        btnMenuBongkarMuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBongkarMuatActionPerformed(evt);
            }
        });
        pnlSidebar.add(btnMenuBongkarMuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 382, 219, 39));

        btnMenuKargo.setBackground(new java.awt.Color(28, 58, 95));
        btnMenuKargo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMenuKargo.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuKargo.setText("Kelola Data Kargo");
        btnMenuKargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 92, 140)));
        btnMenuKargo.setContentAreaFilled(false);
        btnMenuKargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuKargo.setFocusPainted(false);
        btnMenuKargo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuKargo.setOpaque(true);
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
        lblHeading.setText("Penambatan Kapal");
        pnlMain.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 800, 40));

        lblSubheading.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSubheading.setForeground(new java.awt.Color(112, 127, 145));
        lblSubheading.setText("Kelola dan pantau data penambatan kapal.");
        pnlMain.add(lblSubheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 900, 25));

        pnlDocking.setBackground(new java.awt.Color(255, 255, 255));
        pnlDocking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAntreTitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAntreTitle.setForeground(new java.awt.Color(34, 55, 77));
        lblAntreTitle.setText("KAPAL BERSTATUS ANTRE");
        pnlDocking.add(lblAntreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 22));

        lblDermagaKosongTitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblDermagaKosongTitle.setForeground(new java.awt.Color(34, 55, 77));
        lblDermagaKosongTitle.setText("DERMAGA KOSONG");
        pnlDocking.add(lblDermagaKosongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 300, 22));

        scrollAntre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblAntre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblAntre.setGridColor(new java.awt.Color(237, 241, 245));
        tblAntre.setRowHeight(30);
        tblAntre.setForeground(new java.awt.Color(43, 57, 73));
        tblAntre.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblAntre.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblAntre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID KAPAL", "NAMA KAPAL", "JENIS", "GT", "KEDATANGAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollAntre.setViewportView(tblAntre);

        pnlDocking.add(scrollAntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 470, 380));

        scrollDermagaKosong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 231, 238)));

        tblDermagaKosong.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDermagaKosong.setGridColor(new java.awt.Color(237, 241, 245));
        tblDermagaKosong.setRowHeight(30);
        tblDermagaKosong.setForeground(new java.awt.Color(43, 57, 73));
        tblDermagaKosong.setSelectionBackground(new java.awt.Color(222, 237, 249));
        tblDermagaKosong.setSelectionForeground(new java.awt.Color(25, 53, 78));
        tblDermagaKosong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DERMAGA", "NAMA DERMAGA", "KAPASITAS (TON)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDermagaKosong.setViewportView(tblDermagaKosong);

        pnlDocking.add(scrollDermagaKosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 471, 380));

        btnDocking.setBackground(new java.awt.Color(27, 93, 145));
        btnDocking.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnDocking.setForeground(new java.awt.Color(255, 255, 255));
        btnDocking.setText("Proses penambatan");
        btnDocking.setBorderPainted(false);
        btnDocking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDocking.setFocusPainted(false);
        btnDocking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDockingActionPerformed(evt);
            }
        });
        pnlDocking.add(btnDocking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 220, 36));

        btnMuatDocking.setBackground(new java.awt.Color(235, 241, 247));
        btnMuatDocking.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMuatDocking.setForeground(new java.awt.Color(43, 73, 101));
        btnMuatDocking.setText("Muat ulang");
        btnMuatDocking.setBorderPainted(false);
        btnMuatDocking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuatDocking.setFocusPainted(false);
        btnMuatDocking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatDockingActionPerformed(evt);
            }
        });
        pnlDocking.add(btnMuatDocking, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 450, 120, 36));

        pnlMain.add(pnlDocking, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 1001, 640));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 65, 1065, 755));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDashboardActionPerformed
        new OperatorDashboardForm().setVisible(true);
        dispose();
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
        // sudah berada di menu ini
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
        config.DBConnection.logout();
        util.Sesi.pengguna = null;
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDockingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDockingActionPerformed
        jalankan(this::prosesDocking, "Penambatan gagal");
    }//GEN-LAST:event_btnDockingActionPerformed

    private void btnMuatDockingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatDockingActionPerformed
        jalankan(this::muatDocking, "Gagal memuat data");
    }//GEN-LAST:event_btnMuatDockingActionPerformed

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
        gayaTabel(tblAntre, scrollAntre);
        gayaTabel(tblDermagaKosong, scrollDermagaKosong);
    }

    private void muatDocking() throws Exception {
        isi(tblAntre, controller.getKapalByStatus("Antre"));
        isi(tblDermagaKosong, controller.getDermagaKosong());
    }

    private void prosesDocking() throws Exception {
        if (tblDermagaKosong.getRowCount() == 0) {
            info("Dermaga Penuh, Kapal Tetap di Antrean");
            return;
        }
        String kapal = dipilih(tblAntre, 0, "Pilih kapal berstatus Antre terlebih dahulu.");
        String dermaga = dipilih(tblDermagaKosong, 0, "Pilih dermaga kosong terlebih dahulu.");
        controller.prosesDocking(kapal, dermaga);
        info("Penambatan Kapal Berhasil");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocking;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuBongkarMuat;
    private javax.swing.JButton btnMenuDaftarKapal;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuKargo;
    private javax.swing.JButton btnMenuPenambatan;
    private javax.swing.JButton btnMenuPendaftaran;
    private javax.swing.JButton btnMuatDocking;
    private javax.swing.JLabel lblAntreTitle;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblDermagaKosongTitle;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSubheading;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlDocking;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scrollAntre;
    private javax.swing.JScrollPane scrollDermagaKosong;
    private javax.swing.JTable tblAntre;
    private javax.swing.JTable tblDermagaKosong;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
