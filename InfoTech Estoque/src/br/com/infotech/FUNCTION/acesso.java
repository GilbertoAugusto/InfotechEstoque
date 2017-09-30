/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FUNCTION;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author glber
 */
public class acesso {
    
    //seleciona todos valores de acesso
   public static  ResultSet acesso(int user){
                ResultSet retorno;

                 String query = "use infotech ; select * from  nivelAcesso where usuario ="+user+";";
          try{
                  Connection conn=    br.com.infotech.CONNECTION.conn.obterConexão();

                  Statement stmt = conn.createStatement();  


                      retorno = stmt.executeQuery(query);

              return retorno;

          }
          catch(SQLException ex){
              
              JOptionPane.showMessageDialog(null,"Ocorreu Um Erro 112112\n"+ex);
              
           return retorno = null;   
           

          }  
}   
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
      
   //retorna true ou false se o usuario existe ou nao, evita acesso indevidos
   public static  boolean configAcesso(String valor){
   int id=0;
    String query = "use infotech ;select idUsuario from  Usuario where userLogin ='"+valor+"';";
          try{
                  Connection conn=    br.com.infotech.CONNECTION.conn.obterConexão();

                  Statement stmt = conn.createStatement();  
                  ResultSet rs = stmt.executeQuery(query);
                        while ( rs.next() )
                          {
                        id = rs.getInt("idUsuario");
                            }
              if(id != 0){
                  
              ResultSet retorno = acesso(id); 
              
              return true;
              }
              
              else{
                  return false;
                }
              
           }
          catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Ocorreu Um Erro 110012\n"+ex);
           return false;   
          }
   }
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
      
   //retorna id do usuario caos ele exista, para selecionar os acessos
   public static int getId(String valor){
   int id=0;
    String query = "use infotech ; select idUsuario from  Usuario where userLogin ='"+valor+"';";
          try{
                  Connection conn=    br.com.infotech.CONNECTION.conn.obterConexão();

                  Statement stmt = conn.createStatement();  
                  ResultSet rs = stmt.executeQuery(query);
                        while ( rs.next() )
                          {
                        id = rs.getInt("idUsuario");
                            }
              if(id != 0){
                  
              ResultSet retorno = acesso(id); 
              
              return id;
              }
              
              else{
                  return id;
                }
              
           }
          catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Ocorreu Um Erro 1110119\n"+ex);
           return id;   
          }
   
   
   
   }
    
    
   
   
}
