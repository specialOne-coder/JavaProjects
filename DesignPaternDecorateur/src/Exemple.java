
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Exemple {
    public static void main(String[] args) throws IOException {      
        
             FileWriter file = new FileWriter("sample.txt");     
             BufferedWriter writer = new BufferedWriter(file);       
             writer.write("un petit exemple de texte");  
             writer.newLine();          
             
     }
}

