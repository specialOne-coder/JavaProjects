/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEleves;

import static gestionEleves.Texte.leveve;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ferdinand
 */
public class Texte {
    
    
    
    public Scanner scanner= new Scanner(System.in);
     public static void main(String[] args) {
         
           Scanner Sc =new Scanner(System.in);
        System.out.println("Bienvenue a ESIG");
     int choix;
              
     
         System.out.println("Entrer le nom AGLAMEY pour essayer ");
          String nom;
             nom=Sc.nextLine(); 
         for(int i=0;i<leveve().size();i++){
  
           if(nom.equalsIgnoreCase(leveve().get(i).getNom())){   
               System.out.println("Merci Bienvenue en Sil1");
                do{
                   choix=menu();
                   switch(choix){
                       case 1:
                          LesNotes();
                           break;
                       
                      case 2: 
                          LesSilois();
                           break; 
                       case 5:
                           Quitter();
                   }
               }
               while(choix<4);
               
       }else{
               System.out.println(" Aller faire votre inscription SVP!!!");
               
               
               }
         
     }
     }
    public static ArrayList<Eleve> leveve(){
      
       ArrayList ListeEleve= new ArrayList<Eleve>();
       
       Eleve El1 =new Eleve("Attivi",12.55);
        Eleve El2=new Eleve("Amankwah",10.25);
       Eleve El3 =new Eleve ("Aglamey",11);
       Eleve El4 =new Eleve ("Zinssou",9);
       Eleve El5 =new Eleve ("Togbe",10.50);
       
       ListeEleve.add(El1);
       ListeEleve.add(El2);
       ListeEleve.add(El3);
       ListeEleve.add(El4);
       ListeEleve.add(El5);
       
   return ListeEleve;  
   }
       
         static int menu(){
     Scanner sc=new Scanner (System.in);
     int choix=0;
     System.out.println("");  
     System.out.println("");
     System.out.println("1:Vos notes");
     System.out.println("2:Moi");
     System.out.println("3:Quitter");
     
      while((choix!=1)&(choix!=2)&(choix!=3)&(choix!=4)){
            choix=sc.nextInt();
 }
      return choix;
     }
     static void LesNotes(){
           Eleve M1 =new Eleve("Attivi",52);  
        Eleve El2=new Eleve("Amankwah",10.25);
       Eleve El3 =new Eleve ("Aglamey",11);
       Eleve El4 =new Eleve ("Zinssou",9);
       Eleve El5 =new Eleve ("Togbe",10.50);
         
         System.out.println();
        System.out.println("  note attivi:"+M1.getMoyenne());
        System.out.println("  note aladji:"+El2.getMoyenne());    
        System.out.println("  note sriga"+El3.getMoyenne());
        System.out.println("  note zakou:"+El4.getMoyenne());
        System.out.println(" note balpou:"+El5.getMoyenne());
         
         
     
     }
      static void LesSilois(){ 
         
        Eleve M1 =new Eleve("Attivi",52);  
        Eleve El2=new Eleve("Amankwah",10.25);
       Eleve El3 =new Eleve ("Aglamey",11);
       Eleve El4 =new Eleve ("Zinssou",9);
       Eleve El5 =new Eleve ("Togbe",10.50);
        System.out.println(" Nom et note:"+M1.getNom());
        System.out.println(" Nom et note:"+El2.getNom());    
        System.out.println(" Nom et note:"+El3.getNom());
        System.out.println(" Nomet note:"+El4.getNom());
        System.out.println(" Nomet note:"+El5.getNom());
        
           }
         
      
      
      
      static void Quitter(){
     System.out.println("Programme terminé");
 }
}


 


