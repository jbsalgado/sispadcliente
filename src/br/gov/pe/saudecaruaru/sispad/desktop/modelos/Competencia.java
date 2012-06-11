/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

/**
 *
 * @author Junior Pires
 */
public class Competencia {
    private String mes;
    private String ano;

    /**
     * @return the mes
     */
    public String getMes() {
        return mes.length()==1?"0"+mes:mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }
    
    public String getAnoDoisDigitos(){
        return ano.substring(2);
    }
    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }
    
   public int toInt(){
       return Integer.parseInt(this.mes+this.ano);
   }
   
    @Override
   public String toString(){
       return this.mes+this.ano;
   }
    
    
}
