-- Jalankan sekali menggunakan akun MySQL administrator pada database argoport_db.
USE argoport_db;
CREATE TABLE IF NOT EXISTS akun_aplikasi (
 id_akun INT AUTO_INCREMENT PRIMARY KEY,
 nama_lengkap VARCHAR(100) NOT NULL,
 username VARCHAR(50) NOT NULL UNIQUE,
 password_hash VARCHAR(255) NOT NULL,
 salt VARCHAR(64) NOT NULL,
 peran ENUM('Admin','Operator') NOT NULL DEFAULT 'Operator',
 status_akun ENUM('Aktif','Nonaktif') NOT NULL DEFAULT 'Aktif',
 dibuat_pada TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Akun Admin awal: username admin / password Admin123!
-- Segera ubah password setelah login pertama.
INSERT INTO akun_aplikasi(nama_lengkap,username,password_hash,salt,peran,status_akun)
SELECT 'Administrator ArgoPort','admin','AHKxqeEyvWE8iAzTuUKaWtBECzOqtDilUrGJ9gpuJ1o=','DeRBa5S7JYqHiqgY23LOVg==','Admin','Aktif'
WHERE NOT EXISTS (SELECT 1 FROM akun_aplikasi WHERE username='admin');
