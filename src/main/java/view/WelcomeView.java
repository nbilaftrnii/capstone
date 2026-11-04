package view;


/**
 * ArgoPort | Beranda. Tampilan diatur lewat NetBeans Design (WelcomeView.form).
 */
public class WelcomeView extends javax.swing.JFrame {

    public WelcomeView() {
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
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Beranda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNavLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_sidebar.png"))); // NOI18N
        getContentPane().add(lblNavLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, 42, 42));

        btnNavBeranda.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavBeranda.setForeground(new java.awt.Color(91, 197, 190));
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

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_main.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBerandaActionPerformed
        // halaman ini sedang dibuka
    }//GEN-LAST:event_btnNavBerandaActionPerformed

    private void btnNavLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavLoginActionPerformed
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNavLoginActionPerformed

    private void btnNavRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavRegistrasiActionPerformed
        new RegisterView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNavRegistrasiActionPerformed

    private void btnNavKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavKeluarActionPerformed
        util.Navigasi.keluar(this);
    }//GEN-LAST:event_btnNavKeluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNavBeranda;
    private javax.swing.JButton btnNavKeluar;
    private javax.swing.JButton btnNavLogin;
    private javax.swing.JButton btnNavRegistrasi;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblNavLogo;
    // End of variables declaration//GEN-END:variables
}
