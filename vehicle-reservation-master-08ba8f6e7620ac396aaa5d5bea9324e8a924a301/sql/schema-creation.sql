-- 1. Design the schema for movie cruiser in MySQL Workbench
-- 2. Generate the SQL schema script in MySQL Workbench
-- 3. Paste the generated the SQL code here
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema vehicle
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vehicle
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vrsystem` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `vrsystem` ;

-- -----------------------------------------------------
-- Table `vrsystem`.`register`
-- -----------------------------------------------------  
CREATE TABLE IF NOT EXISTS `vrsystem`.`Regform` (
   `id` varchar(50) NOT NULL,
   `first_name` varchar(50) NOT NULL,
   `last_name` varchar(50) NOT NULL,
   `age` int(2) NOT NULL,
   `gender` varchar(11) NOT NULL,
   `contactnumber` int(13) DEFAULT NULL,
   `email` varchar(50) NOT NULL,
   `password` varchar(20) NOT NULL, 
   `security_question` varchar(50) NOT NULL,
   `branch` varchar(45)  NOT NULL,
   `status` varchar(45)  NOT NULL,
   PRIMARY KEY (id))
ENGINE = InnoDB; 
-- -----------------------------------------------------
-- Table `vrsystem`.`vehicle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vrsystem`.`vehicle` (
   `vehicle_no` varchar(50) NOT NULL,
   `branch` varchar(50) NOT NULL,
   `vehicle_type` varchar(50) NOT NULL,
   `insurance_edate` DATE NOT NULL,
   `last_service` DATE NOT NULL,
   `service_due` DATE NOT NULL,
   PRIMARY KEY (vehicle_no))
ENGINE = InnoDB; 

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
