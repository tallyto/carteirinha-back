DELETE FROM carteirinha;

ALTER TABLE carteirinha AUTO_INCREMENT = 1;

-- Limpa a tabela usuario
DELETE FROM usuario;

-- Reseta o índice da tabela usuario
ALTER TABLE usuario AUTO_INCREMENT = 1;

-- Limpa a tabela genero
DELETE FROM genero;

-- Reseta o índice da tabela genero
ALTER TABLE genero AUTO_INCREMENT = 1;

-- Limpa a tabela escolaridade
DELETE FROM escolaridade;

-- Reseta o índice da tabela escolaridade
ALTER TABLE escolaridade AUTO_INCREMENT = 1;

INSERT INTO genero (nome)
VALUES ('Masculino'),
       ('Feminino'),
       ('Não binário'),
       ('Transgênero');

INSERT INTO escolaridade (nome)
VALUES ('Ensino Fundamental Incompleto'),
       ('Ensino Fundamental Completo'),
       ('Ensino Médio Incompleto'),
       ('Ensino Médio Completo'),
       ('Ensino Superior Incompleto'),
       ('Ensino Superior Completo'),
       ('Pós-Graduação');

INSERT INTO usuario (nome, data_nascimento, genero_id, escolaridade_id, cpf, celular, instituicao, curso, email)
VALUES
       ('João da Silva', '1990-01-01', 1, 3, '123.456.789-00', '(11) 99999-9999', 'Universidade X', 'Ciência da Computação', 'joao.silva@exemplo.com'),
       ('Maria Oliveira', '1995-05-10', 2, 2, '987.654.321-00', '(11) 88888-8888', 'Universidade Y', 'Direito', 'maria.oliveira@exemplo.com'),
       ('Pedro Santos', '2000-12-30', 1, 1, '456.123.789-00', '(11) 77777-7777', 'Universidade Z', 'Administração', 'pedro.santos@exemplo.com');

INSERT INTO carteirinha (numero, data_emissao, data_validade, usuario_id) VALUES
                                                                              ('000001', '2023-05-14', '2024-05-14', 1),
                                                                              ('000002', '2023-05-14', '2024-05-14', 2),
                                                                              ('000003', '2023-05-14', '2024-05-14', 3);
