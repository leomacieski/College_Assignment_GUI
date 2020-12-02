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
import javax.swing.border.EmptyBorder;

public class CA1_GUI_2019221 extends JFrame {

    public static void main(String[] args) {

      //new CA1_GUI_2019221();
      //new register();
      //new costumer();
        new hairdresser();
    }
    public CA1_GUI_2019221() {
    //frame
        JFrame f1 = new JFrame();
            f1.setVisible(true);
            f1.setSize(500,500);
            BorderLayout frameLayout = new BorderLayout();
            f1.setTitle("Hairdresser Finder");
            f1.setLayout(frameLayout);
      
        //fonts
        Font tFont = new Font("Lato",Font.BOLD,50);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
            
        //top panel
        JPanel topPanel = new JPanel();
            f1.add(topPanel, BorderLayout.PAGE_START);
            
        JLabel title = new JLabel("Hairdresses Finder");
            title.setFont(tFont);
            topPanel.add(title);
            
       //center panel 
        JPanel centerPanel = new JPanel();
        GridLayout centralGrid = new GridLayout(2,2);
            
        f1.add(centerPanel, BorderLayout.CENTER);
        
        JPanel central1 = new JPanel();
        central1.setLayout(centralGrid);
        JLabel email = new JLabel ("Email:");
        JLabel password = new JLabel ("Password:");
        JTextField tEmail = new JTextField();
        JTextField tPassword = new JTextField();
        centerPanel.add(central1);
        central1.setBorder(new EmptyBorder(70,0,0,0)); //padding
            email.setFont(tFont2);
            central1.add(email);
            email.setBorder(new EmptyBorder(0,20,0,50)); //padding
            central1.add(tEmail);
           
            password.setFont(tFont2);
            central1.add(password);
            central1.add(tPassword);
      
            
        //botton panel
        JPanel bottonPane = new JPanel();
        GridLayout bottonGrid = new GridLayout(2,1);
        bottonPane.setBorder(new EmptyBorder(0,30,50,30)); //padding
        bottonPane.setLayout(bottonGrid);
        f1.add(bottonPane, BorderLayout.PAGE_END);
        JButton bLogin = new JButton("Login");
        JButton bRegister = new JButton("Register");
            bottonPane.add(bLogin);
            bottonPane.add(bRegister);        

    }
}
