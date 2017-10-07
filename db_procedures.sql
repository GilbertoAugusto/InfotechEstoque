create function auth_estoque(
@quantidadeSobra INT,
@quantidadeFalta INT
)
returns int
as

begin
	declare @ret int;
	 set @ret = 0; 
	if (@quantidadeFalta>0)
	set @ret=  4;		
	else if (@quantidadeSobra >0)
	set @ret= 3;
	else
	set @ret= 2;	

	RETURN @ret
end
go

create procedure insert_estoque_conferencia(
@quantidade_sobra numeric(10),
@quantidade_falta numeric(10),
@quantidade_entrada numeric(10),
@id_funcionario int,
@id_notafiscal int,
)
as

begin
		
		DECLARE @status_stoque int;
	
		set @status_stoque = dbo.auth_estoque(@quantidade_sobra, @quantidade_falta);
		
		declare @data_inser date = getdate();
		
		insert estoque_conferencia (data_conferencia, quantidade_entrada, qauntidade_falta , id_notafiscal  ,quantidade_sobra, status_estoque)
							values (@data_inser,     @quantidade_entrada, @quantidade_falta, @id_notafiscal ,@quantidade_sobra,@status_stoque )
				
		RETURN SELECT @@IDENTITY;
		
end
go


CREATE PROCEDURE CATEGORIA_ITENS
@valor varchar(1),
@categoria varchar(100),
@id numeric(25)
as
begin
begin try
	if @valor = 'U'	begin
		update categoria_item set categoria =@categoria where id_categoria_item = @id		
		end
	else if @valor = 'D' begin
		delete categoria_item where id_categoria_item = @id;
		end
	else if @valor = 'I'  begin
		insert into categoria_item(categoria) values (@categoria)
		end
end try
begin catch
SELECT  
    ERROR_NUMBER() AS ErrorNumber  
    ,ERROR_SEVERITY() AS ErrorSeverity  
    ,ERROR_STATE() AS ErrorState  
    ,ERROR_PROCEDURE() AS ErrorProcedure  
    ,ERROR_LINE() AS ErrorLine  
    ,ERROR_MESSAGE() AS ErrorMessage;  

end catch
end
go



create procedure tabela_preco
@valor varchar(1),
@descricao varchar(100),
@id numeric(25)
as
begin
begin try
	if @valor = 'U'	begin
		update tabela_preco set descricao=@descricao where id_tabela_preco = @id		
		end
	else if @valor = 'D' begin
		delete tabela_preco where id_tabela_preco = @id;
		end
	else if @valor = 'I'  begin
		insert into tabela_preco(descricao) values (@descricao)
		end
end try
begin catch
SELECT  
    ERROR_NUMBER() AS ErrorNumber  
    ,ERROR_SEVERITY() AS ErrorSeverity  
    ,ERROR_STATE() AS ErrorState  
    ,ERROR_PROCEDURE() AS ErrorProcedure  
    ,ERROR_LINE() AS ErrorLine  
    ,ERROR_MESSAGE() AS ErrorMessage;  

end catch
end




go
create procedure insert_funcionario
@nome varchar(100),
@usuario varchar(100),
@senha	varchar(120),
@cpf varchar(20),
@rg varchar(20),
@rua varchar(100),
@estado varchar(100),
@cidade varchar(100),
@cep varchar(100),
@data	date,
@acrescimo numeric(10,2),
@sexo int,
@setor int,
@telefone varchar(100),
@celular varchar(100),
@bairro varchar(100),
@complemento varchar(100)
as
begin
begin try
insert into funcionario(rg,nome, Usuario,senha,  cpf, rua,estado , cidade, cep, data_nascimento, acrescimo_salario,sexo,setor,telefone	,  celular ,bairro,  complemento)
				values (@rg,@nome,@usuario,@senha,@cpf,@rua,@estado,@cidade,@cep ,@data,				@acrescimo,@sexo,@setor,@telefone,@celular,@bairro, @complemento);
end try
begin catch
SELECT  
    ERROR_NUMBER() AS ErrorNumber  
    ,ERROR_SEVERITY() AS ErrorSeverity  
    ,ERROR_STATE() AS ErrorState  
    ,ERROR_PROCEDURE() AS ErrorProcedure  
    ,ERROR_LINE() AS ErrorLine  
    ,ERROR_MESSAGE() AS ErrorMessage;  
end catch
end
go

create procedure delete_funcionario
@id_usuario int
as
begin

begin try

delete funcionario where id_usuario = @id_usuario;

end try
begin catch
SELECT  
    ERROR_NUMBER() AS ErrorNumber  
    ,ERROR_SEVERITY() AS ErrorSeverity  
    ,ERROR_STATE() AS ErrorState  
    ,ERROR_PROCEDURE() AS ErrorProcedure  
    ,ERROR_LINE() AS ErrorLine  
    ,ERROR_MESSAGE() AS ErrorMessage;  

end catch
end
go

create procedure update_funcionario
@id_usuario int,
@nome varchar(100),
@usuario varchar(100),
@senha	varchar(120),
@cpf varchar(20),
@rg varchar(20),
@rua varchar(100),
@estado varchar(100),
@cidade varchar(100),
@cep varchar(100),
@data	date,
@acrescimo numeric(10,2),
@sexo int,
@setor int,
@telefone varchar(100),
@celular varchar(100),
@bairro varchar(100),
@complemento varchar(100)
as
begin 
begin try
	
	update funcionario set nome = @nome, Usuario= @Usuario, senha = @senha,cpf = @cpf, rua = @rua,estado =@estado , cidade =@cidade
			, cep=@cep, data_nascimento = @data, acrescimo_salario = @acrescimo,sexo = @sexo,setor = @setor, telefone = @telefone,celular = @celular,bairro = @bairro , complemento = @complemento
			  where id_usuario =@id_usuario;	

end try

begin catch

SELECT  
    ERROR_NUMBER() AS ErrorNumber  
    ,ERROR_SEVERITY() AS ErrorSeverity  
    ,ERROR_STATE() AS ErrorState  
    ,ERROR_PROCEDURE() AS ErrorProcedure  
    ,ERROR_LINE() AS ErrorLine  
    ,ERROR_MESSAGE() AS ErrorMessage;  
end catch
end
go

create view select_funcionario
AS
select id_usuario,nome'NOME', Usuario'USUARIO',senha'SENHA',  cpf'CPF', rua'RUA',estado'ESTADO' , cidade'CIDADE', cep'CEP', data_nascimento'DATA NASCIMENTO', acrescimo_salario'ACRESCIMO SALARIO',C.sexo'SEXO',B.descricao'SETOR', telefone,celular,bairro, complemento from funcionario A left join setor_funcionario B
on
A.setor = B.id_setor
left JOIN sexo C
ON
A.sexo = C.id_sexo
where id_usuario > 0
 

go

update nivel_acesso set adicionarFuncionario = 1, todosFuncionarios = 1, funcionarios = 1
go




