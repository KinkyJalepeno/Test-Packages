package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {

    public static void main(String[] args) {

        try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example5.txt"));
             InputStreamReader in = new InputStreamReader(new FileInputStream("example5.txt"))){

            //System.out.println(out.getEncoding()); // will show char set used

            out.write("Yolo, what time we off out to eat??");
            out.flush();// nothing will be written unless you call the flush method which clears/writes the stream
            // this can be repeated so long as the stream remains open.

            //out.close(); if flush method is not used then the close method will also write stream contents to file
            // but stream is then closed which is not necessary using try-with resources.

            int data = in.read();
            while(data != -1){

                System.out.print((char)data);
                data = in.read();
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
