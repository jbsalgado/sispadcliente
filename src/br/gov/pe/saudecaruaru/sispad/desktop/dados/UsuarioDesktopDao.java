/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;
import br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Junior Pires
 */
public class UsuarioDesktopDao {
//      private Connection conn;
//    private Statement stm;
    public static final int id = 1;
    /**
    * O construtor cria uma nova conexão com o banco de dados sqlite contido
    * no arquivo passado como parâmetro. A conexão é possibilitada pelo driver
    * JDBC, fornecido por SQLiteJDBC.
    */
    public UsuarioDesktopDao(){
   
        //this.conn = ConnectionFactorySQLite.getConnection();
        //this.stm = this.conn.createStatement();
    }
    /**
    * Cria uma nova tabela de recordes, apagando tudo que houvesse na base
    * anteriormente.
    */
    public void initDB() {
        criaTabela();
        criaUsuarioDefault();
    }
   
    
    public void criaTabela(){
    Connection conn = null;
        try {
     conn = ConnectionFactorySQLite.getConnection();
    Statement stm = conn.createStatement();
    stm.executeUpdate("DROP TABLE IF EXISTS usuario_desktop");
    stm.executeUpdate("CREATE TABLE usuario_desktop (" +
    "id varchar(1) PRIMARY KEY NOT NULL DEFAULT '"+UsuarioDesktopDao.id+"',"
    + "servidor_cpf varchar(11) NOT NULL DEFAULT '0'," +
    "token varchar(255) NOT NULL DEFAULT '0',"
    + "usuario_sistema varchar(45) NOT NULL DEFAULT 'NAME',"
    + "serial_aplicacao varchar(255) NOT NULL DEFAULT '0');");
    } catch (SQLException e) {
    e.printStackTrace();
    }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDesktopDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    public void criaUsuarioDefault() {
   Connection conn = null;
    try {
         conn = ConnectionFactorySQLite.getConnection();
        Statement stm = conn.createStatement();
        stm.executeUpdate("INSERT INTO usuario_desktop(servidor_cpf,token,"
                + "usuario_sistema,serial_aplicacao) VALUES ('0','0','NAME','0')");
    } catch (SQLException e) {
    e.printStackTrace();
    }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDesktopDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    public void atualizaUsuario(UsuarioDesktop usuarioDesktop) {
        Connection conn = null;
    try {
     conn = ConnectionFactorySQLite.getConnection();
    Statement stm = conn.createStatement();
    stm.executeUpdate("UPDATE usuario_desktop SET servidor_cpf=\"" +
    usuarioDesktop.getServidor_cpf() + "\"" +",token=\""+usuarioDesktop.getToken()+"\""
    +",usuario_sistema=\""+usuarioDesktop.getUsuario_sistema()+"\""
    +",serial_aplicacao=\""+usuarioDesktop.getSerial_aplicacao()+"\""+
    "WHERE id=\"" + UsuarioDesktopDao.id + "\"");
    } catch (SQLException e) {
    e.printStackTrace();
    }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDesktopDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    /**
    * Retorna um objeto Vector com todos os recordes do banco de dados
    * organizados em ordem decrescente de pontuação.
    * @return
    */
    public void selectUsuario() {
   
    ResultSet rs;
    
    UsuarioDesktop usuarioDesktop = null;
    Connection conn = null;
    try {
     conn = ConnectionFactorySQLite.getConnection();
    Statement stm = conn.createStatement();
    rs = stm.executeQuery("SELECT * FROM usuario_desktop WHERE id='"+UsuarioDesktopDao.id+"'");
    if(rs.next()){
        usuarioDesktop = UsuarioDesktop.getInstance();
        usuarioDesktop.setServidor_cpf(rs.getString("servidor_cpf"));
        usuarioDesktop.setToken(rs.getString("token"));
        usuarioDesktop.setUsuario_sistema(rs.getString("usuario_sistema"));
        usuarioDesktop.setSerial_aplicacao(rs.getString("serial_aplicacao"));         
    }
    rs.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDesktopDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
  
    }
}
