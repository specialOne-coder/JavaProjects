/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEleves;

import java.util.ArrayList;

/**
 *
 * @author Ferdinand
 */
public class Eleve {
    private String nom;
    ArrayList ListeNotes= new ArrayList<Integer>();
    private double moyenne;
    private int note;
    public Eleve() {
    }

    public Eleve(String nom, double moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }

    

    

    public double getMoyenne() {
        return moyenne;
    }

   
    
    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListeNotes() {
       ListeNotes.add(14);
        ListeNotes.add(4);
        ListeNotes.add(6);
        ListeNotes.add(5);
        ListeNotes.add(10);
        ListeNotes.add(18);
        return ListeNotes;
    }
    
    public void ajouterNote(int note){
    
    if (note<0){
        note=0;
    }else if(note>20){
       note=20;
    }
        ListeNotes.add(note);
        moyenne= note;
}
    
  public String toString(){
     
      System.out.println("");
      System.out.println(getNom() +(moyenne));
      return nom+  (moyenne);
  }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
