create database infotech_Controle_estoque;
use infotech_Controle_estoque;
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table tabela_preco(

id_tabela_preco int identity(1,1) primary key,

descricao varchar(100)

)



-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table tipo_parceiro(

id_tipo_parceiro int identity(1,1) primary key,

descricao_tipo_parceiro varchar(100)

)

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(1,'Cliente');

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(2,'Fornecedor');

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(3,'transportadora');

go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table categoria_fornecedor(

id_categoria_fornecedor int identity(1,1) primary key,

descricao_categoria_fornecedor varchar(100)
)
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table sexo(
id_sexo numeric(1) primary key,

sexo varchar(20),

)
insert into sexo(id_sexo,sexo) values(1, 'Masculino');
insert into sexo(id_sexo,sexo) values(1, 'Feminino');
insert into sexo(id_sexo,sexo) values(1, 'Outros');

go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_item(

id_status_item numeric(1) primary key,

status_item varchar(100)
)
insert into status_item(status_item,id_status_item) values('Ativo', 1);
insert into status_item(status_item,id_status_item) values('Inativo', 2);
insert into status_item(status_item,id_status_item) values('Bloqueado', 3);
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table categoria_item(

id_categoria_item int identity(1,1) primary key,

categoria varchar(100)

)
go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table status_fornecedor(
id_status_fornecedor numeric(1) primary key,

status_fornecedor varchar(100)

)

insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (1, 'Ativo')
insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (2, 'Inativo')
go


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_nota(

id_status_nota numeric(1),

descricao varchar(100)

)

insert status_nota(id_status_nota, descricao) values(1,'Aberta');
insert status_nota(id_status_nota, descricao) values(2,'Concluida');
insert status_nota(id_status_nota, descricao) values(3,'Pendencias Sobra');
insert status_nota(id_status_nota, descricao) values(4,'Pendencias Falta');
insert status_nota(id_status_nota, descricao) values(5,'Cancelada');
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table setor_funcionario(
id_setor int identity(1,1) primary key,

descricao varchar(100),

salario_base numeric(10,2)

)
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table status_estoque_saida(

id_status_estoque numeric(1) primary key,
descricao_status varchar(100)

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_estoque(

id_status_estoque numeric(1) primary key,
descricao_status varchar(100)

)

insert status_estoque(descricao_status, id_status_estoque) values ('Aberto',1)
insert status_estoque(descricao_status, id_status_estoque) values ('Concluido',2)
insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Sobra',3)
insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Falta',4)
insert status_estoque(descricao_status, id_status_estoque) values ('Bloqueado',5)
go


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table itens(
id_itens int IDENTITY(1,1) PRIMARY KEY,

status_item numeric(1) references status_item(id_status_item),

categoria_item int references categoria_item(id_categoria_item),

data_cadastro date not null,

codigo_item numeric(20),

descricao_item varchar(50),

observacao_item varchar(200)

)
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table funcionario(


id_usuario int identity(1,1) primary key,

Usuario varchar(50) unique,

senha	varchar(150),

nome	varchar(100) not null, 

cpf		varchar(20) unique not null,

rg		varchar(20) unique not null,

rua		varchar(120),

estado  varchar(20),

cidade  varchar(20),

cep		varchar(20),

data_nascimento date,

acrescimo_salario numeric(10,2),	

sexo numeric(1) references sexo(id_sexo),

setor int references setor_funcionario(id_setor)


)


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table parceiro(

id_parceiro int identity(1,1) primary key,

status_fornecedor numeric(1) references status_fornecedor(id_status_fornecedor),

tipo_parceiro int references tipo_parceiro(id_tipo_parceiro),

categoria_fornecedor int references categoria_fornecedor(id_categoria_fornecedor),

razao_social varchar(200) unique,

nome_fantasia varchar(200) not null,

contato		varchar(100),

ie			varchar(20) unique,

cnpj		varchar(22) unique,

email       varchar(200),

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table parceiro_endereco(

id_parceiro_endereco int identity(1,1)primary key,

id_parceiro int references parceiro(id_parceiro),

rua varchar(200),

bairro varchar(200),

cep varchar(200),

estado varchar(200),

cidade varchar(200),

numero varchar(200),

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table parceiro_telefone(

id_parceiro_telefone int identity(1,1) primary key,

id_parceiro int references parceiro(id_parceiro),

telefone varchar(45),

ramal   varchar(45),

contato varchar(45),

)


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table cod_itens_parceiro(

id_cod_itens_parceiro int identity(1,1) primary key,

codigo	varchar(15),

itens int references itens(id_itens),

parceiro int references parceiro(id_parceiro),

preco_compra	numeric(10,2),

data_atualizacao date

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table itens_preco(

id_itens_preco int identity(1,1) primary key,

preco_venda numeric(12,2),

tabela_preco int references tabela_preco(id_tabela_preco),

cod_itens_parceiro int references cod_itens_parceiro(id_cod_itens_parceiro)


)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table nota_fiscal(

id_nota_fiscal int identity(1,1) primary key,

parceiro int references parceiro(id_parceiro),

funcionario int references funcionario(id_usuario),

status_nota	int references status_nota(id_status_nota),

data_emissao date,

data_entrada date,

numero_nota numeric(25),

valor_nota numeric(20,2),
)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table nota_fiscal_itens(

id_nota_fiscal_itens int identity(1,1) primary key,

nota_fiscal int references nota_fiscal(id_nota_fiscal),

itens int references itens(id_itens),

quantidade numeric(10,2) not null,

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table estoque_conferencia(

id_estoque_conferencia int identity(1,1) primary key,

data_conferencia date,

quantidade_entrada numeric(10),

quantidade_sobra numeric(10),

quantidade_falta numeric(10),

funcionario int references funcionarios(id_usuario),

status_estoque numeric references status_estoque(id_status_estoque), 

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table nota_fiscal_saida(

id_nota_fiscal_saida int identity(1,1) primary key,

data_autorizacao date,

data_saida date,

valor_nota numeric(10,2),

parceiro int references parceiro(id_parceiro),

funcionario int references funcionario(id_funcionario),

status_nota int references status_nota(id_nota),

)


create database infotech_Controle_estoque;
use infotech_Controle_estoque;
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table tabela_preco(

id_tabela_preco int identity(1,1) primary key,

descricao varchar(100)

)



-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table tipo_parceiro(

id_tipo_parceiro int identity(1,1) primary key,

descricao_tipo_parceiro varchar(100)

)

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(1,'Cliente');

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(2,'Fornecedor');

insert into tipo_parceiro(id_tipo_parceiro,descricao_tipo_parceiro) values(3,'transportadora');

go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table categoria_fornecedor(

id_categoria_fornecedor int identity(1,1) primary key,

descricao_categoria_fornecedor varchar(100)
)
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table sexo(
id_sexo numeric(1) primary key,

sexo varchar(20),

)
insert into sexo(id_sexo,sexo) values(1, 'Masculino');
insert into sexo(id_sexo,sexo) values(1, 'Feminino');
insert into sexo(id_sexo,sexo) values(1, 'Outros');

go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_item(

id_status_item numeric(1) primary key,

status_item varchar(100)
)
insert into status_item(status_item,id_status_item) values('Ativo', 1);
insert into status_item(status_item,id_status_item) values('Inativo', 2);
insert into status_item(status_item,id_status_item) values('Bloqueado', 3);
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table categoria_item(

id_categoria_item int identity(1,1) primary key,

categoria varchar(100)

)
go
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table status_fornecedor(
id_status_fornecedor numeric(1) primary key,

status_fornecedor varchar(100)

)

insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (1, 'Ativo')
insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (2, 'Inativo')
go


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_nota(

id_status_nota numeric(1),

descricao varchar(100)

)

insert status_nota(id_status_nota, descricao) values(1,'Aberta');
insert status_nota(id_status_nota, descricao) values(2,'Concluida');
insert status_nota(id_status_nota, descricao) values(3,'Pendencias Sobra');
insert status_nota(id_status_nota, descricao) values(4,'Pendencias Falta');
insert status_nota(id_status_nota, descricao) values(5,'Cancelada');
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table setor_funcionario(
id_setor int identity(1,1) primary key,

descricao varchar(100),

salario_base numeric(10,2)

)
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table status_estoque_saida(

id_status_estoque numeric(1) primary key,
descricao_status varchar(100)

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table status_estoque(

id_status_estoque numeric(1) primary key,
descricao_status varchar(100)

)

insert status_estoque(descricao_status, id_status_estoque) values ('Aberto',1)
insert status_estoque(descricao_status, id_status_estoque) values ('Concluido',2)
insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Sobra',3)
insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Falta',4)
insert status_estoque(descricao_status, id_status_estoque) values ('Bloqueado',5)
go


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table itens(
id_itens int IDENTITY(1,1) PRIMARY KEY,

status_item numeric(1) references status_item(id_status_item),

categoria_item int references categoria_item(id_categoria_item),

data_cadastro date not null,

codigo_item numeric(20),

descricao_item varchar(50),

observacao_item varchar(200)

)
go

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table funcionario(


id_usuario int identity(1,1) primary key,

Usuario varchar(50) unique,

senha	varchar(150),

nome	varchar(100) not null, 

cpf		varchar(20) unique not null,

rg		varchar(20) unique not null,

rua		varchar(120),

estado  varchar(20),

cidade  varchar(20),

cep		varchar(20),

data_nascimento date,

acrescimo_salario numeric(10,2),	

sexo numeric(1) references sexo(id_sexo),

setor int references setor_funcionario(id_setor)


)


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table parceiro(

id_parceiro int identity(1,1) primary key,

status_fornecedor numeric(1) references status_fornecedor(id_status_fornecedor),

tipo_parceiro int references tipo_parceiro(id_tipo_parceiro),

categoria_fornecedor int references categoria_fornecedor(id_categoria_fornecedor),

razao_social varchar(200) unique,

nome_fantasia varchar(200) not null,

contato		varchar(100),

ie			varchar(20) unique,

cnpj		varchar(22) unique,

email       varchar(200),

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table parceiro_endereco(

id_parceiro_endereco int identity(1,1)primary key,

id_parceiro int references parceiro(id_parceiro),

rua varchar(200),

bairro varchar(200),

cep varchar(200),

estado varchar(200),

cidade varchar(200),

numero varchar(200),

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
create table parceiro_telefone(

id_parceiro_telefone int identity(1,1) primary key,

id_parceiro int references parceiro(id_parceiro),

telefone varchar(45),

ramal   varchar(45),

contato varchar(45),

)


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table cod_itens_parceiro(

id_cod_itens_parceiro int identity(1,1) primary key,

codigo	varchar(15),

itens int references itens(id_itens),

parceiro int references parceiro(id_parceiro),

preco_compra	numeric(10,2),

data_atualizacao date

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table itens_preco(

id_itens_preco int identity(1,1) primary key,

preco_venda numeric(12,2),

tabela_preco int references tabela_preco(id_tabela_preco),

cod_itens_parceiro int references cod_itens_parceiro(id_cod_itens_parceiro)


)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table nota_fiscal(

id_nota_fiscal int identity(1,1) primary key,

parceiro int references parceiro(id_parceiro),

funcionario int references funcionario(id_usuario),

status_nota	int references status_nota(id_status_nota),

data_emissao date,

data_entrada date,

numero_nota numeric(25),

valor_nota numeric(20,2),
)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table nota_fiscal_itens(

id_nota_fiscal_itens int identity(1,1) primary key,

nota_fiscal int references nota_fiscal(id_nota_fiscal),

itens int references itens(id_itens),

quantidade numeric(10,2) not null,

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table estoque_conferencia(

id_estoque_conferencia int identity(1,1) primary key,

data_conferencia date,

quantidade_entrada numeric(10),

quantidade_sobra numeric(10),

quantidade_falta numeric(10),

funcionario int references funcionarios(id_usuario),

status_estoque numeric references status_estoque(id_status_estoque), 

)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


create table itens_conferencia(

id_itens_conferencias int identity(1,1) primary key,

data	date,

quantidade numeric(10),

nota_fiscal_saida int references nota_discal_saida(id_nota_discal_saida),

funcionario int references funcionario(id_usuario)


)



-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table estoque_saida(

id_estoque saida int identity(1,1) primary key,

data_saida date,

)


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------







