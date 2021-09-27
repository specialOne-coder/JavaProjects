/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exep;

import java.util.Hashtable;

/**
 *
 * @author root
 */
public class Exep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
       
          Dico tr = new Dico("plane : avion");
          
          tr.ajouter("ferdi : fre", tr);
          
         
         System.out.println( tr.toString(""));
         
         System.out.println(tr.rechercher("ferdi : fre"));
         
        
    }
    
}
