/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudfili;

/**
 *
 * @author root
 */
public class Etudiant {
 
    private String matricule,nom,prenom,telephone;
    
    private int age;
    
    
    
    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }
    
    
    
    
    
    public Etudiant(String mat, String n,String pre,int ag,String tel){
        
        this.matricule = mat;
        this.nom = n;
        this.prenom = pre;
        this.age = ag;
        this.telephone = tel;
        
        
    }
    
   public void afficher(){
       Etudiant e = this;
       
       while(e!= null){
           System.out.println(e.getNom() + e.getMatricule() + e.getPrenom() + e.getTelephone() + e.getAge());
       }
       
   }
    
}
