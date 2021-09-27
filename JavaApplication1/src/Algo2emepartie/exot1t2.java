/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algo2emepartie;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class exot1t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int taille;
    Scanner Sc=new Scanner(System.in);
        System.out.println("quel taille souhaitez vous pour votre tableau");
        taille=Sc.nextInt();
        float tab1[]=new float[taille];
    for(int i=0;i<tab1.length;i++){
        System.out.println(" entrer tab["+i+"]:");
        tab1[i]=Sc.nextFloat();
    }
    for(int i=0;i<tab1.length;i++){
        System.out.println(tab1[i]);
      
    }
    float tab2[]=new float[taille];
        System.out.println("Voici le tableau2");
    for(int i=0;i<tab2.length;i++){
        tab2[i]=tab1[i]*tab1[i];
         System.out.println(tab2[i]);
    }
        
    
    }
    
}
