/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.main;

import br.gov.pe.saudecaruaru.sispad.desktop.controllers.EnvioController;
import br.gov.pe.saudecaruaru.sispad.desktop.controllers.IEnvioController;
import br.gov.pe.saudecaruaru.sispad.desktop.controllers.IUsuarioDesktopController;
import br.gov.pe.saudecaruaru.sispad.desktop.controllers.UsuarioDesktopController;
import br.gov.pe.saudecaruaru.sispad.desktop.gui.Home;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Envio;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.MenssagensWebService;

/**
 *
 * @author Junior Pires
 */
public class Main {
    public static void main(String[] argv){
        MenssagensWebService mensagensWeb = new MenssagensWebService();
        Envio envio = new Envio(mensagensWeb);
//        EnvioController envioController = new EnvioController(envio);
//        IUsuarioDesktopController usuarioDesktopController = new UsuarioDesktopController();
//        
        Home home = new Home(envio);
        //registrando a home como um observador das mensagens web
        mensagensWeb.registerObserver(home);
        home.setVisible(true);
        //thread Log
        //home.thread();
        home.exibeTelaLogin();
        //IEnvioController envioController = new EnvioController(envio);
    }
    
    
}
