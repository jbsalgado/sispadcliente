/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Envio;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public interface IEnvioController {
    public List<MessageWebService> EnviarDados(Envio envio);
   
    
    
}
