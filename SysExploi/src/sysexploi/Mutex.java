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
public interface Mutex {
    
    abstract  void commencerSectionCritique(int id);
    abstract  void finirSectionCritique(int id);
    
}
