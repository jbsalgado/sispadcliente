/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.dados.Teste;
import br.gov.pe.saudecaruaru.sispad.desktop.gui.Home;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Configuracao;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Envio;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.FactoryEnvioSistema;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.ISistema;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;

/**
 *
 * @author Junior Pires
 */
public class EnvioController implements IEnvioController{
    Home home = null;
    Envio envio = null;
    public EnvioController(Envio envio) {
        this.envio = envio;
        
        
    }
    
    //obtem os dados do modelo Envio, extrai os arquivos e ler e envia os dados
    @Override
    public boolean EnviarDados(Envio envio){
      
        this.envio.setArquivo(envio.getArquivo());
        this.envio.setmesCompetencia(envio.getMesCompetencia());
        this.envio.setAnoCompetencia(envio.getAnoCompetencia());
        this.envio.setSistema(envio.getSistema());
        
        if(this.envio.extrairArquivo())
            if(lerEnviarDados()){
                //Configuracao.limpaDiretorioTemp();
                return true;
            }
        return false;
    }
   
    //obtem o sistema a partir da fabrica e chama o metodo de leitura e envio de dados
    public boolean lerEnviarDados() {
        ISistema sistema;
        sistema = FactoryEnvioSistema.obterFactory(this.envio.getSistema());
        if(sistema.lerEnviarDados(this.envio.getCompetencia()))
            return true;

        return false;
        
       
    }


    

   
    

   
    
}
