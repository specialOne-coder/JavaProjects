/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.JFrame;

/**
 *
 * @author Ferdinand
 */
public class Main {
  public static void main(String[] args){
      JFrame frame = new JFrame ("jeu video");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1600,900);
      frame.add(new GamePanel());
      frame.setVisible(true);
      frame.setAlwaysOnTop(true);
  }
}
