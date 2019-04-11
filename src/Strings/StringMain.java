package Strings;

public class StringMain {

    public static void main(String[] args) {

        stringExamples();
    }

    private static void stringExamples() {

        String text = "Hello World";

        System.out.println("Text length: " + text.length()); // length of String

        System.out.println("text.empty():" + text.isEmpty()); // boolean is string empty?

        // Comparison
        System.out.println("\ntext.equals(\"HELLO WORLD!\"): " + text.equals("HELLO WORLD!"));
        System.out.println("text.equalsIgnoreCase(\"HELLO WORLD!\"): " + text.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("text.compareTo(\"HELLO WORLD!\"): " + text.compareTo("HELLO WORLD!"));

        // Searching
        System.out.println("\ntext.contains(\"HELLO WORLD!\"): " + text.contains("HELLO WORLD!"));
        System.out.println("text.contains(\"world!\"): " + text.contains("world!"));
        System.out.println("text.startsWith(\"HELLO WORLD!\"): " + text.startsWith("HELLO WORLD!"));
        System.out.println("text.startsWith(\"hello world!\"): " + text.startsWith("hello world!"));
        System.out.println("text.endsWith(\"!\"): " + text.endsWith("!"));
        System.out.println("text.indexOf(\"lo\"): " + text.indexOf("lo"));
        System.out.println("text.indexOf(\"o\"): " + text.indexOf('o'));
        System.out.println("text.lastIndexOf(\"o\"): " + text.lastIndexOf('o'));

        // Examining individual characters
        System.out.println("\ntext.charAt(4): " + text.charAt(4));

        // Extracting substrings
        System.out.println("\ntext.substring(4): " + text.substring(4));
        System.out.println("text.substring(4, 9): " + text.substring(4, 9));

        // Case conversions (Note: String is immutable. So, only a copy is returned)
        System.out.println("\ntext.toUpperCase(): " + text.toUpperCase());
        System.out.println("text.toLowerCase(): " + text.toLowerCase());

        System.out.println("\ntext.trim(): " + text.trim()); // returns a copy of string after trimming any leading & trailing white spaces


        // Replace (e.g., replace comma's with white-space)
        System.out.println("\ntext.replaceAll(\"o\", \"r\"): " + text.replaceAll("o", "r"));

        // Split (e.g., split a document into words or split a line of text by tab or comma or white space)
        System.out.println("\ntext.split(\"o\"): ");
        String[] sa = text.split("o");
        for (String temp : sa) {
            System.out.println(temp);
        }

        // Static method (includes overloaded methods)
        System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
    }
}
