/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.FUNCTION;

/**
 *
 * @author glber
 */
public class autenticadorAcesso {
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    //retorno do valor true ou false do acesso
    private static boolean  ret_valor(int valor){
   
    if(valor == 1)
    {
       return true;
    }
    else
    {
       return false;
    }
           
   }
 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //pega pega valor do acesso
    public static boolean acesso(int valor){    
        return ret_valor(valor);    
    }
        
    private  boolean  autenticLogin(int valor ){
   
       int val = valor;

       if(valor == 0){
       
       return true;
       
       }
       else {
        
          return false;
       
       }      
   }
    
    public boolean autencuadorDeLogin(int valor){
      return autenticLogin(valor);  
  } 
    
}
