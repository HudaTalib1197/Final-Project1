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
public class Patient {

    private String first_name;
    private String last_name;
    public String address;
    public int phone_number;
    public String status;
    public int ID;
    public String Password;
   //////////////////
    //public int price_rm = 1;

    public Patient() {
    }

    public Patient(String status) {
        this.status = status;
    }

    public Patient(String first_name, String last_name, String address, int phone_number, String status, int ID, String Password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phone_number = phone_number;
        this.status = status;
        this.ID = ID;
        this.Password = Password;
        /////////////
       // this.price_rm = price_rm;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

 

}
