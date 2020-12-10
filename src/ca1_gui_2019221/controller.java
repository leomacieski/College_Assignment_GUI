package ca1_gui_2019221;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class controller implements ActionListener {
    //access the view class and the model
    view view;
    model model;
    
    
    public controller (){
      this.view = new view(this);
      this.model = new model();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //register page
        if(e.getActionCommand().equals("bRegister")){
            System.out.println("register page");
            view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
            view.register();    
    }
        //login action
        //login as a customer
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
            //login as a hairdresser
            else if (!result){ 
                System.out.println("login as a hairdresser");
            email = view.tEmail.getText();
            password = view.tPassword.getText();
            userlogin = new userlogin(email, password);
            
            result = model.hairdresser(userlogin);
            if(result){
                System.out.println("working");
                view.f1.dispatchEvent(new WindowEvent(view.f1, WindowEvent.WINDOW_CLOSING));
                view.hairdresser();
            }
            }else
            JOptionPane.showMessageDialog(view.f1, "Invalid Credentials. Please try again");   
        }
        
        //register page
        if(e.getActionCommand().equals("b1")){
           
            System.out.println("registered as customer");
            
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
         
        //return to login screen
        if(e.getActionCommand().equals("b2")){
            System.out.println("back to the login screen");
            view.f2.dispatchEvent(new WindowEvent(view.f2, WindowEvent.WINDOW_CLOSING));
            view.login();
        }
        
        //hide or display the location field at the registration page
        if(e.getActionCommand().equals("r2")){
            System.out.println("location field visible");
            view.visible = true;
            view.location.setVisible(view.visible);
            view.tLoc.setVisible(view.visible);
        }
        if(e.getActionCommand().equals("r1")){
            System.out.println("location hide");
            view.visible = false;
            view.location.setVisible(view.visible);
            view.tLoc.setVisible(view.visible);
        }
         
        //logout button for all different screens
        if(e.getActionCommand().equals("logout")){
            System.out.println("logged out");
            view.f3.dispatchEvent(new WindowEvent(view.f3, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout1")){
            System.out.println("logged out");
            view.f6.dispatchEvent(new WindowEvent(view.f6, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout2")){
            System.out.println("logged out");
            view.f5.dispatchEvent(new WindowEvent(view.f5, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout3")){
            System.out.println("logged out");
            view.f4.dispatchEvent(new WindowEvent(view.f4, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout4")){
            System.out.println("logged out");
            view.f7.dispatchEvent(new WindowEvent(view.f7, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout5")){
            System.out.println("logged out");
            view.f8.dispatchEvent(new WindowEvent(view.f8, WindowEvent.WINDOW_CLOSING));
            view.login();
            JOptionPane.showMessageDialog(this.view, "You have been logged out");  
        }
        if(e.getActionCommand().equals("logout6")){
            System.out.println("logged out");
            view.f9.dispatchEvent(new WindowEvent(view.f9, WindowEvent.WINDOW_CLOSING));
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
        
        //view bookings
        if(e.getActionCommand().equals("view")){
            System.out.println("view bookings screen"); 
            view.f3.dispatchEvent(new WindowEvent(view.f3, WindowEvent.WINDOW_CLOSING));
            view.costumer2();
        }
            //back
            if(e.getActionCommand().equals("back1")){
                System.out.println("preview screen");
                view.f5.dispatchEvent(new WindowEvent(view.f5, WindowEvent.WINDOW_CLOSING));
                view.costumer();
            }
        
        //view clients 
        if(e.getActionCommand().equals("view1")){
            System.out.println("Upcoming clients page");
            view.f6.dispatchEvent(new WindowEvent(view.f6, WindowEvent.WINDOW_CLOSING));
            view.hairdresser1();
        }
            //back
            if(e.getActionCommand().equals("back2")){
                System.out.println("preview screen");
                view.f7.dispatchEvent(new WindowEvent(view.f7, WindowEvent.WINDOW_CLOSING));
                view.hairdresser();
            }
        
        
        //my availablity
        if(e.getActionCommand().equals("set")){
            System.out.println("configure availability"); 
            view.f6.dispatchEvent(new WindowEvent(view.f6, WindowEvent.WINDOW_CLOSING));
            view.hairdresser2();
        }
        
            //save button
            if(e.getActionCommand().equals("save")){
                System.out.println("Settings saved");
                JOptionPane.showMessageDialog(this.view, "Your timetable has been updated!");    
            }
        
            //back
            if(e.getActionCommand().equals("back3")){
                System.out.println("preview screen");
                view.f8.dispatchEvent(new WindowEvent(view.f8, WindowEvent.WINDOW_CLOSING));
                view.hairdresser();
            }
            
            //hairdresser reviews
            if(e.getActionCommand().equals("review")){
                System.out.println("comments people make");
                view.f6.dispatchEvent(new WindowEvent(view.f6, WindowEvent.WINDOW_CLOSING));
                view.hairdresser3();
            }
                //back
                if(e.getActionCommand().equals("back4")){
                    System.out.println("preview screen");
                    view.f9.dispatchEvent(new WindowEvent(view.f9, WindowEvent.WINDOW_CLOSING));
                    view.hairdresser();
                }
            
    }
}
