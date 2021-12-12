INSERT INTO permissao (nome) values('ROLE_ADMIN');
INSERT INTO permissao (nome) values('ROLE_USER');

INSERT INTO usuario(nome, cpf, telefone, email,  username, password) VALUES ('Administrador', '06354809992','46999858352', 'rafasch@live.com', 'rafasch@live.com', '$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');
INSERT INTO usuario(nome, cpf, telefone, email,  username, password) VALUES ('TESTE', '06354809993','46999858352', 'rafasch@live.com', 'rafaschi@live.com', '$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');


INSERT INTO permissao (nome) values('ROLE_ADMIN');
INSERT INTO permissao (nome) values('ROLE_USER');

INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 1);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 2);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (2, 2);

insert into autor(nome, nacionalidade, email) values('Tiringa', 'Brasileiro', 'autor@hotmail.com');
insert into autor(nome, nacionalidade, email) values('Galo Cego', 'Brasileiro', 'autor2@hotmail.com');
insert into autor(nome, nacionalidade, email) values('Hulk Magrelo', 'Brasileiro', 'autor3@hotmail.com');


insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 01', 123, 'editora 01', '../img/products/51n3T2SNLGL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 199.0, 1);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 02', 1234, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 209.99, 1);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 03', 12345, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 299.99, 1);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 04', 123456, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 449.99, 2);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 05', 321, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 399.99, 2);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 06', 3214, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 199.0, 2);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 07', 32145, 'editora 01', '../img/products/51q9FRA9gjL._SY344_BO1,204,203,200_QL70_ML2_.jpg', 199.0, 3);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 07', 321456, 'editora 01', '../img/products/519LeZDGJNS._SY344_BO1,204,203,200_QL70_ML2_.jpg', 199.0, 3);
insert into livro (titulo, isbn, editora, img, valor, autor_id) values ('Livro 09', 456789, 'editora 01', '../img/products/capa-ampliada-9788575224458.jpg', 199.0, 3);


