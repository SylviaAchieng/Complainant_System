-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2024 at 09:44 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `complainant`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_complaints`
--

CREATE TABLE `add_complaints` (
  `Id` int(11) NOT NULL,
  `category` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `add_complaints`
--

INSERT INTO `add_complaints` (`Id`, `category`) VALUES
(2, 'Academics'),
(3, 'Adminstrative issues'),
(4, 'social issues'),
(13, 'Finance');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Id`, `name`, `email`, `password`) VALUES
(1, 'admin', 'admin@gmail.com', 'Admin@1234');

-- --------------------------------------------------------

--
-- Table structure for table `depart`
--

CREATE TABLE `depart` (
  `Id` int(11) NOT NULL,
  `department` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `depart`
--

INSERT INTO `depart` (`Id`, `department`) VALUES
(1, 'Computer Science'),
(2, 'Physical Science'),
(3, 'Nursing'),
(4, 'Animal Science'),
(5, 'Humanities'),
(6, 'public health');

-- --------------------------------------------------------

--
-- Table structure for table `register_complaint`
--

CREATE TABLE `register_complaint` (
  `Id` int(11) NOT NULL,
  `RegWorkNumber` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `word_details` varchar(500) NOT NULL,
  `statuss` varchar(255) NOT NULL,
  `details` varchar(255) NOT NULL,
  `files` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register_complaint`
--

INSERT INTO `register_complaint` (`Id`, `RegWorkNumber`, `category`, `title`, `department`, `status`, `date`, `time`, `word_details`, `statuss`, `details`, `files`) VALUES
(8, ' eb1/56142/21 ', 'Academics', 'payment', 'Physical Science', 'Serious', '2024-03-27', '06:05 p.m.', 'have made a payment but havent received  my gatepass', 'Pending', 'you will be updated', 0x433a557365727375736572446f776e6c6f616473646f776e6c6f61642e747874),
(9, ' eb1/56142/21 ', 'Adminstrative issues', 'class', 'Physical Science', 'Serious', '2024-03-27', '06:07 p.m.', 'we have no lecturer who have attended the lessn since we begun this semester', 'Solved', 'we are going to inform them', 0x433a557365727375736572446f776e6c6f616473646f776e6c6f61642e747874),
(10, ' EB1/56085/21 ', 'Finance', 'failure', 'Computer Science', 'Serious', '2024-03-28', '12:51 p.m.', 'no fees in my fewertyuiop[asdfghjkl;rtytrtytrtdkucguftfkdcffiffkuyfytyes statement', 'Not Yet Checked', 'No Resolution Details', ''),
(11, ' EB1/56028/21 ', 'mess', 'no enough food', 'Humanities', 'Serious', '2024-03-28', '06:43 p.m.', 'am always on time but never get my order', 'Solved', 'The complain has been solved', 0x433a5573657273757365724f6e654472697665446f63756d656e7473446f636b6572204368656174205368656574202d312e706466),
(12, ' EB1/56028/21 ', 'Academics', 'results', 'Computer Science', 'Serious', '2024-03-28', '06:52 p.m.', 'i have not gotten my results since last year', 'Not Yet Checked', 'No Resolution Details', 0x433a5573657273757365724f6e654472697665446f63756d656e747343415420312e646f6378),
(13, ' EB1/12345/20  ', 'social issues', 'menal health', 'Humanities', 'Serious', '2024-03-30', '04:09 p.m.', 'urdcnhfeuchuisemiusuiius', 'In progress', 'No Resolution Details', 0x43686f6f73652046696c65),
(14, ' EB1/12345/20  ', 'Finance', 'FEES', 'Physical Science', 'Serious', '2024-03-30', '04:12 p.m.', 'awhdxgjdhmakdscfkxmcfskcfkcfh', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(15, ' EB1/56085/21  ', 'Academics', 'lecturer', 'Nursing', 'Serious', '2024-03-30', '04:15 p.m.', 'no attendance of classese', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(16, ' EB1/56028/21  ', 'Academics', 'RESULTS', 'Computer Science', 'Serious', '2024-03-31', '03:07 p.m.', 'i cant find my results for two years now', 'Solved', 'dsdyjhdgf', 0x43686f6f73652046696c65),
(17, ' EB1/56028/21  ', 'Academics', 'RESULTS', 'Computer Science', 'Serious', '2024-03-31', '03:07 p.m.', 'i cant find my results for two years now', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(18, ' EB1/56130/21  ', 'Academics', 'student missbeaving', 'Animal Science', 'Not Serious', '2024-03-31', '03:35 p.m.', 'student lack common sence', 'Solved', 'the matter has been looked onto', 0x43686f6f73652046696c65),
(19, ' EB1/56123/21  ', 'social issues', 'Cocurriculum activities', 'Computer Science', 'Not Serious', '2024-04-01', '04:02 p.m.', 'There are no curriculum activities in the school', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(20, ' EB1/56123/21  ', 'social issues', 'Cocurriculum activities', 'Computer Science', 'Not Serious', '2024-04-01', '04:04 p.m.', 'There are no curriculum activities in the school', 'In progress', 'We will implement som activities', 0x43686f6f73652046696c65),
(21, ' EB1/56028/21  ', 'Academics', 'results', 'Computer Science', 'Serious', '2024-04-05', '09:19 a.m.', 'the results have not been uploaded since last year', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(22, ' EB1/55965/21  ', 'Adminstrative issues', 'dfghj', 'Physical Science', 'Not Serious', '2024-04-05', '09:32 a.m.', 'ip[]piouytdrdfghuituydtsropuyisruiytuysre', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(23, ' EB1/55965/21  ', 'Academics', 'asdfxffxf', 'Computer Science', 'Serious', '2024-04-05', '09:35 a.m.', 'ertyuiuytdrsedtfyugihlkg', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(24, ' EB1/55965/21  ', 'Academics', 'WDJEFRTY', 'Computer Science', 'Serious', '2024-04-05', '09:39 a.m.', 'WERTKLLJHGFDKGFSTRUTYTSR', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(25, ' EB1/55965/21  ', 'Adminstrative issues', 'DFGHJ', 'Computer Science', 'Serious', '2024-04-05', '09:55 a.m.', 'asdfghjkjhgfwdsdf', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65),
(26, ' EB1/56142/21  ', 'Adminstrative issues', 'fee', 'Physical Science', 'Serious', '2024-04-05', '10:32 a.m.', 'eioeoifpoipwpdkslaedwepowipoeiapkdkpokd', 'Not Yet Checked', 'No Resolution Details', 0x43686f6f73652046696c65);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `RegWorkNumber` varchar(255) NOT NULL,
  `username` varchar(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  `PhoneNumber` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `rank` varchar(255) NOT NULL,
  `securityQuestion` varchar(255) NOT NULL,
  `securityAnswer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Id`, `Name`, `RegWorkNumber`, `username`, `email`, `PhoneNumber`, `password`, `rank`, `securityQuestion`, `securityAnswer`) VALUES
(22, 'Victor Mureithi', 'EB1/55965/21', 'Victor', 'victor@gmail.com', '0707070707', '123!@#qweQWE', 'Non-Staff', 'What is your high school name?', 'jkiat'),
(23, 'Faith maina', 'Eb1/56028/21', 'credinta', 'faith@gmail.com', '0757179567', '123!@#qweQWE', 'Student ', 'How many are you in your family?', '10'),
(24, 'Amadera', 'EB1/56130/21', 'amad', 'amad@gmail.com', '0700000000', '123!@#qweQWE', 'Staff', 'What is your home town?', 'narok'),
(25, 'sylvia', 'EB1/56142/21', 'sylvia', 'sylvia@gmail.com', '0808080808', '123!@#qweQWE', 'Staff', 'What is your age?', '10'),
(26, 'Collins Ongolo', 'EB1/56123/21', 'Collo', 'collo@gmail.com', '076973594', '123!@#qweQWE', 'Non-Staff', 'What is your age?', '20'),
(27, 'Halan Kiprotich', 'EB1/56085/21', 'Halan', 'Halan@gmail.com', '0709090909', '123!@#qweQWE', 'Non-Staff', 'What is your home town?', 'Naks'),
(28, 'sdfgbj,./', 'zdxfghj', 'zxvhjnk', 'a@gmail.com', '0784', '123!@#ADMa', 'Student ', 'What is your home town?', 'tyee'),
(29, 'Carolyne Musenya', 'EB1/56052/21', 'carol', 'carolmartoz763@gmail.com', '0111997539', 'Tokyo@2023', 'Student ', 'How many are you in your family?', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_complaints`
--
ALTER TABLE `add_complaints`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `depart`
--
ALTER TABLE `depart`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `register_complaint`
--
ALTER TABLE `register_complaint`
  ADD UNIQUE KEY `Id` (`Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD UNIQUE KEY `Id` (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_complaints`
--
ALTER TABLE `add_complaints`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `depart`
--
ALTER TABLE `depart`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `register_complaint`
--
ALTER TABLE `register_complaint`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
