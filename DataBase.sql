CREATE DATABASE TestingForm;

USE TestingForm;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(20) NOT NULL,
    country VARCHAR(50) NOT NULL,
    skills VARCHAR(255),
    date_of_birth DATE NOT NULL,
    phone VARCHAR(15) NOT NULL,
    comments TEXT,
    document_name VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Select * from users;