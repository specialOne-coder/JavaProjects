/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algo2emepartie;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class tableauadeuxD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int l,c;
    Scanner Sc=new Scanner (System.in);
        System.out.println("NOMBRES DE LIGNES");
        l=Sc.nextInt();
        System.out.println("NOMBRES DE COLONNES");
        c=Sc.nextInt();
        int tab[][]=new int[l][c];
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                tab[i][j]=i+j;
        
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.print(tab[i][j]);
                
            }
        }
    }
    
}
