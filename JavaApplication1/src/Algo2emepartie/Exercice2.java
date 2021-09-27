/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo2emepartie;

import java.util.Scanner;

/**
 *
 * @author ferdinand ATTIVI
 */
public class Exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     long i,b=1;
     int a;
     Scanner lectureClavier=new Scanner (System.in);
        System.out.println("entrer un entier");
        a=lectureClavier.nextInt();
        for(i=2;i<=a;i++){
          b=b+i;     
        }
        System.out.println(b);
    }
    
}
