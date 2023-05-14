-- adiciona a coluna genero_id na tabela usuario
ALTER TABLE usuario
    ADD COLUMN genero_id INT,
ADD CONSTRAINT fk_usuario_genero
FOREIGN KEY (genero_id) REFERENCES genero(id);
