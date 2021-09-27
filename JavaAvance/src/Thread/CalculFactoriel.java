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
public class CalculFactoriel extends Thread {
    
        protected int nb;
        
        public void run(){
            int res = 1;
            for (int i=1; i<=nb; i++)
            res = res * i;
            System.out.println("factoriel de "+nb+"="+res);
        }
        
        public CalculFactoriel(int nb) {
           this.nb = nb;
        }
}