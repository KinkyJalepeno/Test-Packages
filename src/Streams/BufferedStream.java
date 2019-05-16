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

            /* using the above method of wrapping a file writer/reader directly into a buffered reader/writer
            you are using by default the O/S default char encoding which might not be suitable.
            To control what encoding is used we need to use input and output stream readers.
            ie - BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("example6.txt"), "UTF-8"))) {..}
            */
            String text;
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
