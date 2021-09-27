/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etude;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class Filiere implements Serializable {

    private String codeFiliere, nomFiliere;

    public Filiere() {
    }

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public void afficher() {
        System.out.println("Filière : ");
        System.out.println(" Code : " + this.codeFiliere + " / Nom : " + this.nomFiliere);
    }

}
