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
public class Balanciagatrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    String nom;
    String rep;
        System.out.println("VOULEZ VOUS ACHETEZ BALANCIAGA TRACK? ");
        rep=Sc.nextLine();
        while(!rep.equals("oui")&!rep.equals("non")){
            System.out.println("quoi? tu veux pas acheter et t'es venu ici pour faire quoi?");
        rep=Sc.nextLine();
        }
             if(rep.equals("oui")){
                 System.out.println("quel est ton nom");
                 nom=Sc.nextLine();
                 while(nom.equals("momo savage")){
                     System.out.println("Que ce que tu fais ici fils de pute vatant");
                     nom=Sc.nextLine();
                 }
                     if(!nom.equals("momo savage")){
                         System.out.println("soit le bienvenue dans mon magasin");
                     }
                 }
    }
}
        
        
    
    

