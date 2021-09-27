/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ferdinand
 */
public class Examen {
    
   
    
private static Connection con;
Statement stmt;
public static Connection seConnecter(){
    try{
        
        String url="jdbc:mysql://localhost:3306/test"; 
        String user="root";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
         System.out.println("Connexion a la base de donnee");
        return con;
        
      }catch(Exception e){
           return null;
}
  
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        try{
         System.out.println("Chargement des diveres....");
         Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok!!!");
            String user="root";
            String url="jdbc:mysql://localhost:3306/ajax";
            String password="ferdio";
            Connection co = DriverManager.getConnection(url, user, password);
            System.out.println("Connection ok!!");
            
            
    }catch (Exception e){
    e.printStackTrace();
    }
    
}
}
