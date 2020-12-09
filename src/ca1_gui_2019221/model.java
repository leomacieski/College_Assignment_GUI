/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_gui_2019221;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leojk
 */
public class model {

    //customer
    public boolean login(userlogin userlogin){
        boolean result = false;
            try{
            String dbServer = "jdbc:mysql://52.50.23.197:3306/Leo_2019221?useSSL=false";
            String user = "Leo_2019221";
            String password = "2019221";
            String query = "SELECT * FROM customer WHERE email = '" + userlogin.getemail() + "' AND password = '" + userlogin.getPw() + "';";
            
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                result = true;
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            
                while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    
    //hairdresser
        public boolean hairdresser(userlogin userlogin){
        boolean result = false;
            try{
            String dbServer = "jdbc:mysql://52.50.23.197:3306/Leo_2019221?useSSL=false";
            String user = "Leo_2019221";
            String password = "2019221";
            String query = "SELECT * FROM hairdresser WHERE email = '" + userlogin.getemail() + "' AND password = '" + userlogin.getPw() + "';";
            
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                result = true;
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            
                while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
}
        public boolean registrationc(userlogin userlogin){
        boolean result = false;
            try{
            String dbServer = "jdbc:mysql://52.50.23.197:3306/Leo_2019221?useSSL=false";
            String user = "Leo_2019221";
            String password = "2019221";
            String query = "INSERT INTO customer (name, surname, email, phone, password)"+ "VALUES('"+userlogin.getname()+ "','"+userlogin.getsurname()+"','"+userlogin.getemailreg()+"','"+userlogin.getphone()+"','"+userlogin.getpassword()+"');";
            
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            int reg = stmt.executeUpdate(query);
            
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            
                while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
        }  
        
        public boolean registrationh(userlogin userlogin){
        boolean result = false;
            try{
            String dbServer = "jdbc:mysql://52.50.23.197:3306/Leo_2019221?useSSL=false";
            String user = "Leo_2019221";
            String password = "2019221";
            String query = "INSERT INTO hairdresser (name, surname, email, phone, password, location)"+ "VALUES('"+userlogin.getname()+ "','"+userlogin.getsurname()+"','"+userlogin.getemailreg()+"','"+userlogin.getphone()+"','"+userlogin.getpassword()+"','"+userlogin.getloc()+");";
            
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            int reg = stmt.executeUpdate(query);
            
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            
                while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
}
}
