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
public class Prixarticle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Screp=new Scanner(System.in);
        Scanner Scprix=new Scanner (System.in);
    int prix;
    String rep;
        System.out.println(" veuiller entrer le prix de l'article");
        prix=Scprix.nextInt();
        System.out.println("cet article est il en solde");
        rep=Screp.nextLine();
        if(rep.equals("oui")){
            System.out.println(+(prix)/2);
        }
        }
    }
    

