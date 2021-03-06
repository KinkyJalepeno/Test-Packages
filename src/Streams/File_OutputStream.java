package Streams;

import java.io.FileOutputStream;

public class File_OutputStream {

    public static void main(String[] args) {

        try {
            FileOutputStream outputStream = new FileOutputStream("example2.txt");

            char H = 'H';
            outputStream.write(H);

            String string = "Hello java program, write this to my file";
            outputStream.write(string.getBytes());  // breaks up string into bytes
            // if another string is written after this, it will overwrite existing file contents
            // if you want to append text, pass true as 2nd argument - FileOutputStream("example2.txt", true);

            outputStream.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
