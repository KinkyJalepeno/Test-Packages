package TryWithResources;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        File file = new File("test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = br.readLine()) != null){
                System.out.println("line = " + line);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Cant find the file matey");;
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
