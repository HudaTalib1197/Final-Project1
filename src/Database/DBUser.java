/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Registration.User;
import java.sql.ResultSet;
//import Security.Encrypt;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DBUser {
     private  Statement aStatement;
 private  DBConnection aDBConnection;
    private static DBUser dbUser;

  public static synchronized DBUser getDBUsers(){
         if(dbUser == null) {
           dbUser = new DBUser();
       }
           return dbUser;
      }    
     public DBUser() {
    }
    
    public void register(User aUser){
         try {
             DBConnection aDBConnection = DBConnection.getDBConnection();
             
             aStatement =  aDBConnection.getStatement();
       
             String query = "Insert into User(first_name,last_name,address,ID,password) values ('"+
                     aUser.getFirst_name()+"','"+
                     aUser.getLast_name()+"','"+
                     aUser.getAddress()+"','"+
                     aUser.getID()+"','"+
                     aUser.getPassword()+
                     "')";
                          aStatement.executeUpdate(query);

         } catch (Exception ex) {
             Logger.getLogger(DBUser.class.getName()).log(Level.SEVERE, null, ex);
         }
       
            
    
    }
    
     public boolean verifyUser(int ID, String password) throws Exception{
        boolean isFound = false;
             DBConnection aDBConnection = DBConnection.getDBConnection();
        
            aStatement = aDBConnection.getStatement();
            ResultSet rs = aStatement.executeQuery
        ("Select * from User where ID='"+ID+
                "' and password='" + password+"'" );
            if(rs.next())
                isFound=true;
     
        return isFound;
    }
   
}
