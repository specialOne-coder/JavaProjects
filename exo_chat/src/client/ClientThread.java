/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import main1.Util;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.StringTokenizer;

/**
 *
 * @author Yassine Mahlaoui
 */
public class ClientThread extends Thread {

    private int port;
    private byte [] tampon;
    private int length = 1024;

    public ClientThread(int port) {
        this.port = port;
        tampon = new byte [length];
    }

    @Override
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket(port);
            while (true) {
                DatagramPacket packet = new DatagramPacket(tampon, length);
                try {
                    socket.receive(packet);
                    analyse(packet);
                } catch (SocketException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }

    private void analyse(DatagramPacket packet) {
        String data = new String(packet.getData());

        StringTokenizer token =  new StringTokenizer(data, Util.DELIM);

        Client.newMessageArrived(token.nextToken(), token.nextToken());
    }
    
}
