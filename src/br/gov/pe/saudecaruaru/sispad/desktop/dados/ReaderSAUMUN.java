/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ProcedimentoEstatico;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortTypeProxy;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *SSA2- Consolidado de cada microarea (cada acs) - agente de saude. 1 registro para cada acs por mês
 * @author Albuquerque
 */
public class ReaderSAUMUN {
    
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
    
    
    public List<EquipeExecutaProcedimento> selectAllCompetencias(){
        List<EquipeExecutaProcedimento> list= new ArrayList<EquipeExecutaProcedimento>();
        try{
            Connection co=ConectionFactory.getConnection();
            String sql="SELECT "+ReaderSAUMUN.CODIGO_AREA+", "+ReaderSAUMUN.CODIGO_MICRO_AREA+","
                    + ""+ReaderSAUMUN.CODIGO_UNIDADE_CNES+","+ReaderSAUMUN.MES+","+
                    ReaderSAUMUN.NUMERO_VISITAS+" FROM ZSAU12 WHERE "+ReaderSAUMUN.MES+"='02' AND "+
                    ReaderSAUMUN.CODIGO_AREA+"='0024' AND "+ReaderSAUMUN.CODIGO_UNIDADE_CNES+"='2345676' ";
            Statement stmt=co.createStatement();
            ResultSet resultSet=stmt.executeQuery(sql);
            int cont=0;
            while(resultSet.next())
            {
                EquipeExecutaProcedimento eqp= new EquipeExecutaProcedimento();
                eqp.setCompetencia(Integer.parseInt(resultSet.getString(ReaderSAUMUN.MES)+"2012"));
                eqp.setEquipe_codigo_area(resultSet.getInt(ReaderSAUMUN.CODIGO_AREA));
                eqp.setEquipe_codigo_micro_area(Integer.parseInt(resultSet.getString(ReaderSAUMUN.CODIGO_MICRO_AREA)));
                eqp.setProcedimento_codigo(ProcedimentoEstatico.VISITA_DOMICILIAR_POR_PROFISSIONAL_NIVEL_MEDIO);
                eqp.setQuantidade(resultSet.getInt(ReaderSAUMUN.NUMERO_VISITAS));
                eqp.setUnidade_cnes(resultSet.getString(ReaderSAUMUN.CODIGO_UNIDADE_CNES));
                //adicioa na lista
                cont++;
                list.add(eqp);
            }
            System.out.println(cont);
            resultSet.close();
            co.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
         return list;
        }
    }
    
}
