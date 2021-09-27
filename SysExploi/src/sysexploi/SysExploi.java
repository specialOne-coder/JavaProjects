/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysexploi;

/**
 *
 * @author Ferdinand
 */
public class SysExploi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("debut");
        exercice[]thread ={
            new exercice("riri"),
            new exercice("fifi"),
            new exercice("loulou")
        };
        for(exercice ex:thread)
           ex.start();
        try {Thread.sleep(2500);}
            
         catch (Exception e){e.printStackTrace();}
        thread[2].interrupt();
        try {
            thread[1].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("adieu");

        
        

        
    
        
        
        
        
        
        
        
        
        }

    }
   

