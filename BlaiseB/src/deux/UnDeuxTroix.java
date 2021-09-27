/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deux;

/**
 *
 * @author ferdio
 */
public class UnDeuxTroix {

    
    public static int sum(int []tab){
        int sum = 0;
        for(int i=0;i<tab.length;i++){
            sum +=tab[i];
        }
        return sum;
    }
    
    
    public static double min(double tab[]){
      
        Double maximal = Double.MAX_VALUE;
   
        for(int i=0;i<tab.length;i++){
            if(tab[i] < maximal){
            maximal = tab[i];
            }
        }
        return maximal;
    }
    
    
    
    public static char[] CompareTab(int[] tab1,int[] tab2){
          
        char[] rep= new char[tab1.length];
        
        for(int i=0;i< tab1.length;i++){
            
            if(tab1[i] < tab2[i]){
                rep[i] = '<';
            }else if(tab1[i] > tab2[i]){
                rep[i] = '>';
            }else{
                rep[i] = '=';
            } 
        }
        
        return rep;
        
        }
         
        
        
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
   
    }

}
