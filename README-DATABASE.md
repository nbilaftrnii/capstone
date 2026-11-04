# ArgoPort - Setup Database MySQL

Project menggunakan MySQL lokal dengan nama database `argoport_db`.
Driver MySQL Connector/J sudah dideklarasikan pada `pom.xml`, sehingga Maven/NetBeans
akan mengunduh driver saat project dibuka/build.

## Setup pertama kali setelah clone

1. Install/jalankan XAMPP atau Laragon dengan **MySQL 8.x**, lalu aktifkan MySQL.
2. Buka `http://localhost/phpmyadmin`.
3. Buat database baru dengan nama **argoport_db** (collation `utf8mb4` disarankan).
4. Pilih database `argoport_db` → **Import** → pilih `database/argoport_db.sql` → **Go**.
   File ini membuat tabel dan mengisi data awal (pengguna, kapal, dermaga, jadwal,
   kargo, slot gudang, dan retribusi).
5. Masih di phpMyAdmin, pilih database `argoport_db` → **Import** → jalankan
   `database_migration_argoport.sql`. Jalankan sebagai administrator/root.
6. Import `database_migration_akun_aplikasi.sql` untuk membuat tabel akun login
   aplikasi dan akun admin awal.
7. Buka folder project di NetBeans sebagai Maven Project, tunggu dependency selesai
   diunduh, lalu jalankan `main.MainApp`.

## Konfigurasi koneksi Java

File koneksi: `src/main/java/repository/DBConnection.java`

Default XAMPP:
- Host: `localhost`
- Port: `3306`
- Database: `argoport_db`
- Username: `root`
- Password: kosong

Jika konfigurasi MySQL berbeda, atur environment variable sebelum menjalankan NetBeans:
- `ARGOPORT_DB_URL` (contoh `jdbc:mysql://localhost:3306/argoport_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Makassar`)
- `ARGOPORT_DB_USER`
- `ARGOPORT_DB_PASSWORD`

`pom.xml` sudah memuat dependency `com.mysql:mysql-connector-j:8.4.0`.
Tidak perlu menambahkan JAR Connector/J secara manual jika project dibuka sebagai Maven Project.

## Login awal

Setelah `database_migration_akun_aplikasi.sql` berhasil diimpor:
- Username: `admin`
- Password: `Admin123!`

Segera ganti password setelah login pertama. Registrasi dari aplikasi membuat akun dengan
peran Operator.

## Catatan akun database (DCL)

`database_migration_argoport.sql` juga menyiapkan akun MySQL `admin_argo` dan
`operator_argo` untuk kebutuhan praktikum hak akses. Password awal lokal:
- `admin_argo`: `AdminArgo123!`
- `operator_argo`: `OperatorArgo123!`

Ganti password tersebut untuk penggunaan selain komputer lokal praktikum. Aplikasi
secara default menggunakan `root` lokal melalui environment variable, bukan kedua akun
DCL tersebut. Jangan menyimpan password produksi di GitHub.

## Jika koneksi gagal

- Pastikan MySQL aktif dan port sesuai.
- Pastikan database bernama persis `argoport_db`.
- Pastikan ketiga file SQL di atas diimpor dengan urutan yang benar.
- Periksa `ARGOPORT_DB_URL`, `ARGOPORT_DB_USER`, dan `ARGOPORT_DB_PASSWORD` jika
  pernah diatur di sistem.
- Buka Output NetBeans untuk melihat pesan error koneksi.
