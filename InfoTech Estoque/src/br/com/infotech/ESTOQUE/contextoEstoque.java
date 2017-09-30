/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.ESTOQUE;

import br.com.infotech.CONNECTION.conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto-Notebook
 */
public  class contextoEstoque {
 
    Connection con = conn.obterConexão();
    
    
    public  void insert_item(String descricao, int valor){
    
        String query = "use infotech ;insert into itens(descricao, marca) values ('"+descricao+"', "+valor+")";
        
    try{
            
                Statement stmt = con.createStatement(); 
                stmt.execute(query);
    
    }       
    catch(SQLException err){

                JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na inserção 234749 \n"+err.getLocalizedMessage()+" \n" +err.getSQLState()+"\n "+err.getMessage()+"\n \n "+err);

            }   
    }
    
    public ResultSet select_Item(String descricao){
    try{
        String query;
            if(descricao ==""){
               query ="use infotech; Select * from itens ";
            }
            else{
               query = "use infotech ; select * from itens where descricao = '"+descricao+"'";
            }
                Statement stmt = con.createStatement(); 
            ResultSet  valor = stmt.executeQuery(query);   
            return valor;
    }       
    catch(SQLException err){
                                 JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na inserção 234749 \n"+err.getLocalizedMessage()+" \n" +err.getSQLState()+"\n "+err.getMessage()+"\n \n "+err);
                                 return null;
            }
    
    
    }
    public ResultSet select_Item(){
    try{
        String query;
           
               query ="use infotech; Select * from itens ";
           
               Statement stmt = con.createStatement(); 
            ResultSet  valor = stmt.executeQuery(query);   
            return valor;
    }       
    catch(SQLException err){
                                 JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na inserção 234749 \n"+err.getLocalizedMessage()+" \n" +err.getSQLState()+"\n "+err.getMessage()+"\n \n "+err);
                                 return null;
            }
    
    
    }
    
    
    
}
    
    

