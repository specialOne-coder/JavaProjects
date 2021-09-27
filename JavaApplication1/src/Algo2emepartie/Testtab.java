/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo2emepartie;

import java.util.Scanner;

/**
 *
 * @author ferdio
 */
public class Testtab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
    Scanner Sc=new Scanner (System.in);
    int taille;
    int somme = 0;
    int max = 0;
    double moyenne = 0;
    
        System.out.println("veuiller entrer la taille du tableau");
        taille=Sc.nextInt();
        int tab1[]=new int[taille];
        for(int i=0;i<tab1.length;i++){
            System.out.println("Entrer les les valeurs du tableau : tab["+i+"]=");
            tab1[i]=Sc.nextInt();
        }
        for(int j=0;j<taille;j++){
          somme += tab1[j];
           
        }
        System.out.println("VOICI la somme de ces valeurs");
        System.out.println(somme);
        
      for(int k=0;k<taille;k++){
        
        moyenne=somme/(taille);
      }
      
      System.out.println("VOICI la MOYENNE de ces valeurs");
      System.out.println(moyenne);
      
      for(int l=0;l<taille;l++){
          if(tab1[l]>tab1[l]){
             max = tab1[l];
          }else{
             max = tab1[l];
          }
      }
    System.out.println( "voici la plus grande valeur du tableau : "+max);
    }
    
}
