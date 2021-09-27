/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ferdinand
 */
public class Player {
    public int x,y,addy;
     public static Player getMainPlayer;
     public Image img;
     boolean children;
     
     public Player(){
         x=100;
         y=500;
         ImageIcon i = new ImageIcon (getClass().getResource("/Res/player.png"));
         img = i.getImage();
          addy=0;
          getMainPlayer = this;
          children = true;
     }
     
     public void updateposition(){
         
         if(y<= 250) addy=-3;
         if(y>= 500){
             addy =0;
             y=500;
             children=true;
         }
         y = y - addy;
}
}
