/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudfili;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Filiere implements Serializable{
    
    private String codeFiliere;
    private String nomFiliere;

   
    public String getCodeFiliere() {
        return codeFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }
    
    
    
    
    
    public Filiere(Etudiant et,String code , String no) {
    
        this.codeFiliere = code;
        this.nomFiliere = no;
        
    }
    
    public void afficher(){
        
        System.out.println(this.getNomFiliere() + this.getCodeFiliere() );
        
    }
    
    
    
    
    
    
}
