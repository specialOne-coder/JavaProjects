/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diction;

/**
 *
 * @author root
 */
public class list {
    private Object valeur;
    private list suivant;
    
    public list (Object premier, list reste){
        this.valeur = premier;
        this.suivant = reste;
        
    }

    public list() {
        
    }
    
    public Object tete(){
        return (this.valeur);
    }
    
    public list queue(){
        return (this.suivant);
    }
    
    public void Afficher(){
        list p = this;
        while ( p != null ){
            System.err.print( p.tete()+( p.queue() != null ? "-->":"\n"));
            p = p.queue();
        }
        
    }
    
    
    public  boolean vide(){
        if (this.tete() == null ) return true;
        else
                {
            return false;
        }
    }
       
    public list insererEntete(Object x){
        list p = new list(x , this);
        return p;
    }
    
    

}
