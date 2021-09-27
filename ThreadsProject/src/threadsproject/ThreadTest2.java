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
public class ThreadTest2 implements Runnable{
    
    private String name;

    public ThreadTest2(String name) {
        this.name = name;
    }
    
    
    
    
    public static void main (String[] args){
        
        ThreadTest2 t1 = new ThreadTest2("Ferdi");
        ThreadTest2 t2 = new ThreadTest2("adri");
        ThreadTest2 t3 = new ThreadTest2("geraud");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();

    }
    
    public void run(){
        for(int i=1;i<10;i++)
            System.err.println(i+"de "+this.name);
    }
    
}
