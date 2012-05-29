/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.main;

import br.gov.pe.saudecaruaru.sispad.desktop.controllers.EnvioController;
import br.gov.pe.saudecaruaru.sispad.desktop.controllers.IEnvioController;
import br.gov.pe.saudecaruaru.sispad.desktop.gui.Home;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Envio;

/**
 *
 * @author Junior Pires
 */
public class Main {
    public static void main(String[] argv){
        Envio envio = new Envio();
        EnvioController envioController = new EnvioController(envio);
        Home home = new Home(envioController);
        home.setVisible(true);
        //IEnvioController envioController = new EnvioController(envio);
    }
}
