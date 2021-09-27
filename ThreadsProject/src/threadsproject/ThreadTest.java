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
public class ThreadTest extends Thread {
    
    
    public ThreadTest(String na){
        super(na);
    }
    
    
    
    
    public void run(){
        for(int i=1;i<10;i++) 
            System.out.println(this.getName());
    }
    
    
}
