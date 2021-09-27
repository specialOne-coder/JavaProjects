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
public class Matikbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc = new Scanner (System.in);
    String nom_facebook;
        System.out.println("VEUILLIER ENTRER UN NOM FACEBOOK");
        nom_facebook=Sc.nextLine();
        if(nom_facebook.equals("matik like")||nom_facebook.equals("parfait souciman")||nom_facebook.equals("momo savage")||nom_facebook.equals("armel mario")){
            System.out.println("FELICITATION VOUS ETES UN BUZZMAN");
        }else{
            System.out.println("VOUS ETES NUL SUR FACEBOOK ENTRER UN AUTRE NOM");
        }
    }
    }

