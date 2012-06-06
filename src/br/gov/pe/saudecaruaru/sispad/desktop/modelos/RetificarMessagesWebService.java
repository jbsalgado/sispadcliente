/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public class RetificarMessagesWebService {
    List<MessageWebService> messages=null;

    public RetificarMessagesWebService(List<MessageWebService> messages) {
        this.messages = messages;
    }
    
    @Override
     public String toString(){
        String mensagem="";
        for(MessageWebService msg:this.messages){
            mensagem = mensagem+"\n"+msg.getMessage();
        }
        return mensagem;
    }
    
    
    
}
