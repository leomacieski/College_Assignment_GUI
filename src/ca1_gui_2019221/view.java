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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
public class view extends JFrame {
  controller controller;
    public view(controller controller){
      this.controller = controller;
      login();
  }
    
    JFrame f1;
    JFrame f2;
    JFrame f3;
    JFrame f4;
    JFrame f7;
    
    JTextField tEmail;
    JTextField tPassword;
    
    JTextField tName;
    JTextField tSurname;
    JTextField tEmail1;
    JTextField tPhone;
    JTextField tPass;
    JTextField tLoc;
    JLabel location;
    
    boolean visible;
    JLabel info;
    JRadioButton r2;
    JRadioButton r1;
    //login frame
    public  void login() {
    //frame
        f1 = new JFrame();
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
        tEmail = new JTextField();
        tPassword = new JTextField();
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
            bLogin.addActionListener(controller);
            bLogin.setActionCommand("bLogin");
        JButton bRegister = new JButton("Register");
            bRegister.addActionListener(controller);
            bRegister.setActionCommand("bRegister");
                bottonPane.add(bLogin);
                bottonPane.add(bRegister);
    }
    //register frame
    public void register(){
    f2 = new JFrame();
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
   
    
    info = new JLabel("I am registering as:");
    info.setFont(tFont2);
    center.add(info);
    
    JPanel center3 = new JPanel();
    GridLayout grid2 = new GridLayout(1,2);
    r1 = new JRadioButton("Costumer");
    r1.addActionListener(controller);
    r1.setActionCommand("r1");
    r1.setFont(tFont2);
    r2 = new JRadioButton("Hairdresser");
    r2.addActionListener(controller);
    r2.setActionCommand("r2");
    r2.setFont(tFont2);
    ButtonGroup group1 = new ButtonGroup();
    
    group1.add(r1);
    group1.add(r2);
    
    center3.add(r1);
    center3.add(r2);
    
    center.add(center3);
    JLabel name = new JLabel("Name:");
    tName = new JTextField();
    name.setFont(tFont2);
    
    JLabel surname = new JLabel("Surname:");
    tSurname = new JTextField();
    surname.setFont(tFont2);
    
    JLabel email = new JLabel("Email:");
    tEmail1 = new JTextField();
    email.setFont(tFont2);
    
    JLabel phone = new JLabel("Phone:");
    tPhone = new JTextField();
    phone.setFont(tFont2);
    
    JLabel pass = new JLabel("Password:");
    tPass = new JTextField();
    pass.setFont(tFont2);
    
    location = new JLabel("Location:");
    location.setVisible(visible);
    tLoc = new JTextField();
    tLoc.setVisible(visible);
    pass.setFont(tFont2);
    
    center.add(name);
    center.add(tName);
    center.add(surname);
    center.add(tSurname);
    center.add(email);
    center.add(tEmail1);
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
        b1.addActionListener(controller);
        b1.setActionCommand("b1");
    botton.add(b1);
    
    botton.setBorder(new EmptyBorder(20, 30, 30, 20));
    JButton b2 = new JButton("Login");
        b2.addActionListener(controller);
        b2.setActionCommand("b2");
    botton.add(b2);
    }
    
    //costumer dashboard
    public void costumer(){
    f3 = new JFrame();
    f3.setVisible(true);
    f3.setSize(500, 500);
    f3.setTitle("Hairdresser Finder");
    BorderLayout frame3 = new BorderLayout();
    f3.setLayout(frame3);
    
    //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
    //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f3.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
        
        
        JButton logout = new JButton("Logout");
        logout.addActionListener(controller);
        logout.setActionCommand("logout");
        JPanel pLogout = new JPanel();
        topPanel.add(pLogout);
        pLogout.add(logout);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
    
    
    //center
        JPanel center = new JPanel();
        GridLayout centerGrid = new GridLayout(1,2);
        f3.add(center, BorderLayout.CENTER);
        center.setLayout(centerGrid);
        center.setBorder(new EmptyBorder(50,30,50,30));
        
        JLabel welcome = new JLabel("Welcome + name");
        center.add(welcome);
    
        JPanel rightCenter = new JPanel();
        GridLayout rCenter = new GridLayout(2,1);
        rightCenter.setLayout(rCenter);
        
        JButton view = new JButton("View my Bookings");
        rightCenter.add(view);
        
        JButton search = new JButton("Search a hairdresser");
        search.addActionListener(controller);
        search.setActionCommand("search");
        rightCenter.add(search);
        center.add(rightCenter);
    }
    
    //serach screen
    public void costumer1(){
        f4 = new JFrame();
        f4.setVisible(true);
        f4.setSize(500, 500);
        f4.setTitle("Hairdresser Finder");
        BorderLayout frame4 = new BorderLayout();
        f4.setLayout(frame4);
        
            //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f4.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout = new JButton("Logout");
        logout.addActionListener(controller);
        logout.setActionCommand("logout");
        JPanel pLogout = new JPanel();
        topPanel.add(pLogout);
        pLogout.add(logout);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
        
        //center panel
        JPanel center = new JPanel();
        BorderLayout center1 = new BorderLayout();
        center.setLayout(center1);
        f4.add(center, BorderLayout.CENTER);
        
        JPanel center2 = new JPanel ();
        GridLayout topCenter = new GridLayout(1,2);
        center.add(center2, BorderLayout.PAGE_START);
        center2.setLayout(topCenter);
        center2.setBorder(new EmptyBorder(20,10,0,10));
        JTextField serachBox = new JTextField("Serach by location or name");
        center2.add(serachBox);
        
        JButton sSearch = new JButton("Search now");
        sSearch.addActionListener(controller);
        sSearch.setActionCommand("sSearch");
        center2.add(sSearch);
        
        
        
        //botton panel
        JPanel bottonPanel = new JPanel();
        FlowLayout flowBotton = new FlowLayout();
        f4.add(bottonPanel, BorderLayout.PAGE_END);
        bottonPanel.setLayout(flowBotton);
        JButton back = new JButton("Back");
        back.addActionListener(controller);
        back.setActionCommand("back");
        bottonPanel.add(back);
        
    }
    
    
    
    
    
    
    
    
    //hairdresser dashboard
    public void hairdresser(){
        f7 = new JFrame();
        f7.setVisible(true);
        f7.setSize(500, 500);
        f7.setTitle("Hairdresser Finder");
        BorderLayout frame3 = new BorderLayout();
        f7.setLayout(frame3);
    
    //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f7.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout = new JButton("Logout");
        topPanel.add(logout);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
        
        
        //center
        JPanel center = new JPanel();
        GridLayout centerGrid = new GridLayout(1,2);
        f7.add(center, BorderLayout.CENTER);
        center.setLayout(centerGrid);
        center.setBorder(new EmptyBorder(50,30,50,30));
        
        JLabel welcome = new JLabel("Welcome + name");
        center.add(welcome);
    
        JPanel rightCenter = new JPanel();
        GridLayout rCenter = new GridLayout(3,1);
        rightCenter.setLayout(rCenter);
        
        JButton view = new JButton("View Upcoming Clients");
        rightCenter.add(view);
        
        JButton set = new JButton("Set Availability");
        rightCenter.add(set);
        
        JButton review = new JButton("My Reviews");
        rightCenter.add(review);
        
        center.add(rightCenter);
        
        
    }
    
    
}
