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
INSERT INTO TB_MUSICA (nome) VALUES ('AVIOOO1');
INSERT INTO TB_MUSICA (nome) VALUES ('AVI0002');
INSERT INTO TB_MUSICA (nome) VALUES ('AVI0003');
INSERT INTO TB_MUSICA (nome) VALUES ('AVI0004');
INSERT INTO TB_MUSICA (nome) VALUES ('TESTE');



INSERT INTO TB_ACORDE (letra, nome) VALUES ('C', 'DÓ MAIOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('D', 'RÉ MAIOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('E', 'MI MAIOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('G', 'SOL MAIOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('A', 'LÁ MAIOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('Dm', 'RÉ MENOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('Em', 'MI MENOR');
INSERT INTO TB_ACORDE (letra, nome) VALUES ('Am', 'LÁ MENOR');

-- Inserir acordes associados à música
--AVI0001
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 5);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (1, 2);

--AVIOOO2
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 5);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 5);

--AVI0003
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 5);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 5);

--AVI0004
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 5);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 5);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 2);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (4, 3);

--teste
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (5, 3);
INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (5, 4);
--
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 1);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 2);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 3);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 4);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (2, 5);
--
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 1);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 2);
--INSERT INTO musica_acorde (musica_id, acorde_id) VALUES (3, 3);


