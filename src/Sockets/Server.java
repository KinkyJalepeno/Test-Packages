package Sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Waiting for client: ");

            boolean stop = false;
            while(!stop) {
                Socket socket = serverSocket.accept();

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello client, this is the server");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientInput = input.readLine();

                System.out.println(clientInput);
                if(clientInput.equals("stop")){
                    stop = true;
                }

                input.close();
                out.close();
                socket.close();
            }
            serverSocket.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}

// This is a server that can only connect to one client at a time.