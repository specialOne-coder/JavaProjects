/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graventp;

/**
 *
 * @author ferdio
 */
public class Jouet {
    
    private int prix;
    private String nom;
    private int promotion;
    private String description;
    
    
    public Jouet(String nom,int prix,String description,int promo){
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.promotion = 0;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getPrix(){
        return prix;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getPromo(){
        return promotion;
    }
    
    
    
}
