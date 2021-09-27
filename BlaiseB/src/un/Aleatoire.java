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
public class Aleatoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner saisie = new Scanner(System.in);
        int a = 1,b=1000;
        int al;
        al = a+(int) (Math.random()*(b-a+1));
        int choix = 0;
        char reponse = ' ';
        int nbreessai = 0;
        
        
        do{
           
            System.err.println(" Bienvenue ");
            System.out.println(" Devinnez le nombre caché Bonne chance");
        
        do{
            System.out.println(" Entrer votre nombre ");
           choix = saisie.nextInt();
           if(choix<al){
               System.err.println("nombre inferieur au nombre aleatoire Reessayer");
               
           }else if(choix>al){
               System.err.println(" nombre superieur au nombre aleatoire Reessayer");
               
               
           }else{
               System.err.println("Felicitations You are a genious");
           }
           
           saisie.nextLine();
           nbreessai++;
          
        }while(nbreessai<10);
        
         do{
             System.out.println("Vous avez atteint les 10 essais");
             System.out.println("Voulez vous continuez?O/N");
             
             reponse = saisie.nextLine().charAt(0);
             
           }while(reponse!='O' && reponse!='N');
       
        
        }while(reponse == 'O');
        System.out.println("Voici le nombre aleatoire "+al);
        
        
    }
    
}
