/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author acer
 */
public interface RMIInterface extends Remote {

    public String getData(String text) throws RemoteException;

    public Integer calculate(int a, int b, int ch) throws RemoteException;
    
}
