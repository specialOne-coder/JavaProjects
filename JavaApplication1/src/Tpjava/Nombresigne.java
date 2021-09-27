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
public class Nombresigne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int nombre;
        System.out.println("veuiller entrer un nombre");
        nombre= Sc.nextInt();
        if (nombre>0) {
            System.out.println("le nombre est positif");
        }
        if(nombre<0){
            System.out.println("le nombre est negatif");
        }
        if(nombre==0){
            System.out.println("ce nombre est nul");
    }
    }
}
