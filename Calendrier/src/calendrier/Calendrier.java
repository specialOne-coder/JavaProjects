/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendrier;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Calendrier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        
        int choix;
        
        do {            
            choix = menu();
                switch(choix){
                    
                    case 1: Janvier();
                    break;
                    
                    case 2: Fevrier();
                    break;
                
                    case 3:Mars();
                    break;
//                    
                    case 4:Avril();
                    break;
                    
                    case 5:Mai();
                    break;
                    
                    case 6:Juin();
                    break;
                    
                    case 7:Juillet();
                    break;
                    
                    case 8:Aout();
                    break;
                    
                    case 9:Septembre();
                    break;
                    
                    case 10:Octobre();
                    break;
                    
                    case 11:Novembre();
                    break;
                    
                    case 12:Decembre();
     
                    
                }
            
   
            
        } while (choix<12);
        
    }
        
       static int menu(){
     Scanner sc=new Scanner (System.in);
     int choix=0;
     System.out.println("");  
     System.out.println("");
     System.out.println("1:Janvier");
     System.out.println("2:Fevrier");
     System.out.println("3:Mars");
     System.out.println("4:Avril");
     System.out.println("5:Mai");
     System.out.println("6:Juin");
     System.out.println("7:Juillet");
     System.out.println("8:Aout");
     System.out.println("9:Septembre");
     System.out.println("10:Octobre");
     System.out.println("11:Novembbre");
     System.out.println("12:Decembre");
     
     
      while((choix!=1)&(choix!=2)&(choix!=3)&(choix!=4)&(choix!=5)&(choix!=6)&(choix!=7)&(choix!=8)&(choix!=9)&(choix!=10)&(choix!=11)&(choix!=12)){
          
            choix=sc.nextInt();
 }
    return choix;
 }
       
       static void Janvier(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " janvier");
          }
       }

      
    
    static void Fevrier(){
         String j[] ={"","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi"}; 

         for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " Fevrier");
          }
         
         
    }
    
    
     static void Mars(){
           
           String j[] ={"","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " Mars ");
          }
       }
    
     static void Avril(){
           
           String j[] ={"","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " Avril");
          }
       }
     static void Mai(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " Mai");
          }
       }
     static void Juin(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " juin");
          }
       }
    
    
     static void Juillet(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " juillet");
          }
       }
    
     static void Aout(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " aout");
          }
       }
      static void Septembre(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " septembre");
          }
       }
    
         static void Octobre(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " octobre");
          }
       }
          static void Novembre(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " novembre");
          }
       }
           static void Decembre(){
           
           String j[] ={"","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi"  , "mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche","lundi","mardi","mercredi","jeudi","vendredi"}; 
         
       for(int i=1; i<j.length;i++){
              System.out.println( j[i]+"  " + i+ " decembre");
          }
       }
}
    
    
    
        
        
  
    


