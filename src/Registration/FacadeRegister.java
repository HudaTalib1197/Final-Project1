/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

/**
 *
 * @author PC
 */
public class FacadeRegister {
      private static User aUser;
    private static UserModel aUserModel;
    
    public FacadeRegister(){
        aUser = new User();
        aUserModel = new UserModel();
    }
}
