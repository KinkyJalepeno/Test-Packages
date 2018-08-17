package Streams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrntStream {

    public static void main(String[] args) {

        try {
            PrintStream out = new PrintStream("example8.txt");

            int var1 = 10;

            out.println("The value of var1 is: " + var1);
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
