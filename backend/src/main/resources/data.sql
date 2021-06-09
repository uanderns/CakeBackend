insert into tb_sabor(nome,descricao,imagem_Url) values ('baunilha', 'teste', 'www.teste.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('chocolate', 'chocolate', 'www.chocolate.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('banana', 'banana', 'www.banana.com.br');

insert into tb_tipo_bolo(nome_tipo) values ('Tradicional');
insert into tb_tipo_bolo(nome_tipo) values ('Recheado');

insert into tb_tamanho(tamanho) values (15.0);
insert into tb_tamanho(tamanho) values (25.0);

insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo cuca',10.0,2,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo maravilha',20.0,3,2,2);

insert into tb_entregador(doc_veiculo) values ('PLACAX');
insert into tb_entregador(doc_veiculo) values ('PLACAY');

insert into tb_avaliacao(classificacao,comentario) values (1, 'gostei muito');
insert into tb_avaliacao(classificacao,comentario) values (3, 'o bolo estava muito doce');

insert into tb_cancelamento(motivo) values ('bolo chegou desconfigurado');
insert into tb_cancelamento(motivo) values ('bolo chegou com muito atraso na entrega');