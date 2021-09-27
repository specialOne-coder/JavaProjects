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
public class Client {
    private String NomC;
    private double credit;

    public String getNomC() {
        return NomC;
    }

    public double getCredit() {
        return credit;
    }

    public void setNomC(String NomC) {
        this.NomC = NomC;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Client() {
    }

    public Client(String NomC, double credit) {
        this.NomC = NomC;
        this.credit = credit;
    }

  
    
    
}
