package Streams;

import java.io.*;

public class File_InputStream {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("example1.txt");

            int data = inputStream.read();

            // the end of file character = -1 so use in while loop
            while(data != -1){

                System.out.print((char) data); // with only (data); the ascii codes will be printed out and not chars
                data = inputStream.read();
            }
            inputStream.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
