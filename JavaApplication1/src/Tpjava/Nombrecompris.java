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
public class Nombrecompris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
     int nombre;
        System.out.println("veuiller entrer un nombre compris entre 10 et 20");
        nombre = Sc.nextInt();
            if (nombre<10) {
                System.out.println("plus grand!");
            }
             if (nombre>20){
                System.out.println("plus petit!");
    }
    
}
    }
      