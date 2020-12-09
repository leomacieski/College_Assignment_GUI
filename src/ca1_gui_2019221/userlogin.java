/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

/**
 *
 * @author leojk
 */
public class userlogin {
    private String pw;
    private String email;
    
    private String name;
    private String surname;
    private String emailreg;
    private String phone;
    private String password;
    
    private String loc;
    
    public userlogin(String email, String pw){
        this.email = email;
        this.pw = pw;
    }

    public String getemail() {
        return email;
    }

    public String getPw() {
        return pw;
    }
    
    public userlogin(String name, String surname, String emailreg, String phone, String password){
        this.name = name;
        this.surname = surname;
        this.emailreg = emailreg;
        this.phone = phone;
        this.password = password;
    }
    public userlogin(String name, String surname, String emailreg, String phone, String password, String loc){
        this.name = name;
        this.surname = surname;
        this.emailreg = emailreg;
        this.phone = phone;
        this.password = password;
        this.loc= loc;
    }
    
    public String getname(){
        return name;
    }
    
        public String getsurname(){
        return surname;
    }
    
        public String getemailreg(){
        return emailreg;
    }
    
        public String getphone(){
        return phone;
    }
    
        public String getpassword(){
        return password;
    }
    
        public String getloc(){
        return loc;
}
        
        
        
        
        
        
        
}
