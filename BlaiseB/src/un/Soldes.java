/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package un;

import java.util.Scanner;

/**
 *
 * @author ferdio
 */
public class Soldes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int prix;
        char rep = ' ';
        double reduc;
        
        System.out.println(" Bienvenue dans notre magasin");
        
        System.out.println(" Entrer le prix de votre article");
        
        prix = s.nextInt();
        
        System.out.println("Cet article est il en solde ? O/N");
        s.nextLine();
        do{
            rep = s.nextLine().charAt(0);
            System.err.println("La reponse ne doit pas différé de O et N ");
        }while(rep!= 'O' && rep!= 'N');
        
        if(rep == 'O'){
            reduc = ((prix * 50)/100);
            System.err.println("Le prix a payer est donc "+reduc);
        }else{
            System.err.println("Cet article n'est pas en solde");
        }
        
        
        
        
    }
    
}
