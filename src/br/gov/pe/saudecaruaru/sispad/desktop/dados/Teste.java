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
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Albuquerque
 */
public class Teste {
    
     public static void main(String[] argv){
         Competencia com= new Competencia();
         com.setAno("2012");
         com.setMes("02");
        ReaderATIMUN reader= new ReaderATIMUN(com);
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
            //cria o usuário
           UsuarioDesktop user= new UsuarioDesktop();
           user.setServidor_cpf("09809809809");
           user.setToken("c425a748fe7269fa6c4202a77569df66b3609026");
           user.setSerial_aplicacao("0987890");
           user.setUsuario_sistema("cesar");
           MessageWebService[] mensagens2 =  servivoProcedimento.login(user);
            for(MessageWebService msg: mensagens2){ 
                System.out.println(msg.getMessage());
           }
           //pega os procedimentos que devem ser enviados
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeEnfermeiroAEnviarSIAB(user);
           Medico[] medi= servivoProcedimento.getMedicos(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getCodigo());
           }
           
           MedicoExecutaProcedimento[] array=reader.getProcedimentosExecutadoMedico(medi, com, pro);
           
           
           MessageWebService[] mensagens;
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
        //r.teste();
    }
     
     public void TesteAtimun(Competencia competencia){
        ReaderATIMUN r= new ReaderATIMUN(competencia);
        Medico med= new Medico();
        med.setServidor_cpf("09886798805");
        med.setUnidade_cnes("2345676");
        List<MedicoExecutaProcedimento> lista= r.getAll(med);
        int size=lista.size();
        MedicoExecutaProcedimento[] array= new MedicoExecutaProcedimento[size];
        
        for(int i=0;i<size;i++){
            array[i]=lista.get(i);
        }
        ProcedimentoControllerPortType servivoProcedimento= new ProcedimentoControllerPortTypeProxy();
        
        try {
           UsuarioDesktop user= new UsuarioDesktop();
           user.setServidor_cpf("232132");
           user.setToken("993eh2198e3yu2899");
           user.setSerial_aplicacao("jndewhd936327");
           user.setUsuario_sistema("cesar");
           MessageWebService[] mensagens;
           mensagens=servivoProcedimento.sendExecutadosPorMedico(array, user);
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }
           System.out.println("terminou");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
}
