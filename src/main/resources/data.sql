DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL
);

INSERT INTO users VALUES
    (1, 'Paco',  'Gonzalez'),
    (2, 'Pepe', 'Domingo'),
    (3, 'Felipe', 'Julian');