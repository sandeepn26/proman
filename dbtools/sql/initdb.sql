DROP USER 'proman'@'localhost';

DROP DATABASE IF EXISTS proman;

CREATE DATABASE proman;

CREATE USER 'proman'@'localhost' IDENTIFIED BY 'proman';

GRANT ALL PRIVILEGES ON *.* TO 'proman'@'localhost' IDENTIFIED BY 'proman';
