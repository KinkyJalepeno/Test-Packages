package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ping {

    public static void main(String[] args) {

        String hostName = "192.168.16.235";

        try{
            InetAddress host = InetAddress.getByName(hostName);
            System.out.println(host.isReachable(1000)); // returns boolean for isReachable method

        }catch (Exception e){

            System.out.println("Cannot connect to host " + hostName);
        }

        // if the above does not work then you can use an OS command "ping"
        try {
            Process process = Runtime.getRuntime().exec("ping " + hostName);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String pingResponse;

            while((pingResponse = inputStream.readLine()) != null){

                System.out.println("pingResponse = " + pingResponse);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
