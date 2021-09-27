/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmod;


import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.JDBCType;

/**
 *
 * @author ferdinand ATTIVI
 */
public class MyConnection {
    
private static Connection con;
Statement stmt;
public static Connection seConnecter(){
    try{
     
       String url="jdbc:mysql://localhost:3306/gmod"; 
        String user="root";
        String password="ferdio";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url, user, password);
         System.out.println("Cuon ne gnie");
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
            String url="jdbc:mysql://localhost:3306/tp_sdzee";
            String password="ferdio";
            Connection co = DriverManager.getConnection(url, user, password);
            System.out.println("Connection ok!!");
            Statement stmt=null;
            stmt=co.createStatement();
            ResultSet rs =null;
            rs=stmt.executeQuery("select * from administrateur");
            int i=1;
            while(rs.next()){
                System.out.println("Donnee N°"+i);
                System.out.println("ID="+rs.getObject(1));
                System.out.println("Nom :"+rs.getObject(2));
                System.out.println("Code:"+rs.getObject(3));
                i++;
            }
            /*
            int res;
            
            String requete="insert into filiere values(5,'Sil','mg')";
            res =stmt.executeUpdate(requete)   ;
            if(res>0){
                JOptionPane.showMessageDialog(null,"Enregistrement effectué","Success",JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(null,"Echec","enregistrement non effectué",JOptionPane.ERROR_MESSAGE);
            }
*/
    }catch (Exception e){
    e.printStackTrace();
}
   
    }
}

      













