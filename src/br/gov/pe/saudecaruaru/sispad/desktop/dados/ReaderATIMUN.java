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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *PMA2 - para cada equipe de SF. 1 registro para cada equipe por mês
 * @author Albuquerque
 */
public class ReaderATIMUN implements IReaderATIMUN{
    
    public static final String CODIGO_AREA="COD_AREA";
    public static final String CODIGO_SEGMENTO="COD_SEG";
    public static final String CODIGO_UNIDADE_CNES="COD_UB";
    public static final String CODIGO_ZONA="COD_ZONA";
    public static final String TIPO_EQUIPE="TIPO_EQP";
    public static final String ID_MODELO="ID_MODELO";
    public static final String MES="MES";
    
    public static final String NUMERO_CONCULTAS_RESIDENTES_OUTROS_MUNICIPIOS="RESMUNI";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_MENOR_1_ANO="CONMED1";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_1_A_4_ANOS="CONMED2";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_5_A_9_ANOS="CONMED3";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_10_A_14_ANOS="CONMED4";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_15_A_19_ANOS="CONMED5";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_20_A_39_ANOS="CONMED6";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_40_A_49_ANOS="CONMED7";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_50_A_59_ANOS="CONMED8";
    public static final String NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_A_PARTI_60_ANOS="CONMED9";
    
    public static final String NUMERO_ATENDIMENTOS_PUERICULTURA="AP_PUER";
    public static final String NUMERO_ATENDIMENTOS_PRENATAL="AP_PREN";
    public static final String NUMERO_ATENDIMENTOS_PREVENCAO_CANCER_CERVICO_UTERINO="AP_PREV"; //ATENDIMENTOS+COLETAS
    public static final String NUMERO_ATENDIMENTOS_DST_AIDS="AP_AIDS";
    public static final String NUMERO_ATENDIMENTOS_DIABETICOS="AP_DIAB";
    public static final String NUMERO_ATENDIMENTOS_HIPERTENSOS="AP_HIPE";
    public static final String NUMERO_ATENDIMENTOS_DOENTES_HANSENIASE="AP_HANS";
    public static final String NUMERO_ATENDIMENTOS_TUBERCULOSE="AP_TUBE";
    
    public static final String NUMERO_EXAMES_COMPLEMENTARES_PATOLOGIA_CLINICA_SOLICITADOS="AP_PATO";
    public static final String NUMERO_EXAMES_COMPLEMENTARES_RADIODIAGNOSTICO_SOLICITADOS="AP_RADI";
    public static final String NUMERO_EXAMES_COMPLEMENTARES_CITOPATOLOGICO_CERVVAGINAL_REALIZADOS="AP_CITO";
    public static final String NUMERO_EXAMES_COMPLEMENTARES_ULTRASOM_OBSTETRICO_SOLICITADOS="AP_ULTR";
    public static final String NUMERO_EXAMES_COMPLEMENTARES_OUTROS_SOLICITADOS="AP_OUTR";
    
    public static final String NUMERO_ENCAMINHAMENTO_ATENDIMENTO_ESPECIALIZADO="AP_ATEN";
    public static final String NUMERO_ENCAMINHAMENTO_INTERNACAO_HOSPITALAR="AP_INTH";
    public static final String NUMERO_ENCAMINHAMENTO_URGENCIA_EMERGENCIA="AP_URGE";
    public static final String NUMERO_INTERNACOES_DOMICILIARES="AP_INTD";
    public static final String NUMERO_ATENDIMENTOS_ESPECIFICOS_ACIDENTES_TRABALHO="AP_ESPE";
    public static final String NUMERO_VISITAS_INSPECAO_SANITARIA="AP_ATEN";
    public static final String NUMERO_ATENDIMENTOS_INDIVIDUAIS_ENFERMEIRO="AP_ENFE";
    public static final String NUMERO_ATENDIMENTOS_INDIVIDUAIS_OUTRO_PROF_NIVEL_SUPERIOR="AP_IND";
    public static final String NUMERO_CURATIVOS="AP_CURA";
    public static final String NUMERO_INALACOES="AP_INAL";
    public static final String NUMERO_INJECOES="AP_INJE";
    public static final String NUMERO_RETIRADA_PONTOS="AP_RETI";
    public static final String NUMERO_TERAPIA_REIDRATACAO_ORAL="AP_TERA";
    public static final String NUMERO_SUTURA="AP_SUTU";
    public static final String NUMERO_ATENDIMENTO_GRUPO="AP_GRUP";
    public static final String NUMERO_PROCEDIMENTOS_COLETIVOS_I="AP_PROC";
    public static final String NUMERO_REUNIOES="AP_REUN";
    public static final String NUMERO_VALVULPATIAS_REUMATICAS_PESSOAS_5_14_ANOS="AP_VALVU";
    
    public static final String NUMERO_ATENDIMENTOS_ACIDENTES_VASCULARES="AP_ACIDE";
    public static final String NUMERO_ATENDIMENTOS_INFARTO_AGUDO_MIOCARDIO="AP_INFAR";
    public static final String NUMERO_ATENDIMENTOS_DHEG_FORMA_GREVE="AP_DHEG";
    public static final String NUMERO_ATENDIMENTOS_DOENCA_HEMOLITICA_PERINATAL="AP_DOENC";
    public static final String NUMERO_ATENDIMENTOS_FRATURAS_COLO_FEMUR_MAIORES_50_ANOS="AP_FRATU";
    public static final String NUMERO_ATENDIMENTOS_MENINGITE_TUBERCULOSA_MENORES_5_ANOS="AP_ACIDE";
    public static final String NUMERO_ATENDIMENTOS_HANSENIASE_GRAU_INCAPACIDADE_II_III="AP_HANSE";
    public static final String NUMERO_ATENDIMENTOS_CITOLOGIA_ONCOTICA_NIC_III_CARCINOMA_IN_SITU="AP_CITOL";
    public static final String NUMERO_ATENDIMENTOS_PNEUMONIA_MENORES_5_ANOS="AP_5PNEU";
    
    public static final String NUMERO_VISITAS_DOMICILIARES_MEDICO="AP_MEDIC";
    public static final String NUMERO_VISITAS_DOMICILIARES_ENFERMEIRO="AP_ENFER";
    public static final String NUMERO_VISITAS_DOMICILIARES_PROF_NIVEL_SUPERIOR="AP_PRONS";
    public static final String NUMERO_VISITAS_DOMICILIARES_PROF_NIVEL_MEDIO="AP_PRONM";
    
    private Competencia competencia;
    public ReaderATIMUN(){
    
    }
    
    public ReaderATIMUN(Competencia competencia){
        this.competencia = competencia;
    }
    public static String getTableName(){
        return "ATIMUN";
    }
    
    public  String NameTable2(){
        return "ATIMUN"+competencia.getAnoDoisDigitos();
    }
    
    public List<MedicoExecutaProcedimento> getAll(Medico med){
        List<MedicoExecutaProcedimento> lista= new ArrayList<MedicoExecutaProcedimento>();
        try{
            Connection co=ConectionFactory.getConnection();
            String sql="SELECT * FROM "+this.NameTable2()+" WHERE "+ReaderSAUMUN.MES+"='"+competencia.getMes()+"' AND "+
                    ReaderSAUMUN.CODIGO_UNIDADE_CNES+"='"+med.getUnidade_cnes()+"'";
            Statement stmt=co.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            
            while(result.next()){
                MedicoExecutaProcedimento medEx= new MedicoExecutaProcedimento();
                medEx.setCompetencia(Integer.parseInt(result.getString(ReaderATIMUN.MES)+competencia.getAno()));
                medEx.setMedico_cpf(med.getServidor_cpf());
                medEx.setMedico_unidade_cnes(med.getUnidade_cnes());
                medEx.setProcedimento_codigo(ReaderATIMUN.NUMERO_ATENDIMENTOS_DST_AIDS);
                medEx.setQuantidade(result.getInt(ReaderATIMUN.NUMERO_CONCULTAS_RESIDENTES_MUNICIPIOS_10_A_14_ANOS));
                lista.add(medEx);
            }
            result.close();
            co.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            return lista;
        }
    }

    @Override
    public MedicoExecutaProcedimento[] getProcedimentosExecutadoMedico(Medico medico, Competencia competencia,  Procedimento[] procedimentos) {
          if(procedimentos!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                MedicoExecutaProcedimento[] array= new MedicoExecutaProcedimento[procedimentos.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderATIMUN.CODIGO_UNIDADE_CNES+" ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"= ?");
                    query.append("  AND "+ReaderATIMUN.CODIGO_UNIDADE_CNES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    stmt.setString(2, medico.getUnidade_cnes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                            
                            //vai pegar todos os procedimento que devem se enviados por medico
                            for(Procedimento proce: procedimentos){
                                //pega o medico da unidade
                                MedicoExecutaProcedimento medExec= new MedicoExecutaProcedimento();
                                medExec.setCompetencia(competencia.toInt());
                                medExec.setMedico_cpf(medico.getServidor_cpf());
                                medExec.setMedico_unidade_cnes(medico.getUnidade_cnes());
                                medExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                medExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo medico.
                                array[pos]=medExec;
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
    public EnfermeiroExecutaProcedimento[] getProcedimentosExecutadoEnfermeiro(Enfermeiro enfermeiro, Competencia competencia,  Procedimento[] procedimentos) {
        if(procedimentos!=null && enfermeiro!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                EnfermeiroExecutaProcedimento[] array= new EnfermeiroExecutaProcedimento[procedimentos.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT  ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"= ?");
                    query.append("  AND "+ReaderATIMUN.CODIGO_UNIDADE_CNES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    stmt.setString(2, enfermeiro.getUnidade_cnes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                EnfermeiroExecutaProcedimento enfExec= new EnfermeiroExecutaProcedimento();
                                enfExec.setCompetencia(competencia.toInt());
                                enfExec.setEnfermeiro_cpf(enfermeiro.getServidor_cpf());
                                enfExec.setEnfermeiro_unidade_cnes(enfermeiro.getUnidade_cnes());
                                enfExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                enfExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=enfExec;
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
    public OdontologoExecutaProcedimento[] getProcedimentosExecutadoOdontologo(Odontologo odontologo, Competencia competencia,  Procedimento[] procedimentos) {
        if(procedimentos!=null && odontologo!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                OdontologoExecutaProcedimento[] array= new  OdontologoExecutaProcedimento[procedimentos.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderATIMUN.CODIGO_UNIDADE_CNES+" ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"= ?");
                    query.append("  AND "+ReaderATIMUN.CODIGO_UNIDADE_CNES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    stmt.setString(2, odontologo.getUnidade_cnes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                OdontologoExecutaProcedimento odonExec= new  OdontologoExecutaProcedimento();
                                odonExec.setCompetencia(competencia.toInt());
                                odonExec.setOdontologo_cpf(odontologo.getServidor_cpf());
                                odonExec.setOdontologo_unidade_cnes(odontologo.getUnidade_cnes());
                                odonExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                odonExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=odonExec;
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
    public MedicoExecutaProcedimento[] getProcedimentosExecutadoMedico(Medico[] medico, Competencia competencia, Procedimento[] procedimentos) {
        if(procedimentos!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                MedicoExecutaProcedimento[] array= new MedicoExecutaProcedimento[procedimentos.length*medico.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderATIMUN.CODIGO_UNIDADE_CNES+" ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"=?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                        Medico med=this.getMedico(medico, result.getString(ReaderATIMUN.CODIGO_UNIDADE_CNES));
                        //existe um medico para a unidade, sennão vai pular para o próximo registro
                        if(med!=null){
                            
                            //vai pegar todos os procedimento que devem se enviados por medico
                            for(Procedimento proce: procedimentos){
                                //pega o medico da unidade
                                MedicoExecutaProcedimento medExec= new MedicoExecutaProcedimento();
                                medExec.setCompetencia(competencia.toInt());
                                medExec.setMedico_cpf(med.getServidor_cpf());
                                medExec.setMedico_unidade_cnes(med.getUnidade_cnes());
                                medExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                medExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo medico.
                                array[pos]=medExec;
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

    @Override
    public EnfermeiroExecutaProcedimento[] getProcedimentosExecutadoEnfermeiro(Enfermeiro[] enfermeiro, Competencia competencia, Procedimento[] procedimentos) {
        if(procedimentos!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                EnfermeiroExecutaProcedimento[] array= new EnfermeiroExecutaProcedimento[procedimentos.length*enfermeiro.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderATIMUN.CODIGO_UNIDADE_CNES+" ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                        Enfermeiro enfer=this.getEnfermeiro(enfermeiro, result.getString(ReaderATIMUN.CODIGO_UNIDADE_CNES));
                        //existe um enfermeiro para a unidade, sennão vai pular para o próximo registro
                        if(enfer!=null){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                EnfermeiroExecutaProcedimento enfExec= new EnfermeiroExecutaProcedimento();
                                enfExec.setCompetencia(competencia.toInt());
                                enfExec.setEnfermeiro_cpf(enfer.getServidor_cpf());
                                enfExec.setEnfermeiro_unidade_cnes(enfer.getUnidade_cnes());
                                enfExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                enfExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=enfExec;
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

    @Override
    public OdontologoExecutaProcedimento[] getProcedimentosExecutadoOdontologo(Odontologo[] odontologo, Competencia competencia, Procedimento[] procedimentos) {
        if(procedimentos!=null){
                //cria um vetor com a quantidade procedimentos que devem ser enviados
                OdontologoExecutaProcedimento[] array= new  OdontologoExecutaProcedimento[procedimentos.length*odontologo.length];
                try{
                    Connection conec=ConectionFactory.getConnection();
                    StringBuffer query=new StringBuffer();
                    //campos que devem ser selecionados, independente dos procedimentos a serem enviados
                    query.append("SELECT "+ReaderATIMUN.CODIGO_UNIDADE_CNES+" ");
                    int s=procedimentos.length;
                    //campos que devem selecionados, cada campo corresponde a um procedimento
                    for(int i=0; i<s;i++){
                        query.append(", ");
                        //pega o campo que corresponde ao procedimento
                        query.append(this.getNameField(procedimentos[i].getCodigo()));
                    }
                    //monta a tabela
                    query.append(" FROM "+ReaderATIMUN.getTableName()+competencia.getAnoDoisDigitos());
                    query.append("  WHERE "+ReaderATIMUN.MES+"= ?");
                    //parametriza a consulta
                    PreparedStatement stmt= conec.prepareStatement(query.toString());
                    //setta os parâmetros
                    stmt.setString(1, competencia.getMes());
                    System.out.println(query.toString()+competencia.getMes());
                    //faz a consulta
                    ResultSet result=stmt.executeQuery();
                    int pos=0;
                    //cada registro equivale a 
                    while(result.next()){
                        Odontologo odon=this.getOdontologo(odontologo, result.getString(ReaderATIMUN.CODIGO_UNIDADE_CNES));
                        //existe um enfermeiro para a unidade, sennão vai pular para o próximo registro
                        if(odon!=null){
                            
                            //vai pegar todos os procedimento que devem se enviados por enfermeiro
                            for(Procedimento proce: procedimentos){
                                //pega o enfermeiro da unidade
                                OdontologoExecutaProcedimento odonExec= new  OdontologoExecutaProcedimento();
                                odonExec.setCompetencia(competencia.toInt());
                                odonExec.setOdontologo_cpf(odon.getServidor_cpf());
                                odonExec.setOdontologo_unidade_cnes(odon.getUnidade_cnes());
                                odonExec.setProcedimento_codigo(proce.getCodigo());
                                //pega o campo da tabela que corresponde ao procedimento
                                odonExec.setQuantidade(result.getInt(this.getNameField(proce.getCodigo())));
                                //adiciona o procedimento executado pelo enfermeiro.
                                array[pos]=odonExec;
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
    
    @Override
    public  String getNameField(String codigoProcedimento){
        //o codigo do procedimento do siab é igual ao nome do campo em suas tabelas
        return codigoProcedimento;
    }
    
    private Medico getMedico(Medico[] medico, String cnes){
        for(Medico m:medico){
            if(m.getUnidade_cnes().equals(cnes)){
                
                return m;
            }
        }
        return null;
    }
    
    private Enfermeiro getEnfermeiro(Enfermeiro[] enfermeiros, String cnes){
        for(Enfermeiro m:enfermeiros){
            if(m.getUnidade_cnes().equals(cnes)){
                
                return m;
            }
        }
        return null;
    }
    
    private Odontologo getOdontologo(Odontologo[] odontologos, String cnes){
        for(Odontologo o:odontologos){
            if(o.getUnidade_cnes().equals(cnes)){
                
                return o;
            }
        }
        return null;
    }
    
    
}
