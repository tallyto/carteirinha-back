CREATE TABLE usuario
(
    id              INT PRIMARY KEY AUTO_INCREMENT,
    nome            VARCHAR(100) NOT NULL,
    data_nascimento DATE         NOT NULL,
    cpf             VARCHAR(14)  NOT NULL UNIQUE,
    celular         VARCHAR(15)  NOT NULL,
    instituicao     VARCHAR(100) NOT NULL,
    curso           VARCHAR(100) NOT NULL
);
