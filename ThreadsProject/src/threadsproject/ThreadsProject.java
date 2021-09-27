/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsproject;

/**
 *
 * @author root
 */
public class ThreadsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ThreadTest t1 = new ThreadTest("boss");
        ThreadTest tr = new ThreadTest("hudo");
        t1.start();
        tr.start();

        //  System.out.println("Le nom de ce thread utilisé ici est :"+ Thread.currentThread().getName());
    }
    
}
