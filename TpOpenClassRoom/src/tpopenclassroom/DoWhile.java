/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpopenclassroom;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Attribute.N;

/**
 *
 * @author ferdio
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choix = 0;
        int fah;
        int cel = 0;
        int rep;
        char r = ' ';
        System.out.println("Bonjour quel conversion souhaitez vous effectuer?");
        Scanner main = new Scanner(System.in);
   
        do{
        
        do{
            
            System.out.println("1 : Fahrenheit - Celsius");
            System.out.println(" ");
            System.out.println("2 : Celsius - Fahrenheit");
            choix = main.nextInt();
            if(choix!=1&&choix!=2){
                System.err.println("Veuillez reessayer votre choix n'hexiste pas!!!");
            }
            
        }while(choix!=1 && choix!=2);
       
            if(choix==1){
                System.out.println("Entrer votre temperature celsius");
                cel = main.nextInt();
                rep = ((9/5)*cel+32);
                System.err.println(cel+"°C = "+rep+"°F");
                main.nextLine();
            }else if(choix==2){
                System.out.println("Entrer votre temperature fahreinheit");
                fah = main.nextInt();
                rep = (((fah-32)*5)/9);
                System.err.println(fah+"°F = "+rep+"°C");
                main.nextLine();
            }
        
          do{
             System.out.println("Voulez vous continuez?O/N");
             
             r = main.nextLine().charAt(0);
             
          }while(r!='O' && r!='N');
          
        }while(r == 'O');
        System.err.println("Good Bye");
   
 
    //Notre objet Scanner
//    Scanner sc = new Scanner(System.in);
//
//    //initialisation des variables
//    double aConvertir, convertit=0;
//    char reponse=' ', mode = ' ';
//
//    System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
//    System.out.println("-------------------------------------------------");
//    
//    do{//tant que reponse = O //boucle principale
//       
//      do{//tant que reponse n'est pas O ou N
//        mode = ' ';
//        System.out.println("Choisissez le mode de conversion : ");
//        System.out.println("1 - Convertisseur Celsius - Fahrenheit");
//        System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
//        mode = sc.nextLine().charAt(0);
//       
//        if(mode != '1' && mode != '2')
//          System.out.println("Mode inconnu, veuillez réitérer votre choix.");
//
//      }while (mode != '1' && mode != '2');
//       
//      //saisie de la température à convertir
//      System.out.println("Température à convertir :");
//      aConvertir = sc.nextDouble();
//      //Pensez à vider la ligne lue
//      sc.nextLine();
//     
//      //Selon le mode, on calcule différemment et on affiche le résultat
//      if(mode == '1'){
//        convertit = ((9.0/5.0) * aConvertir) + 32.0;
//        System.out.print(aConvertir + " °C correspond à : ");
//        System.out.println(arrondi(convertit, 2) + " °F.");
//      }
//      else{
//        convertit = ((aConvertir - 32) * 5) / 9;
//        System.out.print(aConvertir + " °F correspond à : ");
//        System.out.println(arrondi(convertit, 2) + " °C.");
//      }
//     
//      //On invite l'utilisateur à recommencer ou à quitter
//      do{       
//        System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
//        reponse = sc.nextLine().charAt(0);
//       
//      }while(reponse != 'O' && reponse != 'N');
//     
//    }while(reponse == 'O');
//    
//  System.out.println("Au revoir !");
//    
//  //Fin de programme
  }
//    public static double arrondi(double A, int B) {
//           return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
//       } 
//  
}
        
    
        
        
    
    
    

