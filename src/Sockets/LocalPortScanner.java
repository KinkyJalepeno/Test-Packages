package Sockets;

import java.io.IOException;
import java.net.ServerSocket;

public class LocalPortScanner {

    public static void main(String[] args) {

        int port = 1;

        while(port <= 65535) {
            try {
                ServerSocket server = new ServerSocket(port);


            } catch (IOException e) {
                System.out.println(port + " is in use ");
            }
            port++;
        }
    }
}
