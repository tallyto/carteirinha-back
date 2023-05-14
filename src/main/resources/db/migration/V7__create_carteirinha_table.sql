CREATE TABLE carteirinha (
                             id INT PRIMARY KEY AUTO_INCREMENT,
                             numero VARCHAR(20) NOT NULL,
                             data_emissao DATE NOT NULL,
                             data_validade DATE NOT NULL,
                             usuario_id INT NOT NULL,
                             FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);
