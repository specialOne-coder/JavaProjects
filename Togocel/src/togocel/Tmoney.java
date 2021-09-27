/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togocel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ferdinand
 */
public class Tmoney {

    /**
     * @param args the command line arguments
     */
    public Scanner scanner= new Scanner(System.in);
   
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Entrer votre nom");
    int choix;
         
             String nom;
             nom=Sc.nextLine();   
       for(int i=0;i<initclient().size();i++){
  
           if(nom.equalsIgnoreCase(initclient().get(i).getNomc())){
                 
               System.out.println("Merci Bienvenue dans notre base Transfert");
               do{
                   choix=menu();
                   switch(choix){
                       case 1:
                          Transfert();
                           break;
                       case 2: 
                           Marchant();
                           break; 
                       case 3:
                           Retrait();
                       case 4:
                           Solde();
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
    
   public static ArrayList<Client> initclient(){
       
       ArrayList listeclient= new ArrayList<Client>();
       
       Client cl1 =new Client(1,"Attivi","foli",90106759,50000000);
       Client cl2 =new Client (2,"Amankwah","Duah",93215847,25000);
       Client cl3 =new Client (3,"Aglamey","sodjine",93145877,450000);
       Client cl4 =new Client (4,"Zinssou","benji",93215847,25000);
       Client cl5 =new Client (5,"Togbe","adriano",91458747,420000);
       
       listeclient.add(cl1);
       listeclient.add(cl2);
       listeclient.add(cl3);
       listeclient.add(cl4);
       listeclient.add(cl5);
       
   return listeclient;
   }
   
 static int menu(){
     Scanner sc=new Scanner (System.in);
     int choix=0;
     System.out.println("");  
     System.out.println("");
     System.out.println("1:Transfert");
     System.out.println("2:Marchand");
     System.out.println("3:Retrait");
     System.out.println("4:Mon compte");
     System.out.println("5:Quitter");
      while((choix!=1)&(choix!=2)&(choix!=3)&(choix!=4)){
            choix=sc.nextInt();
 }
    return choix;
}
 static void Transfert(){
     Scanner sc=new Scanner (System.in);
 int n;
 int m;
 int mont;
 
     System.out.println("Entrer le  numero du recevant");
     n=sc.nextInt();
   for(int i=0;i<initclient().size();i++){
    mont= (initclient().get(i).getMontant());
           if(n==(initclient().get(i).getTel())){
               System.out.println("Entrer le montant");
               m=sc.nextInt();
               System.out.println("Vous avez envoyer"+m+"sur le numero"+n);
               System.out.println("Votre nouveau solde est"+(mont- m));
}
           
}
 }
 static void Marchant(){
     Scanner sc= new Scanner(System.in);
     int a;
     int b;
     int mont;
     System.out.println("Entrer le numero tmoney du marchand");
     a=sc.nextInt();
     for(int i=0;i<initclient().size();i++){
    mont= (initclient().get(i).getMontant());
           if(a==(initclient().get(i).getTel())){
     
               System.out.println("Entrer le montant");
               b=sc.nextInt();
               System.out.println("Vous avez envoyer"+b+"sur le numero"+a);
               System.out.println("Votre nouveau solde est"+(mont- b));
     
     
     
 }
}
 }
 static void Retrait(){
     Scanner sc= new Scanner (System.in);
    int nu;
     int monta;
    int c;
     System.out.println("Entrer le numero tmoney du point de vente");
        nu=sc.nextInt();
         for(int i=0;i<initclient().size();i++){
    monta= (initclient().get(i).getMontant());
           if(nu==(initclient().get(i).getTel())){
     
               System.out.println("Entrer le montant");
               c=sc.nextInt();
               System.out.println("Vous avez retiré"+c+"de votre compte");
               System.out.println("Votre nouveau solde est"+(monta- c));
           }
            
         }
}
 static void Solde(){
     int mo;
     for(int i=0;i<initclient().size();i++){
    mo= (initclient().get(i).getMontant());
         System.out.println("Votre solde est de"+mo); 
         
 }
 }
 static void Quitter(){
     System.out.println("Programme terminé");
 }
 }