/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etude;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TestMain {

    private static List<Filiere> listeFiliere = new ArrayList<>();
    private static List<List<Etudiant>> allEtudiants = new ArrayList<>();

    public static void main(String[] args) {
        
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            Filiere filiere = new Filiere();
            System.out.println("Code de la filière : ");
            filiere.setCodeFiliere(sc.nextLine());
            System.out.println("Nom de la filière : ");
            filiere.setNomFiliere(sc.nextLine());
            listeFiliere.add(filiere);
        }
        
        listeFiliere.stream().map((filiere) -> {
            List<Etudiant> etudiantsInFiliere = new ArrayList<>();
            System.out.println("Etudiants de la filière : ");
            filiere.afficher();
            for (int i = 0; i < 2; i++) {
                Scanner sc = new Scanner(System.in);
                Etudiant etudiant = new Etudiant();
                etudiant.setFiliere(filiere);
                //Saisie des information de l'étudiant
                System.out.println("Matricule : ");
                etudiant.setMatricule(sc.nextLine());
                System.out.println("Nom : ");
                etudiant.setNom(sc.nextLine());
                System.out.println("Prénoms : ");
                etudiant.setPrenom(sc.nextLine());
                System.out.println("Téléphone : ");
                etudiant.setTelephone(sc.nextLine());
                System.out.println("Age : ");
                etudiant.setAge(sc.nextInt());
                
                etudiantsInFiliere.add(etudiant);
            }
            return etudiantsInFiliere;
        }).forEachOrdered((etudiantsInFiliere) -> {
            allEtudiants.add(etudiantsInFiliere);
        });
        
        //Conversion des données en JSON
        Gson gs = new GsonBuilder().create();
        String allEtudiantJson = gs.toJson(allEtudiants);
        String allFiliereJson = gs.toJson(listeFiliere);
        System.out.println(allFiliereJson);
        System.out.println(allEtudiantJson);
    }
}
