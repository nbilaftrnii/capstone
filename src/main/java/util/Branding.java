package util;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Pemasangan logo ArgoPort System. File gambar ada di
 * src/main/resources/images/ (dibaca lewat classpath, mis. /images/logo_login.png).
 */
public final class Branding {
    public static final String LOGO_APP = "/images/logo_app.png";
    public static final String LOGO_LOGIN = "/images/logo_login.png";
    public static final String LOGO_SIDEBAR = "/images/logo_sidebar.png";

    private Branding() {}

    /** Memuat gambar dari classpath; null jika file tidak ditemukan. */
    public static ImageIcon ikon(String path) {
        URL url = Branding.class.getResource(path);
        return url == null ? null : new ImageIcon(url);
    }

    /** Memasang logo sebagai ikon jendela (title bar / taskbar). */
    public static void pasangIkonJendela(JFrame frame) {
        ImageIcon ic = ikon(LOGO_APP);
        if (ic != null) frame.setIconImage(ic.getImage());
    }

    /** Label berisi logo siap pakai (untuk form yang dibuat manual). */
    public static JLabel labelLogo(String path) {
        JLabel l = new JLabel();
        ImageIcon ic = ikon(path);
        if (ic != null) l.setIcon(ic);
        return l;
    }
}
