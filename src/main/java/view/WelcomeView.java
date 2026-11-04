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

        jLabel1 = new javax.swing.JLabel();
        lblNavLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNavRegistrasi = new javax.swing.JButton();
        btnNavKeluar = new javax.swing.JButton();
        btnNavLogin = new javax.swing.JButton();
        btnNavBeranda = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArgoPort | Beranda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Argoport System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 510, 220));

        lblNavLogo.setBackground(new java.awt.Color(102, 255, 255));
        lblNavLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_sidebar.png"))); // NOI18N
        getContentPane().add(lblNavLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, 42, 42));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btnNavRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 124, 36));

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
        jPanel2.add(btnNavKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 80, 36));

        btnNavLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNavLogin.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(btnNavLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 90, 36));

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
        jPanel2.add(btnNavBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 36));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 80));

        lblBackground.setBackground(new java.awt.Color(0, 102, 153));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_main.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 1100, 680));

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

    private void btnNavRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        new RegisterView().setVisible(true);
        dispose();
    }                                                

    private void btnNavKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavKeluarActionPerformed
        util.Navigasi.keluar(this);
    }//GEN-LAST:event_btnNavKeluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNavBeranda;
    private javax.swing.JButton btnNavKeluar;
    private javax.swing.JButton btnNavLogin;
    private javax.swing.JButton btnNavRegistrasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblNavLogo;
    // End of variables declaration//GEN-END:variables
}
