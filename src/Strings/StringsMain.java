package Strings;

public class StringsMain {

    public static void main(String[] args) {

        stringExamples();

    }

    private static void stringExamples() {

        String s = "Hello World";

        System.out.println("s.length: " + s.length());
        System.out.println("s.isEmpty: " + s.isEmpty());

        // comparison methods
        System.out.println("s.equals (\"Hello World:\")" + s.equals("HELLO WORLD"));
        System.out.println("s.equalsIgnoreCase (\"Hello World\")" + s.equalsIgnoreCase("HELLO WORLD"));
        System.out.println("s.compareTo (\"HELLO WORLD\")" + s.compareTo("HELLO WORLD"));
    }

}
