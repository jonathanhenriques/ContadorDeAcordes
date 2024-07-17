---- Criação das tabelas
--CREATE TABLE IF NOT EXISTS TB_MUSICA (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255)
--);
--
--CREATE TABLE IF NOT EXISTS TB_ACORDE (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    letra VARCHAR(255),
--    nome VARCHAR(255),
--    repeticoes BIGINT,
--    musica_id BIGINT,
--    FOREIGN KEY (musica_id) REFERENCES TB_MUSICA(id)
--);

-- Inserção de dados
INSERT INTO TB_MUSICA (nome) VALUES ('Song 1');
INSERT INTO TB_MUSICA (nome) VALUES ('Musica 2');
INSERT INTO TB_MUSICA (nome) VALUES ('Musica 3');



INSERT INTO TB_ACORDE (letra, nome, repeticoes) VALUES ('C', 'C major', 4);
INSERT INTO TB_ACORDE (letra, nome, repeticoes) VALUES ('D', 'D major', 4);
INSERT INTO TB_ACORDE (letra, nome, repeticoes) VALUES ('E', 'E major', 4);
INSERT INTO TB_ACORDE (letra, nome, repeticoes) VALUES ('A', 'Acorde A', 3);
INSERT INTO TB_ACORDE (letra, nome, repeticoes) VALUES ('B', 'Acorde B', 2);

-- Inserir acordes associados à música
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 1);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 4);

INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 1);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 4);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 5);

INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 1);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 3);


