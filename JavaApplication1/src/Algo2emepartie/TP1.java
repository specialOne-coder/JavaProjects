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
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int taille;
    Scanner Sc=new Scanner(System.in);
        System.out.println("quel taille souhaitez vous pour votre tableau");
        Scanner Sctaille=new Scanner(System.in);
        taille=Sctaille.nextInt();
         String tab1[]=new String [taille];
    for(int i=0;i<tab1.length;i++){
        System.out.println(" entrer tab["+i+"]:");
        tab1[i]=Sc.nextLine();
    }
    for(int i=0;i<tab1.length;i++){
        System.out.println(tab1[i]);
     }
        
    }
    }
    

