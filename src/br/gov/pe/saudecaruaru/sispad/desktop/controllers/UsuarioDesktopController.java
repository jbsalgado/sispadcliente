/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.dados.UsuarioDesktopDao;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;

/**
 *
 * @author Junior Pires
 */
public class UsuarioDesktopController implements IUsuarioDesktopController{
    UsuarioDesktopDao usuarioDao;
   

    public UsuarioDesktopController() {
        usuarioDao = new UsuarioDesktopDao();
      
       
    }
    
    
    
    @Override
    public void selectUsuario(){
         usuarioDao.selectUsuario();
    }
    
    @Override
    public void atualizaUsuario(UsuarioDesktop usuarioDesktop){
        //atualiza usuario no banco
        usuarioDao.atualizaUsuario(usuarioDesktop);
        //atualiza os dados do usuario atual
        usuarioDao.selectUsuario();
    }
    
    @Override
    public MessageWebService[] login(){
        selectUsuario();
        UsuarioDesktop usuarioDesktop = UsuarioDesktop.getInstance();
        return usuarioDesktop.login();
    }
    
}
