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
public class Plusgrand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc= new Scanner(System.in);
    int nbre1;
    int nbre2;
    int nbre3;
        System.out.println("veuiller entrer le nombre 1");
        nbre1= Sc.nextInt();
        System.out.println("veuiler entrer le nonmbre 2");
        nbre2=Sc.nextInt();
        System.out.println("veuiller entrer le nombre 3");
        nbre3=Sc.nextInt();
        if(nbre1>nbre2&nbre1>nbre3){
            System.out.println("le plus grand nombre est:"+nbre1);
        }
        if(nbre2>nbre1&nbre2>nbre3){
            System.out.println("le plus grand nombre est:"+nbre2);
        }
        if(nbre3>nbre1&nbre3>nbre2){
            System.out.println("le plus grand nbre est:"+nbre3);
        }
        
    }
    
}
