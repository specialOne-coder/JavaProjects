/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ferdio
 */



public class TpRMI {
   
    public interface Modelelnterface extends Remote {
           public java.util.Date datation() throws RemoteException;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
