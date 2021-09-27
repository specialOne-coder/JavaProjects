
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structurearboressante;

import Structurelineaire.File;
import javax.smartcardio.ATR;

/**
 *
 * @author Ferdinand
 */
public class Arbre {

   
    private int racine;
    private Arbre gauche;
    private Arbre droit;

    
    public void setRacine(int racine) {
        this.racine = racine;
    }

    public void setGauche(Arbre gauche) {
        this.gauche = gauche;
    }

    public void setDroit(Arbre droit) {
        this.droit = droit;
    }
    
    
    
    
    
    public int getRacine() {
        return racine;
    }
    
    
    public  Arbre getSousArbreGauche(){
        return this.gauche;
    }
    
    public  Arbre getSousArbreDroit(){
        return this.droit;
    }

    public Arbre(int racine) {
        this.racine = racine;
        
    }

    public Arbre() {
    }
    

    public Arbre(int racine, Arbre gauche, Arbre droit) {
        this.racine = racine;
        this.gauche = gauche;
        this.droit = droit;
       
    }
       public  String Aff(String s){
                    if(this.gauche!= null && this.droit!= null){
                        return(this.racine +s+ this.gauche.Aff(s) + this.droit.Aff(s));
                    }else if(this.gauche != null){
                        return (this.racine +s+ this.gauche.Aff(s));
                    }else if(this.droit!= null){
                        return (this.racine +s+ this.droit.Aff(s));
                    }else
                        return (this.racine +s);
                    
                    
                }
    
   public boolean  Recherche(int e){
       if(e == this.racine){
           return true;
       }else if(e< this.racine && this.gauche!= null){
           return (this.gauche.Recherche(e));
       }else if(e> this.racine && this.droit!= null){
           return (this.droit.Recherche(e));
       }
         return false;
    }
    
   public void Inse(int i){
       if(i < this.racine){
              if( this.gauche!= null){
                 this.getSousArbreGauche().Inse(i);
              }else{
                  this.gauche= new Arbre(i);
              }
       }else if(i > this.racine){
        
               if(this.droit != null){
           this.getSousArbreDroit().Inse(i);
       }else{
           this.droit = new Arbre(i);
       }
        
       }
       else System.out.println("Insertion impossible Ce nombre existe deja");

}
   public void Supprimer(int d){
      
       if(d < this.racine){
           if(this.gauche!= null){
              this.gauche.Recherche(d);
              this.getSousArbreGauche().setGauche(null);
           }else{
               System.err.println("Ce nombre n'existe pas");
           }    
         }else if(d> this.racine){
              if(this.droit!=null){
                  this.droit.Recherche(d);
                  this.getSousArbreDroit().setDroit(null);
              }else{
                  System.err.println("Ce nombre n'existe pas");
              }
           }else if(d == this.racine){
             this.setRacine(0);
            
         }
            
            
        }
        
   
   
   public void parcoursprefixe(String s){
       
   }
   
   
   public void ParcoursSuffixé(String s){
     if(this.getSousArbreGauche()!= null){
         this.getSousArbreGauche().ParcoursSuffixé(s);
     }
       if(this.getSousArbreDroit()!= null){
           this.getSousArbreDroit().ParcoursSuffixé(s);
       }
       System.err.print(this.getRacine() +s);
   }
  
   
   public void ParcoursInfixé(String s){
       if(this.getSousArbreGauche()!= null){
           this.getSousArbreGauche().ParcoursInfixé(s);
       }
       System.err.print(this.getRacine() +s);
       if(this.getSousArbreDroit()!= null){
           this.getSousArbreDroit().ParcoursInfixé(s);
       }
   }
   
  
   public  static int hauteur(Arbre a){
       if(a== null)return 0;
      return 1+ Math.max(hauteur(a.getSousArbreGauche()) , hauteur(a.getSousArbreDroit()));
   }
   
   
   public void ParcoursLargeur(String s){
       int n = hauteur(this);
       File f = new  File(n);
       f.Enfiler(this);
       Arbre are;
      while(!f.vide()){
          are = (Arbre)f.Defiler();
          System.out.print(are.getRacine() +s);
          if(are.getSousArbreGauche()!= null)
              f.Enfiler(are.getSousArbreGauche());
          if(are.getSousArbreDroit()!= null)
              f.Enfiler(are.getSousArbreDroit());
      }
   }
   
   
   
   
   
   
   
   
   
}
