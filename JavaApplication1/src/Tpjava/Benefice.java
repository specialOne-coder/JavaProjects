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
public class Benefice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc= new Scanner (System.in);
    int totaldepense;
    int totalvente;
        System.out.println("veuiller entrer votre depense totale de la journee");
        totaldepense=Sc.nextInt();
        System.out.println("veuiller entrer le total de tout ce que vous avez vendu dans la journee");
        totalvente=Sc.nextInt();
        System.out.println("votre benefice est:"+((totalvente)-(totaldepense)));
    }
    
}
