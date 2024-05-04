/** Create Project Tables **/
drop table students;
CREATE TABLE `students` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255),
  `middle_name` varchar(255),
  `last_name` varchar(255),
  `age` int,
   `gender` varchar(6),
   `birthday` date,
    `strand` varchar(5),
    `level` int,
    `section` int,
    `school_id` varchar(255),
    `contact_info` varchar(255),
    `email` varchar(255),
    `former_school` varchar(255),
    `permanent_address` varchar(255),
    `present_address` varchar(255),
    `city` varchar(255),
    `province` varchar(255),
    `zip_code` varchar(255),
     PRIMARY KEY (`id`)
);

drop table users;
CREATE TABLE `users` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
   `name` varchar(255),
    `username` varchar(255),
    `password` varchar(255),
    `is_admin` tinyint(1) DEFAULT '0',
     PRIMARY KEY (`id`),
     UNIQUE KEY `username_uk` (`username`)
);
