-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 09 Jan 2022 pada 06.41
-- Versi Server: 5.5.32
-- Versi PHP: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `uaspbo`
--
CREATE DATABASE IF NOT EXISTS `uaspbo` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `uaspbo`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `nip` varchar(35) NOT NULL,
  `nama_pegawai` varchar(200) NOT NULL,
  `pangkat_golongan` varchar(200) NOT NULL,
  `jenis_kelamin` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `agama` varchar(200) NOT NULL,
  `gaji` varchar(200) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`no`, `nip`, `nama_pegawai`, `pangkat_golongan`, `jenis_kelamin`, `alamat`, `agama`, `gaji`) VALUES
(1, '198104122009122003', 'Rusdina', 'Golongan 3', 'Perempuan', 'desa wayau kec. tanjung kab. tabalong', 'islam', '3.000.000'),
(3, '19630249', 'Muhammad Nasheh', 'Golongan 2', 'Laki-laki', 'tanjung', 'islam', '2.000.000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
