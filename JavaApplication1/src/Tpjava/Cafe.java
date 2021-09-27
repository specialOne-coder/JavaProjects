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
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    String rep;
    
        System.out.println("voulez vous un cafe");
        rep=Sc.nextLine();
     if(rep.equals("oui")){
        System.out.println("saisie accepte");
     }
     while(rep.equals("non")){
        System.out.println("saisie incorrect saisisser encore");
        rep=Sc.nextLine();
    }
    }  
}
