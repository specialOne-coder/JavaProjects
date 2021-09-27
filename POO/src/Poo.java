/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferdinand ATTIVI
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Etudiant LaSenegalaise=new Etudiant();
    
    //Les proprietes de la variable
        System.out.println("le nom de la senegalaise est :"+LaSenegalaise.getNomEtd());
        System.out.println("le prenom est :"+LaSenegalaise.getPrenomEtd());
     
     //Modifions les données
     
     LaSenegalaise.setNomEtd("MARIAM");
     LaSenegalaise.setPrenomEtd("Afi");
     LaSenegalaise.setAgeEtd(20);
     
     //Utilisons un constructeur avec parametre
     
     Etudiant LaTogolaise=new Etudiant("PILON","yannis","masculin",10,96269025,2008);
     
      System.out.println("le nom DU TOGOLAIS est :"+LaTogolaise.getNomEtd());
        System.out.println("le prenom est :"+LaTogolaise.getPrenomEtd());
        System.out.println("son sexe est :"+LaTogolaise.getSexeEtd());
        System.out.println("son age est :"+LaTogolaise.getAgeEtd());
        System.out.println("son num est :"+LaTogolaise.getTelEtd());
        System.out.println("l'année de naissance est :"+LaTogolaise.getAnneeNaissEtd());
        
       
        
        System.out.println("l'etudiante "  +LaSenegalaise.getNomEtd()+ " a " +LaSenegalaise.CalculagePersonne(2019,2000));
        
        System.out.println("La longueur du nom et du prenom " + (LaSenegalaise.longueurChaine(LaSenegalaise.getNomEtd())+ LaSenegalaise.longueurChaine(LaSenegalaise.getPrenomEtd()) )  );
    
        //Sub String
        System.out.println("");
        //Implementation(Appelle une methode depuis une autre classe) de la methiode (classe enseignant)
        Enseignant Aladji=new Enseignant();
        
        System.out.println("le Salaire de Mr Aladji est :" +LaSenegalaise.salaireEns(100000, 10000, 5000));
    
    }
    
}
