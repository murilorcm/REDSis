DROP DATABASE IF EXISTS REDSis;
CREATE DATABASE REDSis;
USE REDSis;

CREATE TABLE disciplinas(codigo int(3) AUTO_INCREMENT, nome varchar(40), sigla varchar(10), professor varchar(40), semestre varchar(20), ano date, PRIMARY KEY(codigo));

CREATE TABLE reds(codigo int(3) AUTO_INCREMENT, nomeAluno varchar(40), prontuario varchar(40), dataInicio date, dataFim date, PRIMARY KEY (codigo));

CREATE TABLE disciplinaRED(codigo int(3) AUTO_INCREMENT, codigoDisciplina int(3), codigoRED int(3), PRIMARY KEY(codigo));

CREATE TABLE usuarios(codigo int(3) AUTO_INCREMENT, nome varchar(40), prontuário varchar(40), senha varchar(40), PRIMARY KEY(codigo));

