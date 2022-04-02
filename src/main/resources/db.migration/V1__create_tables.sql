CREATE TABLE filme
(
    id serial PRIMARY KEY,
    titulo varchar(100) NOT NULL,
    descricao varchar(100),
    genero varchar(100),
    nota float,
    disponibilidade bool DEFAULT TRUE,
    cliente_id integer references cliente(id)
);

CREATE TABLE cliente
(
    id serial PRIMARY KEY,
    nome varchar(100) NOT NULL,
    cpf varchar(100) NOT NULL unique,
    endereco varchar(100) not null,
    permicao_alugar bool default true
);

CREATE TABLE cliente_filme (
    cliente_id integer references cliente(id),
    filme_id integer references filme(id),
    primary key(cliente_id, filme_id),
    data_emprestimo timestamp
);
