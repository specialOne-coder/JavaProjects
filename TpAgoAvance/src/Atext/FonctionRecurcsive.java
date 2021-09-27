/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atext;

/**
 *
 * @author ferdio
 */
public class FonctionRecurcsive {
    
    public int sommePositif(int tab[],int ind){
        
        int n = 0;
        tab = new int [n];
        return sommePositif(tab, ind);
    }
    
    public FonctionRecurcsive(){
        
    }
    
    public  boolean  palindrome(String mot){
        
        int longueur = mot.length();
        if(longueur==0||longueur==1){
            return true;
        }else{
            if(mot.charAt(0)==mot.charAt(longueur-1)){
                return palindrome(mot.substring(1, longueur-1));
            }else{
                return false;
            }
        
                
                }
    }
    
    
    
    
    
    
    
}
