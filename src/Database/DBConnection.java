/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DBConnection {
    

    
    
        private static DBConnection aDBConnection;
   private Connection aConnection;
   private Statement aStatement;
    private DBConnection(){}
    public static synchronized DBConnection getDBConnection(){
        if(aDBConnection == null)
           aDBConnection = new DBConnection();
        return aDBConnection;
   }
    public Statement getStatement()
            throws Exception, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
       aConnection = DriverManager.getConnection("jdbc:mysql://localhost/Clinic","root","");
        
        aStatement = aConnection.createStatement();
        return aStatement;
    }     
        public void disDBConnection() {
        try {
            aConnection.close();
            aStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}

        




