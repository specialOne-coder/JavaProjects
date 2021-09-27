/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exep;

/**
 *
 * @author root
 */
public class Dico {
    
   
// Lettre à stocker
char lettre;
// Dictionnaire des suffixes
Dico suffixe;
// Dictionnaire des mots commençants par une lettre plus grande
// que 'lettre' dans l'ordre alphabétique
Dico autreLettre;

// Constructeur simple initialisant chacun des attributs d'un
// objet Dico.
private Dico(char lettre, Dico suffixe, Dico autreLettre) {
this.lettre = lettre;
this.suffixe = suffixe;
this.autreLettre = autreLettre;
}

// Constructeur récursif construisant un dictionnaire contenant
// un unique mot passé en argument
public Dico(String mot) {
if (mot == null || mot.length() == 0) {
this.lettre = '*';
this.suffixe = null;
} else {
this.lettre = mot.charAt(0);
this.suffixe = new Dico(mot.substring(1));
}
this.autreLettre = null;
}


// Méthode statique ajoutant mot au dictionnaire passé
// en second argument
public Dico ajouter(String mot, Dico precedent) {
// Si le dictionnaire est vide construire un dictionnaire
// contenant uniquement mot.
if (precedent == null) {
return new Dico(mot);
}else{
    System.out.println(mot);
}

// Si mot null ne pas modifier le dictionnaire
if(mot == null) {
return precedent;
}
// Si longueur du mot nulle et '*' déjà à cet endroit
// ne pas modifier le dictionnaire ('*' plus petit que
// toutes les lettres dans l'ordre < ), sinon ajouter '*'
// avant toutes les autres lettres contenu dans le dictionnaire
// précédent.
if(mot.length() == 0) {
if (precedent.lettre == '*') {
return precedent;
} else {
return new Dico('*',null,precedent);
}
}
// Si la première lettre du mot est plus petite que toutes les premières
// lettres des autres mots du dictionnaire ajouter le mot avant tous
// les autres mots.
if (precedent.lettre > mot.charAt(0)) {
Dico temp = new Dico(mot);
temp.autreLettre = precedent;
return temp;
}
// Si la première lettre du mot est plus grande que la première lettre
// du dictionnaire, ajouter le mot au dictionnaire des mots commençants
// par d'autres lettres
if (precedent.lettre < mot.charAt(0)) {
precedent.autreLettre = ajouter(mot,precedent.autreLettre);
return precedent;
}
// Si la première lettre du mot est déjà dans le dictionnaire,
// ajouter le suffie du mot au dictionnaire des suffixes de cette lettre.
precedent.suffixe = ajouter(mot.substring(1),precedent.suffixe);
return precedent;
}

// Méthode de recherche du mot dans le dictionnaire.
public boolean rechercher(String mot) {
// Si le mot ou le dictionnaire sont vide retourner faux
if (mot == null) {
return false;
}
// Si la longueur du mot est nulle, retourner vrai si
// la lettre courante est '*', sinon retourner faux.
if (mot.length() == 0){
return (lettre == '*');
}
// Si la première lettre du mot est plus petite que la
// première lettre de tous les mots du dictionnaire le
// mot n'est pas dans le dictionnaire.
if (lettre > mot.charAt(0)) {
return false;
}
// Si la première lettre du mot est plus grande que la lettre courante,
// rechercher le mot dans le dictionnaire des mots commençants par une autre lettre
if (lettre < mot.charAt(0)) {
return autreLettre != null ? autreLettre.rechercher(mot) : false;
}
// Si la première lettre du mot est la lettre courante, rechercher le suffixe du mot
// dans le dictionnaire.
return suffixe.rechercher(mot.substring(1));
}


// Méthode de recherche du mot dans le dictionnaire.
public Dico prefixSearch(String mot) {
// Si le mot ou le dictionnaire sont vide retourner faux
if (mot == null) {
return null;
}
// Si la longueur du mot est nulle, retourner vrai si
// la lettre courante est '*', sinon retourner faux.
if (mot.length() == 0){
return this;
}
// Si la première lettre du mot est plus petite que la
// première lettre de tous les mots du dictionnaire le
// mot n'est pas dans le dictionnaire.
if (lettre > mot.charAt(0)) {
return null;
}
// Si la première lettre du mot est plus grande que la lettre courante,
// rechercher le mot dans le dictionnaire des mots commençants par une autre lettre
if (lettre < mot.charAt(0)) {
return autreLettre != null ? autreLettre.prefixSearch(mot) : null;
}
// Si la première lettre du mot est la lettre courante, rechercher le suffixe du mot
// dans le dictionnaire.
return suffixe.prefixSearch(mot.substring(1));
}


// Méthode utilisée par println() pour afficher le dictionnaire.
// Appelle l'autre méthode toString avec un suffixe vide.
public String toString(){
return this.toString("");
}


// Méthode utilisée pour afficher le dictionnaire.
public String toString(String prefix){
String tmp = "";
if (lettre == '*'){
// Si '*' est la lettre courante le préfixe est un mot du dictionnaire,
// le stocker pour l'affichage suivi du caractère '\n' (retour à la ligne).
tmp = prefix + "\n";
} else {
// Sinon ajouter la lettre courante au préfixe pour afficher le dictionnaire des
// suffixes.
tmp = suffixe.toString(prefix+lettre);
}
// Si le dictionnaire des mots commençants par une autre lettre n'est pas vide
// l'afficher.
if(autreLettre != null) {
tmp += autreLettre.toString(prefix);
}
return tmp;
}
} 
    
    
    
    
    
    
    
    
    
    
    
    

