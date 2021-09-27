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
public class Vie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     String rep;
        System.out.println("croyez vous qu'en fesant le buzz, en fesant des sorties ça amene quelque part?");
        rep=Sc.nextLine();
        while(rep.equals("oui")){
            System.out.println("etes vous sur? veuiller bien reflechir");
            rep=Sc.nextLine();
            if(rep.equals("non")){
                System.out.println("oui vous avez raison ça amene nul part");
            }
        }
    }
    
}
