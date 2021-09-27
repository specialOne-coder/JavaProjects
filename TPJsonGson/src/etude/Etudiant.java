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
public class Etudiant implements Serializable {

    private String matricule, nom, prenom, telephone;
    private int age;
    
    private Filiere filiere;

    public Etudiant() {
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    
    public void afficher(){
        System.out.println("N°Matricule : "+this.matricule);
        System.out.println("Nom : "+this.nom);
        System.out.println("Prénom : "+this.prenom);
        System.out.println("Age : "+this.age);
        System.out.println("Téléphone : "+this.telephone);
        this.filiere.afficher();
    }

}
