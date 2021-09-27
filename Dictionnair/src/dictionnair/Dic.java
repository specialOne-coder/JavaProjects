/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnair;

import java.util.Hashtable;

/**
 *
 * @author root
 */
public class Dic {
    
    private Hashtable[] tab;
    private int taille;
    private  Hashtable t;
    //Constructeur
     
    public Dic(int taille){
        this.taille = taille;
        tab = new Hashtable[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = new Hashtable();
        }
    }

    public Dic() {
        
    }
    
    // Associateur 
    public int getTaille(){
        return taille;
    }
    
    public Hashtable[] getTab(){
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
    
     public Hashtable insererEntete(Object x){
        Hashtable p = new Hashtable(x,this);
        return p;
    }
    
    
    
    // Ajout un couple d'information au tableau
    public void Ajouter(String mot,String sign){
        String couple[]= mot.split(sign);
        //int position = this.hachage(couple[0]);
        int position = this.hachage(mot);
        
        try{
            
        if (this.tab[position]== null){
            this.tab[position] = new Hashtable();
            System.err.println("["+mot+"] est inserer a la page N° "+position);
        }else{
        this.tab[position] = this.tab[position].insererEntete(mot);
            System.err.println(mot+" est inserer en entete de la liste a la position "+position);
    }
       
    }catch (Exception e){
            System.err.println("insertion impossible pour "+mot+" position-->"+position);
    }
    
}
    
     static void Quitter(){
        System.out.println("Programme terminé!");
    }
     
     
     
     public void Ajo(String mot,String sign){
        String couple[]= mot.split(sign);
        //int position = this.hachage(couple[0]);
        int position = this.hachage(mot);
        
        try{
            
        if (this.tab[position].vide()){
            this.tab[position] = new list(mot, null);
            System.err.println("["+mot+"]");
        }else{
        this.tab[position] = this.tab[position].insererEntete(mot);
            System.err.println("["+mot+"]");
    }
       
    }catch (Exception e){
            System.err.println("insertion impossible pour "+mot+" position-->"+position);
    }
    
}
     
     public boolean  Recherche(int e){
       if(e == this.mot){
           return true;
       }else if(e< this.racine && this.gauche!= null){
           return (this.gauche.Recherche(e));
       }else if(e> this.racine && this.droit!= null){
           return (this.droit.Recherche(e));
       }
         return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
