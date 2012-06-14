/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ISistema;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public class Siab implements ISistema,ISiab{
     IReaderATIMUN reader = null;
     IReaderSAUMUN readerSaumun = null;
     UsuarioDesktop user=null;
    public Siab() {
        reader = new ReaderATIMUN();
        readerSaumun = new ReaderSAUMUN();
        user = UsuarioDesktop.getInstance();
    }
   // private Competencia competencia;
    
    

    @Override
    public List<MessageWebService> lerEnviarDados(Competencia competencia) {
        List<MessageWebService> listMensagens = new ArrayList<MessageWebService>();
        listMensagens.addAll(enviarProcedimentosMedico(competencia));
        listMensagens.addAll(enviarProcedimentosOdontologo(competencia));
        listMensagens.addAll(enviarProcedimentosEnfermeiro(competencia));
        listMensagens.addAll(enviarProcedimentosAgendeDeSaude(competencia));
       
        return listMensagens;
    }

    @Override
    public List<MessageWebService> enviarProcedimentosMedico(Competencia competencia){
        MessageWebService[] mensagens = null;
       

        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
        
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
           //pega os procedimentos que devem ser enviados
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeMedicoAEnviarSIAB(user);
           Medico[] medi= servivoProcedimento.getMedicos(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           MedicoExecutaProcedimento[] array=reader.getProcedimentosExecutadoMedico(medi, competencia, pro);
           
           
          
           mensagens=servivoProcedimento.sendExecutadosPorMedico(array, user);
           System.out.print("TAMANHO MEDICO "+mensagens.length);
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }

//           Medico[] medi= servivoProcedimento.getMedicos(null, user);
//           for(Medico p: medi){
//               
//               System.out.println(p.getUnidade_cnes());
//           }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Arrays.asList(mensagens);
     }

    @Override
    public List<MessageWebService> enviarProcedimentosOdontologo(Competencia competencia) {
         MessageWebService[] mensagens = null;
       

        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
            //cria ou pega uma instancia de usuario
           
        
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
           //pega os procedimentos que devem ser enviados
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeOdontologoAEnviarSIAB(user);
           Odontologo[] odont= servivoProcedimento.getOdontologos(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           OdontologoExecutaProcedimento[] array=reader.getProcedimentosExecutadoOdontologo(odont,competencia, pro);
           
           
          
           mensagens=servivoProcedimento.sendExecutadosPorOdontologo(array, user);
           System.out.print("TAMANHO ODONTOLOGO "+mensagens.length);
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }

//           Medico[] medi= servivoProcedimento.getMedicos(null, user);
//           for(Medico p: medi){
//               
//               System.out.println(p.getUnidade_cnes());
//           }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Arrays.asList(mensagens);
    }

    @Override
    public List<MessageWebService> enviarProcedimentosEnfermeiro(Competencia competencia) {
        MessageWebService[] mensagens = null;
       

        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
        
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
           //pega os procedimentos que devem ser enviados
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeEnfermeiroAEnviarSIAB(user);
           Enfermeiro[] enfer= servivoProcedimento.getEnfermeiros(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           EnfermeiroExecutaProcedimento[] array=reader.getProcedimentosExecutadoEnfermeiro(enfer,competencia, pro);
           System.out.print("VETOR  "+array.length);
           
          
           mensagens=servivoProcedimento.sendExecutadosPorEnfermeiro(array, user);
           System.out.print("TAMANHO ENFERMEIRO "+mensagens.length);
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }

//           Medico[] medi= servivoProcedimento.getMedicos(null, user);
//           for(Medico p: medi){
//               
//               System.out.println(p.getUnidade_cnes());
//           }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Arrays.asList(mensagens);
    }

    @Override
    public List<MessageWebService> enviarProcedimentosAgendeDeSaude(Competencia competencia) {
         MessageWebService[] mensagens = null;
       

        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
        
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
           //pega os procedimentos que devem ser enviados
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeAgenteSaudeAEnviarSIAB(user);
           AgenteSaude[] medi= servivoProcedimento.getAgenteSaude(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           AgenteSaudeExecutaProcedimento[] array=readerSaumun.getProcedimentosExecutadoAgenteSaude(medi, competencia, pro);
           
           
          
           mensagens=servivoProcedimento.sendExecutadosPorAgenteSaude(array, user);
         
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }

//           Medico[] medi= servivoProcedimento.getMedicos(null, user);
//           for(Medico p: medi){
//               
//               System.out.println(p.getUnidade_cnes());
//           }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Arrays.asList(mensagens);
    }
    
    
    }


