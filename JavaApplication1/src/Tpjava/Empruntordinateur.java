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
public class Empruntordinateur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc = new Scanner (System.in);
    String code;
    int choix;
    String choixordinateur;
        System.out.println("bienvenue chez ferdinand");
        System.out.println(" veuller entrer *emprunt#");
        code= Sc.nextLine();
            if(code.equals("*emprunt#")){
                System.out.println("1: EMPRUNT D'ORDINATEUR");
                System.out.println("2:EMPRUNT DE PORTABLE");
                System.out.println("3:EMPRUNT DE MOUTIQUE");
                System.out.println("veuller faire votre choix");
                choix=Sc.nextInt();
                System.out.println("vous venez de preter veuiller le rendre avant la date retour");
                while(choix<1||choix>3){
                    System.out.println("choix incorrect veuiller faire un autre choix");
                    choix=Sc.nextInt();
                }
                } else{
                }
                        }          
    }

        
       
      
    
    

