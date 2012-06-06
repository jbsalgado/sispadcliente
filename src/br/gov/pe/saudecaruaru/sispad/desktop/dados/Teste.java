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
        ReaderATIMUN r= new ReaderATIMUN(com);
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
           user.setToken("744caa719a36dba1becbd0fcd71e3909b60b4e2a");
           user.setSerial_aplicacao("testando");
           user.setUsuario_sistema("ces");
           //pega os procedimentos que devem ser enviados
           MessageWebService[] mensage=servivoProcedimento.login(user);
           for(MessageWebService msg: mensage){ 
                System.out.println(msg.getMessage());
           }
           
           Procedimento[] pro=servivoProcedimento.getProcedimentosDeMedicoAEnviarSIAB(user);
           Medico[] medi= servivoProcedimento.getMedicos(null, user);
           
           for(Procedimento p:pro){
               System.out.println(p.getNome());
           }
           
           MedicoExecutaProcedimento[] array=r.getProcedimentosExecutadoMedico(medi, com, pro);
           
           for(MedicoExecutaProcedimento m: array){
               System.out.println(m.getMedico_cpf());
           }
           
           MessageWebService[] mensagens;
           mensagens=servivoProcedimento.sendExecutadosPorMedico(array, user);
           for(MessageWebService msg: mensagens){ 
                System.out.println(msg.getMessage());
           }
//           
//           Unidade[] pr=servivoProcedimento.getUnidades(user);
//           for(Unidade p: pr){
//               
//               System.out.println(p.getNome());
//           }
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
