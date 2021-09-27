/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ferdinand
 */
public class GameKeyListener extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {
        int k= e.getKeyCode();
        if(k== KeyEvent.VK_D || k==KeyEvent.VK_RIGHT){
            GamePanel.getMainPanel.addx =1;
      
        }
        
        if (k== KeyEvent.VK_SPACE & Player.getMainPlayer.children){
            Player.getMainPlayer.addy= 3;
            Player.getMainPlayer.children=false;
        }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int k= e.getKeyCode();
        if(k== KeyEvent.VK_D || k==KeyEvent.VK_RIGHT){
            GamePanel.getMainPanel.addx =0;
    }
            
    }
}
    
    
    
         
    
    

