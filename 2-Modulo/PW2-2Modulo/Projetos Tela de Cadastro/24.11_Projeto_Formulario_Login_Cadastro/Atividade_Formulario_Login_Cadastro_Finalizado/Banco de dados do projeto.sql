CREATE DATABASE bdpw3;
USE bdpw3;


CREATE TABLE usuarios(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
dt_nasc DATE NOT NULL,
usuario VARCHAR(255) NOT NULL,
senha VARCHAR(255) NOT NULL
);

select * from usuarios;

drop table usuarios;

SELECT * FROM demo;