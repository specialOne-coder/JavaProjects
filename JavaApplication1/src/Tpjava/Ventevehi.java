/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpjava;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class Ventevehi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc= new Scanner(System.in);
    String rep;
    String choixnrt;
    int prixnrt;
    int prixgari;
    int prixhuile;
    int nbresachet;
    final int sachet=25;
        System.out.println("voulez vous achetez a manger?");
        rep=Sc.nextLine();
        while(!rep.equals("oui")&!rep.equals("non")){
            System.out.println("incorrect veuiller refaire votre choix");
            rep=Sc.nextLine();
        }
        if(rep.equals("oui")){
            System.out.println("que voulez vous? VEHI? AZIKOKOUI? AZIKOKUI-VEHI");
            choixnrt=Sc.nextLine();
            while(!choixnrt.equals("vehi")&!choixnrt.equals("azikokui")&!choixnrt.equals("azikokui-vehi")){
                System.out.println("reponse erronee veuiller ressaisir");
                choixnrt=Sc.nextLine();
            }
            System.out.println("combien voulez vous?");
            prixnrt=Sc.nextInt();
            System.out.println("je n'ai que l'huile rouge");
            prixhuile=Sc.nextInt();
            System.out.println("gari combien?");
            prixgari=Sc.nextInt();
            System.out.println("combien de sachets veux tu?");
            nbresachet=Sc.nextInt();
            System.out.println("votre facture est:"+((prixnrt)+(prixgari)+(prixhuile)+(nbresachet*sachet) ));
            }
        if(rep.equals("non")){
            System.out.println("boulefie");
            
        }
        }
        
    
    
}
