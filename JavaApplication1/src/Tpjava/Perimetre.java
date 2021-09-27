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
public class Perimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
      int longeur;
      int largeur;
      double perimetre;
        System.out.println("veuiller entrer la longeur du rectangle");
        longeur=Sc.nextInt();
        System.out.println("veuiller entrer la largeur de votre rectangle");
        largeur=Sc.nextInt();
        System.out.println("le perimetre est:" +((longeur) + (largeur)) *2           );
        
        
    }
    
}
