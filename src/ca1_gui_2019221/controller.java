/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author leojk
 */
public class controller implements ActionListener {

    view view;
    
    public controller (){
      this.view = new view(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //create an account
        if(e.getActionCommand().equals("bRegister")){
            System.out.println("register page");
            view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
            view.register();    
    }
        //login action
        if(e.getActionCommand().equals("bLogin")){
            System.out.println("logged in");
            view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
            view.costumer();
        }
        //register page
        if(e.getActionCommand().equals("b1")){
            System.out.println("registered");
            view.f2.dispatchEvent(new WindowEvent(view.f2, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "Your account has been successfully created!");
        }
        if(e.getActionCommand().equals("b2")){
            System.out.println("back to the login screen");
            view.f2.dispatchEvent(new WindowEvent(view.f2, WindowEvent.WINDOW_CLOSING));
            view.login();
        }
        
        //logout button
        if(e.getActionCommand().equals("logout")){
            System.out.println("logged out");
            view.f3.dispatchEvent(new WindowEvent(view.f3, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        
        
        //serach hairdresser
        if(e.getActionCommand().equals("search")){
            System.out.println("searching page");
            view.f3.dispatchEvent(new WindowEvent(view.f3, WindowEvent.WINDOW_CLOSING));
            view.costumer1();
        }
        
        //search results
        if(e.getActionCommand().equals("sSearch")){
            System.out.println("serach results");
        }
        
        //back
        if(e.getActionCommand().equals("back")){
            System.out.println("preview screen");
            view.f4.dispatchEvent(new WindowEvent(view.f4, WindowEvent.WINDOW_CLOSING));
            view.costumer();
        }
        
        
        
}

}