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
public interface ISistema {

    public List<MessageWebService> lerEnviarDados(Competencia competencia);

}
