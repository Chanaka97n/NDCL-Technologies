-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2020 at 08:32 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pcview`
--

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `sale_id` varchar(15) NOT NULL,
  `item_id` varchar(10) NOT NULL,
  `unit_price` int(10) NOT NULL,
  `no_of_items` int(50) NOT NULL,
  `total_price` int(10) NOT NULL,
  `discount` int(10) NOT NULL,
  `payable` int(10) NOT NULL,
  `cash` int(10) NOT NULL,
  `balance` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale_id`, `item_id`, `unit_price`, `no_of_items`, `total_price`, `discount`, `payable`, `cash`, `balance`, `date`) VALUES
('SID100', 'iid100', 2000, 2, 4000, 100, 3900, 4000, 100, '2020-10-18'),
('SID101', 'iid101', 2000, 3, 6000, 500, 5500, 5500, 0, '2020-10-18'),
('SID102', 'iid102', 280000, 1, 280000, 10000, 270000, 300000, 30000, '2020-10-18'),
('SID103', 'iid103', 83000, 2, 166000, 10000, 156000, 160000, 4000, '2020-10-18'),
('SID104', 'iid103', 83000, 1, 83000, 1000, 82000, 82000, 0, '2020-10-18'),
('SID105', 'iid103', 83000, 1, 83000, 3000, 80000, 80000, 0, '2020-10-19'),
('SID106', 'iid101', 2000, 3, 6000, 500, 5500, 5500, 0, '2020-10-23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`sale_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
