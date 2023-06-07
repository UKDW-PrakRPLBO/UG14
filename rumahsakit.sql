-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2022 at 08:20 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

--
-- Database: `rumahsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `idDokter` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `spesialis` varchar(255) NOT NULL,
  `ruangan` varchar(5) NOT NULL
);

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`idDokter`, `nama`, `spesialis`, `ruangan`) VALUES
(1, 'Budi', 'Organ Dalam', 'A123');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `idPemeriksaan` int(11) NOT NULL,
  `rm` int(11) NOT NULL,
  `idDokter` int(11) NOT NULL,
  `idSuster` int(11) NOT NULL,
  `idPelayanan` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT 0
);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `rm` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `usia` int(11) NOT NULL,
  `alamat` varchar(255) NOT NULL
);

-- --------------------------------------------------------

--
-- Table structure for table `pelayanan`
--

CREATE TABLE `pelayanan` (
  `idPelayan` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL
);

--
-- Dumping data for table `pelayanan`
--

INSERT INTO `pelayanan` (`idPelayan`, `nama`) VALUES
(0, 'Andi');

-- --------------------------------------------------------

--
-- Table structure for table `suster`
--

CREATE TABLE `suster` (
  `idSuster` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL
);

--
-- Dumping data for table `suster`
--

INSERT INTO `suster` (`idSuster`, `nama`) VALUES
(1, 'Siti');


COMMIT;
