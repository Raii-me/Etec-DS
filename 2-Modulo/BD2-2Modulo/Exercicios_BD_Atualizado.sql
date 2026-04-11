#1
CREATE DATABASE db_escola;
use db_escola;


#2
CREATE TABLE alunos(
idAluno INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100)     NOT NULL,
nascimento DATE       NOT NULL,
matricula VARCHAR(10) NOT NULL UNIQUE
);


#3
CREATE TABLE professores(
idProfessor INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
formacao VARCHAR(100) NOT NULL
);


#4
CREATE TABLE disciplinas (
idDisciplina INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
carga_horaria INT NOT NULL
);


#5
CREATE TABLE turmas(
idTurma INT AUTO_INCREMENT PRIMARY KEY,
nome_turma VARCHAR(10) NOT NULL,
ano INT NOT NULL,
professor_id INT NOT NULL,
FOREIGN KEY (professor_id) REFERENCES professores(idProfessor)
);


#6
CREATE TABLE matriculas(
idMatricula INT AUTO_INCREMENT PRIMARY KEY,
nota INT NOT NULL,
frequencia INT NOT NULL,
aluno_id INT NOT NULL,
disciplina_id INT NOT NULL,
professor_id INT NOT NULL,
FOREIGN KEY (aluno_id)      REFERENCES alunos(idAluno),
FOREIGN KEY (disciplina_id) REFERENCES disciplinas(idDisciplina),
FOREIGN KEY (professor_id)  REFERENCES professores(idProfessor)
);


#7
INSERT INTO professores(idProfessor, nome, formacao)
VALUES (1 , 'Cleiton' , 'Professor de banco de dados'),
	   (2 , 'Thiago'  , 'Professor de PW2'),
	   (3 , 'Sueli'   , 'Professora de Sistemas Embarcados');
        
INSERT INTO disciplinas(idDisciplina, nome, carga_horaria)
VALUES (1 , 'Desenvolvimento de Sistemas' , 1500),
	   (2 , 'Banco de dados'              , 750),
	   (3 , 'Sistemas Embarcados'         , 750);
        
INSERT INTO alunos(idAluno, nome, nascimento, matricula)
VALUES (1 , 'Raí Vicencio'    , 20060527 , 'N20060627'),
	   (2 , 'Flavio Henrique' , 20061204 , 'N20481942'),
	   (3 , 'Pedro Menezes'   , 20080517 , 'N12934924'),
	   (4 , 'Lukas Miller'    , 20020514 , 'N58234824'),
	   (5 , 'Ana Beatriz'     , 20060528 , 'N18441249');
           
           
#8
INSERT INTO turmas(idTurma, nome_turma, ano, professor_id)
VALUES (1 , 'Turma 3A' , 2025 , 1),
	   (2 , 'Turma 3B' , 2025 , 2),
	   (3 , 'Turma 3C' , 2025 , 3);
      
INSERT INTO matriculas(idMatricula, nota, frequencia, aluno_id, disciplina_id, professor_id)
VALUES (1 , 10 , 98 , 1 , 1 , 2 ),
	   (2 , 8  , 68 , 2 , 2 , 1 ),
	   (3 , 6  , 76 , 3 , 1 , 3 ),
	   (4 , 9  , 88 , 4 , 3 , 2 ),
	   (5 , 3  , 46 , 5 , 3 , 3 );


#9
CREATE TABLE boletins(
idBoletim INT AUTO_INCREMENT PRIMARY KEY,
nota INT NOT NULL,
frequencia INT NOT NULL,
aluno_id INT NOT NULL,
disciplina_id INT NOT NULL,
professor_id INT NOT NULL,
FOREIGN KEY(aluno_id) REFERENCES alunos(idAluno),
FOREIGN KEY(disciplina_id) REFERENCES disciplinas(idDisciplina),
FOREIGN KEY(professor_id) REFERENCES professores(idProfessor)
);


#10
ALTER TABLE alunos ADD telefone VARCHAR(14)  NOT NULL;
ALTER TABLE alunos DROP COLUMN matricula;


#11
CREATE DATABASE db_biblioteca;
USE db_biblioteca;


#12
CREATE TABLE autores(
idAutor INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
nascionalidade VARCHAR(20) NOT NULL
);


#13
CREATE TABLE livros(
idLivro INT AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(50) NOT NULL,
ano_publicacao INT NOT NULL,
autor_id INT NOT NULL,
FOREIGN KEY (autor_id) REFERENCES autores(idAutor)
);


#14
CREATE TABLE clientes(
idCliente INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
CPF VARCHAR(14) NOT NULL UNIQUE
);


#15
CREATE TABLE emprestimos(
idEmprestimo INT AUTO_INCREMENT PRIMARY KEY,
data_emprestimo DATE NOT NULL,
cliente_id INT NOT NULL,
livro_id INT NOT NULL,
FOREIGN KEY (cliente_id) REFERENCES clientes(idCliente),
FOREIGN KEY (livro_id)   REFERENCES livros(idLivro)
);


#16
INSERT INTO autores(idAutor, nome,nascionalidade)
VALUES (1 , 'Raí Vicencio'  , 'Brasil'),
	   (2 , 'Ethan Johnson' , 'França'),
	   (3 , 'Hana Kim'      , 'Coreia do Sul');

INSERT INTO livros(idLivro, titulo, ano_publicacao, autor_id)
VALUES (1 , 'Sombras do Amanha'   , 2020 , 1 ),
	   (2 , 'O jardim de inverno' , 2019 , 2 ),
	   (3 , 'Entre Estrelas'      , 2024 , 3 );


INSERT INTO clientes(idCliente, nome, CPF)
VALUES (1 , 'Mariana Oliveira' , '123.456.789-50'),
	   (2 , 'Rafael Souza'     , '456.789.123-31'),
	   (3 , 'Camila Ferreia'   , '789.123.456-42');
         

#17
INSERT INTO emprestimos(idEmprestimo, data_emprestimo, cliente_id, livro_id)
VALUES (1 , 20250506 , 1 , 2 ),
	   (2 , 20240827 , 2 , 1 ),
	   (3 , 20250726 , 3 , 3 );


#18

#ta faltando a tabela funcionarios, ent vou criar uma qualquer aq
CREATE TABLE funcionarios(
idFuncionario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
CPF VARCHAR(14) NOT NULL UNIQUE
);

CREATE TABLE reservas(
idReserva INT AUTO_INCREMENT PRIMARY KEY,
data_reserva DATE NOT NULL,
cliente_id INT NOT NULL,
livro_id INT NOT NULL,
funcionario_id INT NOT NULL,
FOREIGN KEY (cliente_id) REFERENCES clientes(idCliente),
FOREIGN KEY (livro_id)   REFERENCES livros(idLivro),
FOREIGN KEY (funcionario_id) REFERENCES funcionarios (idFuncionario)
);

#19
ALTER TABLE clientes ADD telefone VARCHAR(14) NOT NULL;


#20
ALTER TABLE autores DROP COLUMN nascionalidade;
ALTER TABLE livros MODIFY ano_publicacao SMALLINT  NOT NULL;


#21
CREATE DATABASE db_hospital;
use db_hospital;


#22
CREATE TABLE pacientes(
idPaciente INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
nascimento DATE NOT NULL,
CPF VARCHAR(14) NOT NULL UNIQUE
);


#23
CREATE TABLE medicos(
idMedico INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
especialidade VARCHAR(100) NOT NULL
);


#24
CREATE TABLE consultas(
idConsulta INT AUTO_INCREMENT PRIMARY KEY,
data_consulta DATE NOT NULL,
paciente_id INT NOT NULL,
medico_id INT NOT NULL,
FOREIGN KEY (paciente_id) REFERENCES pacientes(idPaciente),
FOREIGN KEY (medico_id) REFERENCES medicos(idMedico)
);


#25
CREATE TABLE receitas(
idReceita INT AUTO_INCREMENT PRIMARY KEY,
descricao VARCHAR(255) NOT NULL,
consulta_id INT NOT NULL,
FOREIGN KEY (consulta_id) REFERENCES consultas(idConsulta)
);


#26
INSERT INTO pacientes(idPaciente, nome, nascimento, CPF)
VALUES (1 , 'Raí Vicencio'   , 20060527 , '484.269.478-45' ),
	   (2 , 'Pedro Henrique' , 20050925 , '846.396.395-45' ),
       (3 , 'Ana Maria'      , 19960328 , '643.978.124-64' );

INSERT INTO medicos(idMedico, nome, especialidade)
VALUES (1 , 'Vicente Silva'   , 'Clinico Geral'),
	   (2 , 'Mariana Menezes' , 'Pediatra'),
	   (3 , 'Lucas Carvalho'  , 'Oftamologista');

INSERT INTO consultas(idConsulta, data_consulta, paciente_id, medico_id)
VALUES (1 , 20250827 , 1 , 1 ),
	   (2 , 20240624 , 2 , 2 ),
       (3 , 20251015 , 3 , 3 );

INSERT INTO receitas(idReceita, descricao, consulta_id)
VALUES (1 , 'Paciente esta gripado'       , 1 ),
	   (2 , 'Paciente caiu e se machucou' , 2 ),
	   (3 , 'Paciente esta com catarata'  , 3 );
         

#27
CREATE TABLE salas(
idSala INT AUTO_INCREMENT PRIMARY KEY,
numero INT NOT NULL,
andar INT NOT NULL
);


#28
CREATE TABLE atendimentos(
idAtendimento INT AUTO_INCREMENT PRIMARY KEY,
data_atendimentos DATE NOT NULL,
paciente_id INT NOT NULL,
medico_id INT NOT NULL,
sala_id INT NOT NULL,
FOREIGN KEY (paciente_id) REFERENCES pacientes(idPaciente),
FOREIGN KEY (medico_id) REFERENCES medicos(idMedico),
FOREIGN KEY (sala_id) REFERENCES salas(idSala)
);


#29
ALTER TABLE pacientes ADD telefone VARCHAR(14) NOT NULL;


#30 
ALTER TABLE pacientes DROP COLUMN CPF;


#31
CREATE DATABASE db_empresa;
USE db_empresa;


#32
CREATE TABLE departamentos(
idDepartamento INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
localizacao VARCHAR(150) NOT NULL
);


#33
CREATE TABLE funcionarios(
idFuncionario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
cargo VARCHAR(100) NOT NULL,
departamento_id INT NOT NULL,
FOREIGN KEY (departamento_id) REFERENCES departamentos(idDepartamento)
);


#34
CREATE TABLE projetos(
idProjeto INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
orcamento DECIMAL(10,2) NOT NULL
);


#35
CREATE TABLE alocacoes (
idAlocacoes INT AUTO_INCREMENT PRIMARY KEY,
horas_semanais INT NOT NULL,
funcionario_id INT NOT NULL,
projeto_id INT NOT NULL,
FOREIGN KEY (funcionario_id) REFERENCES funcionarios(idFuncionario),
FOREIGN KEY (projeto_id) REFERENCES projetos(idProjeto)
);


#36
INSERT INTO departamentos(idDepartamento, nome, localizacao)
VALUES (1 , 'Finaceiros'    , 'Rua das Flores, 123 – Jardim Primavera, São Paulo – SP'),
	   (2 , 'Logistica'     , 'Rua do Horizonte, 303 – Centro, Porto Alegre – RS'),
	   (3 , 'Contabilidade' , 'Rua do Mar, 606 – Barra, Salvador – BA');

INSERT INTO funcionarios(idFuncionario, nome, cargo, departamento_id)
VALUES (1 , 'Jose Almeda'      , 'Anaista Finceiro'      , 1 ),
	   (2 , 'Guilherme Santos' , 'Planejador de Estoque' , 2 ),
       (3 , 'Livia Pereira'    , 'Contadora'             , 3 );

INSERT INTO projetos(idProjeto, nome, orcamento)
VALUES (1 , 'Projeto Financias'    , 100500  ),
	   (2 , 'Projeto Revolução'    , 230700  ),
       (3 , 'Projeto Subcrescente' , 1600400 );
         
         
#37
INSERT INTO alocacoes(idAlocacoes, horas_semanais, funcionario_id, projeto_id)
VALUES (1 , 15 , 1 , 1 ),
	   (2 , 20 , 2 , 2 ),
	   (3 , 8  , 3 , 3 );
         

#38

#problema dnv sem a tabela gerentes, vou criar uma simples
CREATE TABLE gerentes(
idGerente INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
telefone VARCHAR(14) NOT NULL
);

CREATE TABLE tarefas(
idTabela INT AUTO_INCREMENT PRIMARY KEY,
descricao VARCHAR(255) NOT NULL,
projeto_id INT NOT NULL,
funcionario_id INT NOT NULL,
gerente_id INT NOT NULL,
FOREIGN KEY (projeto_id) REFERENCES projetos(idProjeto),
FOREIGN KEY (funcionario_id) REFERENCES funcionarios(idFuncionario),
FOREIGN KEY (gerente_id) REFERENCES gerentes(idGerente)
);


#39
ALTER TABLE funcionarios ADD salario DECIMAL(10,2) NOT NULL;


#40
ALTER TABLE projetos DROP COLUMN orcamento;


#41
CREATE DATABASE db_hotel;
USE db_hotel;


#42
CREATE TABLE hospedes(
idHospede INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
CPF VARCHAR(14) NOT NULL UNIQUE,
telefone VARCHAR(14)  NOT NULL
);


#43
CREATE TABLE quartos(
idQuarto INT AUTO_INCREMENT PRIMARY KEY,
numero INT  NOT NULL,
tipo VARCHAR(50) NOT NULL,
preco_diaria INT NOT NULL
);


#44
CREATE TABLE reservas(
idReserva INT AUTO_INCREMENT PRIMARY KEY,
data_entrada DATE NOT NULL,
data_saida DATE NOT NULL,
hospede_id INT NOT NULL,
quarto_id INT NOT NULL,
FOREIGN KEY (hospede_id) REFERENCES hospedes(idHospede),
FOREIGN KEY (quarto_id) REFERENCES quartos(idQuarto)
);


#45
CREATE TABLE pagamentos(
idPagamento INT AUTO_INCREMENT PRIMARY KEY,
metodo_pagamento VARCHAR(20) NOT NULL,
valor_total DECIMAL(10,2) NOT NULL,
reserva_id INT NOT NULL,
FOREIGN KEY (reserva_id) REFERENCES reservas(idReserva)
);


#46
CREATE TABLE funcionarios(
idFuncionario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
cargo VARCHAR(30) NOT NULL
);


#47
CREATE TABLE servicos_extras(
idServicos INT AUTO_INCREMENT PRIMARY KEY,
descricao VARCHAR(255) NOT NULL,
valor DECIMAL(10,2) NOT NULL,
reserva_id INT NOT NULL,
funcionario_id INT NOT NULL,
pagamento_id INT NOT NULL,
FOREIGN KEY (reserva_id) REFERENCES reservas(idReserva),
FOREIGN KEY (funcionario_id) REFERENCES funcionarios(idFuncionario),
FOREIGN KEY (pagamento_id) REFERENCES pagamentos(idPagamento)
);


#48
INSERT INTO hospedes(idHospede, nome, CPF, telefone)
VALUES (1 , 'Raí Vicencio' , '525.783.960-10' , '(11)96425-1452' ),
	   (2 , 'João Pedro'   , '526.345.195-42' , '(46)96824-1525' ),
	   (3 , 'Nicole Braga' , '742.703.598-45' , '(64)69358-1023' );

INSERT INTO quartos(idQuarto, numero, tipo, preco_diaria)
VALUES (1 , 3  , 'Quarto para uma pessoa'   , 300 ),
	   (2 , 6  , 'Quarto para uma pessoa'   , 300 ),
	   (3 , 14 , 'Quarto para duas pessoas' , 500 );

INSERT INTO reservas(idReserva, data_entrada ,data_saida, hospede_id, quarto_id)
VALUES (1 , 20250527 , 20250528 , 1 , 2 ),
	   (2 , 20210410 , 20210414 , 3 , 3 ),
	   (3 , 20251013 , 20251015 , 2 , 1 );

INSERT INTO pagamentos(idPagamento, metodo_pagamento, valor_total, reserva_id)
VALUES (1 , 'Pix'               , 300 , 2 ),
	   (2 , 'Boleto'            , 500 , 3 ),
	   (3 , 'Cartão de Credito' , 300 , 1 );


#49
ALTER TABLE hospedes ADD email VARCHAR(100) NOT NULL;
ALTER TABLE quartos MODIFY preco_diaria DECIMAL (8,2) NOT NULL;


#50
ALTER TABLE hospedes DROP COLUMN cpf;


#testes para ver se ta ttudo funcionando:
DROP DATABASE db_escola;
DROP DATABASE db_biblioteca;
DROP DATABASE db_hospital;
DROP DATABASE db_empresa;
DROP DATABASE db_hotel;

#testes aq fi
#exemplo de botar valores
insert into nome(coluna) VALUES ('valor');

#puxar dados da tabela
select * from nome;

#exemplo de deletar info das tabelas
TRUNCATE TABLE nome;

#deletar o banco todo(testar se ta funcionando ne)
DROP DATABASE nome;

