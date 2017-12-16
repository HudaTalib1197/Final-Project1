/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Patient.Patient;
import Registration.User;

/**
 *
 * @author PC
 */
public class Connection_Maker {
    private static DBUser dbUser;
    private static DBPatient dbPatient;
    public Connection_Maker(){}
    
    public void addUser(User user){
    dbUser.getDBUsers().register(user);
    }
    
    public boolean verifyUsers0(int ID,String password) throws Exception{
    
        if(dbUser.getDBUsers().verifyUser(ID, password))
            return true;
        else 
            return false;
    
    }
    
    public void addPatient0(Patient patient) throws Exception{
    dbPatient.getDBPatient().addPatient(patient);
    }
    
    public void delete0(Patient patient) throws Exception{
    dbPatient.getDBPatient().delete(patient);
    }
    
    public void update0(Patient patient) throws Exception{
    dbPatient.getDBPatient().update(patient);
    
    }
    
    public void search_by_ID0(String patient) throws Exception{
    dbPatient.getDBPatient().search_by_id(patient);
    
    }
}
