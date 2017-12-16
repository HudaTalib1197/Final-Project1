/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class PatientFactory {

    
   static String status;
    public static IPatient getPatient(PreparedStatement pre){  
            if(status == null){  
             return null;  
            }  
          if(status.equalsIgnoreCase("permanently")) {  
                 return new PatientPermanently();  
               }   
           else if(status.equalsIgnoreCase("temporarily")){  
                return new PatientTemporarily();  
            }   
           
      return null;  
   }  
    
}
