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
public class Foire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    String nom;
        System.out.println("qui est le plus grand a la foire?");
        nom=Sc.nextLine();
        if(nom.equals("matik like")){
            System.out.println("ahan ndakpe");
        }else{
            System.out.println("eboaaaa yira");
        }
    }
    
}
