/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.CONNECTION;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto
 */
public class firstCon {
    
   private static String DRIVE = "com.microsoft.sqlserver.jdbc.SQLServerDriver";     
   private static  String stringConnection= "jdbc:sqlserver://127.0.0.1:1433;";
     
     
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   

   private static Connection  getConnection(){       
       
         String pcName=" ";
       try {       
                 pcName  = InetAddress.getLocalHost().getHostName();       
                 
       }
       catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na Conexao: 000448 \n "+ex);
       }
       try {
           Class.forName(DRIVE);
           return DriverManager.getConnection(stringConnection,"sa","123456");
       }
       catch (ClassNotFoundException | SQLException ex) {
         JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na Conexao: 000447 \n "+ex);
         return null;
       }
   }
  
   
   //Pede conexão ao getConnection e pega seu retorno
   public static  Connection obterConexão(){  
 
   return getConnection();   
   
   }
   
      
   
   //Fecha conexao normalmente... NÃO MEXER ESTA FUNCIONANDO!
   public static void fecharConexao(Connection conn){
     if (conn!=null){
       try {
           conn.close();
       } catch (SQLException ex) {
           
       }
     }   
   }

}
