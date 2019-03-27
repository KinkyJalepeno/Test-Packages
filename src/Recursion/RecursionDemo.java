package Recursion;

public class RecursionDemo {

    public static void main(String[] args) {

        int value = 4;
        calculate(value);

        // lets calculate factors of 4 displayed as 4! = 4 x 3 x 2 x 1
        System.out.println(calculateFactor(value));
    }

    // basic recursive function in a method
    private static void calculate(int value) {

        System.out.println("value = " + value);

        if (value == 1) {

            return;
        }
        calculate(value - 1);
    }

    private static int calculateFactor(int value) {

        if (value == 0) {
            return 1;
        }

        return calculateFactor(value - 1) * value;
        /* this will create heap frames:-
        calculateFactor(4)
            calculateFactorial(3)
                calculateFactorial(2)
                    calculateFactorial(1)
        Factorial of 0 triggers if condition and returns 1, so now process reverses:-
                    1 * calculateFactorial(1) = 1
                2 * calculateFactorial(1) = 2
            3 * calculateFactorial(2) = 6
        4 * calculateFactorial(6) = 24

         */
    }

}
