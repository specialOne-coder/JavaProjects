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
public interface Interface extends Remote{
    public java.util.Date datation() throws RemoteException;
}
