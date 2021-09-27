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
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    String g;
    int taille;
        System.out.println("entrer votre chaine de caractere");
        g=Sc.nextLine();
        taille=g.length();
        char tab2[]=new char[taille];
        for(int i=0;i<tab2.length;i++){
       char caractere=g.charAt(i);
        tab2[i]=caractere;
        }
       for(int i=0;i<tab2.length;i++){
           System.out.println(tab2[i]);
            
            
        
    }
    
}
}
