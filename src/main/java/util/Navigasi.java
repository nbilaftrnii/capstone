package util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

/** Aksi navigasi bersama untuk halaman awal, login, registrasi, dan sidebar dashboard. */
public final class Navigasi {
    private static final Color AKTIF = new Color(0, 140, 160);
    private static final Color BIASA = new Color(28, 58, 95);
    private static final Color HOVER = new Color(40, 80, 125);
    private static final Color GARIS = new Color(52, 92, 140);

    private Navigasi() {}

    /** Konfirmasi lalu menutup aplikasi. */
    public static void keluar(Component parent) {
        int pilih = JOptionPane.showConfirmDialog(parent, "Yakin ingin keluar dari aplikasi?",
                "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pilih == JOptionPane.YES_OPTION) System.exit(0);
    }

    /** Membuat tombol sidebar tampil sebagai tombol sungguhan: garis tepi + efek hover. */
    public static void gayaSidebar(JButton... tombol) {
        for (JButton b : tombol) {
            b.setUI(new BasicButtonUI());
            b.setContentAreaFilled(false);
            b.setOpaque(true);
            b.setFocusPainted(false);
            b.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(GARIS, 1),
                    BorderFactory.createEmptyBorder(0, 14, 0, 8)));
            b.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mouseEntered(java.awt.event.MouseEvent e) {
                    if (!AKTIF.equals(b.getBackground())) b.setBackground(HOVER);
                }
                @Override public void mouseExited(java.awt.event.MouseEvent e) {
                    if (!AKTIF.equals(b.getBackground())) b.setBackground(BIASA);
                }
            });
        }
    }
}
