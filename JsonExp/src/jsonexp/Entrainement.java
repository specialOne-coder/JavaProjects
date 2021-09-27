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
public class Entrainement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
       String jfichier = "training.txt";
       
        JSONObject jobj = new JSONObject();
        
        jobj.put("Effectif Sil2" , 10 +"\n"); 
        jobj.put("Meilleurs", 3.5);

        JSONArray arr = new JSONArray();
        
        arr.add("Profs");
        arr.add("Cours");
        arr.add("Tables");
        arr.add("Projecteurs");
        arr.add("Sacs");
        arr.add("Etudiants");
        
        jobj.put("Composants Sil2", arr);
        
        FileWriter silfichier = new FileWriter(jfichier);
        
        silfichier.write(jobj.toJSONString());
        
        silfichier.flush();
        silfichier.close();
        
        System.err.println(jobj);
        
        
        
        
        
        
        
        
        
    }
    
}
