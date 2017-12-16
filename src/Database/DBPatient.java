/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Patient.Patient;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DBPatient {

    private Statement aStatement;
    private DBConnection aDBConnection;
    private static DBPatient dbPatient;

    public static synchronized DBPatient getDBPatient() {
        if (dbPatient == null) {
            dbPatient = new DBPatient();
        }
        return dbPatient;
    }

    public DBPatient() {
    }

    public void addPatient(Patient patient) throws Exception {
        try {
            DBConnection aDBConnection = DBConnection.getDBConnection();
            
            aStatement = aDBConnection.getStatement();
            
            String query = "Insert into patient(first_name,last_name,address,phone_number,status,ID,Password) values ('"
                    + patient.getFirst_name() + "','"
                    + patient.getLast_name() + "','"
                    + patient.getAddress() + "','"
                    + patient.getPhone_number() + "','"
                    + patient.getStatus() + "','"
                    + patient.getID() + "','"
                    + patient.getPassword()
                    + "')";
            aStatement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBPatient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void delete(Patient patient) throws Exception{
         
            DBConnection aDBConnection = DBConnection.getDBConnection();
       aStatement = aDBConnection.getStatement();
        String sql = "delete from patient where ID ='"+
                patient.getID()+"'";
               
         
        
            aStatement.executeUpdate(sql);
      

     }
    
    public void update(Patient patient) throws Exception{
                DBConnection aDBConnection = DBConnection.getDBConnection();
                       aStatement = aDBConnection.getStatement();

 String sql = "UPDATE patient " +
                   "SET first_name = '"+
                patient.getFirst_name()+
         "',last_name = '"+patient.getLast_name()+
         "', address'"+patient.getAddress()+
         "',phone_number = '"+patient.getPhone_number()+
         "',status'"+patient.getStatus()+
         "',ID'"+patient.getID()+
         "',password'"+patient.getPassword()+
         "'";
        try {
            aStatement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBPatient.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    public String search_by_id(String ID) throws Exception{
    
    String s = null;
        
                DBConnection aDBConnection = DBConnection.getDBConnection();
           
                       aStatement = aDBConnection.getStatement();
              String query = ("SELECT * FROM patient WHERE ID ="+ID);
            
              ResultSet r = (ResultSet) aStatement.executeQuery(query);
             
        try {
            while(r.next()) {
                s = r.getString("first_name".trim()) +
                        r.getString("last_name".trim())+
                        r.getString("address".trim())+
                        r.getInt("phone_number".trim())+
                        r.getString("status".trim())+
                        r.getInt("ID".trim())+
                        r.getString("password".trim());
                
                
                
                System.out.println(s); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
       



}
  
    
}
