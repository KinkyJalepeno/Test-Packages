package CastingDigits;

public class CastApp {


    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 50;
        int intValue = 550;
        long longValue = 34600;

        float floatValue = 56789.12f;
        double doubleValue = 32.5;


        System.out.println("The max size of a byte is:" + Byte.MAX_VALUE);

        System.out.println("The max size of a short is:" + Short.MAX_VALUE);

        System.out.println("The max size of an int is:" + Integer.MAX_VALUE);

        System.out.println("The max size of a long is:" + Long.MAX_VALUE);

        System.out.println("The max size of a float is:" + Float.MAX_VALUE);

        System.out.println("The max size of a double is:" + Double.MAX_VALUE);

        //casting is only needed when there is potential to lose a portion of the cast value

        //cast a long into an int - A long can be way bigger so potential to lose a big portion of a number
        intValue = (int)longValue;
        System.out.println("intValue = " + intValue);

        //No cast needed here as I am not really changing anything
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        //cast a float into an int requires a cast as the int will chop off the .xx without warning.
        intValue = (int)floatValue;
        System.out.println("intValue = " + intValue);

    }

}
