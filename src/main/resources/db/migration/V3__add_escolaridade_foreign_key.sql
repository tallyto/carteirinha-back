-- adiciona a coluna escolaridade_id na tabela usuario
ALTER TABLE usuario
    ADD COLUMN escolaridade_id INT,
ADD CONSTRAINT fk_usuario_escolaridade
FOREIGN KEY (escolaridade_id) REFERENCES escolaridade(id);
