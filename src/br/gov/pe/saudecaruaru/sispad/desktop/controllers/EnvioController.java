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
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.io.File;
import java.io.IOException;
import java.util.List;
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
    public EnvioController(Envio envio,Home home) {
        
        this.envio = envio;
        this.home=home;
        
    }
    
    //obtem os dados do modelo Envio, extrai os arquivos e ler e envia os dados
    @Override
    public boolean EnviarDados(Envio envio){
        //limpa os campos de log da GUI
        home.limparCamposLog();
        
        
        this.envio.setArquivo(envio.getArquivo());
        this.envio.setmesCompetencia(envio.getMesCompetencia());
        this.envio.setAnoCompetencia(envio.getAnoCompetencia());
        this.envio.setSistema(envio.getSistema());
        
        if(this.envio.extrairArquivo()){
             lerEnviarDados();
             return true;
                //Configuracao.limpaDiretorioTemp();
        }     
            
        return false;
    }
   
    //obtem o sistema a partir da fabrica e chama o metodo de leitura e envio de dados
    public void lerEnviarDados() {
        ISistema sistema;
        sistema = FactoryEnvioSistema.obterFactory(this.envio.getSistema(),envio.getMensagensWeb());
        sistema.lerEnviarDados(this.envio.getCompetencia());
        
       
    }


    

   
    

   
    
}
