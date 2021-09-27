/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexp;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author root
 */
public class JsonExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       String jsonfichier = "exemple.txt";
       
       JSONObject objet = new JSONObject();
       
       objet.put("Url", "www.madle.com");
       objet.put("produits", 2000000);
       
       JSONArray tab = new JSONArray();
       
       tab.add("Produits Pour Hommes");
       tab.add("Produits pour femmes");
       
       objet.put("Madle", tab);
       
       FileWriter fichier = new FileWriter(jsonfichier);
       
       fichier.write(objet.toJSONString());
        
       fichier.flush();
       fichier.close();
        
       
        System.err.println(objet);
       


        
        
        
    }
    
}
