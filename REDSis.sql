DROP DATABASE IF EXISTS REDSis;
CREATE DATABASE REDSis;
USE REDSis;

CREATE TABLE disciplina(codigo int(3) AUTO_INCREMENT PRIMARY KEY, nome varchar(40), sigla varchar(10), pofessor varchar(40), semestre varchar(20), ano date);

CREATE TABLE red(codigo int(3) AUTO_INCREMENT, nomeAluno varchar(40), prontuario varchar(40), dataInicio date, dataFim date, codigoDisciplina int(3), PRIMARY KEY (codigo), FOREIGN KEY (codigoDisciplina) REFERENCES Disciplina(codigo));

CREATE TABLE usuario(codigo int(3) AUTO_INCREMENT PRIMARY KEY, nome varchar(40), prontuário varchar(40), senha varchar(40));

