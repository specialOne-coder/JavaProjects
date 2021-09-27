/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacie;


import java.util.Scanner;
/**
 *
 * @author ferdinand ATTIVI
 */
public class Pharmacie {

    /**
     * @param args the command line arguments
     */
    private static Scanner Scanner =new Scanner (System.in);
    public static void main(String[] args) {
        
   Client[] clients =new Client[2];
   Medicament[] medicaments =new Medicament[2];
   
   clients[0] = new Client("Malfichu",0.0);
   clients[1] = new Client("Palichon",0.0);
   
   medicaments[0] =new Medicament("Aspiron",20.40,5);
   medicaments[1] =new Medicament("Rhinoplexil",19.15,5);
   
   int choix;
   do{
       choix=menu();
   
   
   switch(choix){
       case 1:
           achat(clients,medicaments);
           break;
       case 2:   
           approvisionnement(medicaments);
           break;
       case 3: 
          affichage(clients,medicaments);
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
        System.out.println("");  
        System.out.println("");
        System.out.println("1: Achat de medicament");
        System.out.println("2: Approvisionnement en medicaments");
        System.out.println("3:Etats des stocks et des credits");
        System.out.println("4:Quitter");
        while((choix!=1)&(choix!=2)&(choix!=3)&(choix!=4)){
            choix=Scanner.nextInt();        
    }
   return choix;
   
    }
    //Methodes
    static void affichage(Client[] clients, Medicament[] medicaments){
        Client C =new Client("Ferdinand",20.2);
       
        Medicament M =new Medicament("Aspiron",20.40,5+4);
        
         System.out.println("Le client" +C.getNomC()+"a"+C.getCredit()+"de Credit"); 
         System.out.println("Le Medicament"+M.getNomM()+"a pour Stock"+M.getQuantité());
    }
    static void approvisionnement(Medicament[] medicaments){
      Medicament M1 =new Medicament("Panadol",52.5,5);  
        System.out.println(" Nom:"+M1.getNomM());
        System.out.println("Quantite :"+M1.getQuantité());
      Medicament M2 =new Medicament("metronizodale",52.5,5);
       System.out.println(" Nom:"+M2.getNomM());
        System.out.println("Quantite :"+M2.getQuantité());
      Medicament M3 =new Medicament("Paracetamol",558.5,5); 
       System.out.println(" Nom:"+M3.getNomM());
        System.out.println("Quantite :"+M3.getQuantité());
    }
    static void achat(Client[] clients, Medicament[] medicaments){
      Client C1 =new Client("Ferdinand",20.2);  
      Medicament M1 =new Medicament("Panadol",52.5,5); 
      Client C2 =new Client("Diarra",20.2);  
      Medicament M2 =new Medicament("tramadol",52.5,5); 
        System.out.println("Nom du client:"+ C1.getNomC());
        System.out.println("Son medicament acheté est:"+M1.getNomM());
        System.out.println("Nom du client:"+C2.getNomC());
        System.out.println("Medicament acheté:"+M2.getNomM());
      
    }
    static void Quitter(){
        System.out.println("Programme terminé!");
    }
    }
    
    

