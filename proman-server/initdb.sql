DROP USER IF EXISTS 'promanadmin'@'localhost';

CREATE USER 'promanadmin'@'localhost' IDENTIFIED BY 'promanadmin';

GRANT ALL PRIVILEGES ON * . * TO 'promanadmin'@'localhost';

DROP DATABASE IF EXISTS proman;

CREATE DATABASE proman;
