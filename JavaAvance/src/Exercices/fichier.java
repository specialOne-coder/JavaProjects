/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercices;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ferdio
 */
public class fichier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("--------------- Mon Programme ----------------");
        System.out.println("");
        
        // Définition des lignes et colonnes du tableau
        int ligne = 5,colonne = 5;
        
        // Création des tableaux
        String tab[][] = new String[ligne][colonne];
        char tab2[] = new char[100];
        
        // Gestion de la saisie de l'user
        Scanner saisie = new Scanner(System.in);
        
        // Création du fichier pour l'ecriture
        FileWriter fw = new FileWriter("/home/ferdio/Java/fichier.txt");  
        
        // Parcours du tableau pour la saisie et l'ecriture dans le fichier
        for(int i =0;i < ligne;i++){
            for(int j =0;j < colonne;j++){
              System.out.println("Entrer "+i+" e ligne et "+j+" colone");
              tab[i][j] = saisie.nextLine();
              fw.write(tab[i][j]);
              fw.write(" ");
              if(j == colonne - 1){
                fw.write("\n");
              }
            }
        }
        
        // Fermeture du fichier 
        fw.close();
        
        
/**********************************************************************************/

        System.out.println("");
        
        // Ouverture du fichier pour la lecture 
        System.out.println("Récupération et affichage  dans le second tableau");
        System.out.println("");
        FileReader fr = new FileReader("/home/ferdio/Java/fichier.txt");
        fr.read(tab2);
        for(char parcours : tab2){
            System.out.print(parcours );
        }
        
        fr.close();
    }
    
}
