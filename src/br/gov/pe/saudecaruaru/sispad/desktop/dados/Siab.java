/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Competencia;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ISistema;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.*;
import java.util.List;

/**
 *
 * @author Junior Pires
 */
public class Siab implements ISistema{
   // private Competencia competencia;

    @Override
    public boolean lerEnviarDados(Competencia competencia) {
        enviarProcedimentosMedico(competencia);
       return true;
    }

    public boolean enviarProcedimentosMedico(Competencia competencia){
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
        return false;
     }
    
    
    }


