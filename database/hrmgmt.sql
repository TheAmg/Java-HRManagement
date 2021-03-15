-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 11:01 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hrmgmt`
--

-- --------------------------------------------------------

--
-- Table structure for table `applications`
--

CREATE TABLE `applications` (
  `userid` int(3) NOT NULL,
  `deptid` int(3) NOT NULL,
  `arole` varchar(25) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `applications`
--

INSERT INTO `applications` (`userid`, `deptid`, `arole`, `status`) VALUES
(7, 1, 'E', 'P'),
(3, 1, 'E', 'P');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `deptid` int(11) NOT NULL,
  `deptname` varchar(25) NOT NULL,
  `leaderid` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`deptid`, `deptname`, `leaderid`) VALUES
(1, 'Dep A', 1),
(2, 'Dep B', 0),
(3, 'Dep C', 0),
(4, 'Dept D', 0),
(5, 'Dept E', 0);

-- --------------------------------------------------------

--
-- Table structure for table `policies`
--

CREATE TABLE `policies` (
  `deptid` int(3) NOT NULL,
  `minimumwork` int(3) NOT NULL,
  `positions` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `policies`
--

INSERT INTO `policies` (`deptid`, `minimumwork`, `positions`) VALUES
(1, 5, 2),
(2, 10, 5),
(3, 6, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tointerview`
--

CREATE TABLE `tointerview` (
  `userid` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `role` varchar(25) NOT NULL,
  `deptid` int(2) NOT NULL,
  `salary` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `qualifications` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `username`, `password`, `role`, `deptid`, `salary`, `email`, `qualifications`) VALUES
(1, 'suraj', 'suraj', 'DL', 1, 99000, 'suraj@surajmail.com', 'B'),
(2, 'gagan', 'gagan', 'HR', 3, 99000, 'secretkrishna@ggmail.com', 'BE'),
(3, 'nuub', 'nub', 'A', 0, 0, 'nub@noobmail.com', 'PHD'),
(4, 'marlo', 'marlo', 'A', 0, 0, 'Unknown', 'Unknown'),
(5, 'chetan', 'chetan', 'E', 2, 99000, 'chetan@cmail.com', 'BE'),
(6, 'a', 'a', 'E', 2, 420, 'something', 'MS'),
(7, 'b', 'b', 'A', 0, 0, 'b@blackmail.com', 'PHD'),
(8, 'pakisthan_143', 'paki', 'A', 0, 0, 'Unknown', 'Unknown'),
(9, 'c', 'c', 'A', 0, 0, 'Unknown', 'Unknown'),
(10, 'd', 'd', 'A', 0, 0, 'Unknown', 'Unknown'),
(11, 'sunil', 'sunil', 'E', 4, 45000, 'sunil@sunilmail.com', 'B'),
(12, 'sharath', 'sharath', 'E', 5, 50000, 'sharath@sharathmail.com', 'B'),
(13, 'ddval666', 'ddval666', 'HR', 3, 99000, 'ddval666@ddval.com', 'PHD');

-- --------------------------------------------------------

--
-- Table structure for table `worktbl`
--

CREATE TABLE `worktbl` (
  `userid` int(3) NOT NULL,
  `totalwork` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `worktbl`
--

INSERT INTO `worktbl` (`userid`, `totalwork`) VALUES
(1, 36),
(5, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`deptid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `deptid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
