
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferdio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       
       
             Class.forName("com.mysql.jdbc.Driver");
             System.out.println("driver ok");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gmod","root","ferdio");
             System.out.println("connexion ok");
             
            
            
            
        
        
        
        
    }
    
}
