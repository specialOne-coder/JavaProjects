/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferdinand ATTIVI
 */
public class Enseignant {
    private int codeEns;
    private String nomEns;
    private String prenomEns;
    private String SpecialiteEns;
    private String sexeEns;
    private int datePriseEns;
    private int dateNaissEns;
    private boolean permanent;

    
    public int getCodeEns() {
        return codeEns;
    }

    public void setCodeEns(int codeEns) {
        this.codeEns = codeEns;
    }

    public String getNomEns() {
        return nomEns;
    }

    public void setNomEns(String nomEns) {
        this.nomEns = nomEns;
    }

    public String getPrenomEns() {
        return prenomEns;
    }

    public void setPrenomEns(String prenomEns) {
        this.prenomEns = prenomEns;
    }

    public String getSpecialiteEns() {
        return SpecialiteEns;
    }

    public void setSpecialiteEns(String SpecialiteEns) {
        this.SpecialiteEns = SpecialiteEns;
    }

    public String getSexeEns() {
        return sexeEns;
    }

    public void setSexeEns(String sexeEns) {
        this.sexeEns = sexeEns;
    }

    public int getDatePriseEns() {
        return datePriseEns;
    }

    public void setDatePriseEns(int datePriseEns) {
        this.datePriseEns = datePriseEns;
    }

    public int getDateNaissEns() {
        return dateNaissEns;
    }

    public void setDateNaissEns(int dateNaissEns) {
        this.dateNaissEns = dateNaissEns;
    }
    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Enseignant(int codeEns, String nomEns, String prenomEns, String SpecialiteEns, String sexeEns, int datePriseEns, int dateNaissEns) {
        this.codeEns = codeEns;
        this.nomEns = nomEns;
        this.prenomEns = prenomEns;
        this.SpecialiteEns = SpecialiteEns;
        this.sexeEns = sexeEns;
        this.datePriseEns = datePriseEns;
        this.dateNaissEns = dateNaissEns;
    }

    public Enseignant() {
    }
    
    
    public int salaireEns(int brut,int primefonction,int primecommunication){
        int salaire=brut+primefonction+primecommunication;
        return salaire;
    }
    public int CalculagePersonne(int anneeCourante, int anneeNaiss) { 
    int age=anneeCourante-anneeNaiss;     
            
       return age;     
    }
    
    
    
    
    
    
    
    
    
    
    
}
