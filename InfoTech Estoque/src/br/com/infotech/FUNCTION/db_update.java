/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FUNCTION;
import br.com.infotech.CONNECTION.firstCon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import sun.misc.BASE64Decoder;

/**
 *
 * @author Gilberto
 */
public class db_update {
    
    protected byte[] CHAVE = {-117, -11, -123, -9, -4, 78, -45, -121, 92, -22, -111, -82, -88, 72, 21, 95, };
    
    public String descript_ret(byte[] key, String value){
       
       byte[] decrypted = null;
        try {
             String METODO_ENCRIPTACAO = "AES";
           
            SecretKeySpec skeySpec = new SecretKeySpec(key, METODO_ENCRIPTACAO);
            byte[] decoded = new BASE64Decoder().decodeBuffer(value);
            Cipher cipher = Cipher.getInstance(METODO_ENCRIPTACAO);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            decrypted = cipher.doFinal(decoded);
        } catch (Exception e) {
            }
        return new String(decrypted);
        
         
        
    }   
    
    public void ret_diretorioArquivo(){
        String ret ="";
        
        File file = new File("../InfoTech Estoque/src/updates");
	File afile[] = file.listFiles();
	int i = 0;
        if(afile != null){
                    
            for (int j = afile.length; i < j; i++) {
                            File arquivos = afile[i];
                            ret =(arquivos.getName());
                            ret_arquivo(ret,ret);
                        }
        }
        else{
          JOptionPane.showMessageDialog(null,"Seu Aplicatico foi atualizado!","Pronto",1);
    
        }
          
        }    
    
    public void ret_arquivo(String ret, String nome){
    nome =ret_clearNome(nome);
    boolean retornoCheck = checkUpdate(nome);
        
    if(retornoCheck ==true){
    String mostra="";
    String nomeArq="../InfoTech Estoque/src/updates/"+ ret;
    String linha="";
    File arq = new File(nomeArq);
  
    //Arquivo existe
    if (arq.exists()){
      //tentando ler arquivo
      try{
        //abrindo arquivo para leitura
        FileReader reader = new FileReader(nomeArq);
        //leitor do arquivo
        BufferedReader leitor = new BufferedReader(reader);
        while(true){
          linha=leitor.readLine();
          if(linha==null)
            break;
          mostra+=linha;
        }
          mostra = descript_ret(CHAVE, mostra);
              atualizador(mostra, nome);
      }
      catch(Exception erro) {}
    }
    //Se nao existir
    else{   
      JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
        }
    }    
    
    }    
    
    private void atualizador(String ret, String nome){
        
        try{
                    
        Connection conn = firstCon.obterConexão();
                
        Statement stmt =  conn.createStatement();
            
        stmt.execute("use infotech_estoque; "+ret);
        }
        catch(SQLException err){
        JOptionPane.showMessageDialog(null,"Houve um erro: 025484 \n Update :"+nome+" \n"+err,"Erro",0);
        }
    }
    
    private String ret_clearNome(String ret){
    
        String novo;
        novo =  ret.substring(0,ret.length()-4);
        return novo;
    

    }
    
    private Boolean  checkUpdate(String nome){
        
        int valor = 0;
            try{
            
            
        Connection conn = firstCon.obterConexão();
        
        
         Statement stmt =  conn.createStatement();
            
            ResultSet ret =   stmt.executeQuery("use infotech_estoque; select * from versionamento where numero ="+nome);
        
           while ( ret.next() ){
           
               valor = ret.getInt("versionamento");
           
           }
            }
        catch(SQLException err){
        JOptionPane.showMessageDialog(null,"Houve um erro: 025485 \n"+err,"Erro",0);
      
            }
            
            if(valor > 0){
           
               return false;
           
           }
           else{
               return true;
           }
    }

}

