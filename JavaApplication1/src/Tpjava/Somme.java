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
public class Somme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int nombre;
    
        System.out.println("veuiller entrer un nombre");
        nombre=Sc.nextInt();
        System.out.println("voici la somme des nombres jusqu'a votre nom");
        for(int i=0;i<nombre+1;i++){
            System.out.println(nombre+"+"+(i)+ "=" +(nombre+i));
        }
    }
    
}
