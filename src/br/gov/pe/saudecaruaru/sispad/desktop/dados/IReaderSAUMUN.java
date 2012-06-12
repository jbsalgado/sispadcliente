/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade;

/**
 *
 * @author Albuquerque
 */
public interface IReaderSAUMUN {
    
    public AgenteSaudeExecutaProcedimento[] getProcedimentosExecutadoAgenteSaude(AgenteSaude agenteSaude, Competencia competencia,  Procedimento[] procedimentos);
    
    public AgenteSaudeExecutaProcedimento[] getProcedimentosExecutadoAgenteSaude(AgenteSaude[] agenteSaude, Competencia competencia,  Procedimento[] procedimentos);
    
    public String getNameField(String codigoProcedimento);
}
