/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Essence extends Motorisation{
    
      public static int prixessence = 100;
      
      public Essence (Voiture v){
          super(v);
      }
      
      public int prix(){
          return this.prixessence;
      }
      
      
    
    
}
