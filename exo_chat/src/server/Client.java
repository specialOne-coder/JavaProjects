/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Yassine Mahlaoui
 */
public class Client {

    private static Vector<Client> clients;

    static {
        clients = new Vector<Client>();
    }

    private int portClient;
    private InetAddress ipClient;
    private String nomClient;

    public Client(int portClient, InetAddress ipClient, String nomClient) {
        this.portClient = portClient;
        this.ipClient = ipClient;
        this.nomClient = nomClient;
        System.out.println("New Client => " + this.portClient + ", " +  this.ipClient + ", " + this.nomClient);
    }

    public InetAddress getIpClient() {
        return ipClient;
    }

    public void setIpClient(InetAddress ipClient) {
        this.ipClient = ipClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public int getPortClient() {
        return portClient;
    }

    public void setPortClient(int portClient) {
        this.portClient = portClient;
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static Client getClients(String nom) {
        Enumeration<Client> E = clients.elements();
        while (E.hasMoreElements()) {
            Client tmp = E.nextElement();
            if (tmp.getNomClient().equals(nom))
                return tmp;
        }
        return null;
    }

    public static boolean isClient(String nom) {
        Enumeration<Client> E = clients.elements();
        while (E.hasMoreElements()) {
            if (E.nextElement().getNomClient().equals(nom))
                return true;
        }
        return false;
    }

}
