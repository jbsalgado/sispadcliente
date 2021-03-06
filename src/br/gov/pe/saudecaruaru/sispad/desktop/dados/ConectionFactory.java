/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.dados;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.Configuracao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Albuquerque
 */
public class ConectionFactory {
    
    public static Connection getConnection(){
    
        Connection connection=null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String connString="jdbc:odbc:Driver={Microsoft dBASE Driver (*.dbf)};DefaultDir="+Configuracao.pathDirectory;//DeafultDir indicates the location of the db
            connection=DriverManager.getConnection(connString);
            /*String sql="SELECT * FROM PMAMUN11 ";// usual sql query
            Statement stmt=connection.createStatement();
            ResultSet resultSet=stmt.executeQuery(sql);
            int cont=0;
            while(resultSet.next())
            {
                cont++;
                System.out.println(resultSet.getInt("COD_UB"));
            }
            System.out.println(cont);
            resultSet.close();
            connection.close();*/
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        finally{
            return connection;
        }
    }
    
}
