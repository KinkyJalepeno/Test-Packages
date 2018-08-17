package Streams;

import java.io.*;

public class DataStream {

    public static void main(String[] args) {

        // DataInputStream - read Java primitives
        // DataOutputStream - write Java primitives

        File file = new File("example3.txt");
        if(file.exists()){
            System.out.println("File already exiasts " + file.getName());
        }
        else{
            try {

                if(file.createNewFile()){
                    System.out.println("File was created successfully ");
                    System.out.println("Filepath: " + file.getAbsolutePath());
                }else{
                    System.out.println("Cannot create file ");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));

            out.writeInt(72);
            out.writeDouble(678.00);
            out.writeFloat(123.45f);

            int var1 = in.readInt();
            double var2 = in.readDouble();
            float var3 = in.readFloat();

            System.out.println("var1 = " + var1);
            System.out.println("var2 = " + var2);
            System.out.println("var3 = " + var3);

            out.close();
            in.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
