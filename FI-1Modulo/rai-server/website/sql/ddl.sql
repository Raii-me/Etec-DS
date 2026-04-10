CREATE DATABASE db_website;
USE db_website;

CREATE TABLE usuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
    emall VARCHAR(255) NOT NULL UNIQUE,
    nome VARCHAR (255) NOT NULL,
    senha VARCHAR (255) NOT NULL
    
    
)
