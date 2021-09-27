/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k;

import java.util.ArrayList;

/**
 *
 * @author ferdio
 */
public class Bank {
    
    private ArrayList<Client> client;
    private Client c;
    private int solde;
    private String nom;
    
    
    public Bank(){
        
    }

    public Bank( int solde, String nom) {
        this.solde = solde;
        this.nom = nom;
    }
   
    public ArrayList<Client> getClient(){
        return this.client;
    }
    public ArrayList<Client> setClient(ArrayList<Client> nclient){
       return this.client = nclient;
    }
    
    public int getSolde(){
        return this.solde;
    } 
    public int setSolde(int nsolde){
        return this.solde = nsolde;
    }
    public String getNom(){
        return this.nom;
    }
    public String setNom(String nnom){
        return this.nom = nnom;
    }
   
    public void inscription(Client o){
        
        ArrayList listeC = new ArrayList<Client>();
        listeC.add(o);
        System.out.println("Vous venez d'inscire "+o.getNom()+" a Ecobank merci");

    }
    
//    public ArrayList<Client> liste(){
//       
//      
//        
//    }
    
    
    
    
    
    
    
    
    
    
    
}
