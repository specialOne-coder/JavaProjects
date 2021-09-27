/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurelineaire;

/**
 *
 * @author Administrateur
 */
public class File {
    
    
    private Object tab[];
    private int queue;
    private int taille;
    
    
    // Methode pour creer une file de n element
    public File(int n){
        this.queue = 0;
        this.taille = n;
        this.tab = new Object[n];
    }
    
    // Pour savoir si la file est vide ou non
    
    public boolean vide(){
        return( this.queue == 0);
    }
    
    // Enfiler
    
    public void Enfiler(Object o){
        if (this.queue < this.taille)
            this.tab[this.queue] = 0;
        this.queue ++;
    }
            
   // Defiler
    
    public Object Defiler(){
        if (this.vide())
            return null;
        else{
            Object Resultat = this.tab[0];
            this.queue --;
            for(int i = 0; i < this.queue; i ++ ){
                this.tab[i] = this.tab[i+1];           
            }
             return Resultat;
        }
    }
    
    // Afficher les elements de la File
    
    public void Afficher(){
        File d = this;
        while(!this.vide()){
            System.err.println(d.Defiler());
        }     
    }
    
    //public int Remplissage()
    
    public int Remplissage(){
        if(this.vide()) return 0;
        else{
            int compteur = 0;
            File l = new File(this.taille);
            for (int i = 0; i < this.tab.length; i++) {
                l.tab[i] = this.taille;
             
            }
            return tab.length;
        }
    }
          
    
}
