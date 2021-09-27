
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpagoavance;

import Structurelineaire.File;
import Structurelineaire.Liste;
import Structurelineaire.Pile;
import SutructureAssociative.TableHachage;
import java.util.ArrayList;
import structurearboressante.Arbre;



/**
 *
 * @author Administrateur
 */
public class TpAgoAvance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*
        Liste l = new Liste(10, new Liste(8, new Liste(6,new Liste(4, new Liste(2,new Liste(0, null)))))); 
    
        System.out.println("les Elements de la liste sont");
        l.Afficher();
        System.err.println("Tete de le liste");
        System.err.println(l.tete());
        System.err.println("Le reste de la liste");
        l.queue().Afficher();
        
       /*
        Pile unePile = new Pile();
        
        unePile.Empiler("Kokou");
        unePile.Empiler("David");
        unePile.Empiler("Noe");
        unePile.Empiler("Beaugard");
        unePile.Empiler("Ablaham");
        unePile.Empiler("Kelly");
        unePile.Empiler("Ferdinand");
        unePile.Empiler("Chritian");
        
        unePile.Afficher();
       // System.err.println("Le dernier element de la pile est : " +unePile.Depiler());
 
        
        /*
        ArrayList<String> texte = new  ArrayList<>();
        
        texte.add("a");
        texte.add("d");
        texte.add("(");
        texte.add("f");
        texte.add("r");
        texte.add(")");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        texte.add("(");
        
        
        for ( String lettre : texte){
            if (lettre.equals("(")) unePile.Empiler("(");
            if (lettre.equals(")")) unePile.Depiler();
               
        }
        try{
            if (unePile.vide()){
                System.err.println("Expression bien parenthesé");
            }else{
                System.err.println("Expression mal parenthesé");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        */ 
      /*
        System.err.println("Test de le classe File");
        int n = 0;
        
        File f = new File(n);
        
       // System.err.println(f.vide());
        
        f.Enfiler("Kokou");
        f.Enfiler("Jean");
        f.Enfiler("Raoul");
        f.Enfiler("Adriano");
        f.Enfiler("Ferdinand");
        f.Enfiler("Dodji");
       
        System.err.println("voici"+f.Remplissage());
        
      
      /*
        System.err.println("TP table de hachage");
        System.err.println("abalo".codePointAt(1));
        
        TableHachage uneTable = new TableHachage(13);
        uneTable.Ajouter("anne : 90106759",":");
        uneTable.Ajouter("paul :954587812", ":");
        uneTable.Ajouter("jerome : 96269025", ":");
        uneTable.Ajouter("paulin : 95487125" ,"");
        uneTable.Ajouter("michel :97854125","");
        
        for (int i = 0; i < uneTable.getTaille(); i++) {
            
            if (!uneTable.getTab()[i].vide()) 
            uneTable.getTab()[i].Afficher();
            
        }
        */
        System.out.println("Tp Arbre");
        
        Arbre ar = new Arbre(6,new Arbre(3, new Arbre(1,new Arbre(0),null),new Arbre(4)),new Arbre(9,new Arbre(8), new Arbre(12, new Arbre(10),null)));
        //Arbre ar = new Arbre(6,new Arbre(3, new Arbre(1,new Arbre(0),null), new Arbre(4)),new Arbre(9,new Arbre(8),new Arbre(12,new Arbre(10),  null)));
      
//        System.out.println(ar.Aff("->"));
        
//        System.out.println("Recherche");
//        System.out.println(ar.Recherche(3));
//
//      System.out.println("Insertion");
//       ar.Inse(5);
//     System.out.println(ar.Aff("->"));

//        System.out.println("Suppression");
//          ar.Supprimer(9);
//         System.out.println(ar.Aff("->"));
//        
//            ar.ParcoursP(44);
//        System.out.println(ar.toString("->"));
//        ar.ParcoursSuffixé("->");
//         ar.ParcoursInfixé("/");
//         
//         ar.ParcoursLargeur("-->");


    }
    
    
    
}




























