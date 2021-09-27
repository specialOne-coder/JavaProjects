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
public class Quatres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] t = {1, 7, 0 , 4 };
        int x = Integer.parseInt(args[0]);
        
        if(t.length > 0){
            int valeur = t[0];
            int xplus = x;
            for(int i = 1;i< t.length;i++){
                 valeur += t[i] * xplus;
                 xplus *= x;
            }
            System.err.println("Valeur du polynome :"+valeur);

        }
        
        
    }
    
}
