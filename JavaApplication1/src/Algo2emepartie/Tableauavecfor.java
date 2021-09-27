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
public class Tableauavecfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    float tab[]=new float[10];
    for(int i=0;i<tab.length;i++){
        System.out.println("entrer tab["+i+"]:");
        tab[i]=Sc.nextFloat();
    }
    for(int i=0;i<tab.length;i++){
        System.out.println(tab[i]);
    }
    }
    
}
