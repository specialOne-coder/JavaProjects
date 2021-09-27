/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togocel;

/**
 *
 * @author Ferdinand
 */
public class Client {
  private int id;
  private String nomc;
  private String prenom;
  private int tel;
  private int montant;

    public int getId() {
        return id;
    }

    public String getNomc() {
        return nomc;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTel() {
        return tel;
    }

    public int getMontant() {
        return montant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomc(String nomc) {
        this.nomc = nomc;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Client() {
    }

    public Client(int id, String nomc, String prenom, int tel, int montant) {
        this.id = id;
        this.nomc = nomc;
        this.prenom = prenom;
        this.tel = tel;
        this.montant = montant;
    }

    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
