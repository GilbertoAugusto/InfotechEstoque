
package br.com.infotech.FUNCTION;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gilberto
 */
public class modeloTabela extends AbstractTableModel {
    private ArrayList Linhas = null;
    private String[] Colunas= null; 

    public modeloTabela(ArrayList lin, String[] col){
        
    setLinhas(lin);
    setColunas(col);
    }

    public ArrayList getLinhas(){
    return Linhas;
    }
    public void setLinhas(ArrayList dados){
        Linhas = dados;
    }
    
    public String[] getColunas(){
    return Colunas;
    }
    public void setColunas(String[] colunas){
        Colunas = colunas;
    }    

    public int getColumnCount(){
    return Colunas.length;
    }
    public int getRowCount(){
    return Linhas.size();
    }
    public String getColumnCoumName(int numCol){
    return Colunas[numCol];
    }
    
    public Object getValueAt(int numLim, int numCol){
    Object[] Linha = (Object[])getLinhas().get(numLim);
   
    return Linha[numCol];
    }

   



}

