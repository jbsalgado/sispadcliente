/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.controllers;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;

/**
 *
 * @author Junior Pires
 */
public interface IUsuarioDesktopController {
     public void selectUsuario();
     public void atualizaUsuario(UsuarioDesktop usuarioDesktop);
     public void login();
     public void logout();
     
}
