/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnair;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Dictionnair {

    /**
     * @param args the command line arguments
     */
     private static Scanner Scanner =new Scanner (System.in);
    public static void main(String[] args) {
  
   
   int choix;
   do{
       choix=menu();
   
   
   switch(choix){
       case 1:
           liste();
           break;
       case 2:   
           Enregistrement();
           break;
       case 3: 
          affichage();
           break;
       case 4: 
           Quitter();
           break;
   } 
   }   
   while (choix<4);
    }
    static int menu(){
        int choix=0;
        System.out.println("Dictionnaire petit Robert numerique");  
        System.out.println("");
        System.out.println("1: Votre Dictionnaire");
        System.out.println("2: Enregistrement");
        System.out.println("3: Supression");
        System.out.println("4: Quitter");
        while((choix!=1)&(choix!=2)&(choix!=3)&(choix!=4)){
            choix=Scanner.nextInt();        
    }
   return choix;
   
    }
    //Methodes
    static void affichage(){
    }
    static void Enregistrement(){
      Scanner  sc = new Scanner(System.in);
      Dictionnaire ro = new Dictionnaire();
      System.out.println("Entrer votre mot suivi de sa signification");
         sc.nextLine();
        String m;
        System.out.println(ro.getTab());
         
      
      
      
      
      
    }
    static void liste(){
       
         Dictionnaire robert = new  Dictionnaire(22000);
          
        System.out.println("Entrez vos mots et leurs significations");
        
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");
       robert.Ajo("man : homme",":");
       robert.Ajo("nice :jolie ", ":");
       robert.Ajo("poverty : pauvre", ":");
       robert.Ajo("power : pouvoir" ,":");
       robert.Ajo("joice :joie",":");

      
    }
    static void Quitter(){
        System.out.println("Programme terminé!");
    }
        
        
    }
    
}
