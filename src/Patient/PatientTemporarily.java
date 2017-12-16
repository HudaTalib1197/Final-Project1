/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

/**
 *
 * @author PC
 */
public class PatientTemporarily implements IPatient{

   private int price_rm;
    public PatientTemporarily() {
        this.price_rm= price_rm;
    }

    

  

    public void setPrice_rm(int price_rm) {
this.price_rm= price_rm;    
    
    }

    @Override
    public int getPrice_rm() {
    return price_rm = 40*(10/100);    }
}
