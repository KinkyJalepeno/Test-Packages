package Streams;

import java.io.BufferedReader;;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedStream {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("example6.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("example7.txt"));

            String text = null;
            while((text = reader.readLine()) != null){

                System.out.println(text);
                writer.write(text);
                writer.newLine(); // without this lines in original will not be honoured

            }

            writer.write("I added this at the end for the giggles");

            reader.close();
            writer.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
