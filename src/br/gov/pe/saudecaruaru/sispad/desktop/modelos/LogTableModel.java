/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.apache.commons.logging.impl.Log4JCategoryLog;

/**
 *
 * @author Junior Pires
 */
public class LogTableModel extends AbstractTableModel{
    private List linhas = null;
    private String[] colunas = null;
    private boolean [] colsEdicao;
    private static final String ERRO = "ERRO";
    private static final String PERIGO = "PERIGO";
    private static final String SUCESSO = "SUCESSO";

    public LogTableModel(List linhas, String[] colunas, boolean[] colsEdicao) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.colsEdicao = colsEdicao;
        
        
    }
    
    

    /**
     * @return the linhas
     */
    public List getLinhas() {
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
       MessageWebService linha =  (MessageWebService) getLinhas().get(rowIndex);
      
       return linha.getValueAtIndex(columnIndex);
    }
    
    @Override
    public boolean isCellEditable(int row, int col){  
        return colsEdicao[col];  
    } 
    
    @Override
    public void setValueAt(Object value, int row, int col){  
        // Obtem a linha
        MessageWebService linha=  (MessageWebService) getLinhas().get(row); 
        // Altera o conteudo no indice da coluna passado 
       
        linha.setValueAtIndex(col,(String)value);  
        // dispara o evento de celula alterada  
        fireTableCellUpdated(row,col);  
} 
}
