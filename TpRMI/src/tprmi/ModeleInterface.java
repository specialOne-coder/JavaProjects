/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tprmi;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.GregorianCalendar;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ferdio
 */
public class ModeleInterface extends UnicastRemoteObject implements Interface{
    
    protected ModeleInterface()throws RemoteException {
      super();
    }
    
    public Date datation() throws RemoteException {
        return new GregorianCalendar().getTime();
     }
     public void miseAJour(){
     }
        Registry regis = LocateRegistry.createRegistry(1099);
        ModeleInterface modele = new ModeleInterface();

}
