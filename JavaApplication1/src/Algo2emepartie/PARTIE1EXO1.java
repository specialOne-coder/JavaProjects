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
public class PARTIE1EXO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int a=1;
    int b=1000;
    int choix2;
    int choix;
    int entier;
    int mun;
    mun=a+(int) (Math.random()*(a+b-1));
        System.out.println("entrer votre choix bonne chance");
        choix=Sc.nextInt();
        for(int i=1;i<10;i++){
        if(choix<mun){
            System.out.println("votre nombre est inferieur au nombre caché");
            choix=Sc.nextInt();
        }else{
            System.out.println("votre nombre est superieure au nombre caché");
            choix=Sc.nextInt();
        }
        if(choix==mun){
            System.out.println("Vous avez gagné vous etes un genie");
        }  
        }
        System.out.println("BONNE CHANCE POUR LA PROCHAINE PARTIE! VOUS N'AVEZ PAS PU REUSSIR VOULEZ VOUS CONTINUER?");
        choix2=Sc.nextInt();
        for(int i=0;i<10;i++){
        while(choix!=mun){
            System.out.println("toujours desole pour vous merci de continuer");
          choix2=Sc.nextInt(); 
        }
                }
            
        
        
    
    
    
    }
    }
    

