/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import sun.datatransfer.DataFlavorUtil.RMI;

/**
 *
 * @author acer
 */
public class RMIClient {

    public static void main(String[] args) {
        try {

            RMIClient client = new RMIClient();
            RMI rmi = client.connectServer();
            
            if (rmi==null) {
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1, n2, ans;
            int choice;
            String cont;

            do {
                System.out.println("--------MENU-------------------");
                System.out.println("---- 1. For Addition       ----");
                System.out.println("---- 2. For Substraction   ----");
                System.out.println("---- 3. For Multiplication ----");
                System.out.println("---- 4. For Division       ----");
                System.out.println("-------------------------------");
                System.out.print("Your choice : ");
                choice = Integer.parseInt(br.readLine());
                System.out.print("First number : ");
                n1 = Integer.parseInt(br.readLine());
                System.out.print("Second number : ");
                n2 = Integer.parseInt(br.readLine());
                //ans = rmi.calculate(n1, n2, choice);
               // System.out.println("The Process result is : " + ans);
                System.out.print("Do you want to continue ? (Y/N) : ");
                cont = br.readLine();

            } while (cont.equalsIgnoreCase("Y"));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private RMI connectServer() {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            RMI rmi = (RMI) reg.lookup("server");

            return rmi;
        } catch (Exception e) {
            System.out.println("Server is not running...");
            return null;
        }

    }

}
