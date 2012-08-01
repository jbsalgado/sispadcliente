/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ISistema;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.MenssagensWebService;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public class Siab implements ISistema,ISiab{
    
    
     private IReaderATIMUN reader = null;
     private IReaderSAUMUN readerSaumun = null;
     private UsuarioDesktop user=null;
     private Competencia competencia=null;
     private MenssagensWebService mensagensWeb=null;
     
     
     
    public Siab(MenssagensWebService mensagensWeb) {
        reader = new ReaderATIMUN();
        readerSaumun = new ReaderSAUMUN();
        user = UsuarioDesktop.getInstance();
        this.mensagensWeb=mensagensWeb;
    }
   // private Competencia competencia;
    
    

    @Override
    public void lerEnviarDados(Competencia competencia) {
        this.competencia=competencia;
        Thread[] threads=new Thread[4];
        
        threads[0]= new Thread(new Runnable() {

            @Override
            public void run() {
                Siab.this.mensagensWeb.addMensagens(enviarProcedimentosMedico(Siab.this.competencia));
            }
        });
        
        threads[1]= new Thread(new Runnable() {

            @Override
            public void run() {
                Siab.this.mensagensWeb.addMensagens(enviarProcedimentosOdontologo(Siab.this.competencia));
            }
        });
        
        threads[2]= new Thread(new Runnable() {

            @Override
            public void run() {
                Siab.this.mensagensWeb.addMensagens(enviarProcedimentosEnfermeiro(Siab.this.competencia));
            }
        });
        
        
       threads[3]= new Thread(new Runnable() {

            @Override
            public void run() {
                Siab.this.mensagensWeb.addMensagens(enviarProcedimentosAgendeDeSaude(Siab.this.competencia));
            }
        });
       System.out.println("antwes do for");
       for(Thread t: threads){
           System.out.println("cesar");
           t.start();
       }
//        MessageWebService m = new MessageWebService();
//        m.setMessage("Funcionou\n");
//        ArrayList<MessageWebService> array = new ArrayList<MessageWebService>();
//        array.add(m);
//        array.add(m);
//        array.add(m);
//        array.add(m);
//        array.add(m);
//        array.add(m);
//        array.add(m);
              
//        System.out.printf("Chegou");
//         mensagensWeb.addMensagens(array);
       
    
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


