/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade;

/**
 *
 * @author Albuquerque
 */
public interface IReaderATIMUN {
    
   /**
     *Devolve a quantidade de procedimenentos executados pelo médico passado como parâmetro
     * para a competência também fornecida e a unidade
     * @param medico o medico que se deseja pegar
     * @param competencia
     * @param unidade
     * @param procedimentos
     * @return MedicoExecutaProcedimento
     */
    public MedicoExecutaProcedimento[] getProcedimentosExecutadoMedico(Medico medico, Competencia competencia, Unidade unidade, Procedimento[] procedimentos);
    
    /**
     * 
     * @param enfermeiro
     * @param competencia
     * @param unidade
     * @param procedimentos
     * @return 
     */
    public EnfermeiroExecutaProcedimento[] getProcedimentosExecutadoEnfermeiro(Enfermeiro enfermeiro, Competencia competencia, Unidade unidade, Procedimento[] procedimentos);
    
    public OdontologoExecutaProcedimento[] getProcedimentosExecutadoOdontologo(Odontologo odontologo, Competencia competencia, Unidade unidade, Procedimento[] procedimentos);
    
    public MedicoExecutaProcedimento[] getProcedimentosExecutadoMedico(Medico[] medico, Competencia competencia,  Procedimento[] procedimentos);
    
    public EnfermeiroExecutaProcedimento[] getProcedimentosExecutadoEnfermeiro(Enfermeiro[] enfermeiro, Competencia competencia, Procedimento[] procedimentos);
    
    public OdontologoExecutaProcedimento[] getProcedimentosExecutadoOdontologo(Odontologo[] odontologo, Competencia competencia, Procedimento[] procedimentos);
    
}
