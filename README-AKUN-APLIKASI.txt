ARGOPORT - LOGIN DAN REGISTRASI AKUN APLIKASI

1. Aktifkan MySQL pada XAMPP/Laragon.
2. Pastikan database argoport_db dan seluruh tabel proyek sudah diimpor.
3. Jalankan database_migration_akun_aplikasi.sql sekali melalui phpMyAdmin.
4. Buka project di NetBeans dan jalankan main.MainApp.
5. Halaman awal menyediakan Masuk ke Sistem dan Registrasi Akun Operator.
6. Registrasi hanya membuat akun dengan peran Operator. Akun Admin awal setelah migrasi: username admin, password Admin123! (segera ganti setelah login pertama). Registrasi mandiri hanya membuat akun Operator.

KONFIGURASI KONEKSI:
Default XAMPP: host localhost, port 3306, database argoport_db, user root, password kosong.
Jika berbeda, atur environment variable:
ARGOPORT_DB_URL, ARGOPORT_DB_USER, ARGOPORT_DB_PASSWORD.

Catatan: autentikasi akun aplikasi menggunakan PBKDF2-HMAC-SHA256 dengan salt acak.
Akun operator yang baru didaftarkan memerlukan hak akses database sesuai peran. Karena operasi aplikasi memakai satu koneksi layanan, atur kredensial database layanan yang hanya memiliki grant yang diperlukan. Untuk tugas lokal XAMPP default, root dapat digunakan saat pengembangan.
