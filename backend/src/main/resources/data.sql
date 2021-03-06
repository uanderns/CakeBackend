insert into tb_tipo_bolo(nome_tipo) values ('Bolo Tradicional');
insert into tb_tipo_bolo(nome_tipo) values ('Bolo Recheados');
insert into tb_tipo_bolo(nome_tipo) values ('Bolo Caseirinho Gourmet');
insert into tb_tipo_bolo(nome_tipo) values ('Bolo Festa');

insert into tb_sabor(nome,descricao,imagem_Url) values ('Abacaxi', 'massa branca saborizada com abacaxi e cobertura de abacaxi', 'https://user-images.githubusercontent.com/59483858/123123432-33046c00-d41d-11eb-9432-b42bf8ba016a.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Banana', 'Massa branca com pedaços de banana e calda caramelizada de banana', 'https://user-images.githubusercontent.com/59483858/123123714-6cd57280-d41d-11eb-9768-99db61daae1a.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Chocolate' , 'Massa de chocolate e cobertura de brigadeiro' , 'https://user-images.githubusercontent.com/59483858/123123817-85de2380-d41d-11eb-9381-b684551f33e3.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Churros' , 'Massa especial com canela, recheio de doce de leite ' , 'https://user-images.githubusercontent.com/59483858/123123937-9db5a780-d41d-11eb-9e90-82e2bd0303ac.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Coco' , 'Massa branca saborizada com coco e cobertura de beijinho' , 'https://user-images.githubusercontent.com/59483858/123124034-b4f49500-d41d-11eb-953d-cd3502189dc3.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Laranja' , 'Massa branca saborizada com laranja e calda de laranja' , 'https://user-images.githubusercontent.com/59483858/123124115-c8076500-d41d-11eb-8dc1-fa7b20e5f1df.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Milho com Goiabada' , 'Massa de fubarina e milho com pedaços de goiabada' , 'https://user-images.githubusercontent.com/59483858/123124192-d81f4480-d41d-11eb-91f2-693a78db401d.jpg');
insert into tb_sabor(nome,descricao,imagem_Url) values ('Formigueiro' , 'Massa branca com granulados de chocolate e cobertura de brigadeiro gourmet' , 'https://user-images.githubusercontent.com/59483858/123124269-e9685100-d41d-11eb-9f51-291da55352a7.jpg');



insert into tb_tamanho(tamanho) values ('20cm');
insert into tb_tamanho(tamanho) values ('22cm');
insert into tb_tamanho(tamanho) values ('500g');
insert into tb_tamanho(tamanho) values ('15cm');
insert into tb_tamanho(tamanho) values ('25cm');
insert into tb_tamanho(tamanho) values ('30cm');


insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Abacaxi',15.0,1,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Banana',15.0,2,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Chocolate',15.0,3,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Churros',15.0,4,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Coco',15.0,5,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Laranja',15.0,6,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo de Milho com Goiabada',15.0,7,1,1);
insert into tb_bolo(nome,preco,idsabor,idtipobolo,idtamanho) values ('Bolo Formigueiro', 15.0,8,1,1);


insert into tb_avaliacao(classificacao,comentario) values (5, 'O bolo estava maravilhoso!!!');
insert into tb_avaliacao(classificacao,comentario) values (3, 'o bolo estava muito doce');


insert into tb_cancelamento(motivo) values ('bolo chegou desconfigurado');
insert into tb_cancelamento(motivo) values ('bolo chegou com muito atraso na entrega');

insert into tb_cliente(cpf,data_nascimento,genero,nome,telefone,email,endereco, senha) values ('12845678911'  ,'1985-08-02' , 'MASCULINO', 'João Silva ', '2199999999','joasilva@silva.com.br', 'Rua Visconde de Uruguai apt201', 'padrao');

insert into tb_entregador (cpf,data_nascimento,genero,nome,telefone,doc_veiculo,email,senha) values ('12345678955', '1998-07-07', 'MASCULINO', 'Manoel Sardinha', '21976555522', 'KMB5056', 'manoel@sardinha.com', 'padrao2');
insert into tb_entregador (cpf,data_nascimento,genero,nome,telefone,doc_veiculo,email,senha) values ('13345678555', '1998-07-07', 'MASCULINO', 'Manoel Galinha', '2197655332', 'KMB5057', 'manoel@galinha.com', 'padrao2');


