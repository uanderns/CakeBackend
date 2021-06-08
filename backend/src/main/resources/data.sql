insert into tb_sabor(nome,descricao,imagem_Url) values ('baunilha', 'teste', 'www.teste.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('chocolate', 'chocolate', 'www.chocolate.com.br');
insert into tb_sabor(nome,descricao,imagem_Url) values ('banana', 'banana', 'www.banana.com.br');

insert into tb_tipo_bolo(nome_tipo) values ('Tradicional');
insert into tb_tipo_bolo(nome_tipo) values ('Recheado');

insert into tb_tamanho(tamanho) values (15.0);
insert into tb_tamanho(tamanho) values (25.0);

insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo cuca',10.0,2,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('bolo maravilha',20.0,3,2,2);