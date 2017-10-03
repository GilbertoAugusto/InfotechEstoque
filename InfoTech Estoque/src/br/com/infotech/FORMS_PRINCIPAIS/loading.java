/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FORMS_PRINCIPAIS;

import br.com.infotech.CONNECTION.firstCon;
import br.com.infotech.FUNCTION.db_update;
import static com.oracle.nio.BufferSecrets.instance;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.Global.instance;
import static sun.font.SunLayoutEngine.instance;
import sun.java2d.pipe.LoopBasedPipe;

/**
 *
 * @author Gilberto
 */
public class loading extends javax.swing.JFrame {

    
   
    public loading() {
        initComponents();
        centralizarComponente();        
        
    }
    public void timer(int valor){
    int x=0;
    while(x<=valor){
    x++;
            }
    }
    
    
  public   void conn(){
    lblApresentacao.setText("Conectando ao Servidor");
    timer(10000);
    lblApresentacao.setText("Obtendo Atualizações");
    preparingSql();    
    }
        
  public  void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) /3, (ds.height - dw.height) /3);
    }
    
  private static String check_database(){ 
        String queryCheckDatabase;
       return queryCheckDatabase =
                  "                     "
                + " create  procedure check_database   " +
"                  as  " +
"                  begin  " +
"                  begin try     " +
"                   if not exists(select * from sys.databases where name = 'infotech_estoque')begin " +
"                  			create database infotech_estoque; " +
"                                     IF NOT EXISTS(Select * from sys.syslogins where name= 'infotech')begin " +
"									 CREATE LOGIN [infotech] WITH PASSWORD=N'LmHBUhsKtIwSpfyj5teQg6D31nnkVqpcnLec4Q/z4eo=', DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[Português (Brasil)], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON; " +
"                                        ALTER LOGIN [infotech] ENABLE; " +
"                                        ALTER SERVER ROLE [sysadmin] ADD MEMBER [infotech];            " +
"                                        alter login infotech WITH PASSWORD= '123456' ; " +
"										end " +
"                    		end    " +
"                    end try   " +
"                    BEGIN CATCH   " +
"                    	 SELECT     " +
"                    	 ERROR_NUMBER() AS ErrorNumber     " +
"                        ,ERROR_SEVERITY() AS ErrorSeverity     " +
"                        ,ERROR_STATE() AS ErrorState     " +
"                        ,ERROR_PROCEDURE() AS ErrorProcedure   " +
"                        ,ERROR_LINE() AS ErrorLine     " +
"                        ,ERROR_MESSAGE() AS ErrorMessage;     " +
"                    end catch   " +
"                    end" +
                    " ";    
}
        
  private static String cretate_tables(){
        String queryCreateTable;
        return queryCreateTable ="				create procedure create_tables  " +
"				as  " +
"				begin  " +
"  " +
"				if not exists(select * from sys.tables where name ='versionamento')begin  " +
"	  " +
                "  " +
"				create table versionamento(  " +
"  " +
"				versionamento int identity(1,1),  " +
"				data_versao date,  " +
"				numero	numeric(10,5) unique,  " +
"				notas_versao varchar(100)  " +
"  " +
"				)   " +
"                               " +
"				create table tabela_preco(  " +
"  " +
"				id_tabela_preco int identity(1,1) primary key,  " +
"  " +
"				descricao varchar(100)  " +
"  " +
"				)   " +
"   " +
"  " +
"				create table tipo_parceiro(  " +
"  " +
"				id_tipo_parceiro int identity(1,1) primary key,  " +
"  " +
"				descricao_tipo_parceiro varchar(100) unique  " +
"  " +
"				)   " +
"  " +
"				insert into tipo_parceiro(descricao_tipo_parceiro) values('Cliente')   " +
"  " +
"				insert into tipo_parceiro(descricao_tipo_parceiro) values('Fornecedor')   " +
"  " +
"				insert into tipo_parceiro(descricao_tipo_parceiro) values('transportadora')   " +
"  " +  
"   " +
"  " +
"  " +
"				create table categoria_fornecedor(  " +
"  " +
"				id_categoria_fornecedor int identity(1,1) primary key, " +
"  " +
"				descricao_categoria_fornecedor varchar(100)"
                                + ") " +
"  " +
"  " +
"   " +
"  " +
"  " +
"				create table sexo(  " +
"				id_sexo numeric(1) primary key,  " +
"  " +
"				sexo varchar(20)  " +
"  " +
"				) "
                                + " " +
"				insert into sexo(id_sexo,sexo) values(1, 'Masculino')   " +
"				insert into sexo(id_sexo,sexo) values(2, 'Feminino') " +
"				insert into sexo(id_sexo,sexo) values(3, 'Outros') " +
"  " +
"   " +
"  " +
"  " +
"				create table status_item(  " +
"  " +
"				id_status_item numeric(1) primary key,  " +
"  " +
"				status_item varchar(100)  " +
"				)" +
"				insert into status_item(status_item,id_status_item) values('Ativo', 1)  " +
"				insert into status_item(status_item,id_status_item) values('Inativo', 2)  " +
"				insert into status_item(status_item,id_status_item) values('Bloqueado', 3)  " +
"   " +
			
"  " +
"				create table categoria_item(  " +
"  " +
"				id_categoria_item int identity(1,1) primary key,  " +
"  " +
"				categoria varchar(100)  " +
"  " +
"				)  " +
"   " +
"  " +
"				create table status_fornecedor(  " +
"				id_status_fornecedor numeric(1) primary key,  " +
"  " +
"				status_fornecedor varchar(100)  " +
"  " +
"				)  " +
"  " +
"				insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (1, 'Ativo')   " +
"				insert status_fornecedor(id_status_fornecedor, status_fornecedor) values (2, 'Inativo')   " +
"   " +
"  " +
"				create table status_nota(  " +
"  " +
"				id_status_nota numeric(1) primary key,  " +
"  " +
"				descricao varchar(100)  " +
"  " +
"				)   " +
"  " +
"				insert status_nota(id_status_nota, descricao) values(1,'Aberta')   " +
"				insert status_nota(id_status_nota, descricao) values(2,'Concluida')   " +
"				insert status_nota(id_status_nota, descricao) values(3,'Pendencias Sobra')   " +
"				insert status_nota(id_status_nota, descricao) values(4,'Pendencias Falta')   " +
"				insert status_nota(id_status_nota, descricao) values(5,'Cancelada')   " +
"   " +
"  " +
"				create table setor_funcionario(  " +
"				id_setor int identity(1,1) primary key,  " +
"  " +
"				descricao varchar(100),  " +
"  " +
"				salario_base numeric(10,2)  " +
"  " +
"				)   " +
"   " +
"  " +
"  " +
"				create table status_estoque_saida(  " +
"  " +
"				id_status_estoque numeric(1) primary key,  " +
"				descricao_status varchar(100)  " +
"  " +
"				)   " +
"   " +
"				create table status_estoque(  " +
"  " +
"				id_status_estoque numeric(1) primary key,  " +
"				descricao_status varchar(100) unique  " +
"  " +
"				)   " +
"  " +
"				insert status_estoque(descricao_status, id_status_estoque) values ('Aberto',1)   " +
"				insert status_estoque(descricao_status, id_status_estoque) values ('Concluido',2)   " +
"				insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Sobra',3)   " +
"				insert status_estoque(descricao_status, id_status_estoque) values ('Pendencia Falta',4)   " +
"				insert status_estoque(descricao_status, id_status_estoque) values ('Bloqueado',5)   " +
"   " +
"  " +
"				create table itens(  " +
"				id_itens int IDENTITY(1,1) PRIMARY KEY,  " +
"  " +
"				status_item numeric(1) references status_item(id_status_item),  " +
"  " +
"				categoria_item int references categoria_item(id_categoria_item), " +
"  " +
"				data_cadastro date not null,  " +
"  " +
"				codigo_item numeric(20),  " +
"  " +
"				descricao_item varchar(50),  " +
"  " +
"				observacao_item varchar(200)  " +
"  " +
"				)   " +
"   " +
"  " +
"				create table funcionario(  " +
"  " +
"  " +
"				id_usuario int identity(1,1) primary key,  " +
"  " +
"				Usuario varchar(50) unique,  " +
"  " +
"				senha	varchar(150),  " +
"  " +
"				nome	varchar(100) not null,   " +
"  " +
"				cpf		varchar(20) unique not null,  " +
"  " +
"				rg		varchar(20) unique not null,  " +
"  " +
"				rua		varchar(120),  " +
"  " +
"				estado  varchar(20),  " +
"  " +
"				cidade  varchar(20),  " +
"  " +
"				cep		varchar(20),  " +
"  " +
"				data_nascimento date,  " +
"  " +
"				acrescimo_salario numeric(10,2),	  " +
"  " +
"				sexo numeric(1) references sexo(id_sexo),  " +
"  " +
"				setor int references setor_funcionario(id_setor)  " +
"  " +
"  " +
"				)   " +
"  " +
"   " +
"  " +
"				create table parceiro(  " +
"  " +
"				id_parceiro int identity(1,1) primary key,  " +
"  " +
"				status_fornecedor numeric(1) references status_fornecedor(id_status_fornecedor),  " +
"  " +
"				tipo_parceiro int references tipo_parceiro(id_tipo_parceiro),  " +
"  " +
"				categoria_fornecedor int references categoria_fornecedor(id_categoria_fornecedor),  " +
"  " +
"				razao_social varchar(200) unique,  " +
"  " +
"				nome_fantasia varchar(200) not null,  " +
"  " +
"				contato		varchar(100),  " +
"  " +
"				ie			varchar(20) unique,  " +
"  " +
"				cnpj		varchar(22) unique,  " +
"  " +
"				email       varchar(200)  " +
"  " +
"				)   " +
"   " +
"  " +
"  " +
"				create table parceiro_endereco(  " +
"  " +
"				id_parceiro_endereco int identity(1,1)primary key,  " +
"  " +
"				id_parceiro int references parceiro(id_parceiro),  " +
"  " +
"				rua varchar(200),  " +
"  " +
"				bairro varchar(200),  " +
"  " +
"				cep varchar(200),  " +
"  " +
"				estado varchar(200),  " +
"  " +
"				cidade varchar(200),  " +
"  " +
"				numero varchar(200)  " +
"  " +
"				)  " +
"   " +
"   " +
"				create table parceiro_telefone(  " +
"  " +
"				id_parceiro_telefone int identity(1,1) primary key,  " +
"  " +
"				id_parceiro int references parceiro(id_parceiro),  " +
"  " +
"				telefone varchar(45),  " +
"  " +
"				ramal   varchar(45),  " +
"  " +
"				contato varchar(45)  " +
"  " +
"				)  " +
"   " +
"  " +
"				create table cod_itens_parceiro(  " +
"  " +
"				id_cod_itens_parceiro int identity(1,1) primary key,  " +
"  " +
"				codigo	varchar(15),  " +
"  " +
"				itens int references itens(id_itens),  " +
"  " +
"				parceiro int references parceiro(id_parceiro),  " +
"  " +
"				preco_compra	numeric(10,2),  " +
"  " +
"				data_atualizacao date  " +
"  " +
"				)  " +
"   " +
"  " +
"				create table itens_preco(  " +
"  " +
"				id_itens_preco int identity(1,1) primary key,  " +
"  " +
"				preco_venda numeric(12,2),  " +
"  " +
"				tabela_preco int references tabela_preco(id_tabela_preco),  " +
"  " +
"				cod_itens_parceiro int references cod_itens_parceiro(id_cod_itens_parceiro)  " +
"				)   " +
"   " +
"  " +
"				create table nota_fiscal(  " +
"  " +
"				id_nota_fiscal int identity(1,1) primary key,  " +
"  " +
"				parceiro int references parceiro(id_parceiro),  " +
"  " +
"				funcionario int references funcionario(id_usuario),  " +
"  " +
"				status_nota	numeric(1) references status_nota(id_status_nota),  " +
"  " +
"				data_emissao date,  " +
"  " +
"				data_entrada date,  " +
"  " +
"				numero_nota numeric(25),  " +
"  " +
"				valor_nota numeric(20,2)  " +
"				)   " +
"   " +
"  " +
"				create table nota_fiscal_itens(  " +
"  " +
"				id_nota_fiscal_itens int identity(1,1) primary key,  " +
"  " +
"				nota_fiscal int references nota_fiscal(id_nota_fiscal),  " +
"  " +
"				itens int references itens(id_itens),  " +
"  " +
"				quantidade numeric(10,2) not null  " +
"  " +
"				)   " +
"   " +
"  " +
"  " +
"				create table estoque_conferencia(  " +
"  " +
"				id_estoque_conferencia int identity(1,1) primary key,  " +
"  " +
"				data_conferencia date,  " +
"  " +
"				quantidade_entrada numeric(10),  " +
"  " +
"				quantidade_sobra numeric(10),  " +
"  " +
"				quantidade_falta numeric(10),  " +
"  " +
"				funcionario int references funcionario(id_usuario),  " +
"  " +
"				status_estoque numeric(1) references status_estoque(id_status_estoque)   " +
"  " +
"				)   " +
"   " +
"  " +
"  " +
"				create table nota_fiscal_saida(  " +
"  " +
"				id_nota_fiscal_saida int identity(1,1) primary key,  " +
"  " +
"				data_autorizacao date,  " +
"  " +
"				data_saida date,  " +
"  " +
"				valor_nota numeric(10,2),  " +
"  " +
"				parceiro int references parceiro(id_parceiro),  " +
"  " +
"				funcionario int references funcionario(id_usuario),  " +
"  " +
"				status_nota numeric(1) references status_nota(id_status_nota)  " +
"  " +
"				)   " +
"   " +
"  " +
"  " +
"				create table itens_conferencia(  " +
"  " +
"				id_itens_conferencias int identity(1,1) primary key,  " +
"  " +
"				data	date,  " +
"  " +
"				quantidade numeric(10),  " +
"  " +
"				nota_fiscal_saida int references nota_fiscal_saida(id_nota_fiscal_saida),  " +
"  " +
"				funcionario int references funcionario(id_usuario)  " +
"  " +
"  " +
"				)   " +
"   " +
"  " +
"				create table nota_fiscal_itens_saida(  " +
"				id_nota_fiscal_itens_saida int identity(1,1) primary key,  " +
                
"				inota_fiscal_saida int references nota_fiscal_saida(id_nota_fiscal_saida),  " +
"		"
                + "		itens int references itens(id_itens),  " +
                
"				quantidade numeric(10)  " +
"		"
                + "		)   " +
"   " +
                
"  " +
"  " +
"				create table estoque_saida(  " +
"  " +
"				id_estoque_saida int identity(1,1) primary key,  " +
"				nota_fiscal_itens_saida int references nota_fiscal_itens_saida(id_nota_fiscal_itens_saida),  " +
"				data_saida date  " +
"  " +
"				)   " +
"   " +
"  " +
"				create table nivel_acesso(  " +
"  " +
"				id_nivel_acesso int identity(1,1) primary key,"
                + "             autorizacao numeric(1),   " +
"                               cadastrarCliente numeric(1), "+
                                "todosClientes numeric(1),"+
                                "clientesInativos numeric(1),"+
                                "adicionarFuncionario numeric(1),"+
                                "todosFuncionarios numeric(1),"+
                                "funcionariosInativos numeric(1),"+
                                "adiministracao numeric(1),"+
                                "estoque numeric(1),"+
                                "clientes numeric(1),"+
                                "funcionarios numeric(1),"+
                                  
"				funcionario int references funcionario(id_usuario) unique " +
"  " +
"				)"
                + "             insert into funcionario (nome,Usuario,		senha,		cpf,				rg) \n" +
"				values  ('SISTEMA','User@sys','usuario','111.111.111-11','11.111.111-11')   " +
"                               "
                +               "insert into nivel_acesso (funcionario,autorizacao) values(1,1)  " +                             
"                               END " +
"				end  "
                                + "" ;
}
        
  private static String drop_check(){
  
      String ret;
      
      return ret ="if exists(select * from sys.procedures where name ='check_database')begin " +
                    "	drop procedure check_database; " +
                    "end";
    
  }    

  private static String drop_tables(){
  
      String ret;
      
      return ret =" if exists(select * from sys.procedures where name ='create_tables')begin "+
	" drop procedure create_tables; "+
        " end ";

  
  }     
  
  private  void preparingSql(){
       
        
     try{   
        
    Connection conn = firstCon.obterConexão();
    
    
    Statement stmt =  conn.createStatement();
            lblApresentacao.setText("Checando Bando De Dados");            
            stmt.execute("use master; "+drop_check());            
            stmt.execute(check_database());
            lblApresentacao.setText("Virificando Versoes");
            stmt.execute("use master; execute check_database");
            lblApresentacao.setText("Atualizando Tabelas");
            stmt.execute("use infotech_estoque; "+drop_tables() );
            stmt.execute(cretate_tables());
            lblApresentacao.setText("Validando Atualização");
            stmt.execute("use infotech_estoque; execute create_tables");
            lblApresentacao.setText("Concluindo Atualização");            
            db_update db = new db_update();
            
            db.ret_diretorioArquivo();
            
          double time =0;
            while(time <=99999){
            
            time = time +0.2;
            }
             login novo = new login();
             novo.setVisible(true);
             this.dispose();
         
             
     }
     catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Ocorreu Um Erro>:000201\n"+erro.getLocalizedMessage());
              JOptionPane.showMessageDialog(null,"O programa sera fechado.");
              System.exit(0);
     
     }
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblApresentacao = new javax.swing.JLabel();
        pbPrincipal = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmLoading"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        btnIniciar.setText("Começar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblApresentacao.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblApresentacao.setText("Estamos fazendo a configuração e atualizações ");

        pbPrincipal.setIndeterminate(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblApresentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnIniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        conn();
        
    }//GEN-LAST:event_btnIniciarActionPerformed
    
    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApresentacao;
    private javax.swing.JProgressBar pbPrincipal;
    // End of variables declaration//GEN-END:variables

}


