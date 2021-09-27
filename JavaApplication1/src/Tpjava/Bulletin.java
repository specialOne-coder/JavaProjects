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
public class Bulletin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nom_etudiant;
    String prenom_etudiant;
    String filiere_etudiant;
    String matiere1;
    String matiere2;
    String matiere3;
    String matiere4;
    int note1;
    int note2;
    int note3;
    int note4;
    double moyenne;
    String decision;
    Scanner Scnom_etudiant= new Scanner(System.in);
    Scanner Scprenom_etudiant=new Scanner (System.in);
    Scanner Scfiliere_etudiant=new Scanner (System.in);
    Scanner Scmatietre1=new Scanner (System.in);
    Scanner Scmatiere2=new Scanner (System.in);
    Scanner Scmatiere3=new Scanner (System.in);
    Scanner Scmatiere4=new Scanner (System.in);
    Scanner Scnote1=new Scanner(System.in);
    Scanner Scnote2=new Scanner (System.in);
    Scanner Scnote3=new Scanner (System.in);
    Scanner Scnote4= new Scanner (System.in);
    Scanner Scmoyenne=new Scanner (System.in);
    Scanner Sc=new Scanner (System.in);
        System.out.println("veuiller entrer votre nom");
    nom_etudiant= Sc.nextLine();
        System.out.println("veuiller entrer votre prenom");
        prenom_etudiant=Sc.nextLine();
        System.out.println("veuiller entrer votre filiere");
        filiere_etudiant= Sc.nextLine();
        System.out.println("veuiller entrer la matietre1");
        matiere1=Sc.nextLine();
        System.out.println("veuiller entrer matiere2");
        matiere2=Sc.nextLine();
        System.out.println("veuiller entrer la matiere 3");
        matiere3= Sc.nextLine();
        System.out.println("veuiller entrer la matiere 4");
        matiere4= Sc.nextLine();
        System.out.println("cveuiller entrer la note 1");
        note1= Sc.nextInt();
        System.out.println("veuiller entrer la note 2");
        note2=Sc.nextInt();
        System.out.println("veuiller enttrer la note 3");
        note3= Sc.nextInt();
        System.out.println("veuimller entrer la note 4");
        note4=Sc.nextInt();
        moyenne=(note1+note2+note3+note4)/4;
        if (note1+note2+note3+note4>10) {
            System.out.println("vous etes admis"); 
        System.out.println("*************************************************************************");
        System.out.println("*                   BULLETIN DU 1ER SEMESTRE                            *");   
        System.out.println("*************************************************************************");
        System.out.println("* NOM :"+(nom_etudiant)+"******************************************************");
        System.out.println("* PRENOM :"+(prenom_etudiant)+"***************************************************");
        System.out.println("* FILIERE:"+(filiere_etudiant)+"**************************************************"); 
        System.out.println("*MATIERE :"+(matiere1)+"********************************"+(note1)+"***************");
        System.out.println("*MATIERE :"+(matiere2)+"********************************"+(note2)+"***************");
        System.out.println("*MATIERE :"+(matiere3)+"********************************"+(note3)+"***************");
        System.out.println("*MATIERE :"+(matiere4)+"********************************"+(note4)+"***************");
        System.out.println("*************************************************************************");
        System.out.println("*************************************************************************");
        System.out.println("*Moyenne :**"+(moyenne)+"**********************************************************************");
        
        } else {
            System.out.println("vous etes ajourne");
           
        }
            
        } 
        
        
        
        
        
        
        
             
    
    
    
    
    
    
    
    
    
    
    }
    
