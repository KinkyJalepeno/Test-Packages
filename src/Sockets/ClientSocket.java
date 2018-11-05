package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

    public static void main(String[] args) {

        try{

            Socket socket = new Socket("localhost", 9090);

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(input.readLine());
            output.println("Hello there server");

            input.close();
            output.close();
            socket.close();

        }catch(UnknownHostException e1){
            System.out.println("Unknown Host Exception " + e1.toString());
        }catch(IOException e2){
            System.out.println("IOException " + e2.toString());
        }catch(IllegalArgumentException e3){
            System.out.println("Illegal Argument Exception " + e3.toString());
        }catch(Exception e4){
            System.out.println("Something is wrong " + e4.toString());
        }

    }
}
