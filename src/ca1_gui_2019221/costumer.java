/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author leojk
 */
public class costumer extends JFrame {
    
public costumer(){
    
    JFrame f3 = new JFrame();
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
        topPanel.add(logout);
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
        rightCenter.add(search);
        
        center.add(rightCenter);
    

    
    
    
}
    
}
