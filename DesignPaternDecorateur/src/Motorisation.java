/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public abstract class Motorisation{
    
    
    private Voiture bmw;
    private float massemoteur;
    private float forcemoteur;
    
    
    public float getMasse(){
        return this.massemoteur + this.bmw.getMasse();
    }
    
    public float getForcemoteur(){
        return this.forcemoteur;
    }
    
    public Voiture getBmw(){
        return this.bmw;
    }
    
    public Motorisation(Voiture voi){
        this.bmw = voi;
    }
    
    public Motorisation(float massemoteurr, float forcemoteurr, Voiture other){
      
        this.massemoteur = massemoteurr;
        this.forcemoteur = forcemoteurr;
        this.bmw = other;
    }
    
    public float getMassemoteur(){
       
           return this.massemoteur;
           
    }
    
   
    public float acceleration(){
        return this.forcemoteur/this.getMasse();
    }
    
    public float Distanceparcourue(float t){
        
        float a = this.acceleration();
        float d = (float) (0.5 *a*t*t) ;
        
        return d;
    }
    
    abstract public int prix();
    
    public String getModel(){
        
      return this.bmw.getNommodel();
        
    }
    
    
    
    
            
}
