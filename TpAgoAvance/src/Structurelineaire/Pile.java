/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurelineaire;

/**
 *
 * @author Administrateur
 */
public class Pile {
    private Liste L;

    public Pile(){
        L = null;
    }
    
    public boolean vide(){
        return (this.L == null);
    }
    
    public void Empiler(Object O){
        this.L = new Liste(O, this.L);
       
    }
        
    public Object Depiler() {
        if (this.vide()){
            return null;
        }
        else{
                Object O = this.L.tete();
                this.L = this.L.queue();
                return O;
                }
    }
    
     public void Afficher(){
         Pile LaPile = new Pile();
         LaPile.L = this.L;
         while (LaPile.vide())
             System.err.println(LaPile.Depiler());
     }
    
    
}
