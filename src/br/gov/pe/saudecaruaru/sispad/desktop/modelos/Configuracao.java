/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.modelos;

import java.io.File;

/**
 *
 * @author Junior Pires
 */
public class Configuracao {
    public static String pathDirectory = "C:/temp_sispad";

      public static void limpaDiretorioTemp() {
        File f = new File(Configuracao.pathDirectory);
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; ++i) {
                files[i].delete();
            }
        }
    }
}
