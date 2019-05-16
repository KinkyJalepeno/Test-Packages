package read.from.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadTest {

    public static void main(String[] args) {

        String data;

        System.out.print("Enter \"start\" to continue: ");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))){
            while ((data = in.readLine()) != null && !data.equals("start")){

                System.out.println("\nDid not enter \"start\", try again");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Correct !!");
    }
}
/*
Personal note: Buffer and InputStream is good for large amounts of data as it has a bigger buffer, scanner is generally ok.
BufferedReader is only for Strings.
 */