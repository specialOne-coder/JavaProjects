/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpjava;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class Depense {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int depense_effectue;
    int depense_total;
    int benefice;
        System.out.println("veuiller entrer votre depense effectue");
        depense_effectue=Sc.nextInt();
        System.out.println("veuiller entrer votre depense total");
        depense_total=Sc.nextInt();
        System.out.println("voici votre benefice"); 
        System.out.println("depense_total-depense effectue");
    }
    
}
