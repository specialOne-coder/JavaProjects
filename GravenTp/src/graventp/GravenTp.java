/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graventp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ferdio
 */
public class GravenTp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /***
         *  Création de la liste de jouets 
         */
        List<Jouet> jouets = new ArrayList();
        jouets.add(new Jouet("Battelfied 4",150,"Pas mal",0));
        jouets.add(new Jouet("The Game Of Thrones",1500,"Pas mal",10));
        jouets.add(new Jouet("God Hand",40,"Pas mal",20));
        jouets.add(new Jouet("Zakari",45,"Pas mal",15));
        jouets.add(new Jouet("Minecraft",17,"Pas mal",5));
        jouets.add(new Jouet("Elice",16,"Pas mal",3));
        jouets.add(new Jouet("FiFa21",5,"Pas mal",2));
        jouets.add(new Jouet("Grizou",7,"Pas mal",0));
        
        /**
         *  Affichage et Tri
         */
        System.err.println(jouets);
        
        
//        jouets.stream().forEach(Jouet->{
//            System.out.println();
//        });
        
        System.out.println("-----------------Tri en cour---------------");
        
        //Collections.sort(jouets);
        
        for(Jouet j :jouets){
            System.out.println("jouet :"+ j.getNom());
        }
    }
    
}
