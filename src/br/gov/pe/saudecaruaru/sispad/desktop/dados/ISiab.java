/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public interface ISiab {
   public List<MessageWebService> enviarProcedimentosMedico(Competencia competencia);
   public List<MessageWebService> enviarProcedimentosOdontologo(Competencia competencia);
   public List<MessageWebService> enviarProcedimentosEnfermeiro(Competencia competencia);
   public List<MessageWebService> enviarProcedimentosAgendeDeSaude(Competencia competencia);
    
}
