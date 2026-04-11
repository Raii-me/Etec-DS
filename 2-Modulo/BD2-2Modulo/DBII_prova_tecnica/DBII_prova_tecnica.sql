#Questão 1
CREATE DATABASE db_lojaPascotto;
USE db_lojaPascotto;

CREATE TABLE fornecedor(
idFornecedor INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (100) NOT NULL,
CNPJ VARCHAR (100) UNIQUE NOT NULL,
telefone VARCHAR (14) NOT NULL,    #(11)11111-1111
CPF VARCHAR (14) UNIQUE NOT NULL   #111.111.111-11
);

CREATE TABLE produtos(
idProdutos INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (100) NOT NULL,
preco DECIMAL (8,2) NOT NULL,
qntd_estoque INT NOT NULL,
id_fornecedor INT,
FOREIGN KEY (id_fornecedor) REFERENCES fornecedor(idFornecedor)
);

CREATE TABLE colaborador(
idColaborador INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (100) NOT NULL,
cargo VARCHAR (100) NOT NULL,
salario INT
);

CREATE TABLE pedidos(
idPedido INT AUTO_INCREMENT PRIMARY KEY,
data DATE NOT NULL,
quantidade INT NOT NULL,
id_colaborador INT,
id_produto INT,
FOREIGN KEY (id_colaborador) REFERENCES colaborador (idColaborador),
FOREIGN KEY (id_produto) REFERENCES produtos (idProdutos)
);

#Questão 2
ALTER TABLE fornecedor ADD email VARCHAR(100) UNIQUE NOT NULL;

#Questão 3
CREATE TABLE categorias(
idCategoria INT AUTO_INCREMENT PRIMARY KEY,
nomeCategoria VARCHAR(100) NOT NULL
);

ALTER TABLE produtos ADD id_categoria INT;
ALTER TABLE produtos ADD FOREIGN KEY (id_categoria) REFERENCES categorias(idCategoria);

#Questão 4
INSERT INTO fornecedor(idFornecedor, nome, CNPJ, telefone, CPF, email)
VALUES('1' , 'Raí Vicencio'   , '1234567890' , '(11)91929-3949' , '345.267.235-90' , 'raivicencio@gmail.com  '),
	  ('2' , 'Fernando Morais', '0987654321' , '(20)89784-0413' , '987.424.246-29' , 'fernandomorais@gmail.com'),
      ('3' , 'Livia Silva'    , '7654321098' , '(17)50241-5295' , '456.123.789-10' , 'liviasilva@gmail.com    ');

INSERT INTO colaborador(idColaborador, nome, cargo, salario)
VALUES('1' , 'Fabio Almenda' , 'Caixa'     , 1200),
	  ('2' , 'Fabiana Souza' , 'Estoque'   , 1300),
      ('3' , 'Rodrigo Silva' , 'Segurança' , 1250);

INSERT INTO categorias (idCategoria, nomeCategoria)
VALUES('1' , 'Doces'),
	  ('2' , 'Refrigerantes'),
      ('3' , 'Frios');
      
INSERT INTO produtos (idProdutos, nome, preco, qntd_estoque, id_fornecedor , id_categoria)
VALUES('1' , 'Queijo Mussarela Fatiado'  , 6.99  , 34 , 1 , 3 ),
	  ('2' , 'Chocotone Recheado'        , 14.20 , 20 , 2 , 1 ),
      ('3' , 'Coca-cola 2L'              , 9.99  , 14 , 3 , 2 );

INSERT INTO pedidos(idPedido, data, quantidade, id_colaborador, id_produto)
VALUES('1' , 20251023 , 2 , 1 , 2),
	  ('2' , 20240925 , 1 , 2 , 1),
      ('3' , 20250824 , 4 , 3 , 3);
      
#Questão 5
ALTER TABLE fornecedor DROP COLUMN CPF;

#Questão 6 
SELECT (nome) FROM produtos;
SELECT (nome) FROM fornecedor;

#testes
    

SELECT * FROM fornecedor;
SELECT * FROM colaborador;
SELECT * FROM categorias;
SELECT * FROM produtos;
SELECT * FROM pedidos;


DROP DATABASE db_lojaPascotto;  