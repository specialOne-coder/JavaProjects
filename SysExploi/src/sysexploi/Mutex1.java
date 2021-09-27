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
public class Mutex1 implements Mutex{
    
    private boolean[] est_SC = {false,false};
     
    
    public void commencerSectionCritique(int id){
        while(est_SC[1-id])
            est_SC[id] = true;
    }
    
    public void finirSectionCritique(int id){
        est_SC[id] = false;
    }
    
}
