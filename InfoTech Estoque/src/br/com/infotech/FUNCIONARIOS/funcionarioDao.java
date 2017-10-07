/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FUNCIONARIOS;

import br.com.infotech.CONNECTION.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto
 */
public class funcionarioDao {

   Funcionario func = new Funcionario();
  
  
   //======================================================================================================================================================================================//   
   //======================================================================================================================================================================================//    
       
    public void insert(Funcionario fn){
    
        String insert ="use infotech_estoque ;"
                  + "execute insert_funcionario  @nome='"+fn.getNome()+"',  @Usuario='"+fn.getUsuario()+"', @senha='"+fn.getSenha()+"', @cpf ='"+fn.getCpf()+"', @rua='"+fn.getRua()+"', @estado='"+fn.getEstado()+"', @cidade='"+fn.getCidade()+"' ,@cep='"+fn.getCep()+"', @data ='"+fn.getData_nascimento()+"',@acrescimo ="+fn.getAcrescimo()+", @sexo =1,"
                                            + "@setor=NULL, @telefone ='"+fn.getTelefone()+"', @celular ='"+fn.getCelular()+"', @bairro ='"+fn.getBairro()+"', @complemento='"+fn.getComplemento()+"', @rg='"+fn.getRg()+"' ;";
      
        Connection connection = conn.obterConexão();
        
        
        try
        {
        Statement stmt =  connection.createStatement();
     

        
        stmt.execute(insert);

        stmt.close();
        
           JOptionPane.showMessageDialog(null,"Funcionario incluido com sucesso","Concluido",3);
        }
        
        catch(SQLException err){
            
            JOptionPane.showMessageDialog(null,"Ocorreu Um Erro>:900209\n"+err,"Erro",0);        
        }
        finally{
        conn.fecharConexao(connection);
        }
    }
 
   //======================================================================================================================================================================================//   
   //======================================================================================================================================================================================//    
  
    public List<Funcionario> getlista(){
        String sql = "select * from select_funcionario";
        
        return ret_lista(sql);
       }        
    
    public List<Funcionario> getlista(int id){        
            
        String sql = "select * from select_funcionario where id_usaurio ="+id;   
    
        return ret_lista(sql);
    }    
        
    private List<Funcionario> ret_lista(String sql){
        
        
                 Funcionario funci = new Funcionario();
        Connection connection = conn.obterConexão();
         List <Funcionario> func = new ArrayList<Funcionario>();
        
        try
        {       
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
       
        func = null;
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        
                funci.setId(rs.getInt("id_usuario"));
                funci.setNome(rs.getString("nome"));
                funci.setAcrescimo(rs.getDouble("acrescimo_salario"));
                funci.setCep(rs.getString("cep"));
                funci.setCidade(rs.getString("cidade"));
                funci.setCpf( rs.getString("cpf"));
                funci.setData_nascimento( rs.getString("data_nascimento"));
                funci.setEstado(rs.getString("estado"));
                funci.setRg(rs.getString("rg"));
                funci.setRua(rs.getString("rua"));
                funci.setSenha(rs.getString("senha"));
                funci.setSetor(rs.getInt("setor"));
                funci.setUsuario(rs.getString("Usuario"));
                funci.setSexo(rs.getInt("sexo"));
                
                func.add(funci);
                }
                return func;
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Ocorreu Um Erro>:900201\n"+e,"Erro",0);         
                 return null;
                
            }               
        }
        
   //======================================================================================================================================================================================// 
   //======================================================================================================================================================================================//
    public void update(Funcionario fn , int id){
    
       String update ="execute update_funcionario  @rg='?',@nome='?', @Usuario='?', @senha='?',@cpf ='?',@rua='?', @estado='?' ,@cidade='?' ,@cep='?', @data ='?' ,@acrescimo = ?,@sexo = ?,@setor= ?"
                    + ",@telefone ='?',@celular ='?',@bairro ='?', @complemento= '?', @id_usuario=? ;";
        
        Connection connection = conn.obterConexão();
         
        try
        {
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(update);
                 
        stmt.setString(1,fn.getNome());
        stmt.setString(2,fn.getUsuario());
        stmt.setString(3,fn.getSenha());
        stmt.setString(4,fn.getCpf());
        stmt.setString(5,fn.getRua());
        stmt.setString(6,fn.getEstado());
        stmt.setString(7,fn.getCidade());
        stmt.setString(8,fn.getCep());
        stmt.setString(9,fn.getData_nascimento());
        stmt.setDouble(10, fn.getAcrescimo());
        stmt.setInt(11,fn.getSexo());
        stmt.setInt(12,fn.getSetor());
        stmt.setInt(13,fn.getId());        
        stmt.setString(14,fn.getTelefone());
        stmt.setString(15, fn.getCelular());
        stmt.setString(16, fn.getBairro());
        stmt.setString(17, fn.getComplemento());
        stmt.setInt(18, fn.getId());
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null,"Funcionario Atualizado com sucesso","Concluido",3);
        }
        catch(SQLException er)
        {
            JOptionPane.showMessageDialog(null,"Ocorreu Um Erro>:900204\n"+er,"Erro",0);              
        }         
    }    


}
