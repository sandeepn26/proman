--
-- Create the tables for proman
--
CREATE TABLE user_roles (
  role VARCHAR(10) NOT NULL PRIMARY KEY,
  role_description VARCHAR(25) NOT NULL,
  role_long_description VARCHAR(256) NOT NULL
);

CREATE TABLE users (
  user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT  'Unique user id',
  email VARCHAR(80) NOT NULL,
  display_name VARCHAR(50) NULL,
  password CHAR(41) NOT NULL,
  failed_logins INT NOT NULL DEFAULT 0,
  enabled TINYINT(1) NOT NULL DEFAULT 1,
  locked TINYINT(1) NOT NULL DEFAULT 0,
  last_login_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'last login date',
  role VARCHAR(10) NOT NULL,
  UNIQUE INDEX (email),
  CONSTRAINT role_fk FOREIGN KEY (role) REFERENCES user_roles(role)
);
 
CREATE TABLE user_details (
  user_id INT NOT NULL,
  first_name VARCHAR(25) NOT NULL,
  last_name VARCHAR(25) NOT NULL,
  address VARCHAR(80) NOT NULL,
  city VARCHAR(30) NOT NULL,
  state CHAR(2) NOT NULL,
  post_code CHAR(7) NOT NULL,
  date_of_birth TIMESTAMP NOT NULL COMMENT 'Date of Birth',
  CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
