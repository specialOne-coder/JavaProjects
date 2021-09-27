/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnary;

import java.util.Hashtable;

/**
 *
 * @author root
 */
public class hashta {
    
    private Hashtable mots;
    private hashta signs;

    
    public hashta(Hashtable mots, hashta signs) {
        this.mots = mots;
        this.signs = signs;
    }

   

    public hashta() {
    }
    
     public Hashtable lmot(){
        return (this.mots);
    }
    
    public hashta lsig(){
        return (this.signs);
    }
    
    
    
     public void Afficher(){
        hashta p = this;
        while ( p != null ){
            System.err.print( p.lmot()+( p.lsig() != null ? "-->":"\n"));
            p = p.lsig();
        }
        
    }
    
      public  boolean vide(){
        if (this.lmot() == null ) return true;
        else
                {
            return false;
        }
    }
      
      
      public void inserer(String m ,String s){
          hashta p = this;
         if(p.vide()){
          this.mots.put(m,s);
      }else{
             p = new hashta(mots, signs);
         }
      }
     
    public hashta insererEntete(String m,String s){
        hashta p = new hashta(mots,signs);
        return p;
    }
    
    
    
    
    
    
}
