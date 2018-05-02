CREATE TABLE users (
  user_id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(80) NOT NULL,
  display_name VARCHAR(50) NOT NULL,
  password CHAR(41) NOT NULL,
  PRIMARY KEY (user_id),
  UNIQUE INDEX (email)
);
 
 
CREATE TABLE users_details (
  user_id INT NOT NULL,
  first_name VARCHAR(25) NOT NULL,
  last_name VARCHAR(25) NOT NULL,
  address VARCHAR(80) NOT NULL,
  city VARCHAR(30) NOT NULL,
  state CHAR(2) NOT NULL,
  post_code CHAR(7) NOT NULL,
  PRIMARY KEY (user_id),
);