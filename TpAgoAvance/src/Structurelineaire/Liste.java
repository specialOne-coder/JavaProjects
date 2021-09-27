/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurelineaire;

import java.awt.List;

/**
 *
 * @author Administrateur
 */
public class Liste {

    private Object valeur;
    private Liste suivant;
    
    public Liste (Object premier, Liste reste){
        this.valeur = premier;
        this.suivant = reste;
        
    }

    public Liste() {
        
    }
    
    public Object tete(){
        return (this.valeur);
    }
    
    public Liste queue(){
        return (this.suivant);
    }
    
    public void Afficher(){
        Liste p = this;
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
       
    public Liste insererEntete(Object x){
        Liste p = new Liste(x , this);
        return p;
    }

    
    }
