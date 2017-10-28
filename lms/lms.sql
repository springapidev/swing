-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: lms
-- ------------------------------------------------------
-- Server version	5.6.35-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lms_author`
--

DROP TABLE IF EXISTS `lms_author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_author`
--

LOCK TABLES `lms_author` WRITE;
/*!40000 ALTER TABLE `lms_author` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_book`
--

DROP TABLE IF EXISTS `lms_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `book_code` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `edition` varchar(45) DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total_price` int(11) DEFAULT NULL,
  `rack_no` varchar(45) DEFAULT NULL,
  `issn_no` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `purchase_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_book`
--

LOCK TABLES `lms_book` WRITE;
/*!40000 ALTER TABLE `lms_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_book_category`
--

DROP TABLE IF EXISTS `lms_book_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_book_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_book_category`
--

LOCK TABLES `lms_book_category` WRITE;
/*!40000 ALTER TABLE `lms_book_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_book_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_book_issue`
--

DROP TABLE IF EXISTS `lms_book_issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_book_issue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `issue_date` varchar(45) DEFAULT NULL,
  `expire_date` varchar(45) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `book_id` (`book_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `lms_book_issue_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `lms_book` (`id`),
  CONSTRAINT `lms_book_issue_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `lms_student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_book_issue`
--

LOCK TABLES `lms_book_issue` WRITE;
/*!40000 ALTER TABLE `lms_book_issue` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_book_issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_book_receive`
--

DROP TABLE IF EXISTS `lms_book_receive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_book_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_book_receive`
--

LOCK TABLES `lms_book_receive` WRITE;
/*!40000 ALTER TABLE `lms_book_receive` DISABLE KEYS */;
INSERT INTO `lms_book_receive` VALUES (1,29,7,'dfd',5,'d'),(2,30,7,'f',6000,'f');
/*!40000 ALTER TABLE `lms_book_receive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_book_summary`
--

DROP TABLE IF EXISTS `lms_book_summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_book_summary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(45) DEFAULT NULL,
  `total_stock` int(11) DEFAULT NULL,
  `avilable_stock` int(11) DEFAULT NULL,
  `already_lend` int(11) DEFAULT NULL,
  `lost_qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `lms_book_summary_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `lms_book` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_book_summary`
--

LOCK TABLES `lms_book_summary` WRITE;
/*!40000 ALTER TABLE `lms_book_summary` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_book_summary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_department`
--

DROP TABLE IF EXISTS `lms_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `dep_code_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_department`
--

LOCK TABLES `lms_department` WRITE;
/*!40000 ALTER TABLE `lms_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_edition`
--

DROP TABLE IF EXISTS `lms_edition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_edition` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_edition`
--

LOCK TABLES `lms_edition` WRITE;
/*!40000 ALTER TABLE `lms_edition` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_edition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_institute`
--

DROP TABLE IF EXISTS `lms_institute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_institute` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `house_no` varchar(45) DEFAULT NULL,
  `road_no` varchar(45) DEFAULT NULL,
  `block_or_village` varchar(45) DEFAULT NULL,
  `thana` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `division` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `address_type` varchar(45) DEFAULT NULL,
  `institute_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_institute`
--

LOCK TABLES `lms_institute` WRITE;
/*!40000 ALTER TABLE `lms_institute` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_institute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_publisher`
--

DROP TABLE IF EXISTS `lms_publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_publisher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_publisher`
--

LOCK TABLES `lms_publisher` WRITE;
/*!40000 ALTER TABLE `lms_publisher` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_sesson`
--

DROP TABLE IF EXISTS `lms_sesson`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_sesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_sesson`
--

LOCK TABLES `lms_sesson` WRITE;
/*!40000 ALTER TABLE `lms_sesson` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_sesson` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_shift`
--

DROP TABLE IF EXISTS `lms_shift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_shift` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `starting_time` varchar(45) DEFAULT NULL,
  `ending_time` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_shift`
--

LOCK TABLES `lms_shift` WRITE;
/*!40000 ALTER TABLE `lms_shift` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_shift` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_student`
--

DROP TABLE IF EXISTS `lms_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `registration_no` int(11) DEFAULT NULL,
  `boardRoll_no` int(11) DEFAULT NULL,
  `class_roll` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `shift_id` int(11) DEFAULT NULL,
  `house_no` varchar(45) DEFAULT NULL,
  `road_no` varchar(45) DEFAULT NULL,
  `block_or_village` varchar(45) DEFAULT NULL,
  `thana` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `division` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `department_id` (`department_id`),
  KEY `shift_id` (`shift_id`),
  CONSTRAINT `lms_student_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `lms_department` (`id`),
  CONSTRAINT `lms_student_ibfk_2` FOREIGN KEY (`shift_id`) REFERENCES `lms_shift` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_student`
--

LOCK TABLES `lms_student` WRITE;
/*!40000 ALTER TABLE `lms_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lms_user`
--

DROP TABLE IF EXISTS `lms_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lms_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `user_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lms_user`
--

LOCK TABLES `lms_user` WRITE;
/*!40000 ALTER TABLE `lms_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `lms_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-28 23:09:02
