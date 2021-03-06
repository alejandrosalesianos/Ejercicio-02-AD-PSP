CREATE TABLE country (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE product (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price REAL        NOT NULL,
    image TEXT,
    description TEXT,
    PRIMARY KEY (id)
);
