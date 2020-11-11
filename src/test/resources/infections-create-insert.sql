-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2020 at 07:41 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `birthdate` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `birthdate`, `name`) VALUES
(1, 372019027, 'Myles Popley'),
(2, 1056149025, 'Reine Steers'),
(3, -950173804, 'Ayn Benninger'),
(4, 950336452, 'Layton Dobbison'),
(5, 286697418, 'Niel McWhan'),
(6, 645899731, 'Davita Thomel'),
(7, 1007777894, 'Linell Dunbobin'),
(8, 1094879372, 'Fairleigh Barstow'),
(9, -1028827285, 'Arvy Tipling'),
(10, -995628839, 'Luce Snowding'),
(11, 1062100548, 'Kyrstin Mackney'),
(12, -293281873, 'Katinka Dowrey'),
(13, -362874538, 'Nadeen Reinert'),
(14, -410859588, 'Robbin Ascough'),
(15, 494570560, 'Marie-jeanne Draude'),
(16, -552172413, 'Jess Masden'),
(17, -664924291, 'Dedra Oke'),
(18, -622331231, 'Cart Battie'),
(19, 893988788, 'Alf Crocetti'),
(20, 454160902, 'Theo Fryatt'),
(21, 489912023, 'Hermina Annott'),
(22, 495385172, 'Cari Bellison'),
(23, 93406519, 'Tallie Giamitti'),
(24, 488027579, 'Albina Trippitt'),
(25, 27204087, 'Maryjo Sockell'),
(26, -297124587, 'Kial Baribal'),
(27, 64488153, 'Barnaby Stonuary'),
(28, 894600666, 'Quintilla Westwater'),
(29, -620749413, 'Luther Torvey'),
(30, 843254294, 'Jilleen Kemmett'),
(31, 203933148, 'Waly Huggons'),
(32, -751383334, 'Nanci Flisher'),
(33, -104154856, 'Camilla Pomfrey'),
(34, -606999853, 'Leigh Wewell'),
(35, -37887671, 'Kimmie Huddles'),
(36, -1244620233, 'Twila Chater'),
(37, -563128779, 'Serena Bradburn'),
(38, -1131359118, 'Elmer Spratling');

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
