/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author ferdio
 */
public class BaseTest {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        Connection c = null;
         try{
         System.out.println("Chargement des diveres....");
         Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok!!!");
            c = DriverManager.getConnection("mariadb:jdbc://127.0.0.1:3306/javatest", "ferdo", "");
             System.out.println("Ouaah la connection a reussie");
        }catch (Exception e){
            e.printStackTrace();
        }
   }
    
}
