/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ISistema;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public class Siab implements ISistema,ISiab{
   // private Competencia competencia;

    @Override
    public List<MessageWebService> lerEnviarDados(Competencia competencia) {
        List<MessageWebService> listMensagens = new ArrayList<MessageWebService>();
        listMensagens.addAll(enviarProcedimentosMedico(competencia));
//        listMensagens.addAll(enviarProcedimentosOdontologo(competencia));
//        listMensagens.addAll(enviarProcedimentosEnfermeiro(competencia));
//        listMensagens.addAll(enviarProcedimentosAgenteDeSaude(competencia));
       
        return listMensagens;
    }

    @Override
    public List<MessageWebService> enviarProcedimentosMedico(Competencia competencia){
        MessageWebService[] mensagens = null;
        ReaderATIMUN reader= new ReaderATIMUN(competencia);

        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
            //cria ou pega uma instancia de usuario
           UsuarioDesktop user= UsuarioDesktop.getInstance();
        
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<MessageWebService> enviarProcedimentosEnfermeiro(Competencia competencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<MessageWebService> enviarProcedimentosAgendeDeSaude(Competencia competencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    }


