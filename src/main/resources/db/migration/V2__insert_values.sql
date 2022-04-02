insert into cliente(nome, cpf, endereco, permicao_alugar) values ('Israel', '123', 'Rua Dois, 756', true);
insert into filme (titulo, descricao, genero, nota, disponibilidade, cliente_id) values ('A Volta dos que não foram', 'Um filme imperdivel', 'Terror', 2 , false, (select id from cliente where cpf like '123'));
