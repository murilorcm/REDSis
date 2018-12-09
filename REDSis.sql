DROP DATABASE IF EXISTS REDSis;
CREATE DATABASE REDSis;
USE REDSis;

CREATE TABLE disciplinas(codigo int(3) AUTO_INCREMENT PRIMARY KEY, nome varchar(40), sigla varchar(10), professor varchar(40), semestre varchar(20), ano date);

CREATE TABLE reds(codigo int(3) AUTO_INCREMENT, nomeAluno varchar(40), prontuario varchar(40), dataInicio date, dataFim date, codigoDisciplina int(3), PRIMARY KEY (codigo), FOREIGN KEY (codigoDisciplina) REFERENCES DisciplinaS(codigo));

CREATE TABLE disciplinasRED(codigo int(3) AUTO_INCREMENT, codigoDisciplina int(3), codigoRED int(3), PRIMARY KEY(codigo), FOREIGN KEY (codigoDisciplina, codigoRED) REFERENCES disciplinas(codigo) REFERENCES reds(codigo);

CREATE TABLE usuarios(codigo int(3) AUTO_INCREMENT PRIMARY KEY, nome varchar(40), prontuário varchar(40), senha varchar(40));

