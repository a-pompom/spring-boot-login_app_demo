CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON * . * TO 'user'@'localhost';


DROP TABLE IF EXISTS user;

DROP DATABASE IF EXISTS login_app;
CREATE DATABASE login_app;

USE login_app;

CREATE TABLE user(
    user_id INT AUTO_INCREMENT,
    user_name VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY(user_id)
);

INSERT INTO user (user_name, password) VALUES
(
    'user',
    'password'
),
(
    'pompom',
    'purin'
);