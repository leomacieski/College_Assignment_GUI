package ca1_gui_2019221;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

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
    JFrame f5;
    JFrame f6;
    JFrame f7;
    JFrame f8;
    JFrame f9;
    
    
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
    location.setFont(tFont2);
    
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

    //center panel
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
        view.addActionListener(controller);
        view.setActionCommand("view");
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
    
        JButton logout3 = new JButton("Logout");
        logout3.addActionListener(controller);
        logout3.setActionCommand("logout3");
        JPanel pLogout = new JPanel();
        topPanel.add(pLogout);
        pLogout.add(logout3);
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
    
    //View bookings screen
    public void costumer2(){
        f5 = new JFrame();
        f5.setVisible(true);
        f5.setSize(500, 500);
        f5.setTitle("Hairdresser Finder");
        BorderLayout frame4 = new BorderLayout();
        f5.setLayout(frame4);
        
            //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f5.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout2 = new JButton("Logout");
        logout2.addActionListener(controller);
        logout2.setActionCommand("logout2");
        JPanel pLogout = new JPanel();
        topPanel.add(pLogout);
        pLogout.add(logout2);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
        
        //center panel
        JPanel centerView = new JPanel();
        GridLayout gridView = new GridLayout(2,1);
        centerView.setLayout(gridView);
        centerView.setBorder(new EmptyBorder(0,60,0,10));
        f5.add(centerView, BorderLayout.CENTER);
        
        JLabel newB = new JLabel("Upcoming Bookings");
        newB.setFont(tFont2);
        centerView.add(newB);
        
        JLabel lastB = new JLabel ("Last Bookings");
        lastB.setFont(tFont2);
        centerView.add(lastB);
        
        //botton panel
        JPanel bottonPanel = new JPanel();
        FlowLayout flowBotton = new FlowLayout();
        f5.add(bottonPanel, BorderLayout.PAGE_END);
        bottonPanel.setLayout(flowBotton);
        JButton back1 = new JButton("Back");
        back1.addActionListener(controller);
        back1.setActionCommand("back1");
        bottonPanel.add(back1);
    }

    //hairdresser dashboard
     public void hairdresser(){
        f6 = new JFrame();
        f6.setVisible(true);
        f6.setSize(500, 500);
        f6.setTitle("Hairdresser Finder");
        BorderLayout frame3 = new BorderLayout();
        f6.setLayout(frame3);
    
    //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f6.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout1 = new JButton("Logout");
        logout1.addActionListener(controller);
        logout1.setActionCommand("logout1");
        topPanel.add(logout1);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));

        //center
        JPanel center = new JPanel();
        GridLayout centerGrid = new GridLayout(1,2);
        f6.add(center, BorderLayout.CENTER);
        center.setLayout(centerGrid);
        center.setBorder(new EmptyBorder(50,30,50,30));
        
        JLabel welcome = new JLabel("Welcome + name");
        center.add(welcome);
    
        JPanel rightCenter = new JPanel();
        GridLayout rCenter = new GridLayout(3,1);
        rightCenter.setLayout(rCenter);
        
        JButton view1 = new JButton("View Upcoming Clients");
        view1.addActionListener(controller);
        view1.setActionCommand("view1");
        rightCenter.add(view1);
        
        JButton set = new JButton("Set Availability");
        set.addActionListener(controller);
        set.setActionCommand("set");
        rightCenter.add(set);
        
        JButton review = new JButton("My Reviews");
        review.addActionListener(controller);
        review.setActionCommand("review");
        rightCenter.add(review);
        
        center.add(rightCenter);   
    }
    
     //view clients timetable
     public void hairdresser1(){
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
    
        JButton logout4 = new JButton("Logout");
        logout4.addActionListener(controller);
        logout4.setActionCommand("logout4");
        topPanel.add(logout4);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
    
        //center panel
        JPanel clientsComing = new JPanel();
        BorderLayout clientsC = new BorderLayout();
        clientsComing.setLayout(clientsC);
        clientsComing.setBorder(new EmptyBorder(10, 30, 0, 0));
        f7.add(clientsComing, BorderLayout.CENTER);
        
        JLabel clientsInfo = new JLabel("Upcoming Clients");
        clientsInfo.setFont(tFont2);
        clientsComing.add(clientsInfo, BorderLayout.PAGE_START);
        
        //botton panel
        JPanel bottonPanel = new JPanel();
        FlowLayout flowBotton = new FlowLayout();
        f7.add(bottonPanel, BorderLayout.PAGE_END);
        bottonPanel.setLayout(flowBotton);
        JButton back2 = new JButton("Back");
        back2.addActionListener(controller);
        back2.setActionCommand("back2");
        bottonPanel.add(back2);
    }
     
     //my availability
     public void hairdresser2(){
        f8 = new JFrame();
        f8.setVisible(true);
        f8.setSize(500, 500);
        f8.setTitle("Hairdresser Finder");
        BorderLayout frame3 = new BorderLayout();
        f8.setLayout(frame3);
    
    //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f8.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout5 = new JButton("Logout");
        logout5.addActionListener(controller);
        logout5.setActionCommand("logout5");
        topPanel.add(logout5);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
        
        //centrer panel
        JPanel setAv = new JPanel();
        GridLayout setAvGrid = new GridLayout(14, 1);
//        JScrollPane setScroll = new JScrollPane();
//        setAv.add(setScroll);
        setAv.setLayout(setAvGrid);
        
        JLabel avTitle = new JLabel("Set My Availability");
        avTitle.setFont(tFont2);
        setAv.add(avTitle);
        
        JLabel monday = new JLabel("Monday:");
        monday.setFont(tFont2);
        setAv.add(monday);
        
        //monday times
        JPanel mondayH = new JPanel();
        GridLayout monH = new GridLayout(2,5);
        mondayH.setLayout(monH);
        JCheckBox monHours1 = new JCheckBox("9:00");
        monHours1.setFont(tFont2);
        JCheckBox monHours2 = new JCheckBox("10:00");
        monHours2.setFont(tFont2);
        JCheckBox monHours3 = new JCheckBox("11:00");
        monHours3.setFont(tFont2);
        JCheckBox monHours4 = new JCheckBox("12:00");
        monHours4.setFont(tFont2);
        JCheckBox monHours5 = new JCheckBox("13:00");
        monHours5.setFont(tFont2);
        JCheckBox monHours6 = new JCheckBox("14:00");
        monHours6.setFont(tFont2);
        JCheckBox monHours7 = new JCheckBox("15:00");
        monHours7.setFont(tFont2);
        JCheckBox monHours8 = new JCheckBox("16:00");
        monHours8.setFont(tFont2);
        JCheckBox monHours9 = new JCheckBox("17:00");
        monHours9.setFont(tFont2);
        JCheckBox monHours0 = new JCheckBox("18:00");
        monHours0.setFont(tFont2);
        
        mondayH.add(monHours1);
        mondayH.add(monHours2);
        mondayH.add(monHours3);
        mondayH.add(monHours4);
        mondayH.add(monHours5);
        mondayH.add(monHours6);
        mondayH.add(monHours7);
        mondayH.add(monHours8);
        mondayH.add(monHours9);
        mondayH.add(monHours0);
        setAv.add(mondayH);
        
        //tuesday times
        JLabel tuesday = new JLabel("Tuesday:");
        tuesday.setFont(tFont2);
        setAv.add(tuesday);
        
        JPanel tuesdayH = new JPanel();
        GridLayout tueH = new GridLayout(2,5);
        tuesdayH.setLayout(tueH);
        JCheckBox tueHours1 = new JCheckBox("9:00");
        tueHours1.setFont(tFont2);
        JCheckBox tueHours2 = new JCheckBox("10:00");
        tueHours2.setFont(tFont2);
        JCheckBox tueHours3 = new JCheckBox("11:00");
        tueHours3.setFont(tFont2);
        JCheckBox tueHours4 = new JCheckBox("12:00");
        tueHours4.setFont(tFont2);
        JCheckBox tueHours5 = new JCheckBox("13:00");
        tueHours5.setFont(tFont2);
        JCheckBox tueHours6 = new JCheckBox("14:00");
        tueHours6.setFont(tFont2);
        JCheckBox tueHours7 = new JCheckBox("15:00");
        tueHours7.setFont(tFont2);
        JCheckBox tueHours8 = new JCheckBox("16:00");
        tueHours8.setFont(tFont2);
        JCheckBox tueHours9 = new JCheckBox("17:00");
        tueHours9.setFont(tFont2);
        JCheckBox tueHours0 = new JCheckBox("18:00");
        tueHours0.setFont(tFont2);
        
        tuesdayH.add(tueHours1);
        tuesdayH.add(tueHours2);
        tuesdayH.add(tueHours3);
        tuesdayH.add(tueHours4);
        tuesdayH.add(tueHours5);
        tuesdayH.add(tueHours6);
        tuesdayH.add(tueHours7);
        tuesdayH.add(tueHours8);
        tuesdayH.add(tueHours9);
        tuesdayH.add(tueHours0);
        setAv.add(tuesdayH);
        
        //wednesday times
        JLabel wednesday = new JLabel("Wednesday:");
        wednesday.setFont(tFont2);
        setAv.add(wednesday);
        
        JPanel wednesdayH = new JPanel();
        GridLayout wedH = new GridLayout(2,5);
        wednesdayH.setLayout(wedH);
        JCheckBox wedHours1 = new JCheckBox("9:00");
        wedHours1.setFont(tFont2);
        JCheckBox wedHours2 = new JCheckBox("10:00");
        wedHours2.setFont(tFont2);
        JCheckBox wedHours3 = new JCheckBox("11:00");
        wedHours3.setFont(tFont2);
        JCheckBox wedHours4 = new JCheckBox("12:00");
        wedHours4.setFont(tFont2);
        JCheckBox wedHours5 = new JCheckBox("13:00");
        wedHours5.setFont(tFont2);
        JCheckBox wedHours6 = new JCheckBox("14:00");
        wedHours6.setFont(tFont2);
        JCheckBox wedHours7 = new JCheckBox("15:00");
        wedHours7.setFont(tFont2);
        JCheckBox wedHours8 = new JCheckBox("16:00");
        wedHours8.setFont(tFont2);
        JCheckBox wedHours9 = new JCheckBox("17:00");
        wedHours9.setFont(tFont2);
        JCheckBox wedHours0 = new JCheckBox("18:00");
        wedHours0.setFont(tFont2);
        
        wednesdayH.add(wedHours1);
        wednesdayH.add(wedHours2);
        wednesdayH.add(wedHours3);
        wednesdayH.add(wedHours4);
        wednesdayH.add(wedHours5);
        wednesdayH.add(wedHours6);
        wednesdayH.add(wedHours7);
        wednesdayH.add(wedHours8);
        wednesdayH.add(wedHours9);
        wednesdayH.add(wedHours0);
        setAv.add(wednesdayH);
        
        //thursday times
        JLabel thursday = new JLabel("Thursday:");
        thursday.setFont(tFont2);
        setAv.add(thursday);
        
        JPanel thursdayH = new JPanel();
        GridLayout thuH = new GridLayout(2,5);
        thursdayH.setLayout(thuH);
        JCheckBox thuHours1 = new JCheckBox("9:00");
        thuHours1.setFont(tFont2);
        JCheckBox thuHours2 = new JCheckBox("10:00");
        thuHours2.setFont(tFont2);
        JCheckBox thuHours3 = new JCheckBox("11:00");
        thuHours3.setFont(tFont2);
        JCheckBox thuHours4 = new JCheckBox("12:00");
        thuHours4.setFont(tFont2);
        JCheckBox thuHours5 = new JCheckBox("13:00");
        thuHours5.setFont(tFont2);
        JCheckBox thuHours6 = new JCheckBox("14:00");
        thuHours6.setFont(tFont2);
        JCheckBox thuHours7 = new JCheckBox("15:00");
        thuHours7.setFont(tFont2);
        JCheckBox thuHours8 = new JCheckBox("16:00");
        thuHours8.setFont(tFont2);
        JCheckBox thuHours9 = new JCheckBox("17:00");
        thuHours9.setFont(tFont2);
        JCheckBox thuHours0 = new JCheckBox("18:00");
        thuHours0.setFont(tFont2);
        
        thursdayH.add(thuHours1);
        thursdayH.add(thuHours2);
        thursdayH.add(thuHours3);
        thursdayH.add(thuHours4);
        thursdayH.add(thuHours5);
        thursdayH.add(thuHours6);
        thursdayH.add(thuHours7);
        thursdayH.add(thuHours8);
        thursdayH.add(thuHours9);
        thursdayH.add(thuHours0);
        setAv.add(thursdayH);
        
        //friday times
        JLabel friday = new JLabel("Friday:");
        friday.setFont(tFont2);
        setAv.add(friday);
        
        JPanel fridayH = new JPanel();
        GridLayout fryH = new GridLayout(2,5);
        fridayH.setLayout(fryH);
        JCheckBox fryHours1 = new JCheckBox("9:00");
        fryHours1.setFont(tFont2);
        JCheckBox fryHours2 = new JCheckBox("10:00");
        fryHours2.setFont(tFont2);
        JCheckBox fryHours3 = new JCheckBox("11:00");
        fryHours3.setFont(tFont2);
        JCheckBox fryHours4 = new JCheckBox("12:00");
        fryHours4.setFont(tFont2);
        JCheckBox fryHours5 = new JCheckBox("13:00");
        fryHours5.setFont(tFont2);
        JCheckBox fryHours6 = new JCheckBox("14:00");
        fryHours6.setFont(tFont2);
        JCheckBox fryHours7 = new JCheckBox("15:00");
        fryHours7.setFont(tFont2);
        JCheckBox fryHours8 = new JCheckBox("16:00");
        fryHours8.setFont(tFont2);
        JCheckBox fryHours9 = new JCheckBox("17:00");
        fryHours9.setFont(tFont2);
        JCheckBox fryHours0 = new JCheckBox("18:00");
        fryHours0.setFont(tFont2);
        
        fridayH.add(fryHours1);
        fridayH.add(fryHours2);
        fridayH.add(fryHours3);
        fridayH.add(fryHours4);
        fridayH.add(fryHours5);
        fridayH.add(fryHours6);
        fridayH.add(fryHours7);
        fridayH.add(fryHours8);
        fridayH.add(fryHours9);
        fridayH.add(fryHours0);
        setAv.add(fridayH);
        
        //saturday times
        JLabel saturday = new JLabel("Saturday:");
        saturday.setFont(tFont2);
        setAv.add(saturday);
        
        JPanel saturdayH = new JPanel();
        GridLayout satH = new GridLayout(2,5);
        saturdayH.setLayout(satH);
        JCheckBox satHours1 = new JCheckBox("9:00");
        satHours1.setFont(tFont2);
        JCheckBox satHours2 = new JCheckBox("10:00");
        satHours2.setFont(tFont2);
        JCheckBox satHours3 = new JCheckBox("11:00");
        satHours3.setFont(tFont2);
        JCheckBox satHours4 = new JCheckBox("12:00");
        satHours4.setFont(tFont2);
        JCheckBox satHours5 = new JCheckBox("13:00");
        satHours5.setFont(tFont2);
        JCheckBox satHours6 = new JCheckBox("14:00");
        satHours6.setFont(tFont2);
        JCheckBox satHours7 = new JCheckBox("15:00");
        satHours7.setFont(tFont2);
        JCheckBox satHours8 = new JCheckBox("16:00");
        satHours8.setFont(tFont2);
        JCheckBox satHours9 = new JCheckBox("17:00");
        satHours9.setFont(tFont2);
        JCheckBox satHours0 = new JCheckBox("18:00");
        satHours0.setFont(tFont2);
        
        saturdayH.add(satHours1);
        saturdayH.add(satHours2);
        saturdayH.add(satHours3);
        saturdayH.add(satHours4);
        saturdayH.add(satHours5);
        saturdayH.add(satHours6);
        saturdayH.add(satHours7);
        saturdayH.add(satHours8);
        saturdayH.add(satHours9);
        saturdayH.add(satHours0);
        setAv.add(saturdayH);
        
        //save button
        JPanel saveB = new JPanel();
        JButton save = new JButton("Save Changes");
        save.addActionListener(controller);
        save.setActionCommand("save");
        saveB.add(save);
        setAv.add(saveB);
        
        f8.add(setAv, BorderLayout.CENTER);
        
        
        
        //botton panel
        JPanel bottonPanel = new JPanel();
        FlowLayout flowBotton = new FlowLayout();
        f8.add(bottonPanel, BorderLayout.PAGE_END);
        bottonPanel.setLayout(flowBotton);
        JButton back3 = new JButton("Back");
        back3.addActionListener(controller);
        back3.setActionCommand("back3");
        bottonPanel.add(back3);
     }
     
     
     //my reviews
     public void hairdresser3(){
        f9 = new JFrame();
        f9.setVisible(true);
        f9.setSize(500, 500);
        f9.setTitle("Hairdresser Finder");
        BorderLayout frame3 = new BorderLayout();
        f9.setLayout(frame3);
    
    //fonts
        Font tFont = new Font("Lato",Font.BOLD,25);
        Font tFont2 = new Font("Lato", Font.PLAIN, 15);
        
            //top Panel
        JPanel topPanel =  new JPanel();
        GridLayout topgrid = new GridLayout(1,2);
        topPanel.setLayout(topgrid);
        f9.add(topPanel, BorderLayout.PAGE_START);
        
        JLabel title = new JLabel("Hairdresser Finder");
        title.setFont(tFont);
        topPanel.add(title);
    
        JButton logout6 = new JButton("Logout");
        logout6.addActionListener(controller);
        logout6.setActionCommand("logout6");
        topPanel.add(logout6);
        topPanel.setBorder(new EmptyBorder(10,30,0,30));
     
        //center panel
        JPanel centerReview = new JPanel();
        BorderLayout reviewBorder = new BorderLayout();
        centerReview.setLayout(reviewBorder);
        
        JLabel myRev = new JLabel("My Reciews:");
        myRev.setFont(tFont2);
        centerReview.add(myRev, BorderLayout.PAGE_START);
        
        f9.add(centerReview, BorderLayout.CENTER);
        
        
        
        
        //botton panel
        JPanel bottonPanel = new JPanel();
        FlowLayout flowBotton = new FlowLayout();
        f9.add(bottonPanel, BorderLayout.PAGE_END);
        bottonPanel.setLayout(flowBotton);
        JButton back4 = new JButton("Back");
        back4.addActionListener(controller);
        back4.setActionCommand("back4");
        bottonPanel.add(back4);
        
     }
}
