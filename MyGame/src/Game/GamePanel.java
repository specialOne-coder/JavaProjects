/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ferdinand
 */
public class GamePanel extends JPanel {
    
    private Image img;
    public int x,x2;
    public int addx;
    public static GamePanel getMainPanel;
    private Player p;
    

    public GamePanel(){
        addKeyListener(new GameKeyListener());
        setFocusable(true);
        requestFocus();
        p = new Player();
        ImageIcon i = new ImageIcon(getClass().getResource("/Res/die.Jpg"));
        img = i.getImage();
        x=0;
        x2=2000;
        addx=0;
        getMainPanel = this;
        Thread t= new Thread(new GameLook());
        t.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img, x, 0,null);
        g2.drawImage(img, x2, 0,null);
        g2.drawImage(p.img,p.x,p.y,null );
    }
    
    public void UpdatePosition(){
     x = x-addx;
     x2= x2-addx;
      if(x== -400) x2=1600;
      if(x== -2400) x=1600;
    
    
    
    } 
    
    
    
    
    
}
