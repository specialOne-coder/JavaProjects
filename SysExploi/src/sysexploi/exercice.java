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
public class exercice extends Thread {
    public String name;
    
    public exercice(String s){
        this.name=s;
    }
    
    public void run(){
        for(int i=0;i<8;i++){
            System.out.println("Bonjour de la part de "+name);
            try {
                Thread.sleep(1000);
                if(name!="fifi"&& i== 8){
                    break;
                }
                
            } catch (InterruptedException e) {
                break;
                
            }
            
        }
        System.out.println("Aurevoir de "+name);
    }
    
    
}
