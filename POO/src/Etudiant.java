

import java.io.Serializable;


/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferdinand ATTIVI
 */
public class Etudiant extends Enseignant implements Serializable{
    private String nomEtd;
    private String prenomEtd;
    private String sexeEtd;
    private int ageEtd;
    private int telEtd;
    private int anneeNaissEtd;

    public String getNomEtd() {
        return nomEtd;
    }

    public void setNomEtd(String nomEtd) {
        this.nomEtd = nomEtd;
    }

    public String getPrenomEtd() {
        return prenomEtd;
    }

    public void setPrenomEtd(String prenomEtd) {
        this.prenomEtd = prenomEtd;
    }

    public String getSexeEtd() {
        return sexeEtd;
    }

    public void setSexeEtd(String sexeEtd) {
        this.sexeEtd = sexeEtd;
    }

    public int getAgeEtd() {
        return ageEtd;
    }

    public void setAgeEtd(int ageEtd) {
        this.ageEtd = ageEtd;
    }

    public int getTelEtd() {
        return telEtd;
    }

    public void setTelEtd(int telEtd) {
        this.telEtd = telEtd;
    }

    public int getAnneeNaissEtd() {
        return anneeNaissEtd;
    }

    public void setAnneeNaissEtd(int anneeNaissEtd) {
        this.anneeNaissEtd = anneeNaissEtd;
    }

    public Etudiant() {
    }
    

    public Etudiant(String nomEtd, String prenomEtd, String sexeEtd, int ageEtd, int telEtd, int anneeNaissEtd) {
        this.nomEtd = nomEtd;
        this.prenomEtd = prenomEtd;
        this.sexeEtd = sexeEtd;
        this.ageEtd = ageEtd;
        this.telEtd = telEtd;
        this.anneeNaissEtd = anneeNaissEtd;
    }
    
    
    public int longueurChaine(String laChaine){
        int longueur =laChaine.length();
        return longueur;
    }
    
    
    
    
    
    }
  
 

