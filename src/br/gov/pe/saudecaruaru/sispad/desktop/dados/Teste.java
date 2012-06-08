/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.gui.Home;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortTypeProxy;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Albuquerque
 */
public class Teste {
    
     public static void main(String[] argv){
           Teste teste = new Teste();
           teste.TesteAtimun();
//         Competencia com= new Competencia();
//         com.setAno("2012");
//         com.setMes("02");
//         ReaderATIMUN reader= new ReaderATIMUN();
////        Medico med= new Medico();
////        med.setServidor_cpf("09886798805");
////        med.setUnidade_cnes("2345676");
////        List<MedicoExecutaProcedimento> lista= r.getAll(med);
////        int size=lista.size();
////        MedicoExecutaProcedimento[] array= new MedicoExecutaProcedimento[size];
////        
////        for(int i=0;i<size;i++){
////            array[i]=lista.get(i);
////        }
//        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
//        
//        try {
//            //cria ou recupera uma instancia do usuario 
//           UsuarioDesktop user= UsuarioDesktop.getInstance();
//           user.setServidor_cpf("09809809809");
//           user.setToken("c425a748fe7269fa6c4202a77569df66b3609026");
//           user.setSerial_aplicacao("0987890");
//           user.setUsuario_sistema("cesar");
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
//           //pega os procedimentos que devem ser enviados
//           MessageWebService[] mensage=servivoProcedimento.login(user);
//           for(MessageWebService msg: mensage){ 
//                System.out.println(msg.getMessage());
//           }
//           
//           Procedimento[] pro=servivoProcedimento.getProcedimentosDeMedicoAEnviarSIAB(user);
//           Medico[] medi= servivoProcedimento.getMedicos(null, user);
//           
//           for(Procedimento p:pro){
//               System.out.println(p.getCodigo());
//           }
//           
//           MedicoExecutaProcedimento[] array=reader.getProcedimentosExecutadoMedico(medi, com, pro);
//           
//           
//           MessageWebService[] mensagens;
//           mensagens=servivoProcedimento.sendExecutadosPorMedico(array, user);
//           for(MessageWebService msg: mensagens){ 
//                System.out.println(msg.getMessage());
//           }
//
////           Medico[] medi= servivoProcedimento.getMedicos(null, user);
////           for(Medico p: medi){
////               
////               System.out.println(p.getUnidade_cnes());
////           }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        //r.teste();
    }
     
     public void TesteAtimun(){
          Competencia com= new Competencia();
         com.setAno("2012");
         com.setMes("02");
         ReaderATIMUN reader= new ReaderATIMUN();
//        Medico med= new Medico();
//        med.setServidor_cpf("09886798805");
//        med.setUnidade_cnes("2345676");
//        List<MedicoExecutaProcedimento> lista= r.getAll(med);
//        int size=lista.size();
//        MedicoExecutaProcedimento[] array= new MedicoExecutaProcedimento[size];
//        
//        for(int i=0;i<size;i++){
//            array[i]=lista.get(i);
//        }
        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
            //cria ou recupera uma instancia do usuario 
           UsuarioDesktop user= UsuarioDesktop.getInstance();
           user.setServidor_cpf("09809809809");
           user.setToken("c425a748fe7269fa6c4202a77569df66b3609026");
           user.setSerial_aplicacao("0987890");
           user.setUsuario_sistema("cesar");
           
           
//           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
//            for(MessageWebService msg: mensagens2){ 
//                System.out.println(msg.getMessage());
//           }
           //pega os procedimentos que devem ser enviados
           MessageWebService[] mensage=servivoProcedimento.login(user);
           for(MessageWebService msg: mensage){ 
                System.out.println(msg.getMessage());
           }
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeEnfermeiroAEnviarSIAB(user);
           Enfermeiro[] medi= servivoProcedimento.getEnfermeiros(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           EnfermeiroExecutaProcedimento[] array=reader.getProcedimentosExecutadoEnfermeiro(medi, com, pro);
           
           
           MessageWebService[] mensagens;
           mensagens=servivoProcedimento.sendExecutadosPorEnfermeiro(array, user);
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
        //r.teste();
     }
}
