package SplitCSV;

public class splitCSVString {

    public static void main(String[] args) {

        String data = "general motors|ibm watson|Dave Graham";
        String tokens[] = data.split("[|]");

        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
    }
}
