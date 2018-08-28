package Sockets;

import org.apache.commons.validator.routines.InetAddressValidator;

import java.util.Scanner;

public class ValidateIP {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = in.next();

        InetAddressValidator validator = new InetAddressValidator(); //uses commons validator library
        boolean isValid = validator.isValid(ipAddress);

        if(isValid){
            System.out.println(ipAddress + " is valid.");
        }else {
            System.out.println(ipAddress + " is NOT a valid IP address");
        }

        System.out.println("Boolean method says IP Address valid: " + validateIpAddress(ipAddress));
    }

    public static boolean validateIpAddress(String ipAddress){

        String[] numbers = ipAddress.split("\\.");
        if (numbers.length != 4){
            return false;
        }

        for(String str: numbers){
            int i = Integer.parseInt(str);
            if((i<0) || (i>255)){
                return false;
            }
        }
        return true;
    }
}
