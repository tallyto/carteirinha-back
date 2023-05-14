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

INSERT INTO genero (nome, created_by, created_date, last_modified_by, last_modified_date)
VALUES ('Masculino', 'admin', NOW(), 'admin', NOW()),
       ('Feminino', 'admin', NOW(), 'admin', NOW()),
       ('Não binário', 'admin', NOW(), 'admin', NOW()),
       ('Transgênero', 'admin', NOW(), 'admin', NOW());

INSERT INTO escolaridade (nome, created_by, created_date, last_modified_by, last_modified_date)
VALUES ('Ensino Fundamental Incompleto', 'admin', NOW(), 'admin', NOW()),
       ('Ensino Fundamental Completo', 'admin', NOW(), 'admin', NOW()),
       ('Ensino Médio Incompleto', 'admin', NOW(), 'admin', NOW()),
       ('Ensino Médio Completo', 'admin', NOW(), 'admin', NOW()),
       ('Ensino Superior Incompleto', 'admin', NOW(), 'admin', NOW()),
       ('Ensino Superior Completo', 'admin', NOW(), 'admin', NOW()),
       ('Pós-Graduação', 'admin', NOW(), 'admin', NOW());

INSERT INTO usuario (nome, data_nascimento, genero_id, escolaridade_id, cpf, celular, instituicao, curso, email, created_by, created_date, last_modified_by, last_modified_date)
VALUES
    ('João da Silva', '1990-01-01', 1, 3, '123.456.789-00', '(11) 99999-9999', 'Universidade X', 'Ciência da Computação', 'joao.silva@exemplo.com', 'admin', NOW(), 'admin', NOW()),
    ('Maria Oliveira', '1995-05-10', 2, 2, '987.654.321-00', '(11) 88888-8888', 'Universidade Y', 'Direito', 'maria.oliveira@exemplo.com', 'admin', NOW(), 'admin', NOW()),
    ('Pedro Santos', '2000-12-30', 1, 1, '456.123.789-00', '(11) 77777-7777', 'Universidade Z', 'Administração', 'pedro.santos@exemplo.com', 'admin', NOW(), 'admin', NOW());

INSERT INTO carteirinha (numero, data_emissao, data_validade, usuario_id, created_by, created_date, last_modified_by, last_modified_date)
VALUES
    ('000001', '2023-05-14', '2024-05-14', 1, 'admin', NOW(), 'admin', NOW()),
    ('000002', '2023-05-14', '2024-05-14', 2, 'admin', NOW(), 'admin', NOW()),
    ('000003', '2023-05-14', '2024-05-14', 3, 'admin', NOW(), 'admin', NOW());

