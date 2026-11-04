package view;

import controller.AuthController;
import model.Pengguna;
import javax.swing.JOptionPane;

/**
 * ArgoPort | Login. Tampilan diatur lewat NetBeans Design (LoginView.form).
 */
public class LoginView extends javax.swing.JFrame {

    private final AuthController authController = new AuthController();

    public LoginView() {
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
        pnlLogin = new javax.swing.JPanel();
        lblCardLogo = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();
        lblLoginSub = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegistrasi = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNavLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_sidebar.png"))); // NOI18N
        getContentPane().add(lblNavLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, 42, 42));

        btnNavBeranda.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavBeranda.setForeground(new java.awt.Color(255, 255, 255));
        btnNavBeranda.setText("Beranda");
        btnNavBeranda.setBorderPainted(false);
        btnNavBeranda.setContentAreaFilled(false);
        btnNavBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavBeranda.setFocusPainted(false);
        btnNavBeranda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBerandaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 22, 100, 36));

        btnNavLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavLogin.setForeground(new java.awt.Color(91, 197, 190));
        btnNavLogin.setText("Login");
        btnNavLogin.setBorderPainted(false);
        btnNavLogin.setContentAreaFilled(false);
        btnNavLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavLogin.setFocusPainted(false);
        btnNavLogin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 22, 90, 36));

        btnNavRegistrasi.setBackground(new java.awt.Color(0, 140, 140));
        btnNavRegistrasi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavRegistrasi.setForeground(new java.awt.Color(255, 255, 255));
        btnNavRegistrasi.setText("Registrasi");
        btnNavRegistrasi.setBorderPainted(false);
        btnNavRegistrasi.setContentAreaFilled(false);
        btnNavRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavRegistrasi.setFocusPainted(false);
        btnNavRegistrasi.setOpaque(true);
        btnNavRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavRegistrasiActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 22, 124, 36));

        btnNavKeluar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnNavKeluar.setText("Keluar");
        btnNavKeluar.setBorderPainted(false);
        btnNavKeluar.setContentAreaFilled(false);
        btnNavKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavKeluar.setFocusPainted(false);
        btnNavKeluar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNavKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnNavKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 22, 80, 36));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 231, 239)));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_card.png"))); // NOI18N
        pnlLogin.add(lblCardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 28, 47, 48));

        lblLoginTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(24, 39, 58));
        lblLoginTitle.setText("Selamat datang");
        pnlLogin.add(lblLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 88, 340, 38));

        lblLoginSub.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblLoginSub.setForeground(new java.awt.Color(111, 126, 145));
        lblLoginSub.setText("Masuk untuk melanjutkan ke workspace Anda.");
        pnlLogin.add(lblLoginSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 128, 340, 22));

        lblUsername.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(75, 91, 110));
        lblUsername.setText("USERNAME");
        pnlLogin.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 178, 340, 18));

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setBackground(new java.awt.Color(249, 251, 253));
        txtUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        pnlLogin.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 340, 44));

        lblPassword.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(75, 91, 110));
        lblPassword.setText("PASSWORD");
        pnlLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 262, 340, 18));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setBackground(new java.awt.Color(249, 251, 253));
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 226, 235)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 284, 340, 44));

        btnLogin.setBackground(new java.awt.Color(27, 93, 145));
        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Masuk ke sistem");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 354, 340, 46));

        btnRegistrasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnRegistrasi.setForeground(new java.awt.Color(27, 93, 145));
        btnRegistrasi.setText("Belum punya akun? Registrasi operator");
        btnRegistrasi.setBorderPainted(false);
        btnRegistrasi.setContentAreaFilled(false);
        btnRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrasi.setFocusPainted(false);
        btnRegistrasi.setOpaque(true);
        btnRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrasiActionPerformed(evt);
            }
        });
        pnlLogin.add(btnRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 414, 340, 32));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 115, 400, 470));

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
        // halaman ini sedang dibuka
    }//GEN-LAST:event_btnNavLoginActionPerformed

    private void btnNavRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavRegistrasiActionPerformed
        new RegisterView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNavRegistrasiActionPerformed

    private void btnNavKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavKeluarActionPerformed
        util.Navigasi.keluar(this);
    }//GEN-LAST:event_btnNavKeluarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        doLogin();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        doLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrasiActionPerformed
        new RegisterView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrasiActionPerformed

    private void doLogin() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan password wajib diisi.", "Data belum lengkap", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            Pengguna p = authController.login(username, password);
            util.Sesi.pengguna = p;
            dispose();
            if (p.getPeran().equalsIgnoreCase("Admin")) new AdminDashboardForm().setVisible(true);
            else new OperatorDashboardForm().setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Login tidak berhasil", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNavBeranda;
    private javax.swing.JButton btnNavKeluar;
    private javax.swing.JButton btnNavLogin;
    private javax.swing.JButton btnNavRegistrasi;
    private javax.swing.JButton btnRegistrasi;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCardLogo;
    private javax.swing.JLabel lblLoginSub;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblNavLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
