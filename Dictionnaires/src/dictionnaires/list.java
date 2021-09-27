/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnaires;

/**
 *
 * @author root
 */
public class list {
    
     private Object valeur;
     private Object sign;
    
    public list (Object premier, Object reste){
        this.valeur = premier;
        this.sign = reste;
        
    }

    public list() {
        
    }

       
    public Object mots(){
        return (this.valeur);
    }
    
    public Object signif(){
        return (this.sign);
    }
    
   
    
    public void Afficher(){
        list p = this;
        if( p != null ){
            System.err.print(""+ p.mots()+ " : " +( p.signif()));
            System.err.print(( p.signif() != null ? "\n":""));
              p.signif();
        }
        
    }
    
    
    public  boolean vide(){
        if (this.mots() == null ) return true;
        else
                {
            return false;
        }
    }
       
    public list insererEntete(Object x,Object y){
        list p = new list(x , y);
        return p;
    
    }
    
    
    
    
    
    
    
    
    
    
}
