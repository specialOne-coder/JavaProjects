/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author ferdio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        CalculFactoriel cf;
        for (int i=10; i >= 1; i--) {
            cf = new CalculFactoriel(i);
            cf.start();
        }
    }
    
}
