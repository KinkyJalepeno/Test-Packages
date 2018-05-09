package TestingDigits;

import java.util.Scanner;

public class DigitTest {

    public static void main(String[] args) {
        DigitTest test = new DigitTest();
        test.getNumber();
    }

    private void getNumber() {

        while(true) {
            System.out.print("Enter number to be tested or type exit to quit: ");
            Scanner sc = new Scanner(System.in);

            String mobile = sc.nextLine();
            if(mobile.equals("exit") || mobile.equals("Exit")){
                break;
            }else if (mobile.startsWith("07")) {
                DigitTest checkLength = new DigitTest();
                checkLength.checkLength(mobile);

            } else if (mobile.startsWith("+44")) {
                DigitTest stripAndReplace = new DigitTest();
                stripAndReplace.stripAndReplacePlus44(mobile);

            }else if(mobile.startsWith("44")){
                DigitTest strip44 = new DigitTest();
                strip44.stripAndReplace44(mobile);

            }else if(mobile.startsWith("7")){
                DigitTest addZero = new DigitTest();
                addZero.addZero(mobile);
            }
        }

    }

    private void addZero(String intMobile) {

        String newMobile = ("0" + intMobile);

        DigitTest checkLength = new DigitTest();
        checkLength.checkLength(newMobile);

    }

    private void stripAndReplace44(String intMobile) {

        System.out.println("Mobile starts with 44 ");

        String newMobile = ("0" + intMobile.substring(2));
        System.out.println("newMobile = " + newMobile);

        DigitTest checkLength = new DigitTest();
        checkLength.checkLength(newMobile);
    }

    public void checkLength(String intMobile) {
        int length = String.valueOf(intMobile).length();

        System.out.println("length = " + length);

        if (length < 11 || length > 11){

            System.out.println("Number: " + intMobile + " is sent to bad file");
        } else {
            System.out.println("Number: " + intMobile + " is sent to good file");
        }
    }

    private void stripAndReplacePlus44(String intMobile){

        System.out.println("Mobile starts with +44");
        String newMobile = ("0") + intMobile.substring(3);

        System.out.println("newMobile = " + newMobile);

        DigitTest checkLength = new DigitTest();
        checkLength.checkLength(newMobile);

    }

}

