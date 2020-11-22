/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author leojk
 */
public class CA1_GUI_2019221 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CA1_GUI_2019221();
    }
    public CA1_GUI_2019221() {
    
        JFrame f1 = new JFrame();
            f1.setVisible(true);
            f1.setSize(600, 600);
            f1.setTitle("Hairdresser Finder");
      
        JPanel login = new JPanel();
            f1.add(login);
        FlowLayout flow1 = new FlowLayout();
            f1.setLayout(flow1);
            
        Font tFont = new Font("Lato",Font.BOLD,50);
            
        JLabel title = new JLabel("Hairdresses Finder");
            title.setFont(tFont);
            login.add(title);
            
        
        GridLayout grid1 = new GridLayout(2,2);
        JLabel email = new JLabel ("Email:");
        JLabel password = new JLabel ("Password:");
            login.add(email);
            login.add(password);
      
        JTextField tEmail = new JTextField();
        JTextField tPassword = new JTextField();
            login.add(tEmail);
            login.add(tPassword);
            tEmail.setSize(300, 20);
            tPassword.setSize(300, 20);
        
        
        JButton bLogin = new JButton("Login");
        JButton bRegister = new JButton("Register");
            login.add(bLogin);
            login.add(bRegister);
        
            
            
        login.repaint();
        login.validate();
    }
}
