package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

    public static void main(String[] args){

        try{
            // datagram sockets support 2way traffic from multiple clients
            DatagramSocket socket = new DatagramSocket(9090);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];

            //use while loop to enable receipt of traffic from multiple clients
            while(true){
                // we need to supply a byte array to datagram packet (receiveData) to store incoming traffic
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // now wrap the datagram packet up in datagram socket
                socket.receive(receivePacket);

                //create a string to dump traffic into from the datagram socket
                String string = new String(receivePacket.getData());
                System.out.println("Message from CLIENT: " + string);

                // generate a response and convert to bytes
                String response = "Hello Mr Client, I am the server";
                sendData = response.getBytes();

                // get the client Ip Address and port
                InetAddress clientIpAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                // create a sending datagram packet with essential params and send
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
                socket.send(sendPacket);
            }


        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
/*
Datagram Socket(port)
byte[] for storing incoming traffic
datagram packet(byte[])
datagram socket.receive(datagram packet)
string to accept and display contents packet - receivePacket.getData()
*/