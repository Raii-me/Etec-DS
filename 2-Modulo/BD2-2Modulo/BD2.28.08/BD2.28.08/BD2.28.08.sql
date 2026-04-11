CREATE DATABASE 28_08;

USE 28_08;

CREATE TABLE Tabela1(
id INT,
nome VARCHAR(255),
categoria VARCHAR(255),
preco DECIMAL(10,2),
estoque INT
);

DROP TABLE Alunos;

CREATE TABLE Alunos(
id INT,
cpf INT,
nome VARCHAR(255),
email VARCHAR(255),
idade INT
);

INSERT INTO Alunos (id, cpf , nome , email, idade)
VALUES (1, 11111111111, 'Maria Silva', 'maria@gmail.com' , 20);

INSERT INTO Alunos (id, cpf , nome , email, idade)
VALUES (2, 11111211111, 'Joao Souza', 'João@gmail.com' , 22);

INSERT INTO Alunos (id, cpf , nome , email, idade)
VALUES (3, 11111111311, 'Ana Costa', 'ana@gmail.com' , 19);