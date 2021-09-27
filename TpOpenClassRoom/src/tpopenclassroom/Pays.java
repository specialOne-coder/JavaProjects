/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpopenclassroom;

/**
 *
 * @author ferdio
 */
public class Pays {
    
    private String nom;
    private int nbreH;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbreH() {
        return nbreH;
    }

    public void setNbreH(int nbreH) {
        this.nbreH = nbreH;
    }

    public Pays(String nom, int nbreH) {
        this.nom = nom;
        this.nbreH = nbreH;
    }
    
    
    
}
