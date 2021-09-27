/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpjava;

import java.util.Scanner;
import static javax.lang.model.type.TypeKind.INT;

/**
 *
 * @author user01
 */
public class Aleatoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     int tirage;
     int a,b;
        System.out.println("veuiller enter un nombre");
        a=Sc.nextInt();
        System.out.println("veuiller entrer un deuxieme nombre");
        b=Sc.nextInt();
        if(a<b){
            int mun;
             mun = a+(int) (Math.random()*(b-a+1));
            System.out.println( mun);
        }else{
            System.out.println("veuiller entrer un autre nombre");
        }
        
        
        
        
     
     
    }
    
}
