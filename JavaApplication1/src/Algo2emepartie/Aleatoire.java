/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algo2emepartie;

import java.util.Random;
import java.util.Scanner;

/**
/**
 *
 * @author user01
 */
public class Aleatoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     int tirage;
     int a = 1;
     int b = 1000;
        System.out.println("Choisissez un nombre entre 1 et 1000");
        System.err.println("-------------------------------------");
        
        System.out.println("veuiller enter un nombre");
        a=Sc.nextInt();
        System.out.println("veuiller entrer un deuxieme nombre");
        b=Sc.nextInt();
        if(a<b){
            int mun;
            Random rd = new Random();
            rd.doubles(1000);
             //mun =a+(int) (Math.random()*(b-a+1));
             System.out.println(rd);
        }else{
            System.out.println("veuiller entrer un autre nombre");
        }
        
        
        
        
     
     
    }
    
}
