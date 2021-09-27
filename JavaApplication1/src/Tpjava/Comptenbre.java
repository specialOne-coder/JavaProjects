/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpjava;

/**
 *
 * @author user01
 */
public class Comptenbre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tab[]={1,2,3,4,5,6,7,8,9,78,22,25,30};
    int nbre=tab[0];
    for(int i=0;i<tab.length;i++){
        if(tab[i]>nbre){
            nbre=tab[i];
        }
       
    
    }
        System.out.println("le plus grand nombre est:"+nbre);
    }  
}
