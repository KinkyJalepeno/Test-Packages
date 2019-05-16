package serialisation.demo;

import java.io.*;

public class SerialisationDemo {

    public static void main(String[] args) {

        /* serialisation is used frequently to store high traffic objects and their states on disk for easy access
        Dynamic webpages taking data from multiple tables are a common use*/
        doSerialise();

        doDeserialise();

    }

    private static void doSerialise() {

        System.out.println("We are inside serialisation method");
        SerialisableDemo serialisableDemo = new SerialisableDemo();
        serialisableDemo.setName("KinkyJalepeno");

        System.out.println("Name before serialisation: " + serialisableDemo.getName());
        System.out.println("id before serialisation: " + serialisableDemo.getId());

        try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("serial.ser")))){

            out.writeObject(serialisableDemo);

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    private static void doDeserialise(){

        System.out.println("\n\nNow we are inside doDeserialisation..");

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("serial.ser")))){

            SerialisableDemo serialisableObj = (SerialisableDemo) in.readObject();
            System.out.println("Name after deserialisation: " + serialisableObj.getName());
            System.out.println("id after deserialisation: " + serialisableObj.getId());
        }catch(FileNotFoundException | ClassNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class SerialisableDemo implements Serializable {

        private String name;

        public String getName(){
            return name;
        }
        public void setName(String name){this.name = name;}

        private transient int id = 4;
        public int getId(){return id;}

    }
}
