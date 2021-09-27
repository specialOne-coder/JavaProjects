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
public class Client {
    
     private ArrayList<Bank> ba;
     private String nom;
     private int id;
     private String prenom;
     private int solde;

    public Client(int id,String nom, String prenom, int solde) {
        this.nom = nom;
        this.id = id;
        this.prenom = prenom;
        this.solde = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getSolde() {
        return solde;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    
    
     public void inscription(Bank a){
        ArrayList listeBank = new ArrayList<Bank>();
        listeBank.add(a);
         System.err.println("Vous venez de choisir "+a.getNom()+" comme Banque veuillez procedez a l'inscription");
         System.out.println("Leur chiffre d'affaire est de "+a.getSolde()+"  merci");

     }
    
    public String depot(int argent){
        this.solde+=argent;
        System.out.println("Vous venez de Crediter votre compte de "+argent+"FCFA");
        return "Votre nouveau solde est de :"+this.solde;
      
    }
            
    public String retrait(int argent){
        this.solde-= argent;
        System.out.println("Vous venez de debiter votre compte de "+argent+"FCFA");
        return "Votre nouveau solde est de :"+this.solde;
    }
    
    
    
}
