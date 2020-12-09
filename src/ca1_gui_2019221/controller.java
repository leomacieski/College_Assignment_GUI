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
    model model;
    
    
    public controller (){
      this.view = new view(this);
      this.model = new model();
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
            System.out.println("logged in as customer");
            
            String email;
            String password;
            
            userlogin userlogin;
            boolean result;
            
            email = view.tEmail.getText();
            password = view.tPassword.getText();
            userlogin = new userlogin(email, password);
            
            result = model.login(userlogin);
            if(result){
                System.out.println("working");
                view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
                view.costumer();
            }
            //hairdresser
            else if (!result){ 
                System.out.println("hairdresser");
            email = view.tEmail.getText();
            password = view.tPassword.getText();
            userlogin = new userlogin(email, password);
            
            result = model.hairdresser(userlogin);
            if(result){
                System.out.println("working");
                view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
                view.hairdresser();
            }
            }
            
        }
        //register page
        if(e.getActionCommand().equals("b1")){
           
            System.out.println("registered");
            
            String name = view.tName.getText();
            String surname = view.tSurname.getText();
            String emailreg = view.tEmail1.getText();
            String phone = view.tPhone.getText();
            String password = view.tPass.getText();
            
            userlogin userreg = new userlogin(name, surname, emailreg, phone, password);
            
            boolean result = model.registrationc(userreg);
            String query = "INSERT INTO customer (name, surname, email, phone, password)"+ "VALUES('"+name+ "','"+surname+"','"+emailreg+"','"+phone+"','"+password+"');";
            System.out.println(query);
            
            System.out.println("working");
            view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
            view.costumer();
            view.f2.dispatchEvent(new WindowEvent(view.f2, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "Your account has been successfully created!");
        }
            
        if(e.getActionCommand().equals("b2")){
            System.out.println("back to the login screen");
            view.f2.dispatchEvent(new WindowEvent(view.f2, WindowEvent.WINDOW_CLOSING));
            view.login();
        }
        
        if(e.getActionCommand().equals("r2")){
            view.visible = true;
            view.location.setVisible(view.visible);
            view.tLoc.setVisible(view.visible);
        }
        
        if(e.getActionCommand().equals("r1")){
            view.visible = false;
            view.location.setVisible(view.visible);
            view.tLoc.setVisible(view.visible);
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
