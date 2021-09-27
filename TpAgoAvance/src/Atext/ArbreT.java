/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atext;

/**
 *
 * @author ferdio
 */
public class ArbreT {
    
    private int racine;
    private ArbreT gauche;
    private ArbreT droit;

    public int getRacine() {
        return racine;
    }

    public ArbreT getSousArbreGauche() {
        return this.gauche;
    }

    public ArbreT getSousArbreDroit() {
        return this.droit;
    }

    public ArbreT(int racine) {
        this.racine = racine;

    }

    public ArbreT() {
    }

    public ArbreT(int racine, ArbreT gauche, ArbreT droit) {
        this.racine = racine;
        this.gauche = gauche;
        this.droit = droit;

    }
    
    public void inserer(int i){
        if(i<this.racine){
            if(this.gauche!= null){
                this.gauche.inserer(i);
            }else{
                this.gauche = new ArbreT(i);
            }
        }else if(i>this.racine){
            if(this.droit!= null){
                this.droit.inserer(i);
            }else{
                this.droit = new ArbreT(i);
            }
        }else{
                System.err.println("Insertion impossible ce nombre existe deja");
             }
    }
    
    public String afficher(String d){
        if(this.gauche!= null && this.droit!= null){
            return(this.racine +d+ this.gauche.afficher(d) + this.droit.afficher(d));
        }else if(this.gauche!= null){
            return (this.racine +d+ this.gauche.afficher(d));
        }else if(this.droit!= null){
            return (this.racine +d+ this.droit.afficher(d));
        }else{
            return this.racine+d ;
        }
    }   
    
    
}
