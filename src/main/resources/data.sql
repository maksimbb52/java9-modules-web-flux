DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS default;

CREATE TABLE users
(
    id         LONG AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    birth_date date         NOT NULL
);

CREATE TABLE default
(
    id    LONG AUTO_INCREMENT PRIMARY KEY,
    brand  VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL
);

INSERT INTO users (first_name, last_name, birth_date)
VALUES ('Ivan', 'Ivanov', '1991-01-01'),
       ('Petr', 'Petrov', '1992-02-02'),
       ('Aleksey', 'Alekseev', '1993-03-03');

INSERT INTO default (brand, model)
VALUES ('BMW', 'X6'),
       ('Ford', 'Focus-3'),
       ('Porsche', 'Cayenne');