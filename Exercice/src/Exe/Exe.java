/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exe;

import java.util.Scanner;

/**
 *
 * @author Ferdinand
 */
public class Exe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int j=0;
//        for(int i=0; i<10;i++){
//            j+=i;
//            System.out.println(j);
//        }
//       int n;
//       int j=0;
//       Scanner nbre = new Scanner(System.in);
//              n = nbre.nextInt();
//        for (int i=1;i<=n; i++){
//            j= j+i;
//            
//        }
//        System.out.println(" La somme des "+n+ " Premiers nbres est:" +j  );

         
        Compte ta = new Compte(100000);
        //ta.Deposer(50000);
        //ta.Affi();
        ta.Retirer(70000);
        ta.Affi();









    }
    
}
