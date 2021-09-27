/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k;

/**
 *
 * @author ferdio
 */
public class Banque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Bank ecobank = new Bank( 500000000, "Ecobank");
        
        
        Client at = new Client(0,"ATTIVI", "ferdinand", 0);
        
        //at.inscription(at);
        
        /*at.depot(100000);
        System.err.println(""+at.getSolde());
        at.retrait(20000);
        System.err.println(""+at.getSolde());*/

      //  ecoBank.inscription(at);
        
        at.inscription(ecobank);
        
    }
    
}
