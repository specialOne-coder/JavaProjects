/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public abstract class Voiture {
    
    private String nommodel;
    private float masse;
    private int prix;
    
    abstract public int prix();    
    
    public float getMasse(){
        return this.masse;
    }
    
    
    public String getNommodel(){
        return this.nommodel;
    }
    
    public int getPrix(){
        return this.prix;
    }
    
   
    
    public String toString(){
        return"modele"+this.getNommodel()+"\n Prix"+this.getPrix();
    }
    
   
    
}
