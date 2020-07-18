DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL
);

INSERT INTO users VALUES
    (1, 'Paco',  'Gonzalez'),
    (2, 'Ana', 'Domingo'),
    (3, 'Felipe', 'Julian');

DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL
);

INSERT INTO clients VALUES
    (1, 'Jaime', 'Ap1'),
    (2, 'Alba', 'Ap1'),
    (3, 'Pepe', 'Ap1');


DROP TABLE IF EXISTS brands;

CREATE TABLE brands(
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES users(id)
);
