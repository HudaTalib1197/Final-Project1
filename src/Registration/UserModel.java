/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.util.Observable;

/**
 *
 * @author PC
 */
public class UserModel extends Observable{
    private User aUser;
     public User getUser() {
        return aUser;
    }

    public void setUser(User aUser) {
        this.aUser = aUser;
        setChanged();
        notifyObservers();
    }
    
}
