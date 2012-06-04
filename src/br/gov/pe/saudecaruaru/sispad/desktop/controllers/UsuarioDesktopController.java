/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.dados.UsuarioDesktopDao;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop;

/**
 *
 * @author Junior Pires
 */
public class UsuarioDesktopController {
    UsuarioDesktopDao usuarioDao;

    public UsuarioDesktopController() {
        usuarioDao = new UsuarioDesktopDao();
       
    }
    
    
    
    public UsuarioDesktop getUsuario(){
        return usuarioDao.getUsuario();
    }
    
    public void atualizaUsuario(UsuarioDesktop usuarioDesktop){
        usuarioDao.atualizaUsuario(usuarioDesktop);
    }
    
}
