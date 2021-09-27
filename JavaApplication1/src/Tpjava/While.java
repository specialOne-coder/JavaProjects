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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    int nombre;
        System.out.println("veuiller entrer un nombtre compris entre 1 ET 3");
        nombre=Sc.nextInt();
        while(nombre<1||nombre>3){
            System.out.println("le nombre ne convient pas");
        System.out.println("veuiller encore entrer un nombre");
        nombre=Sc.nextInt();
        }
    }
}
       