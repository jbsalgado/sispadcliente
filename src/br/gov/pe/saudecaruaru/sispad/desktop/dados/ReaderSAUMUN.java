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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *SSA2- Consolidado de cada microarea (cada acs) - agente de saude. 1 registro para cada acs por mês
 * @author Albuquerque
 */
public class ReaderSAUMUN implements IReaderSAUMUN{
    
    public static final String CODIGO_AREA="COD_AREA";
    public static final String CODIGO_SEGMENTO="COD_SEG";
    public static final String CODIGO_MICRO_AREA="COD_MICROA";
    public static final String CODIGO_UNIDADE_CNES="COD_UB";
    public static final String CODIGO_ZONA="COD_ZONA";
    public static final String TIPO_EQUIPE="TIPO_EQP";
    public static final String ID_MODELO="ID_MODELO";
    public static final String MES="MES";
    
    public static final String NUMERO_FAMILIAS_CADASTRADAS="NFAMICAD";
    public static final String NUMERO_GESTANTES_CADASTRADAS="NGESCAD";
    public static final String NUMERO_GESTANTES_MENOS_20_ANOS="NGESM20";
    public static final String NUMERO_GESTANTES_ACOMPANHADAS="NGESAC";
    public static final String NUMERO_GESTANTES_VACINADAS="NGESVAC";
    public static final String NUMERO_GESTANTES_PRENATAL_MES="NGESPRE1";    
    public static final String NUMERO_GESTANTES_PRENATAL_PRIMEIRO_TRIMESTRE="NGESPRE2";
    
    public static final String NUMERO_CRIANCAS_0_3_MESES_29_DIAS="C_4MESES";
    public static final String NUMERO_CRIANCAS_SO_MAMANDO="C_MAMAND";
    public static final String NUMERO_CRIANCAS_ALEITAMENTO_MISTO="C_MISTO";
    
    public static final String NUMERO_CRIANCAS_0_11_MESES_29_DIAS="C_0A11";
    public static final String NUMERO_CRIANCAS_0_11_MESES_29_DIAS_VACINA_EM_DIA="C_VACDIA";
    public static final String NUMERO_CRIANCAS_0_11_MESES_29_DIAS_PESADAS="C_0A112P";
    public static final String NUMERO_CRIANCAS_0_11_MESES_29_DIAS_DESNUTRIDAS="C_0A11GP";
    
    public static final String NUMERO_CRIANCAS_12_23_MESES_29_DIAS_="C_1223";
    public static final String NUMERO_CRIANCAS_12_23_MESES_29_DIAS_VACINA_EM_DIA_="C_VACINA";
    public static final String NUMERO_CRIANCAS_12_23_MESES_29_DIAS_PESADAS="C_12232P";
    public static final String NUMERO_CRIANCAS_12_23_MESES_29_DIAS_DESNUTRIDAS="C_1223GP";
    
    
    public static final String NUMERO_CRIANCAS_MENORES_2_ANOS_TIVERAM_DIARREIA="C_DIARRE";
    public static final String NUMERO_CRIANCAS_MENORES_2_ANOS_TIVERAM_DIARREIA_USARAM_TERAPIA_REIDRATACAO_ORAL="C_DIASPRO";
    public static final String NUMERO_CRIANCAS_MENORES_2_ANOS_TIVERAM_INFECCAO_RESPIRATORIA_AGUDA="C_IRA";
    
    public static final String NUMERO_NASCIDOS_VIVOS="NASCVIVO";
    public static final String NUMERO_RECEM_NASCIDOS_PESADOS_NASCER="PESADOS";
    public static final String NUMERO_RECEM_NASCIDOS_PESADOS_NASCER_MENOR_2500G="PESO2500";
    
    public static final String NUMERO_OBITOS_MENORES_28_DIAS_POR_DIARREIA="O_DIA0A28";
    public static final String NUMERO_OBITOS_MENORES_28_DIAS_POR_INFECCAO_RESPIRATORIA_AGUDA="O_IRA0A28";
    public static final String NUMERO_OBITOS_MENORES_28_DIAS_POR_OUTRAS_CAUSAS="O_CAU0A28";
    
    public static final String NUMERO_OBITOS_28_DIAS_11_MESES_29_DIAS_POR_DIARREIA="O_DIA28A1";
    public static final String NUMERO_OBITOS_28_DIAS_11_MESES_29_DIAS_POR_INFECCAO_RESPIRATORIA_AGUDA="O_IRA28A1";
    public static final String NUMERO_OBITOS_28_DIAS_11_MESES_29_DIAS_POR_OUTRAS_CAUSAS="O_CAU28A1";
    
    public static final String NUMERO_OBITOS_MENORES_1_ANO_POR_DIARREIA="OBITODIA";
    public static final String NUMERO_OBITOS_MENORES_1_ANO_POR_INFECCAO_RESPIRATORIA_AGUDA="OBITOIRA";
    public static final String NUMERO_OBITOS_MENORES_1_ANO_POR_OUTRAS_CAUSAS="OBITOCAU";
    
    public static final String NUMERO_OBITOS_MULHERES_IDADE_FERTIL_10_14_ANOS="O_MUL10A14";
    public static final String NUMERO_OBITOS_MULHERES_IDADE_FERTIL_15_49_ANOS="OBITOMUL";
    public static final String NUMERO_OBITOS_ADOLESCENTES_10_19_ANOS_VIOLENCIA="OBITOADOL";
    public static final String NUMERO_OBITOS_OUTROS="OBITOOUT";
    
    public static final String NUMERO_DIABETICOS_CADASTRADOS="D_DIABETE";
    public static final String NUMERO_DIABETICOS_ACOMPANHADOS="D_DIAAC";
    
    public static final String NUMERO_HIPERTENSOS_CADASTRADOS="D_HIPERTEN";
    public static final String NUMERO_HIPERTENSOS_ACOMPANHADOS="D_HIPERRAC";
    
    public static final String NUMERO_TUBERCULOSOS_CADASTRADOS="D_TUBERCUL";
    public static final String NUMERO_TUBERCULOSOS_ACOMPANHADOS="D_TUBERAC";
    
    public static final String NUMERO_DOENTES_HANSENIASE_CADASTRADOS="D_HANSEN";
    public static final String NUMERO_DOENTES_HANSENIASE_ACOMPANHADOS="D_HANSEAC";
    
    public static final String NUMERO_MENORES_5_ANOS_HOSPITALIZADOS_POR_PNEUMONIA="H_0A5PNEU";
    public static final String NUMERO_MENORES_5_ANOS_HOSPITALIZADOS_POR_DESIDATRACAO="H_0A5DES";
    public static final String NUMERO_PESSOAS_HOSPITALIZADAS_POR_ABUSO_ALCOOL="H_ALCOOL";
    public static final String NUMERO_INTERNACOES_HOSPITAL_PSIQUIATRICO="H_PSIQUI";
    public static final String NUMERO_INTERNACOES_COMPLICACOES_DIABETES="H_DIABETE";
    public static final String NUMERO_INTERNACOES_OUTRAS_CAUSAS="H_OUTCAU";
    
    public static final String NUMERO_VISITAS="NVISITAS";
    
    public static String getTableName(){
        return "SAUMUN";
    }

    @Override
    public AgenteSaudeExecutaProcedimento[] getProcedimentosExecutadoAgenteSaude(AgenteSaude agenteSaude, Competencia competencia, Procedimento[] procedimentos) {
        if(procedimentos!=null && agenteSaude!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                AgenteSaudeExecutaProcedimento[] array= new  AgenteSaudeExecutaProcedimento[procedimentos.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderSAUMUN.CODIGO_MICRO_AREA+", "+ReaderSAUMUN.CODIGO_UNIDADE_CNES);
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderSAUMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderSAUMUN.MES+"= ?");
                    query.append("  AND  "+ReaderSAUMUN.CODIGO_UNIDADE_CNES+"= ?");
                    query.append("  AND  "+ReaderSAUMUN.CODIGO_MICRO_AREA+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    stmt.setString(2, agenteSaude.getUnidade_cnes());
                    String tmp=""+agenteSaude.getMicro_area();
                    //verifica o tamanho da string
                    stmt.setString(3, tmp.length()==1?"0"+tmp:tmp);
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                AgenteSaudeExecutaProcedimento agenExec= new  AgenteSaudeExecutaProcedimento();
                                agenExec.setCompetencia(competencia.toInt());
                                agenExec.setAgente_saude_cpf(agenteSaude.getServidor_cpf());
                                agenExec.setAgente_saude_micro_area(agenteSaude.getMicro_area());
                                agenExec.setAgente_saude_unidade_cnes(agenteSaude.getUnidade_cnes());
                                agenExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                agenExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=agenExec;
                                pos++;
                            }
                    }
                    result.close();
                    conec.close();
                    return array;
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                finally{
                
                }
        }
        return null;
    }
    @Override
    public AgenteSaudeExecutaProcedimento[] getProcedimentosExecutadoAgenteSaude(AgenteSaude[] agenteSaude, Competencia competencia, Procedimento[] procedimentos) {
        if(procedimentos!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                AgenteSaudeExecutaProcedimento[] array= new  AgenteSaudeExecutaProcedimento[procedimentos.length*agenteSaude.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderSAUMUN.CODIGO_MICRO_AREA+", "+ReaderSAUMUN.CODIGO_UNIDADE_CNES);
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderSAUMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderSAUMUN.MES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                        AgenteSaude agente=this.getAgenteSaude(agenteSaude, result.getString(ReaderSAUMUN.CODIGO_UNIDADE_CNES), result.getInt(ReaderSAUMUN.CODIGO_MICRO_AREA));
                        //existe um enfermeiro para a unidade, sennão vai pular para o próximo registro
                        if(agente!=null){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                AgenteSaudeExecutaProcedimento agenExec= new  AgenteSaudeExecutaProcedimento();
                                agenExec.setCompetencia(competencia.toInt());
                                agenExec.setAgente_saude_cpf(agente.getServidor_cpf());
                                agenExec.setAgente_saude_micro_area(agente.getMicro_area());
                                agenExec.setAgente_saude_unidade_cnes(agente.getUnidade_cnes());
                                agenExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                agenExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=agenExec;
                                pos++;
                            }
                        }
                    }
                    result.close();
                    conec.close();
                    return array;
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                finally{
                
                }
        }
        return null;
    }
    
    public AgenteSaude getAgenteSaude(AgenteSaude[] agenteSaude, String cnes, int micro_area){
        for(AgenteSaude ag:agenteSaude){
            if(ag.getUnidade_cnes().equals(cnes) && ag.getMicro_area()==micro_area){
                
                return ag;
            }
        }
        return null;
    }

    @Override
    public String getNameField(String codigoProcedimento) {
        //o codigo do procedimento do SIAB é igual ao nome do campo na tabela que o contém
        return codigoProcedimento;
    }
}
