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
public class DEVOIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int taille;
    int sum=4;
        System.out.println("Veuiller entrer la taille de votre tableau");
        taille=Sc.nextInt();
        int tab1[]=new int[taille];
        for(int i=0;i<tab1.length;i++){
          int mun;
          mun=taille+(int) (Math.random()*(taille+1));
            System.out.println(mun);
        
        }
        
           for(int i=0;i<tab1.length;i++){
        System.out.println("VOICI LA SOMME DE VOS NBRES ALEATOIRES");
        sum +=tab1[i];
               System.out.println(sum);
        
        
    }
    }      
    }
    

