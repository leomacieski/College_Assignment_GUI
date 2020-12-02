/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author leojk
 */
public class register extends JFrame {

    public register(){
    JFrame f2 = new JFrame();
    f2.setVisible(true);
    f2.setSize(500, 500);
    f2.setTitle("Hairdresser Finder");
    BorderLayout frame2 = new BorderLayout();
    f2.setLayout(frame2);
    
    
    //fonts
    Font tFont = new Font("Lato",Font.BOLD,35);
    Font tFont2 = new Font("Lato", Font.PLAIN, 15);
    
    //top Panel
    JPanel topanel = new JPanel();
    GridLayout topGrid = new GridLayout(2,1);
    f2.add(topanel, BorderLayout.PAGE_START);
    topanel.setLayout(topGrid);
    topanel.setBorder(new EmptyBorder(0,30,0,30));
    
    JLabel title = new JLabel ("Hairdresser Finder");
    title.setFont(tFont);
    JLabel subTitle = new JLabel("Register a new Account");
    topanel.add(title);
    topanel.add(subTitle);
    
    //center panel
    JPanel center = new JPanel();
    GridLayout gridcenter = new GridLayout(7, 2);
    f2.add(center, BorderLayout.CENTER);
    
    
    JPanel center2 = new JPanel();
    center.setLayout(gridcenter);
   
    
    JLabel info = new JLabel("I am registering as:");
    info.setFont(tFont2);
    center.add(info);
    
    JPanel center3 = new JPanel();
    GridLayout grid2 = new GridLayout(1,2);
    JRadioButton r1 = new JRadioButton("Costumer");
    r1.setFont(tFont2);
    JRadioButton r2 = new JRadioButton("Hairdresser");
    r2.setFont(tFont2);
    ButtonGroup group1 = new ButtonGroup();
    
    group1.add(r1);
    group1.add(r2);
    
    center3.add(r1);
    center3.add(r2);
    
    center.add(center3);
    JLabel name = new JLabel("Name:");
    JTextField tName = new JTextField();
    name.setFont(tFont2);
    
    JLabel surname = new JLabel("Surname:");
    JTextField tSurname = new JTextField();
    surname.setFont(tFont2);
    
    JLabel email = new JLabel("Email:");
    JTextField tEmail = new JTextField();
    email.setFont(tFont2);
    
    JLabel phone = new JLabel("Phone:");
    JTextField tPhone = new JTextField();
    phone.setFont(tFont2);
    
    JLabel pass = new JLabel("Password:");
    JTextField tPass = new JTextField();
    pass.setFont(tFont2);
    
    JLabel location = new JLabel("Location:");
    JTextField tLoc = new JTextField();
    pass.setFont(tFont2);
    
    center.add(name);
    center.add(tName);
    center.add(surname);
    center.add(tSurname);
    center.add(email);
    center.add(tEmail);
    center.add(phone);
    center.add(tPhone);
    center.add(pass);
    center.add(tPass);
    center.add(location);
    center.add(tLoc);
    
    center.setBorder(new EmptyBorder(20,30,0,30));
    
    
    //botton panel
    JPanel botton = new JPanel();
    f2.add(botton, BorderLayout.PAGE_END);
    JButton b1 = new JButton("Register");
    botton.add(b1);
    botton.setBorder(new EmptyBorder(20, 30, 30, 20));
    
    
    
}
    
}
