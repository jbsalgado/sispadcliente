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
    
    private static Connection con=null;
    
    public static String banco = "usuario.db";
    public static Connection  getConnection(){
        try {
            if(ConnectionFactorySQLite.con==null){
                Class.forName("org.sqlite.JDBC");
                ConnectionFactorySQLite.con=DriverManager.getConnection("jdbc:sqlite:" + ConnectionFactorySQLite.banco);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactorySQLite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactorySQLite.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return ConnectionFactorySQLite.con;
        }
    }
}
