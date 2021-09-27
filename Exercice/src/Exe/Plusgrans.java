/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exe;

import java.util.Scanner;

/**
 *
 * @author Ferdinand
 */
public class Plusgrans {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
          Scanner sai = new Scanner(System.in);
       int nbre1, nbre2;
       System.out.println("Veuillez Saisir Deux Nbres");
       System.out.println("Le peremier Svp");
//         
        nbre1= sai.nextInt();
//        System.out.println("Le deuxieme Svp");
//        nbre2= sai.nextInt();
       int pi = nbre1%2;
        if(pi == 0){
            System.out.println("Le nbre "+nbre1+" est pair");
        }else{
            System.out.println("Le nbre "+nbre1+" est impair");
//        }
//        System.err.println("Le plus grand est:"+Math.max(nbre1, nbre2));
        
    

    }
    
}
}
