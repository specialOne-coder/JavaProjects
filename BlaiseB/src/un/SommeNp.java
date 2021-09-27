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
public class SommeNp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sa = new Scanner(System.in);
        
        int nbre;
        int somme = 0; 
        
        System.out.println("Bonjour veuillez entrer votre nombre");
        nbre = sa.nextInt();
     
        for(int i = 1;i<nbre+1;i++){
           somme +=i;
           
        }
        
        System.err.println("la somme des nombres de  1 a "+nbre+ " est "  +   somme);
        
      
        
    }
    
}
