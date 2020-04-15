CREATE TABLE `booking` (
  `booking_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `booking_us_id` varchar(45) NOT NULL,
  `booking_vc_no` varchar(45) NOT NULL,
  `price` bigint(20) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `no_of_days` INT(11) NOT NULL,
  `promo_codes` varchar(45) DEFAULT 'Not Avalible',
  `refund` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  KEY `booking_us_id_idx` (`booking_us_id`),
  KEY `booking_vc_no_idx` (`booking_vc_no`),
  CONSTRAINT `booking_us_id` FOREIGN KEY (`booking_us_id`) REFERENCES `user` (`id`),
  CONSTRAINT `booking_vc_no` FOREIGN KEY (`booking_vc_no`) REFERENCES `vehicle` (`vehicle_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `user` (
    `id` VARCHAR(55) NOT NULL,
    `first_name` VARCHAR(45) NOT NULL,
    `last_name` VARCHAR(45) NOT NULL,
    `age` INT(11) NOT NULL,
    `gender` VARCHAR(45) NOT NULL,
    `contact_number` BIGINT(15) NOT NULL,
    `email` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `user_type` VARCHAR(45) NOT NULL,
    `branch` VARCHAR(45) NOT NULL,
    `status` VARCHAR(45) DEFAULT 'pending',
    PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4 COLLATE = UTF8MB4_0900_AI_CI;


CREATE TABLE `vehicle` (
  `vehicle_no` varchar(50) NOT NULL,
  `name` varchar(255) NOT NULL,
  `color` varchar(45) NOT NULL,
  `branch` varchar(50) NOT NULL,
  `vehicle_type` varchar(255) NOT NULL,
  `seating_capacity` int(11) NOT NULL,
  `year_of_manufacture` date NOT NULL,
  `insurance_edate` date NOT NULL,
  `last_service` date NOT NULL,
  `service_due` date NOT NULL,
  `next_avalible_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `price` bigint(20) NOT NULL,
  PRIMARY KEY (`vehicle_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
