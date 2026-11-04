ARGOPORT - VERSI STABIL NETBEANS
================================

Versi ini dikembalikan ke struktur form utama yang sederhana agar tidak
membawa form tambahan hasil generate yang sebelumnya menyebabkan error.

FORM NETBEANS YANG DIPERTAHANKAN
- src/main/java/view/LoginView.java + LoginView.form
- src/main/java/view/AdminView.java + AdminView.form
- src/main/java/view/OperatorView.java + OperatorView.form

Menu Admin dan Operator dikelola di dalam form utamanya. Tidak ada form
menu tambahan yang dibuat otomatis atau dipaksakan ke ukuran 607x357.
Ukuran dan tata letak asli dipertahankan supaya komponen tidak terpotong.

CARA MEMBUKA
1. Extract ZIP ke folder biasa.
2. Buka NetBeans.
3. Pilih File > Open Project, lalu pilih folder Kelompok24-Agro.
4. Tunggu Maven memuat dependency dari pom.xml.
5. Buka package view.
6. Klik kanan LoginView.java, AdminView.java, atau OperatorView.java,
   lalu pilih Open. Gunakan tab Design untuk mengedit form.

MENJALANKAN APLIKASI
- Jalankan main.MainApp.
- Pastikan MySQL aktif dan database sudah dibuat sesuai file SQL.
- Dependency AbsoluteLayout dan MySQL Connector didefinisikan di pom.xml.

CATATAN
- Tidak menggunakan ukuran paksa 607x357.
- Tidak menggunakan form tambahan yang dibuat oleh generator sebelumnya.
- Layout asli AdminView dan OperatorView dipertahankan.
- Java source telah dicek kompilasi dengan stub AbsoluteLayout; build Maven
  dan pembukaan visual di NetBeans perlu dijalankan di komputer pengguna.


NAVIGASI DASHBOARD
- Menu Admin dan Operator berada di sidebar kiri pada jendela utama.
- Dashboard menampilkan kartu ringkasan dan preview tabel data terbaru saja.
- Klik menu di sidebar untuk membuka halaman pengelolaan pada area konten kanan.
- Tombol Keluar tetap berada di bagian bawah sidebar.


NAVIGASI DASHBOARD
- Menu Admin dan Operator berada di sidebar kiri pada jendela utama.
- Dashboard menampilkan kartu ringkasan dan preview tabel data terbaru saja.
- Klik menu di sidebar untuk membuka halaman pengelolaan pada area konten kanan.
- Tombol Keluar tetap berada di bagian bawah sidebar.


LOGO ARGOPORT SYSTEM
- File logo ada di src/main/resources/images/ (PNG transparan):
  logo_login.png    -> Login, Registrasi, Halaman Awal (panel kiri)
  logo_sidebar.png  -> sidebar AdminView dan OperatorView
  logo_app.png      -> ikon jendela (title bar / taskbar) semua halaman
  logo_full.png / logo_full_navy.png -> logo lengkap dengan tulisan
                       "Argoport System" (terang untuk latar gelap, navy untuk latar putih)
- Di NetBeans Design, logo adalah JLabel "lblLogo" (properti icon). Untuk mengganti,
  timpa file PNG dengan nama yang sama lalu Clean and Build.
- Kelas util.Branding memuat gambar dari classpath dan memasang ikon jendela.
- Perbaikan: LoginView kini meng-import JButton (sebelumnya tidak ada import).


SEMUA HALAMAN = JFRAME FORM (BISA DIBUKA DI TAB DESIGN)
- WelcomeView, LoginView, RegisterView, AdminView, OperatorView masing-masing punya
  file .java + .form. Tidak ada lagi komponen yang dibuat lewat kode saat runtime.
- Tombol menu sidebar (btnMenuDashboard, btnMenuDermaga, dst.) adalah JButton asli
  di pnlSidebar. Klik kanan tombol > Events > Action > actionPerformed untuk
  melihat/mengubah aksinya. Semua aksi memanggil bukaMenu(index) yang memindah halaman
  di area kanan tanpa menghilangkan sidebar.
- Dashboard (kartu statistik pnlCard1..4 dan tabel tblDashboard) adalah tab pertama
  "0. Dashboard" pada JTabbedPane "tabs". Di Design semua tab terlihat; saat aplikasi
  berjalan baris tab disembunyikan dan perpindahan hanya lewat sidebar.
- Tombol "Registrasi operator" di Login kini juga komponen form (btnRegistrasi).


HALAMAN AWAL, LOGIN, REGISTRASI (BACKGROUND + NAVBAR)
- Background: src/main/resources/images/bg_main.jpg (1100x680, tanpa tulisan), dipasang
  sebagai JLabel "lblBackground" di urutan paling belakang. Ganti gambar dengan menimpa
  file yang sama (ukuran 1100x680).
- Navbar seperti website: logo di kiri; Beranda | Login | Registrasi | Keluar di kanan
  (btnNavBeranda, btnNavLogin, btnNavRegistrasi, btnNavKeluar). Keluar menampilkan
  konfirmasi lalu menutup aplikasi (util.Navigasi.keluar).
- Form Login dan Registrasi berupa kartu putih di tengah, di atas background yang sama.

DASHBOARD DAN MENU (ADMIN & OPERATOR)
- Area kanan memakai CardLayout pada panel "pnlContent": card0 = Dashboard (ringkasan:
  kartu statistik + tabel data terbaru), card1..n = halaman menu.
- Halaman menu HANYA bisa dibuka lewat tombol di sidebar (tidak ada tab di dashboard).
- Di Design, pilih panel card (pnlDermaga, pnlSlot, dst.) lewat jendela Navigator untuk
  menampilkan dan mengedit card tersebut.


UPDATE v7
- Menu Admin dan Operator sekarang berupa form terpisah per menu (lihat TUTORIAL-NAVIGASI.txt).
- Login membuka AdminDashboardForm / OperatorDashboardForm.
