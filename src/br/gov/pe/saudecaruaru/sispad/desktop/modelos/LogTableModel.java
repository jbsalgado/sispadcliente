/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Junior Pires
 */
public class LogTableModel extends AbstractTableModel{
    private ArrayList linhas;
    private String[] colunas;
    private boolean [] colsEdicao;
    private String[] valores;
    private MessageWebService message=new MessageWebService();

    public LogTableModel(ArrayList linhas, String[] colunas, boolean[] colsEdicao) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.colsEdicao = colsEdicao;
        valores=new String[]{message.getTipo(),message.getMessage(),message.getCodigo()}; 
    }
    
    

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList<String> linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
       return getLinhas().size();
    }

    @Override
    public int getColumnCount() {
        return getColunas().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       message =  (MessageWebService) getLinhas().get(rowIndex);
       return valores[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int row, int col){  
        return colsEdicao[col];  
    } 
    
    @Override
    public void setValueAt(Object value, int row, int col){  
        // Obtem a linha, que é uma String []  
        message =  (MessageWebService) getLinhas().get(row); 
        // Altera o conteudo no indice da coluna passado  
        valores[col] = (String)value;  
        // dispara o evento de celula alterada  
        fireTableCellUpdated(row,col);  
} 
}
