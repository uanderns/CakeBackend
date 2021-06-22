insert into tb_sabor(nome,descricao,imagem_Url) values ('baunilha', 'teste', 'www.teste.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('chocolate', 'chocolate', 'www.chocolate.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('banana', 'banana', 'www.banana.com.br');

insert into tb_tipo_bolo(nome_tipo) values ('Tradicional');
insert into tb_tipo_bolo(nome_tipo) values ('Recheado');

insert into tb_tamanho(tamanho) values (15.0);
insert into tb_tamanho(tamanho) values (25.0);

insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo cuca',10.0,2,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo maravilha',20.0,3,2,2);


insert into tb_avaliacao(classificacao,comentario) values (1, 'gostei muito');
insert into tb_avaliacao(classificacao,comentario) values (3, 'o bolo estava muito doce');

insert into tb_cancelamento(motivo) values ('bolo chegou desconfigurado');
insert into tb_cancelamento(motivo) values ('bolo chegou com muito atraso na entrega');


insert into tb_cliente(cpf,nome,telefone,email,senha) values ('12345678911','Joaquim','2199999999','joaquim@couves.com.br','padrao');

insert into tb_entregador (cpf,data_nascimento,genero,nome,telefone,doc_veiculo,email,senha) values ('12345678955', '1998-07-07', 'MASCULINO', 'Manoel Sardinha', '21976555522', 'KMB5056', 'manoel@sardinha.com', 'padrao2');

insert into tb_entregador (cpf,data_nascimento,genero,nome,telefone,doc_veiculo,email,senha) values ('13345678555', '1998-07-07', 'MASCULINO', 'Manoel Galinha', '2197655332', 'KMB5057', 'manoel@galinha.com', 'padrao2');

