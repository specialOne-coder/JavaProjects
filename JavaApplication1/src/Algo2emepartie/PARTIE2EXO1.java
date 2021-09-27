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
public class PARTIE2EXO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int taille;
    int s=0;
    int max=0;
        System.out.println("veuiller entrer la taille du tableau");
        taille=Sc.nextInt();
        int tab1[]=new int[taille];
        for(int i=0;i<tab1.length;i++){
            System.out.println("Entrer les les valeurs du tableau : tab["+i+"]=");
            tab1[i]=Sc.nextInt();
        }
        System.out.println("VOICI la somme de ces valeurs");
        for(int i=0;i<tab1.length;i++){
        s+=tab1[i];
    }
        System.out.println(s);
        System.out.println("Voici la moyene:"+s/(taille));
    
    for(int i=0;i<tab1.length;i++){
      max=+tab1[i];
    }
        System.out.println("VOICI LA PLUS GRANDE VALEUR:"+max);
}
     }
   
   
   


