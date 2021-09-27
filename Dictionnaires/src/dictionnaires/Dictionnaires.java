/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnaires;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Dictionnaires {

    /**
     * @param args the command line arguments
     */
    private static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Dictio tr = new Dictio(4);
        System.err.println(" Dictionnaire robert");
        System.err.println("abalo".codePointAt(1));

        tr.insert("nice  ", ":", "jolie");
        tr.insert("plane ", ":", "avion");
        tr.insert("beauty", ":", "beauté");
        tr.insert("word ", ":", "mot");
        tr.insert("again ", ":", "encore");
        tr.insert("airport ", ":", "areoport");
        //         for (int i = 0; i < tr.getTaille(); i++) {
//            
//            if (!tr.getTab()[i].vide()) 
//            tr.getTab()[i].Afficher();
//            
//         }
//        
        //   tr.Recherche("b");

//        
        tr.modification("nice", "belle");

        //tr.modification("day", "jour");
//        
    tr.supprimer("plane");
//        
//
////
 for (int i = 0; i < tr.getTaille(); i++) {
            
            if (!tr.getTab()[i].vide()) 
            tr.getTab()[i].Afficher();
            
        }
//   
//    }
    }

}
