/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpjava;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class Facebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    String email;
    String motdepasse;
        System.out.println("veuiller entrer votre email");
        email=Sc.nextLine();
        while(!email.equals("******@gmail.com")){
            System.out.println("email incorrect veuiller retaper correctement votre email");
            email=Sc.nextLine();
        }
        if(email.equals("@gmail.com")){
            System.out.println("cool veuiller enter votre mot de passe");  
            motdepasse=Sc.nextLine();
            System.out.println("bienvenue sur facebbok");
            
            
        }
    
    }
    
}
