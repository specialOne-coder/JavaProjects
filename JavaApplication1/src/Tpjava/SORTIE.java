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
public class SORTIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
    String nom;
    String rep;
        System.out.println("entrer le nom de celui que vous vouliez");
        nom= Sc.nextLine();
        if(nom.equals("ferdinand")){
            System.out.println("tout ce que ferdinand veut c'est sortir voulez vous lui donner l'autorisation?");
            rep=Sc.nextLine();
            if (rep.equals("oui")){
                System.out.println("coool il sera tres heureux merci beaucoup");
            }else{
                System.out.println("decu ferdinand est faché contre vous");
            }
        }else{
            System.out.println("va t'en on ne parle que de ferdinand ici");
            
            
        }
    }
    
}
