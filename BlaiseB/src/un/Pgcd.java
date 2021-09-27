/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package un;

import java.util.Scanner;

/**
 *
 * @author ferdio
 */
public class Pgcd {
    
    
    public static int PGCD(int a,int b){
        while(a != b){
            if(a<b){
                b= b-a;
            }else{
                a = a - b;
            }
        }
        return a;
    }
     
    
    public static void main(String[] args) {
        
        int a,b;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Entrer a");
        a = sc.nextInt();
        System.out.println("Entrer b");
        b = sc.nextInt();
        int pgcd = PGCD(a, b);
        System.err.println("Voici le pgcd de "+a+" et "+b+" : "+pgcd);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
