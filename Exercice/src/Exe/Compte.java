/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exe;

import javax.swing.JOptionPane;

/**
 *
 * @author Ferdinand
 */
public class Compte {
    private double solde;
    
    
       public Compte(double sol){
       this.solde=sol;
       }

        public void Deposer(double ar){
       
        solde +=ar;
      //  System.out.println("Votre nouveau compte est solde de" +solde);
        
        }
         public void Retirer(double ar){
        
        solde = solde - ar;
        
       }
    public void Affi(){
        System.out.println("Votre nouveau solde est de : "+solde);
    }  
    
    
}
