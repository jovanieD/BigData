-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2022 at 08:52 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventorycashieringsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashiertransaction`
--

CREATE TABLE `cashiertransaction` (
  `CashierTransaction` int(11) NOT NULL,
  `InventoryID` int(11) NOT NULL,
  `CQuantity` float NOT NULL,
  `UserID` int(11) NOT NULL,
  `Date` varchar(64) NOT NULL COMMENT '2022-12-31',
  `Time` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `InventoryID` int(11) NOT NULL,
  `ProductName` varchar(64) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `BuyingPrice` float NOT NULL,
  `SellingPrice` float NOT NULL,
  `InventoryQuantity` float NOT NULL,
  `UnitOfMeasure` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`InventoryID`, `ProductName`, `Description`, `BuyingPrice`, `SellingPrice`, `InventoryQuantity`, `UnitOfMeasure`) VALUES
(1, 'Nova', 'From Luzon', 8, 12, 100, 'pcs');

-- --------------------------------------------------------

--
-- Table structure for table `stafftransaction`
--

CREATE TABLE `stafftransaction` (
  `STransactionID` int(11) NOT NULL,
  `InventoryID` int(11) NOT NULL,
  `SQuantity` float NOT NULL,
  `TypeOfTransactio` varchar(64) NOT NULL COMMENT 'Add, Edit, Disable/Enable',
  `UserID` int(11) NOT NULL,
  `Date` varchar(32) NOT NULL,
  `Time` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `FirstName` varchar(64) NOT NULL,
  `LastName` varchar(64) NOT NULL,
  `Email` varchar(64) NOT NULL,
  `Password` varchar(64) NOT NULL,
  `Role` varchar(32) NOT NULL COMMENT 'Admin, Staff, Cashier',
  `Status` varchar(32) NOT NULL COMMENT 'Active, InActive'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `Role`, `Status`) VALUES
(1, 'Jovanie', 'Dasian', 'jovaniedasian@gmail.com', 'jovanie', 'Admin ', 'Active'),
(2, 'Shakera', 'Tinapay', 'shakeratinapay@gmail.com', 'shakera', 'Staff', 'InActive');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashiertransaction`
--
ALTER TABLE `cashiertransaction`
  ADD PRIMARY KEY (`CashierTransaction`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`InventoryID`);

--
-- Indexes for table `stafftransaction`
--
ALTER TABLE `stafftransaction`
  ADD PRIMARY KEY (`STransactionID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashiertransaction`
--
ALTER TABLE `cashiertransaction`
  MODIFY `CashierTransaction` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `InventoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `stafftransaction`
--
ALTER TABLE `stafftransaction`
  MODIFY `STransactionID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
