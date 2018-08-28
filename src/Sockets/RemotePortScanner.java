package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class RemotePortScanner {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        String targetIP = "";
        int fromPort = 0;
        int toPort = 0;

        try {
            System.out.print("Please enter target ip address: ");
            targetIP = reader.readLine();

            System.out.print("Enter port to start scanning from: ");
            String startPort = reader.readLine();
            fromPort = Integer.valueOf(startPort);

            System.out.print("Enter last port to scan: ");
            String endPort = reader.readLine();
            toPort = Integer.valueOf(endPort);

            System.out.println("toPort = " + fromPort);
            System.out.println("toPort = " + toPort);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        int port = fromPort;

        if (fromPort >= 1 && toPort <= 65536) {

            if (fromPort < toPort) {

                System.out.println("\nBeginning Scan....................");

                while (port <= toPort) {

                    try {
                        Socket socket = new Socket();
                        socket.connect(new InetSocketAddress(targetIP, port), 2000);

                        System.out.println("Port " + port + " is in a listening state");
                        socket.close();

                    } catch (UnknownHostException e1) {

                        System.out.println("Address not found: " + e1.toString());

                    } catch (IOException e2) {

                        System.out.println("Port " + port + " is closed");

                    } catch (Exception e3) {

                        System.out.println("Something is wrong " + e3.toString());
                    }
                    port++;
                }

            }
        } else {
            System.out.println("Ports musty be in range 1 to 65536 ");
        }
    }
}
