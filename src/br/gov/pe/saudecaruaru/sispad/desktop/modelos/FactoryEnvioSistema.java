/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import br.gov.pe.saudecaruaru.sispad.desktop.dados.Siab;

/**
 *
 * @author Junior Pires
 */
public class FactoryEnvioSistema {
    
    public static ISistema obterFactory(String nomeSistema,MenssagensWebService mensagensWeb){
        ISistema sistema=null;
        if(nomeSistema.equals("SIAB")){
            sistema = new Siab( mensagensWeb);
        }

        return sistema;
    }

}
