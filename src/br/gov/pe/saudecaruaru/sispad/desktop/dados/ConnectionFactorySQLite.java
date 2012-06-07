/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Junior Pires
 */
public class ConnectionFactorySQLite {
    
    public static String banco = "usuario.db";
    public static Connection  getConnection(){
      Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:" + ConnectionFactorySQLite.banco);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactorySQLite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactorySQLite.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return conn;
        }
    }
}
