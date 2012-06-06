/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.dados.UsuarioDesktopDao;
import br.gov.pe.saudecaruaru.sispad.desktop.gui.Home;
import br.gov.pe.saudecaruaru.sispad.desktop.gui.IHome;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;

/**
 *
 * @author Junior Pires
 */
public class UsuarioDesktopController implements IUsuarioDesktopController{
    UsuarioDesktopDao usuarioDao;
   
    IHome home = null;
    public UsuarioDesktopController(IHome home) {
        usuarioDao = new UsuarioDesktopDao();
        this.home = home;
      
       
    }
    
    
    
    @Override
    public void selectUsuario(){
         usuarioDao.selectUsuario();
    }
    
    @Override
    public void atualizaUsuario(UsuarioDesktop usuarioDesktop){
        //faz logout do usuario atual
        logout();
        //atualiza usuario no banco
        usuarioDao.atualizaUsuario(usuarioDesktop);
        //tenta fazer o login
        login();
    }
    
    @Override
    public void login(){
        //seleciona o usuario do banco
        selectUsuario();
        //pega instanvia dele
        UsuarioDesktop usuarioDesktop = UsuarioDesktop.getInstance();
        //tenta fazer login
        MessageWebService[] mensagens = usuarioDesktop.login();
        
        //exibe as imagens de erro na tela
        for(MessageWebService msg: mensagens){
          
           if(msg.getTipo().equals("0") || msg.getTipo().equals("2")){
               
               home.disableButtonEscolher();
               home.disableButtonEnviar();
               home.logadoOff(msg.getMessage());
             
              
           }else{
               home.enableButtonEscolher();
               home.enableButtonEnviar();
               home.logadoOn(msg.getMessage());
             
           }
             
          }
       
    }
    
    @Override
    public void logout(){
        //pega instancia de um usuarioDesktop
        UsuarioDesktop usuarioDesktop = UsuarioDesktop.getInstance();
        //faz logout
        usuarioDesktop.logout();
    }
    
}
