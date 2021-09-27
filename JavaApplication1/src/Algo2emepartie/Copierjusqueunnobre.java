/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algo2emepartie;

/**
 *
 * @author user01
 */
public class Copierjusqueunnobre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String CopyFromMe ="ferdinand est un grand sage 'g'";
     StringBuffer CopyToMe = new StringBuffer();
     int i=0;
     char e=CopyFromMe.charAt(i);
     while(e!='g'){ 
     CopyToMe.append(e);i=i+1;
     e=CopyFromMe.charAt(i);
         System.out.println(CopyToMe);
     
    }
    }
}
