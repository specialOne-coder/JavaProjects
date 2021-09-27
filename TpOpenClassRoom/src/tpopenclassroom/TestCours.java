/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpopenclassroom;

import java.util.Scanner;

/**
 *
 * @author ferdio
 */
public class TestCours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int tail;
        
        System.out.println("ligne");
        int l = sc.nextInt();
        System.out.println("colonne");
        int c = sc.nextInt();
        int tab[][] = new int[l][c];
        
        for(int i=0;i<l;i++){
            for(int p=0;p<c;p++){
            System.err.println("entrer"+i+p);
            tab[i][p] = sc.nextInt();
           
            }
        }
        for(int x=0;x<l;x++){
            for(int y = 0;y<c;y++){
                   System.err.println("Voila"+tab[x][y]);

            }
        }
        
       String tab2[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};
 
for(String str[] : tab2)
{
 	for(String str2 : str)
 	{
     	System.out.println("La valeur est  = " + str2);
 	}
 
}
        
        
        
        
        
        
        
    }
    
}
