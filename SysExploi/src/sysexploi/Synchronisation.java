/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysexploi;

import static java.time.Instant.MAX;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Ferdinand
 */
public class Synchronisation {
    private int boite[];
    private int taille=10;
    private int max =10;

    public Synchronisation() {
    }

    public Synchronisation(int[] boite,int taille,int max) {
        this.boite = new int [taille];
        this.taille= taille;
        this.max = max;
    }

    public int[] getBoite() {
        return boite;
    }

    public int getTaille() {
        return taille;
    }

    public int getMax() {
        return max;
    }
    
    
    
    public void produire(int c){
      while(taille == max){
             ;
          }
     
       boite[taille] = c;
              taille++;  
    
    }
        
    public void consommer(int c){
        while(taille== 0){
            
        }
        boite[taille]-- ;
        taille--;
        
        
    }
     
    public static void main(String[] args) {
       
        Synchronisation hi = new Synchronisation();
        hi.taille =0;
        hi.boite = new int[hi.max];
        
                hi.produire(5);
                hi.produire(4);
                hi.produire(8);
                hi.produire(9);
                hi.produire(2);
        
        
        
        for(int i=0; i<hi.max;i++){
        hi.produire(i);
        System.out.println(hi.boite[i]);
              
        }
    }
        
           
        
        
        
    }
            
           
        
      
       
       
        
       
    
   
    
            
        

        
        

    
    
    
    
    
    
    

