-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 29, 2026 at 02:33 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `argoport_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_pengguna` varchar(10) NOT NULL,
  `divisi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_pengguna`, `divisi`) VALUES
('U001', 'Keuangan - Dermaga 1 & 2'),
('U002', 'Keuangan - Dermaga 3 & 4'),
('U003', 'Keuangan - Dermaga 5 & 6'),
('U004', 'Keuangan - Dermaga 7 & 8'),
('U005', 'Keuangan - Dermaga 9 & 10'),
('U006', 'Keuangan - Dermaga 11 & 12'),
('U007', 'Keuangan - Dermaga 13 & 14'),
('U008', 'Keuangan - Dermaga 15 & 16'),
('U009', 'Keuangan - Dermaga 17 & 18'),
('U010', 'Keuangan - Dermaga 19 & 20'),
('U011', 'Keuangan - Dermaga 21 & 22'),
('U012', 'Keuangan - Dermaga 23 & 24'),
('U013', 'Administrasi Pusat Kaltim'),
('U014', 'Pengawasan Logistik Regional'),
('U015', 'Sistem & Operasional IT');

-- --------------------------------------------------------

--
-- Table structure for table `dermaga`
--

CREATE TABLE `dermaga` (
  `id_dermaga` varchar(10) NOT NULL,
  `nama_dermaga` varchar(50) NOT NULL,
  `status_dermaga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `dermaga`
--

INSERT INTO `dermaga` (`id_dermaga`, `nama_dermaga`, `status_dermaga`) VALUES
('D001', 'Dermaga Semayang I (Balikpapan)', 'Tersedia'),
('D002', 'Dermaga Semayang II (Balikpapan)', 'Sibuk'),
('D003', 'Dermaga Kariangau I (Balikpapan)', 'Tersedia'),
('D004', 'Dermaga Kariangau II (Balikpapan)', 'Tersedia'),
('D005', 'Dermaga Palaran I (Samarinda)', 'Perbaikan'),
('D006', 'Dermaga Mahakam II (Samarinda)', 'Tersedia'),
('D007', 'Dermaga Petikemas Balikpapan', 'Tersedia'),
('D008', 'Dermaga Umum Samarinda', 'Sibuk'),
('D009', 'Dermaga Lok Tuan I (Bontang)', 'Tersedia'),
('D010', 'Dermaga Lok Tuan II (Bontang)', 'Tersedia'),
('D011', 'Dermaga Pupuk Kaltim (Bontang)', 'Sibuk'),
('D012', 'Dermaga Sangatta Utara (Kutim)', 'Tersedia'),
('D013', 'Dermaga Sangatta Selatan (Kutim)', 'Tersedia'),
('D014', 'Dermaga Maloy International (Kutim)', 'Perbaikan'),
('D015', 'Dermaga Tanjung Redeb I (Berau)', 'Tersedia'),
('D016', 'Dermaga Tanjung Redeb II (Berau)', 'Tersedia'),
('D017', 'Dermaga Penajam I (PPU - IKN)', 'Tersedia'),
('D018', 'Dermaga Penajam II (PPU - IKN)', 'Tersedia'),
('D019', 'Dermaga Tanah Grogot (Paser)', 'Tersedia'),
('D020', 'Dermaga Sendawar Mahakam (Kubar)', 'Tersedia'),
('D021', 'Dermaga Tenggarong Seberang (Kukar)', 'Tersedia'),
('D022', 'Dermaga Muara Berau (Samarinda)', 'Sibuk'),
('D023', 'Dermaga Muara Jawa (Kukar)', 'Tersedia'),
('D024', 'Dermaga Samboja (Kukar)', 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_sandar`
--

CREATE TABLE `jadwal_sandar` (
  `id_jadwal` varchar(10) NOT NULL,
  `waktu_sandar` datetime NOT NULL,
  `waktu_lepas` datetime NOT NULL,
  `Kapal_id_kapal` varchar(10) NOT NULL,
  `Dermaga_id_dermaga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `jadwal_sandar`
--

INSERT INTO `jadwal_sandar` (`id_jadwal`, `waktu_sandar`, `waktu_lepas`, `Kapal_id_kapal`, `Dermaga_id_dermaga`) VALUES
('JS01', '2026-10-25 09:00:00', '2026-10-26 15:00:00', 'K001', 'D001'),
('JS02', '2026-10-26 12:30:00', '2026-10-27 10:00:00', 'K003', 'D003'),
('JS03', '2026-10-27 07:00:00', '2026-10-27 18:00:00', 'K005', 'D005'),
('JS04', '2026-10-27 08:30:00', '2026-10-28 12:00:00', 'K006', 'D002'),
('JS05', '2026-10-27 12:00:00', '2026-10-28 20:00:00', 'K008', 'D004'),
('JS06', '2026-10-28 07:30:00', '2026-10-29 10:00:00', 'K010', 'D006'),
('JS07', '2026-10-28 11:00:00', '2026-10-29 14:00:00', 'K012', 'D007'),
('JS08', '2026-10-29 06:30:00', '2026-10-30 08:00:00', 'K014', 'D008'),
('JS09', '2026-10-29 09:00:00', '2026-10-30 15:00:00', 'K015', 'D009'),
('JS10', '2026-10-30 08:00:00', '2026-10-31 12:00:00', 'K002', 'D010'),
('JS11', '2026-10-30 10:00:00', '2026-10-31 16:00:00', 'K004', 'D011'),
('JS12', '2026-10-31 07:00:00', '2026-11-01 10:00:00', 'K007', 'D012'),
('JS13', '2026-10-31 13:00:00', '2026-11-01 22:00:00', 'K009', 'D013'),
('JS14', '2026-11-01 06:00:00', '2026-11-02 12:00:00', 'K011', 'D014'),
('JS15', '2026-11-01 09:30:00', '2026-11-02 18:00:00', 'K013', 'D015'),
('JS16', '2026-11-02 07:00:00', '2026-11-03 14:00:00', 'K016', 'D016'),
('JS17', '2026-11-02 09:00:00', '2026-11-03 16:00:00', 'K017', 'D017'),
('JS18', '2026-11-03 08:00:00', '2026-11-04 12:00:00', 'K018', 'D018'),
('JS19', '2026-11-03 10:00:00', '2026-11-04 18:00:00', 'K019', 'D019'),
('JS20', '2026-11-04 06:30:00', '2026-11-05 10:00:00', 'K020', 'D020'),
('JS21', '2026-11-04 08:30:00', '2026-11-05 15:00:00', 'K021', 'D021'),
('JS22', '2026-11-05 07:00:00', '2026-11-06 12:00:00', 'K022', 'D022'),
('JS23', '2026-11-05 10:00:00', '2026-11-06 20:00:00', 'K023', 'D023'),
('JS24', '2026-11-06 08:00:00', '2026-11-07 14:00:00', 'K024', 'D024');

-- --------------------------------------------------------

--
-- Table structure for table `kapal`
--

CREATE TABLE `kapal` (
  `id_kapal` varchar(10) NOT NULL,
  `nama_kapal` varchar(50) NOT NULL,
  `jenis_kapal` varchar(30) NOT NULL,
  `gross_tonnage` decimal(10,2) NOT NULL,
  `draf_kapal` decimal(5,2) NOT NULL,
  `status_kapal` varchar(30) NOT NULL,
  `waktu_kedatangan` datetime NOT NULL,
  `keterangan_tambahan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kapal`
--

INSERT INTO `kapal` (`id_kapal`, `nama_kapal`, `jenis_kapal`, `gross_tonnage`, `draf_kapal`, `status_kapal`, `waktu_kedatangan`, `keterangan_tambahan`) VALUES
('K001', 'KM Mahakam Express', 'Kargo', '4500.00', '6.50', 'Sandar', '2026-10-25 08:00:00', NULL),
('K002', 'KM Balikpapan Jaya', 'Container', '6200.00', '8.00', 'Berlayar', '2026-10-26 10:30:00', NULL),
('K003', 'MV Kaltim Perkasa', 'Tanker', '7500.00', '9.20', 'Sandar', '2026-10-26 12:00:00', NULL),
('K004', 'KM Samarinda Indah', 'Kargo', '3800.00', '5.80', 'Berlayar', '2026-10-26 14:15:00', NULL),
('K005', 'KM Nusantara IKN', 'Container', '5100.00', '7.10', 'Sandar', '2026-10-27 06:30:00', NULL),
('K006', 'KM Semayang Permai', 'Feri', '2900.00', '4.50', 'Sandar', '2026-10-27 08:00:00', NULL),
('K007', 'KM Baruna Kaltim', 'Kargo', '4600.00', '6.60', 'Berlayar', '2026-10-27 09:45:00', NULL),
('K008', 'MV Energy Balikpapan', 'Tanker', '8100.00', '10.00', 'Sandar', '2026-10-27 11:20:00', NULL),
('K009', 'KM Palaran Trade', 'Container', '6400.00', '8.30', 'Berlayar', '2026-10-27 13:00:00', NULL),
('K010', 'KM Delta Mahakam', 'Kargo', '4200.00', '6.00', 'Sandar', '2026-10-28 07:10:00', NULL),
('K011', 'KM Benua Etam', 'Kargo', '3900.00', '5.50', 'Berlayar', '2026-10-28 09:00:00', NULL),
('K012', 'KM Kutai Sejahtera', 'Container', '7000.00', '8.90', 'Sandar', '2026-10-28 10:30:00', NULL),
('K013', 'MV Pertamina Kaltim', 'Tanker', '8500.00', '10.50', 'Berlayar', '2026-10-28 13:15:00', NULL),
('K014', 'KM Rimba Kalimantan', 'Kargo', '4800.00', '6.80', 'Sandar', '2026-10-29 06:00:00', NULL),
('K015', 'KM Pesona Etam', 'Feri', '3100.00', '4.80', 'Sandar', '2026-10-29 08:30:00', NULL),
('K016', 'KM Bontang Sejahtera', 'Container', '5300.00', '7.40', 'Sandar', '2026-10-29 09:15:00', NULL),
('K017', 'MV Pupuk Kaltim II', 'Tanker', '7200.00', '9.00', 'Berlayar', '2026-10-29 11:00:00', NULL),
('K018', 'KM Sangatta Permai', 'Kargo', '4100.00', '6.10', 'Sandar', '2026-10-30 07:00:00', NULL),
('K019', 'KM Berau Indah', 'Kargo', '4900.00', '6.90', 'Berlayar', '2026-10-30 08:30:00', NULL),
('K020', 'KM Penajam Nusantara', 'Feri', '2800.00', '4.20', 'Sandar', '2026-10-30 10:00:00', NULL),
('K021', 'KM Paser Sejahtera', 'Kargo', '3600.00', '5.50', 'Berlayar', '2026-10-30 13:00:00', NULL),
('K022', 'KM Mahakam Ulu', 'Kargo', '3400.00', '5.20', 'Sandar', '2026-10-31 06:30:00', NULL),
('K023', 'KM Kutai Kartanegara', 'Container', '6100.00', '7.80', 'Berlayar', '2026-10-31 09:00:00', NULL),
('K024', 'KM Samboja Indah', 'Feri', '3000.00', '4.60', 'Sandar', '2026-10-31 10:30:00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `kargo`
--

CREATE TABLE `kargo` (
  `id_kargo` varchar(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `berat_ton` decimal(10,2) NOT NULL,
  `status_kargo` varchar(30) NOT NULL,
  `Kapal_id_kapal` varchar(10) NOT NULL,
  `Slot_Gudang_id_slot` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kargo`
--

INSERT INTO `kargo` (`id_kargo`, `nama_barang`, `berat_ton`, `status_kargo`, `Kapal_id_kapal`, `Slot_Gudang_id_slot`) VALUES
('KG01', 'Besi Baja Proyek IKN', '120.50', 'Disimpan', 'K001', 'SG01'),
('KG02', 'Peti Kemas Elektronik', '250.00', 'Disimpan', 'K002', 'SG02'),
('KG03', 'Bahan Bakar Industri', '450.20', 'Disimpan', 'K003', 'SG03'),
('KG04', 'Beras Logistik Kaltim', '180.00', 'Dalam Pengiriman', 'K004', 'SG04'),
('KG05', 'Suku Cadang Alat Berat IKN', '95.40', 'Disimpan', 'K005', 'SG05'),
('KG06', 'Kendaraan Bermotor', '310.00', 'Disimpan', 'K006', 'SG06'),
('KG07', 'Pupuk Subsidi Pertanian', '210.50', 'Disimpan', 'K007', 'SG07'),
('KG08', 'Bahan Kimia Pemurnian', '150.00', 'Disimpan', 'K008', 'SG08'),
('KG09', 'Kayu Olahan Plywood', '135.20', 'Disimpan', 'K009', 'SG09'),
('KG10', 'Kertas HVS Lokal', '88.00', 'Disimpan', 'K010', 'SG10'),
('KG11', 'Karet Lembaran Etam', '160.00', 'Disimpan', 'K011', 'SG11'),
('KG12', 'Tekstil & Pakaian Jadi', '75.30', 'Disimpan', 'K012', 'SG12'),
('KG13', 'Biji Tambang Lokal', '290.00', 'Disimpan', 'K013', 'SG13'),
('KG14', 'Gula Pasir Konsumsi', '140.00', 'Disimpan', 'K014', 'SG14'),
('KG15', 'Alat Berat Konstruksi', '520.00', 'Disimpan', 'K015', 'SG15'),
('KG16', 'Peti Kemas Ekspor', '300.00', 'Disimpan', 'K016', 'SG16'),
('KG17', 'Pupuk Urea Curah', '420.00', 'Disimpan', 'K017', 'SG17'),
('KG18', 'Batu Bara Kalbar', '600.00', 'Disimpan', 'K018', 'SG18'),
('KG19', 'Hasil Hutan Kayu', '230.00', 'Disimpan', 'K019', 'SG19'),
('KG20', 'Logistik Pendukung IKN', '190.00', 'Disimpan', 'K020', 'SG20'),
('KG21', 'Hasil Perkebunan Sawit', '350.00', 'Disimpan', 'K021', 'SG21'),
('KG22', 'Sembako Masyarakat', '110.00', 'Disimpan', 'K022', 'SG22'),
('KG23', 'Material Bangunan', '270.00', 'Disimpan', 'K023', 'SG23'),
('KG24', 'Kendaraan Niaga', '280.00', 'Disimpan', 'K024', 'SG24');

-- --------------------------------------------------------

--
-- Table structure for table `operator`
--

CREATE TABLE `operator` (
  `id_pengguna` varchar(10) NOT NULL,
  `divisi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `operator`
--

INSERT INTO `operator` (`id_pengguna`, `divisi`) VALUES
('U016', 'Operator Dermaga D001'),
('U017', 'Operator Dermaga D002'),
('U018', 'Operator Dermaga D003'),
('U019', 'Operator Dermaga D004'),
('U020', 'Operator Dermaga D005'),
('U021', 'Operator Dermaga D006'),
('U022', 'Operator Dermaga D007'),
('U023', 'Operator Dermaga D008'),
('U024', 'Operator Dermaga D009'),
('U025', 'Operator Dermaga D010'),
('U026', 'Operator Dermaga D011'),
('U027', 'Operator Dermaga D012'),
('U028', 'Operator Dermaga D013'),
('U029', 'Operator Dermaga D014'),
('U030', 'Operator Dermaga D015'),
('U031', 'Operator Dermaga D016'),
('U032', 'Operator Dermaga D017'),
('U033', 'Operator Dermaga D018'),
('U034', 'Operator Dermaga D019'),
('U035', 'Operator Dermaga D020'),
('U036', 'Operator Dermaga D021'),
('U037', 'Operator Dermaga D022'),
('U038', 'Operator Dermaga D023'),
('U039', 'Operator Dermaga D024');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `id_pengguna` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `peran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`id_pengguna`, `nama`, `peran`) VALUES
('U001', 'Budi Santoso', 'Admin'),
('U002', 'Dewi Lestari', 'Admin'),
('U003', 'Eko Saputra', 'Admin'),
('U004', 'Siti Rahma', 'Admin'),
('U005', 'Ahmad Dani', 'Admin'),
('U006', 'Joko Prasetyo', 'Admin'),
('U007', 'Rina Marlina', 'Admin'),
('U008', 'Doni Setiawan', 'Admin'),
('U009', 'Fitri Handayani', 'Admin'),
('U010', 'Hendra Gunawan', 'Admin'),
('U011', 'Mega Wati', 'Admin'),
('U012', 'Reza Pahlevi', 'Admin'),
('U013', 'Riki Pratama', 'Admin'),
('U014', 'Wahyudi', 'Admin'),
('U015', 'Siti Aminah', 'Admin'),
('U016', 'Andi Pratama', 'Operator'),
('U017', 'Bayu Setyo', 'Operator'),
('U018', 'Candra Wijaya', 'Operator'),
('U019', 'Dian Kusuma', 'Operator'),
('U020', 'Fajar Sidik', 'Operator'),
('U021', 'Gilang Ramadhan', 'Operator'),
('U022', 'Hadi Sucipto', 'Operator'),
('U023', 'Irfan Hakim', 'Operator'),
('U024', 'Jefri Nichol', 'Operator'),
('U025', 'Kurniawan', 'Operator'),
('U026', 'Lukman Hakim', 'Operator'),
('U027', 'Muhammad Ali', 'Operator'),
('U028', 'Noval Aulia', 'Operator'),
('U029', 'Oky Setiawan', 'Operator'),
('U030', 'Prasetyo', 'Operator'),
('U031', 'Qomarudin', 'Operator'),
('U032', 'Rahmat Hidayat', 'Operator'),
('U033', 'Rian Dhyani', 'Operator'),
('U034', 'Sandy Pratama', 'Operator'),
('U035', 'Teguh Prakoso', 'Operator'),
('U036', 'Utomo', 'Operator'),
('U037', 'Vicky Prasetyo', 'Operator'),
('U038', 'Wahyu Hidayat', 'Operator'),
('U039', 'Zainal Arifin', 'Operator');

-- --------------------------------------------------------

--
-- Table structure for table `retribusi`
--

CREATE TABLE `retribusi` (
  `id_retribusi` varchar(10) NOT NULL,
  `total_biaya` decimal(12,2) NOT NULL,
  `tarif` decimal(12,2) NOT NULL,
  `tanggal_bayar` date NOT NULL,
  `status_bayar` varchar(30) NOT NULL,
  `Admin_id_pengguna` varchar(10) NOT NULL,
  `Kapal_id_kapal` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `retribusi`
--

INSERT INTO `retribusi` (`id_retribusi`, `total_biaya`, `tarif`, `tanggal_bayar`, `status_bayar`, `Admin_id_pengguna`, `Kapal_id_kapal`) VALUES
('R001', '2500000.00', '500000.00', '2026-10-25', 'Lunas', 'U001', 'K001'),
('R002', '3100000.00', '500000.00', '2026-10-26', 'Lunas', 'U001', 'K002'),
('R003', '4200000.00', '600000.00', '2026-10-26', 'Lunas', 'U002', 'K003'),
('R004', '2100000.00', '400000.00', '2026-10-26', 'Lunas', 'U002', 'K004'),
('R005', '2800000.00', '500000.00', '2026-10-27', 'Lunas', 'U003', 'K005'),
('R006', '1900000.00', '350000.00', '2026-10-27', 'Lunas', 'U003', 'K006'),
('R007', '2600000.00', '500000.00', '2026-10-27', 'Lunas', 'U004', 'K007'),
('R008', '4500000.00', '700000.00', '2026-10-27', 'Lunas', 'U004', 'K008'),
('R009', '3300000.00', '550000.00', '2026-10-27', 'Lunas', 'U005', 'K009'),
('R010', '2300000.00', '450000.00', '2026-10-28', 'Lunas', 'U005', 'K010'),
('R011', '2150000.00', '400000.00', '2026-10-28', 'Lunas', 'U006', 'K011'),
('R012', '3800000.00', '600000.00', '2026-10-28', 'Lunas', 'U006', 'K012'),
('R013', '4700000.00', '750000.00', '2026-10-28', 'Lunas', 'U007', 'K013'),
('R014', '2700000.00', '500000.00', '2026-10-29', 'Lunas', 'U007', 'K014'),
('R015', '2000000.00', '350000.00', '2026-10-29', 'Lunas', 'U008', 'K015'),
('R016', '3200000.00', '500000.00', '2026-10-29', 'Lunas', 'U008', 'K016'),
('R017', '4100000.00', '650000.00', '2026-10-29', 'Lunas', 'U009', 'K017'),
('R018', '2400000.00', '400000.00', '2026-10-30', 'Lunas', 'U009', 'K018'),
('R019', '2900000.00', '500000.00', '2026-10-30', 'Lunas', 'U010', 'K019'),
('R020', '1800000.00', '300000.00', '2026-10-30', 'Lunas', 'U010', 'K020'),
('R021', '2250000.00', '400000.00', '2026-10-30', 'Lunas', 'U011', 'K021'),
('R022', '2050000.00', '350000.00', '2026-10-31', 'Lunas', 'U011', 'K022'),
('R023', '3900000.00', '600000.00', '2026-10-31', 'Lunas', 'U012', 'K023'),
('R024', '1950000.00', '350000.00', '2026-10-31', 'Lunas', 'U012', 'K024');

-- --------------------------------------------------------

--
-- Table structure for table `slot_gudang`
--

CREATE TABLE `slot_gudang` (
  `id_slot` varchar(10) NOT NULL,
  `kode_blok` varchar(20) NOT NULL,
  `status_slot` enum('Kosong','Terisi','Penuh') DEFAULT 'Kosong',
  `Operator_id_pengguna` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `slot_gudang`
--

INSERT INTO `slot_gudang` (`id_slot`, `kode_blok`, `status_slot`, `Operator_id_pengguna`) VALUES
('SG01', 'Blok D001-A', 'Terisi', 'U016'),
('SG02', 'Blok D002-A', 'Kosong', 'U017'),
('SG03', 'Blok D003-A', 'Terisi', 'U018'),
('SG04', 'Blok D004-A', 'Kosong', 'U019'),
('SG05', 'Blok D005-A', 'Terisi', 'U020'),
('SG06', 'Blok D006-A', 'Kosong', 'U021'),
('SG07', 'Blok D007-A', 'Terisi', 'U022'),
('SG08', 'Blok D008-A', 'Kosong', 'U023'),
('SG09', 'Blok D009-A', 'Terisi', 'U024'),
('SG10', 'Blok D010-A', 'Kosong', 'U025'),
('SG11', 'Blok D011-A', 'Terisi', 'U026'),
('SG12', 'Blok D012-A', 'Kosong', 'U027'),
('SG13', 'Blok D013-A', 'Terisi', 'U028'),
('SG14', 'Blok D014-A', 'Kosong', 'U029'),
('SG15', 'Blok D015-A', 'Terisi', 'U030'),
('SG16', 'Blok D016-A', 'Kosong', 'U031'),
('SG17', 'Blok D017-A', 'Terisi', 'U032'),
('SG18', 'Blok D018-A', 'Kosong', 'U033'),
('SG19', 'Blok D019-A', 'Terisi', 'U034'),
('SG20', 'Blok D020-A', 'Kosong', 'U035'),
('SG21', 'Blok D021-A', 'Terisi', 'U036'),
('SG22', 'Blok D022-A', 'Kosong', 'U037'),
('SG23', 'Blok D023-A', 'Terisi', 'U038'),
('SG24', 'Blok D024-A', 'Kosong', 'U039');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `dermaga`
--
ALTER TABLE `dermaga`
  ADD PRIMARY KEY (`id_dermaga`);

--
-- Indexes for table `jadwal_sandar`
--
ALTER TABLE `jadwal_sandar`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD KEY `Kapal_id_kapal` (`Kapal_id_kapal`),
  ADD KEY `Dermaga_id_dermaga` (`Dermaga_id_dermaga`);

--
-- Indexes for table `kapal`
--
ALTER TABLE `kapal`
  ADD PRIMARY KEY (`id_kapal`);

--
-- Indexes for table `kargo`
--
ALTER TABLE `kargo`
  ADD PRIMARY KEY (`id_kargo`),
  ADD KEY `Kapal_id_kapal` (`Kapal_id_kapal`),
  ADD KEY `Slot_Gudang_id_slot` (`Slot_Gudang_id_slot`);

--
-- Indexes for table `operator`
--
ALTER TABLE `operator`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `retribusi`
--
ALTER TABLE `retribusi`
  ADD PRIMARY KEY (`id_retribusi`),
  ADD KEY `Admin_id_pengguna` (`Admin_id_pengguna`),
  ADD KEY `Kapal_id_kapal` (`Kapal_id_kapal`);

--
-- Indexes for table `slot_gudang`
--
ALTER TABLE `slot_gudang`
  ADD PRIMARY KEY (`id_slot`),
  ADD KEY `Operator_id_pengguna` (`Operator_id_pengguna`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `jadwal_sandar`
--
ALTER TABLE `jadwal_sandar`
  ADD CONSTRAINT `jadwal_sandar_ibfk_1` FOREIGN KEY (`Kapal_id_kapal`) REFERENCES `kapal` (`id_kapal`),
  ADD CONSTRAINT `jadwal_sandar_ibfk_2` FOREIGN KEY (`Dermaga_id_dermaga`) REFERENCES `dermaga` (`id_dermaga`);

--
-- Constraints for table `kargo`
--
ALTER TABLE `kargo`
  ADD CONSTRAINT `kargo_ibfk_1` FOREIGN KEY (`Kapal_id_kapal`) REFERENCES `kapal` (`id_kapal`),
  ADD CONSTRAINT `kargo_ibfk_2` FOREIGN KEY (`Slot_Gudang_id_slot`) REFERENCES `slot_gudang` (`id_slot`);

--
-- Constraints for table `operator`
--
ALTER TABLE `operator`
  ADD CONSTRAINT `operator_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `retribusi`
--
ALTER TABLE `retribusi`
  ADD CONSTRAINT `retribusi_ibfk_1` FOREIGN KEY (`Admin_id_pengguna`) REFERENCES `admin` (`id_pengguna`),
  ADD CONSTRAINT `retribusi_ibfk_2` FOREIGN KEY (`Kapal_id_kapal`) REFERENCES `kapal` (`id_kapal`);

--
-- Constraints for table `slot_gudang`
--
ALTER TABLE `slot_gudang`
  ADD CONSTRAINT `slot_gudang_ibfk_1` FOREIGN KEY (`Operator_id_pengguna`) REFERENCES `operator` (`id_pengguna`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
