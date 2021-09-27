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
public class Sommenombresuivant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int nombre;
    String rep;
        System.out.println("veuiller entrer un nombre");
        nombre=Sc.nextInt();
        for(int i=nombre; i<nombre+1;i++){
            System.out.println((nombre)+ "+"+(nombre+1)+"=" +(nombre+nombre+1));
        }
            System.out.println("voulez vous continuer");
            }
    
        }
    


