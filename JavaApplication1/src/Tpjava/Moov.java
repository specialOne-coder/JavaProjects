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
public class Moov {
    private static boolean codeequal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    String code;
    int choix;
        System.out.println("Bienvenue a togocel");
        System.out.println("entrer *145#");
        code=Sc.nextLine();
        if (code.equals("*145#")) {
           System.out.println("1:transfert"); 
           System.out.println("2:achat");
            System.out.println("3:paiement marchant");
            System.out.println("4:votre comte");
            System.out.println("5:retrait");
            System.out.println("6: compte");
            System.out.println("7:ma banque en ligne");
            System.out.println("entrer votre choix");
            choix=Sc.nextInt();
            while(choix<1||choix>8){
                System.out.println("saisie incorrect veuiller ressaisir");   
             choix=Sc.nextInt();
            }
        } else {
            System.out.println("probleme de connexion");
            if (code.equals("*400#")) {
                System.out.println("1:compatibilite 4g");
                System.out.println("2:forfait haut debit");
                System.out.println("3:option haut debit");
                System.out.println("4:solde");
                System.out.println("entrer votre choix");
                choix=Sc.nextInt();
                while(choix<1||choix>4){
                    System.out.println("saisie incorrect veuiller ressaisir");
                    choix=Sc.nextInt();
                }
            } else{
                System.out.println("erreur");
                }
                                
                            }
                            
                }
}
    

