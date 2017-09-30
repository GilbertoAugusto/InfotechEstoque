/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FORMS_PRINCIPAIS;

import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
import br.com.infotech.CONNECTION.conn;
import br.com.infotech.FUNCTION.modeloTabela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
/**
 *
 * @author Gilberto
 */
public class DataGrid extends javax.swing.JInternalFrame {
    public DataGrid(int valorSelect) {
        initComponents();
        
        switch(valorSelect){
        
            case 1:
                todosClientes();
                break;
            case 2:
                
                break;
            default: 
                break;
             
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dtTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        lblLike1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        dtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dtTable);
        if (dtTable.getColumnModel().getColumnCount() > 0) {
            dtTable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            dtTable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            dtTable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            dtTable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jToolBar1.setBackground(new java.awt.Color(205, 209, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        lblLike1.setText(" Like1   ");
        jToolBar1.add(lblLike1);

        jTextField2.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(95, 25));
        jToolBar1.add(jTextField2);
        jToolBar1.add(jSeparator3);

        jLabel1.setText("  Like2    ");
        jToolBar1.add(jLabel1);

        jTextField3.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(95, 25));
        jToolBar1.add(jTextField3);
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        setBounds(0, 0, 779, 402);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dtTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblLike1;
    // End of variables declaration//GEN-END:variables

   public void todosClientes(){
   
    ArrayList dados = new  ArrayList();
    String sql = "SELECT idCliente, razaoSocial, cnpj, inscricaoEsta, nomeFantasia, endereco, cep, telefone, email, contato, usuario, bairro FROM cliente";
    String[] colunas = {"Id", "razão Social","Cnpj","Inscricão Esta","Nome Fantasia", "endereo", "cep", "telefone","email", "contato", "usuario", "bairro"};
   
   Connection conn = br.com.infotech.CONNECTION.conn.obterConexão();
    
   PreparedStatement stmt = null;
           
   try{
            stmt = conn.prepareStatement(sql);
         
            ResultSet log = stmt.executeQuery();
             log.first();
            
            do{
                dados.add(new Object[]{log.getInt("idCliente"),log.getString("razaoSocial"),log.getString("cnpj"),log.getString("inscricaoEsta"),log.getString("nomeFantasia"),log.getString("endereco"),log.getString("cep"),log.getString("telefone"),log.getString("email"),log.getString("contato"),log.getString("usuario"),log.getString("bairro")});
                
            }while(log.next());
   
   }
   catch(SQLException error){
                 JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na Conexao"+error);
   }
    
   modeloTabela modelo = new modeloTabela(dados,colunas);   
    
  dtTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     dtTable.setModel(modelo);
   dtTable.getColumnModel().getColumn(0).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(0).setResizable(true);
   dtTable.getColumnModel().getColumn(1).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(1).setResizable(true);
   dtTable.getColumnModel().getColumn(2).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(2).setResizable(true);
     dtTable.getColumnModel().getColumn(3).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(3).setResizable(true);
   dtTable.getColumnModel().getColumn(4).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(4).setResizable(true);
   dtTable.getColumnModel().getColumn(5).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(5).setResizable(true);
   dtTable.getColumnModel().getColumn(6).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(6).setResizable(true);
   dtTable.getColumnModel().getColumn(7).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(7).setResizable(true);
   dtTable.getColumnModel().getColumn(8).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(8).setResizable(true);
   dtTable.getColumnModel().getColumn(9).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(9).setResizable(true);
 dtTable.getColumnModel().getColumn(10).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(10).setResizable(true);
   dtTable.getColumnModel().getColumn(11).setPreferredWidth(90);
   dtTable.getColumnModel().getColumn(11).setResizable(true);

   dtTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   
   }     
      
   private void clientesCadasr(){
    ArrayList dados = new  ArrayList();
    String sql = "SELECT idCliente, razaoSocial, cnpj, inscricaoEsta, nomeFantasia, endereco, cep, telefone, email, contato, usuario, bairro FROM cliente";
    String[] colunas = {"Id", "razão Social","Cnpj","Inscricão Esta","Nome Fantasia", "endereo", "cep", "telefone","email", "contato", "usuario", "bairro"};
   
   Connection conn = br.com.infotech.CONNECTION.conn.obterConexão();
    
   PreparedStatement stmt = null;
           
   try{
            stmt = conn.prepareStatement(sql);
         
            ResultSet log = stmt.executeQuery();
             log.first();
            
            do{
                dados.add(new Object[]{log.getInt("idCliente"),log.getString("razaoSocial"),log.getString("cnpj"),log.getString("inscricaoEsta"),log.getString("nomeFantasia"),log.getString("endereco"),log.getString("cep"),log.getString("telefone"),log.getString("email"),log.getString("contato"),log.getString("usuario"),log.getString("bairro")});
                
            }while(log.next());
   
   }
   catch(SQLException error){
                 JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na Conexao"+error);
   }

    }

}
