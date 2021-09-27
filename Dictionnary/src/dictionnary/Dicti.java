/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnary;

/**
 *
 * @author root
 */
public class Dicti {
    
    private hashta[] mot;
    private int taille;
    
    
    
    
     public Dicti(int taille){
        this.taille = taille;
        mot = new hashta[taille];
        for (int i = 0; i < taille; i++) {
            mot[i] = new hashta();
        }
     }

    public hashta[] getMot() {
        return mot;
    }

 

    public int getTaille() {
        return taille;
    }
        
        
    
    
    //Fonction de codage
    public int produireCle(String s){
        return s.codePointAt(0)-96;
    }
    
    //fonction de hachage
    public int hachage(String s){
        return this.produireCle(s) % this.taille;
    }

        
         public void Ajouter(String mo,String si){
            String couple[]= mo.split(si);
        //int position = this.hachage(couple[0]);
        int position = this.hachage(mo);
        
        
        if (this.mot[position].vide()){
            this.mot[position]=new hashta(mo, null);
            System.err.println(mo+ ":" +si+ " est inserer directement dans la liste a la position "+position);
        }else{
        this.mot[position] = this.mot[position].insererEntete(mo,si);
            System.err.println(mo+" est inserer en entete de la liste a la position "+position);
    }
       
   
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
    
    
    
    
    
    
    
