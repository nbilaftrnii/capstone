package view;

import controller.AuthController;
import javax.swing.JOptionPane;

/**
 * ArgoPort | Registrasi Operator. Tampilan diatur lewat NetBeans Design (RegisterView.form).
 */
public class RegisterView extends javax.swing.JFrame {

    public RegisterView() {
        initComponents();
        util.Branding.pasangIkonJendela(this);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNavLogo = new javax.swing.JLabel();
        btnNavBeranda = new javax.swing.JButton();
        btnNavLogin = new javax.swing.JButton();
        btnNavRegistrasi = new javax.swing.JButton();
        btnNavKeluar = new javax.swing.JButton();
        pnlRegistrasi = new javax.swing.JPanel();
        lblCardLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblConfirm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        btnDaftar = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Registrasi Operator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNavLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_sidebar.png"))); // NOI18N
        getContentPane().add(lblNavLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, 42, 42));

        btnNavBeranda.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavBeranda.setForeground(new java.awt.Color(255, 255, 255));
        btnNavBeranda.setText("Beranda");
        btnNavBeranda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavBeranda.setBorderPainted(false);
        btnNavBeranda.setContentAreaFilled(false);
        btnNavBeranda.setOpaque(false);
        btnNavBeranda.setFocusPainted(false);
        btnNavBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBerandaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 22, 100, 36));

        btnNavLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnNavLogin.setText("Login");
        btnNavLogin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavLogin.setBorderPainted(false);
        btnNavLogin.setContentAreaFilled(false);
        btnNavLogin.setOpaque(false);
        btnNavLogin.setFocusPainted(false);
        btnNavLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 22, 90, 36));

        btnNavRegistrasi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavRegistrasi.setForeground(new java.awt.Color(255, 255, 255));
        btnNavRegistrasi.setBackground(new java.awt.Color(0, 140, 140));
        btnNavRegistrasi.setText("Registrasi");
        btnNavRegistrasi.setBorderPainted(false);
        btnNavRegistrasi.setContentAreaFilled(false);
        btnNavRegistrasi.setOpaque(true);
        btnNavRegistrasi.setFocusPainted(false);
        btnNavRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavRegistrasiActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 22, 124, 36));

        btnNavKeluar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnNavKeluar.setText("Keluar");
        btnNavKeluar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavKeluar.setBorderPainted(false);
        btnNavKeluar.setContentAreaFilled(false);
        btnNavKeluar.setOpaque(false);
        btnNavKeluar.setFocusPainted(false);
        btnNavKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 22, 80, 36));

        pnlRegistrasi.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistrasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlRegistrasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_card.png"))); // NOI18N
        pnlRegistrasi.add(lblCardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 47, 48));

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(24, 39, 58));
        lblTitle.setText("Buat akun operator");
        pnlRegistrasi.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 78, 340, 36));

        lblSub.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSub.setForeground(new java.awt.Color(111, 126, 145));
        lblSub.setText("Isi data berikut untuk mendaftar.");
        pnlRegistrasi.add(lblSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 116, 340, 22));

        lblNama.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblNama.setForeground(new java.awt.Color(75, 91, 110));
        lblNama.setText("NAMA LENGKAP");
        pnlRegistrasi.add(lblNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 156, 340, 16));

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNama.setBackground(new java.awt.Color(249, 251, 253));
        txtNama.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        pnlRegistrasi.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, 340, 40));

        lblUsername.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(75, 91, 110));
        lblUsername.setText("USERNAME");
        pnlRegistrasi.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 226, 340, 16));

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setBackground(new java.awt.Color(249, 251, 253));
        txtUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        pnlRegistrasi.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, 340, 40));

        lblPassword.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(75, 91, 110));
        lblPassword.setText("PASSWORD (MINIMAL 8 KARAKTER)");
        pnlRegistrasi.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 296, 340, 16));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setBackground(new java.awt.Color(249, 251, 253));
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        pnlRegistrasi.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 316, 340, 40));

        lblConfirm.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblConfirm.setForeground(new java.awt.Color(75, 91, 110));
        lblConfirm.setText("ULANGI PASSWORD");
        pnlRegistrasi.add(lblConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 366, 340, 16));

        txtConfirm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtConfirm.setBackground(new java.awt.Color(249, 251, 253));
        txtConfirm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        pnlRegistrasi.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 386, 340, 40));

        btnDaftar.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setBackground(new java.awt.Color(0, 140, 140));
        btnDaftar.setText("Daftar sebagai Operator");
        btnDaftar.setBorderPainted(false);
        btnDaftar.setContentAreaFilled(false);
        btnDaftar.setOpaque(true);
        btnDaftar.setFocusPainted(false);
        btnDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        pnlRegistrasi.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 340, 46));

        btnKembali.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(27, 93, 145));
        btnKembali.setBackground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Sudah punya akun? Login");
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.setOpaque(true);
        btnKembali.setFocusPainted(false);
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        pnlRegistrasi.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 506, 340, 32));
        getContentPane().add(pnlRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 84, 400, 556));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_main.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBerandaActionPerformed
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNavBerandaActionPerformed

    private void btnNavLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavLoginActionPerformed
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNavLoginActionPerformed

    private void btnNavRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavRegistrasiActionPerformed
        // halaman ini sedang dibuka
    }//GEN-LAST:event_btnNavRegistrasiActionPerformed

    private void btnNavKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavKeluarActionPerformed
        util.Navigasi.keluar(this);
    }//GEN-LAST:event_btnNavKeluarActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        register();
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void register() {
        String pw = new String(txtPassword.getPassword());
        if (!pw.equals(new String(txtConfirm.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Konfirmasi password tidak sama.");
            return;
        }
        try {
            new AuthController().register(txtNama.getText(), txtUsername.getText(), pw);
            JOptionPane.showMessageDialog(this, "Registrasi berhasil. Silakan login.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            new LoginView().setVisible(true);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Registrasi gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnNavBeranda;
    private javax.swing.JButton btnNavKeluar;
    private javax.swing.JButton btnNavLogin;
    private javax.swing.JButton btnNavRegistrasi;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCardLogo;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNavLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlRegistrasi;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
