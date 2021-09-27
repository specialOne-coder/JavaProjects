/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacie;

/**
 *
 * @author ferdinand ATTIVI
 */
public class Medicament {
private String NomM;
private double Quantité;
private int Prix;

    public String getNomM() {
        return NomM;
    }

    public double getQuantité() {
        return Quantité;
    }

    public int getPrix() {
        return Prix;
    }

    public void setNomM(String NomM) {
        this.NomM = NomM;
    }

    public void setQuantité(double Quantité) {
        this.Quantité = Quantité;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public Medicament() {
    }

    public Medicament(String NomM, double Quantité, int Prix) {
        this.NomM = NomM;
        this.Quantité = Quantité;
        this.Prix = Prix;
    }


   

}
