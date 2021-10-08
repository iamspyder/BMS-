package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");  
            System.out.println("driver loaded connection done1");
            s =c.createStatement();   
        }catch(Exception e){ 
            System.out.println(e);
        }  
    } 
    public static void main(String[]args){
        new Conn();
    }
}  