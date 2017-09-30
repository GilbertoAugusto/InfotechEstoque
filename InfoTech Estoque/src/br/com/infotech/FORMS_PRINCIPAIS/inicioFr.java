package br.com.infotech.FORMS_PRINCIPAIS;


import br.com.infotech.ESTOQUE.estoquePrincipal;
import br.com.infotech.FORMS_PRINCIPAIS.DataGrid;
import br.com.infotech.FORMS_PRINCIPAIS.DataGrid;
import br.com.infotech.CLIENTES.frmCadastraClientes;
import br.com.infotech.CLIENTES.frmCadastraClientes;
import br.com.infotech.FUNCIONARIOS.frmFuncionarioCadastro;
import br.com.infotech.FUNCTION.acesso;
import br.com.infotech.FUNCTION.autenticadorAcesso;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class inicioFr extends javax.swing.JFrame {

    
    private static int LogIn;
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
    //inicializador simples sem parametros para a inicialização so itens de tela
    public inicioFr() {
        initComponents();               
        autenticador();
    }   
  
    public inicioFr(int valor) {
        initComponents();           
        LogIn = valor;
        autenticador();
    }       

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   

    private void autenticador(){
    
        int valor ;
        
        boolean parametro = false;
        ResultSet rsValores = acesso.acesso(LogIn);
        
        try{
            while(rsValores.next())
            {
      valor = 0;    
      valor = rsValores.getInt("cadastrarCliente");
      parametro=autenticadorAcesso.acesso(valor);
      btnCadastrarClientes.setVisible(parametro);
      
      
      valor = 0;
      valor = rsValores.getInt("todosClientes");
      btnTodosCLientes.setVisible(autenticadorAcesso.acesso(valor));
      
      
      valor = 0;
      valor = rsValores.getInt("clientesInativos");
      btnClienteInativos.setVisible(autenticadorAcesso.acesso(valor));
      
      
      
      valor = 0;
      valor = rsValores.getInt("adicionarFuncionario");
      parametro = autenticadorAcesso.acesso(valor);
      btnCadastrarFuncionarios.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("todosFuncionarios");
      parametro = autenticadorAcesso.acesso(valor);
      btnTodosFunc.setVisible(parametro);
      
      
      valor = 0;
      valor = rsValores.getInt("funcionariosInativos");
      parametro = autenticadorAcesso.acesso(valor);
      btnFuncInativos.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("autorizacaoDeAcesso");
      
      valor = 0;
      valor = rsValores.getInt("adiministracao");
      parametro = autenticadorAcesso.acesso(valor);
      btnAdministracao.enable(parametro);
      
      valor = 0;
      valor = rsValores.getInt("estoque");
      parametro =  autenticadorAcesso.acesso(valor);
      btnEstoque.enable(parametro);
      
      valor = 0 ;
      valor = rsValores.getInt("clientes");
      parametro = autenticadorAcesso.acesso(valor);
      btnClientes.enable(parametro);
      
    
      valor = 0 ;
      valor = rsValores.getInt("funcionario");
      parametro = autenticadorAcesso.acesso(valor);
      btnfuncionarios.enable(parametro);
        
            }
        }    
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null, "Erro na conexão tente novamente 123447 \n"+ex);
        
        }
    
    
    }
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public void closeFrm(){

this.dispose();
dispose();
}    


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        editar = new javax.swing.JMenu();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        btnClientes = new javax.swing.JMenu();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        btnTodosCLientes = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        btnCadastrarClientes = new javax.swing.JMenuItem();
        btnClienteInativos = new javax.swing.JMenuItem();
        btnfuncionarios = new javax.swing.JMenu();
        btnCadastrarFuncionarios = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        btnChecarFuncionarios = new javax.swing.JMenu();
        funcAtivos = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        btnFuncInativos = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        btnTodosFunc = new javax.swing.JMenuItem();
        btnAdministracao = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        btnEstoque = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        comando = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        jToolBar1.setBackground(new java.awt.Color(205, 209, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);

        jLabel2.setText("                                                                       ");
        jToolBar1.add(jLabel2);
        jToolBar1.add(jSeparator5);

        jLabel3.setText("Comando:");
        jToolBar1.add(jLabel3);

        jTextField4.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(95, 25));
        jToolBar1.add(jTextField4);

        jButton1.setText("    Ir   ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jdPrincipal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        arquivo.setText("Arquivo");

        jMenuItem1.setText("Sair");
        arquivo.add(jMenuItem1);
        arquivo.add(jSeparator6);

        jMenuBar1.add(arquivo);

        editar.setText("Editar");
        editar.add(jSeparator23);

        jMenuBar1.add(editar);

        btnClientes.setText("Cadastro");
        btnClientes.add(jSeparator21);

        btnTodosCLientes.setText("Todos parceiros");
        btnTodosCLientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTodosCLientesMousePressed(evt);
            }
        });
        btnClientes.add(btnTodosCLientes);
        btnClientes.add(jSeparator22);

        btnCadastrarClientes.setText("Cadastrar Parceiro");
        btnCadastrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarClientesMousePressed(evt);
            }
        });
        btnClientes.add(btnCadastrarClientes);

        btnClienteInativos.setText("Parceiros inativos");
        btnClientes.add(btnClienteInativos);

        jMenuBar1.add(btnClientes);

        btnfuncionarios.setText("Funcionarios");

        btnCadastrarFuncionarios.setText("Cadastrar Funcionarios");
        btnCadastrarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarFuncionariosMousePressed(evt);
            }
        });
        btnfuncionarios.add(btnCadastrarFuncionarios);
        btnfuncionarios.add(jSeparator15);

        btnChecarFuncionarios.setText("Checar Funcionarios");

        funcAtivos.setText("Funcionarios Ativos");
        btnChecarFuncionarios.add(funcAtivos);
        btnChecarFuncionarios.add(jSeparator16);

        btnFuncInativos.setText("Funcionarios Inativos");
        btnChecarFuncionarios.add(btnFuncInativos);
        btnChecarFuncionarios.add(jSeparator17);

        btnTodosFunc.setText("Todos Funcionarios");
        btnChecarFuncionarios.add(btnTodosFunc);

        btnfuncionarios.add(btnChecarFuncionarios);

        jMenuBar1.add(btnfuncionarios);

        btnAdministracao.setText("Administração");

        jMenu1.setText("Entradas");

        jMenuItem7.setText("Notas De Entradas");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Adicionar Nota");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Notas Pendencias");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Nova Nota");
        jMenu1.add(jMenuItem10);

        btnAdministracao.add(jMenu1);

        jMenu2.setText("Saidas");

        jMenuItem3.setText("Pedidos De Saidas");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Saidas Pendentes");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Saidas Enviadas");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Novo Pedido");
        jMenu2.add(jMenuItem6);

        btnAdministracao.add(jMenu2);

        jMenu3.setText("Produtos");

        jMenuItem2.setText("Cadastrar Produto");
        jMenu3.add(jMenuItem2);

        jMenuItem11.setText("Produtos");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Produtos Bloqueados");
        jMenu3.add(jMenuItem12);

        btnAdministracao.add(jMenu3);

        jMenuBar1.add(btnAdministracao);

        btnEstoque.setText("Estoque");
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstoqueMousePressed(evt);
            }
        });
        jMenuBar1.add(btnEstoque);

        ajuda.setText("Ajuda");

        Sobre.setText("Sobre");
        ajuda.add(Sobre);
        ajuda.add(jSeparator1);

        comando.setText("Comandos");
        ajuda.add(comando);

        jMenuBar1.add(ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarClientesMousePressed
       frmCadastraClientes frm = new frmCadastraClientes();
        
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarClientesMousePressed

    private void btnTodosCLientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosCLientesMousePressed
       
         dtGrid(1);
        
    }//GEN-LAST:event_btnTodosCLientesMousePressed

    private void btnCadastrarFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionariosMousePressed
        // TODO add your handling code here:
        frmFuncionarioCadastro frm = new frmFuncionarioCadastro();
         jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFuncionariosMousePressed

    private void btnEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMousePressed
       
        estoquePrincipal frm = new estoquePrincipal();
        
        jdPrincipal.add(frm);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnEstoqueMousePressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed
   
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
   //chama data grid passando parametros de execução de codigo 
    private  void dtGrid(int select){
    
        
        DataGrid obj = new DataGrid(select);
        
        jdPrincipal.add(obj);
        
        obj.setVisible(true);
        
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
    /**
     * @param args the command line arguments
     */
    //não mexer esta funcionando , inicializador de objetos de tela
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioFr().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenu ajuda;
    private javax.swing.JMenu arquivo;
    private javax.swing.JMenu btnAdministracao;
    private javax.swing.JMenuItem btnCadastrarClientes;
    private javax.swing.JMenuItem btnCadastrarFuncionarios;
    private javax.swing.JMenu btnChecarFuncionarios;
    private javax.swing.JMenuItem btnClienteInativos;
    private javax.swing.JMenu btnClientes;
    private javax.swing.JMenu btnEstoque;
    private javax.swing.JMenuItem btnFuncInativos;
    private javax.swing.JMenuItem btnTodosCLientes;
    private javax.swing.JMenuItem btnTodosFunc;
    private javax.swing.JMenu btnfuncionarios;
    private javax.swing.JMenuItem comando;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem funcAtivos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane jdPrincipal;
    // End of variables declaration//GEN-END:variables
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
