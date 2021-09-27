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
public class Cinq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {1,7,0,4};
        int derrive[] = new int[t.length -1];
        
        for(int b =0;b<derrive.length;b++){
            derrive[b] = t[b+1] * (b+1);
        }
        System.out.println("voici la derrive du premier :"+derrive[0]);
        for(int c=1;c<derrive.length;c++){
            System.out.println(" Derrive : " + derrive[c] + "x^"+c);
      
        }
        
//        System.out.println();
    }
    
}
