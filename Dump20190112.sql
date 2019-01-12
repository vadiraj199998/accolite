CREATE DATABASE  IF NOT EXISTS `taxi_managements` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `taxi_managements`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: taxi_managements
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `driver` (
  `driverid` int(11) NOT NULL,
  `driverrating` int(11) DEFAULT NULL,
  `location` varchar(100) NOT NULL,
  `accpetance` tinyint(1) NOT NULL,
  PRIMARY KEY (`driverid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES (21,5,'ravgivnagar',1);
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passangers`
--

DROP TABLE IF EXISTS `passangers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `passangers` (
  `passanger_name` varchar(100) NOT NULL,
  `passanger_id` int(11) NOT NULL,
  `passanger_location` varchar(100) NOT NULL,
  PRIMARY KEY (`passanger_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passangers`
--

LOCK TABLES `passangers` WRITE;
/*!40000 ALTER TABLE `passangers` DISABLE KEYS */;
INSERT INTO `passangers` VALUES ('crab',59,'vidyanagar');
/*!40000 ALTER TABLE `passangers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ride`
--

DROP TABLE IF EXISTS `ride`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ride` (
  `rideid` int(11) NOT NULL,
  `pickuptime` varchar(100) NOT NULL,
  `droptime` varchar(100) NOT NULL,
  `passsid` int(11) DEFAULT NULL,
  `vehnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`rideid`),
  KEY `passsid` (`passsid`),
  KEY `vehnum` (`vehnum`),
  CONSTRAINT `ride_ibfk_1` FOREIGN KEY (`passsid`) REFERENCES `passangers` (`passanger_id`),
  CONSTRAINT `ride_ibfk_2` FOREIGN KEY (`vehnum`) REFERENCES `vehicle` (`vehicalnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ride`
--

LOCK TABLES `ride` WRITE;
/*!40000 ALTER TABLE `ride` DISABLE KEYS */;
INSERT INTO `ride` VALUES (34,'10:30','11:30',59,654);
/*!40000 ALTER TABLE `ride` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderequess`
--

DROP TABLE IF EXISTS `riderequess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `riderequess` (
  `stratlocation` varchar(100) NOT NULL,
  `passid` int(11) DEFAULT NULL,
  `requestid` int(11) NOT NULL,
  `destinationlocation` varchar(100) NOT NULL,
  PRIMARY KEY (`requestid`),
  KEY `passid` (`passid`),
  CONSTRAINT `riderequess_ibfk_1` FOREIGN KEY (`passid`) REFERENCES `passangers` (`passanger_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderequess`
--

LOCK TABLES `riderequess` WRITE;
/*!40000 ALTER TABLE `riderequess` DISABLE KEYS */;
INSERT INTO `riderequess` VALUES ('vidyanagar',59,100,'ravgivnagar');
/*!40000 ALTER TABLE `riderequess` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehicle` (
  `model` varchar(100) NOT NULL,
  `vehicalnum` int(11) NOT NULL,
  `drvid` int(11) DEFAULT NULL,
  PRIMARY KEY (`vehicalnum`),
  KEY `drvid` (`drvid`),
  CONSTRAINT `vehicle_ibfk_1` FOREIGN KEY (`drvid`) REFERENCES `driver` (`driverid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES ('indica',654,21);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'taxi_managements'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-12 22:50:50
