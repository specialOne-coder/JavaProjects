/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SutructureAssociative;

import Structurelineaire.Liste;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class TableHachage {
    
    // Attributs
    private Liste[] tab;
    private int taille;
    
    //Constructeur
     
    public TableHachage(int taille){
        this.taille = taille;
        tab = new Liste[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = new Liste();
        }
    }
    
    // Associateur 
    public int getTaille(){
        return taille;
    }
    
    public Liste[] getTab(){
        return tab;
    }
    
    //Fonction de codage
    public int produireCle(String s){
        return s.codePointAt(0)-96;
    }
    
    //fonction de hachage
    public int hachage(String s){
        return this.produireCle(s) % this.taille;
    }
    
    // Ajout un couple d'information au tableau
    public void Ajouter(String donnees,String separateur){
        String couple[]= donnees.split(separateur);
        //int position = this.hachage(couple[0]);
        int position = this.hachage(donnees);
        
        try{
        if (this.tab[position].vide()){
            this.tab[position] = new Liste(donnees, null);
            System.err.println(donnees+" est inserer directement dans la liste a la position "+position);
        }else{
        this.tab[position] = this.tab[position].insererEntete(donnees);
            System.err.println(donnees+" est inserer en entete de la liste a la position "+position);
    }
       
    }catch (Exception e){
            System.err.println("insertion impossible pour "+donnees+" position-->"+position);
    }
    
}
    
}










































