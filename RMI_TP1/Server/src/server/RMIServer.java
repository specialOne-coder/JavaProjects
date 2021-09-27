/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sun.datatransfer.DataFlavorUtil.RMI;


/**
 *
 * @author acer
 */
public class RMIServer extends RMI {

    public RMIServer() throws RemoteException {
        super();
    }

    public String getData(String text) throws RemoteException {
        text = "My " + text;

        return text;
    }

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("server", (Remote) new RMIServer());
            System.out.println("Server started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Integer calculate(int a, int b, int ch) throws RemoteException {
        Integer result = null;
        try {

            switch (ch) {
                case 1:
                    return a + b;
                    
                case 2:
                    return a - b;
                    
                case 3:
                    return a * b;
                    
                case 4:
                    return a / b;
                   
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            return result;
        } catch (Exception e) {
            return null;
        }

    }

}
