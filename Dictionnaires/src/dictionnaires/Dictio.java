/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnaires;
import java.io.*; 
import java.util.List;
/**
 *
 * @author root
 */
public class Dictio {
  
    private list[] dic;
    private int taille;
    
    //Constructeur
     
    public Dictio(int taille){
        this.taille = taille;
        dic = new list[taille];
        for (int i = 0; i < taille; i++) {
            dic[i] = new list();
        }
    }
    
    
    
    // Associateur 
    public int getTaille(){
        return taille;
    }
    
    public list[] getTab(){
        return dic;
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
    
    public void insert(String mot,String separateur,String sign){
        String couple[]= mot.split(separateur);
        //int position = this.hachage(couple[0]);
        int position = this.hachage(mot);
        
        try{
            
        if (this.dic[position].vide()){
            this.dic[position] = new list(mot,sign);
            System.err.println(mot+ " : " +sign+"  page n° :" +position);
        }else{
        this.dic[position] = this.dic[position].insererEntete(mot,sign);
           System.err.println(mot+ " : " +sign+"  page n° : " + position);
    }
       
    }catch (Exception e){
            System.err.println("insertion impossible pour "+mot+" position-->"+position);
    }
    
}
    
    
    public void Recherche(String mt){

         int position = this.hachage(mt);
                 list p = this.dic[position];
        try{
            
        if (this.dic[position].vide()){
            
            System.err.println(" le mot cherché n'existe pas");
        }else{
            if(mt == p.mots() )
        this.dic[position] = new list(p.signif(),null);
           System.err.println(mt+ " : "+p.mots()+"  " +p.signif()+"  page n° : " + position);
    }
       
    }catch (Exception e){
            System.err.println("recherche impossible pour "+mt+" position-->"+position);
    }
    
    
    }
    
    public void modification(String mot,String newsign){
        
         int position = this.hachage(mot);
                 list p = this.dic[position];
                 
        try{
            
        if (this.dic[position].vide()){
            System.out.println("le mot cherche a modifier n'esiste pas");
            
        }else{
            if(mot == p.mots())
                 p.Afficher();
        this.dic[position] = new list(mot,(newsign));
           System.err.println(" Modification de  " +mot+  " : new signification " + newsign+ "  page n° : " + position);
            
    }
       
    }catch (Exception e){
            System.err.println("recherche impossible pour "+mot+" position-->"+position);
    }
    
    }
    
        public void supprimer(String ot){
            
           // int position = this.hachage(ot);
           int position = this.hachage(ot);
          list p = this.dic[position];
        try{
            
        if (this.dic[position].vide()){
            System.err.println(ot+ "N'existe pas dans le dic" );
        }else{
             if(ot == p.mots())
                 p.Afficher();
        this.dic[position] = new list(null,null);
           System.err.println(ot+ " : " +p.signif()+ "  page n° : "  + position + "  est supprimer avec success");
            
        }
       
         }catch (Exception e){
            System.err.println("Suppression impossible pour "+ot+" position-->"+position);
         }
            
         
            
        }
        
        
        
        

    
}
        
        
        
        
        
        
        
        
        
        
        
        
        
    

    
    
    
    
    
    
    
    

    
    
