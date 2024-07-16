-- Criação das tabelas
CREATE TABLE IF NOT EXISTS TB_MUSICA (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS TB_ACORDE (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    letra VARCHAR(255),
    nome VARCHAR(255),
    repeticoes BIGINT,
    musica_id BIGINT,
    FOREIGN KEY (musica_id) REFERENCES TB_MUSICA(id)
);

-- Inserção de dados
INSERT INTO TB_MUSICA (nome) VALUES ('Song 1');

-- Recuperar o ID da música recém-inserida
-- No H2, você pode usar SCOPE_IDENTITY() ou outra função para recuperar o ID inserido
-- Supondo que o ID retornado seja 1 (ajuste conforme necessário)

-- Inserir acordes associados à música
INSERT INTO TB_ACORDE (letra, nome, repeticoes, musica_id) VALUES ('C', 'C major', 4, 1);
INSERT INTO TB_ACORDE (letra, nome, repeticoes, musica_id) VALUES ('D', 'D major', 4, 1);
INSERT INTO TB_ACORDE (letra, nome, repeticoes, musica_id) VALUES ('E', 'E major', 4, 1);
