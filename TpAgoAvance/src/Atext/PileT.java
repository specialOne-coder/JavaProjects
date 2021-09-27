/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atext;

import Structurelineaire.Liste;
import Structurelineaire.Pile;

/**
 *
 * @author ferdio
 */
public class PileT {
    
   private Liste li;
    
   
    
    public PileT(){
        
    }
   
    
    public boolean vide(){
        PileT p = this;
        if(p == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void empiler(Object a){
        this.li = new Liste(a, this.li);
         
    }
    
    public Object depiler(){
        if(this.vide()){
            return null;
        }else{
            Object d = this.li.tete();
            this.li = this.li. queue();
            return d;
            
        }
    }
    
    public int remplissage(){
        PileT i = this;
        if(i.vide()){
            return 0;
        }else{ 
           return (i.toString().length());
        }
    }
    
    
    public static void main(String[] args) {
        
        PileT a = new  PileT();
       
        System.out.println(" voila le nombre:"+a.remplissage());
        
     
    }
    
    
    
    
    
    
    
    
}
