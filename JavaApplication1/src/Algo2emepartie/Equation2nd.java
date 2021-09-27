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
public class Equation2nd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc=new Scanner (System.in);
    int a;
    int b;
    int c;
    double g;
    int rep;
    double x1;
    double x2;
    
        System.out.println("veuiller entrer un coefficient a");
        a=Sc.nextInt();
        System.out.println("veuiller entrer un coefficient b");
        b=Sc.nextInt();
        System.out.println("veuiller entrer un coefficient c");
        c=Sc.nextInt();
        
           g=(b*b)-(4*a*c);
        x1 = ((-b)-(Math.sqrt(g)))/(2*a);
        x2 = ((-b)+(Math.sqrt(g)))/(2*a);
    
        
        if (g<0) {
            System.out.println("DISCRIMINANT < 0 donc rep="+0);
        }
        if(g>0){
           System.out.println("DISCRIMINANT > 0donc:x1="+x1+   ";x2="+x2);
        
        }
        int k;
        k=b/(2*a);
        if(g==0){
            System.out.println("DISCRIMINANT = 0 donc k=b/(2*a)="+k);
            
        }
            
        }
        }
            
        
     
                
        

   
    

