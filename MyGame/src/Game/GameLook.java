/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Ferdinand
 */
public class GameLook implements Runnable {

    
    public void run() {
     int attente =6;
        while (true) {      
            double start = System.nanoTime();
            GamePanel.getMainPanel.UpdatePosition();
            GamePanel.getMainPanel.repaint();
            Player.getMainPlayer.updateposition();
            double timePassed = System.nanoTime()- start;
            int wait= (int) (attente - timePassed/1000000);
               System.out.println(wait);
            try{
                Thread.sleep(wait);
            }
            catch(Exception e){
                  e.printStackTrace();
        }
    }
    }
}

