/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author PC
 */
public class FacadeInterfaces {
    private static FirstUI aFirstUI;
    private static Login aLogin;
    private static Logout aLogout;
    private static Manage_Screen aManage_Screen;
    private static Registration aRegistration;
    
    public FacadeInterfaces() {
        aFirstUI = new FirstUI();
        aLogin = new Login();
        aLogout = new Logout();
        aManage_Screen = new Manage_Screen();
        aRegistration = new Registration();
}
}