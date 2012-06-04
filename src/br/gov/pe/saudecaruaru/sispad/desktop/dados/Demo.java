/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop;
import java.util.Iterator;
 
public class Demo {
public static void main(String[] args) {
try {
    UsuarioDesktopDao dbCon = new UsuarioDesktopDao();
    dbCon.initDB();
    //dbCon.atualizaUsuario(new UsuarioDesktop("1234", "3456", "Pires", "45546576867iyhfvdsvdf"));
    Demo.imprimeLista(dbCon);
   // dbCon.atualizaHiScore(new HiScore("Quackshot", 99999999));
   
  
} catch (Exception e) {
e.printStackTrace();
}
}
public static void imprimeLista(UsuarioDesktopDao dbCon) {
    UsuarioDesktop usuario = dbCon.getUsuario();
    if(usuario==null){
        System.out.println("Nenhum usuario retornado");
    }else{
        System.out.println("Servidor Cpf.:" + usuario.getServidor_cpf());
        System.out.println("Token:" + usuario.getToken());
        System.out.println();
    }
}
}
