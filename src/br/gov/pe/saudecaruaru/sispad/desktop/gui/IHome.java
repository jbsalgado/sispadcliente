/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.gui;

/**
 *
 * @author Junior Pires
 */
public interface IHome {
     public void logadoOn(String msg);
     public void logadoOff(String msg);
     public void disableButtonEscolher();
     public void enableButtonEscolher();
     public void disableButtonEnviar();
     public void enableButtonEnviar();
    
}
