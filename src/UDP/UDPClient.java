package UDP;

import java.net.*;



public class UDPClient {

    public static void main(String[] args) {

        try{
            DatagramSocket clientSocket = new DatagramSocket(0); // using port 0 means java will pick random port

            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];  // 1k buffer for TX/RX
            // Max size for buffer = 65535 -20(IP header) -8(UDP Header) = 65508

            InetAddress serverAddress = InetAddress.getByName("localhost");

            clientSocket.setSoTimeout(3000);

            String stringSendData = "Hello there Mr Server...";
            sendData = stringSendData.getBytes(); // convert String to bytes

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            receiveData = receivePacket.getData();
            String stringReceiveData = new String(receiveData);
            System.out.println("From Server: " + stringReceiveData );

            clientSocket.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
