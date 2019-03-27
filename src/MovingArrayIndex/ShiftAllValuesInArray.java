package MovingArrayIndex;

import java.util.Arrays;

public class ShiftAllValuesInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        // shift values to the left and insert 6 at the end to output 2,3,4,5,6

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {

            array[i - 1] = array[i];

        }
        array[4] = 6;
        System.out.println(Arrays.toString(array) + "\n");

        shiftRight();
    }

    private static void shiftRight() {

        int[] array = {1, 2, 3, 4, 5};
        // shift values to the right and insert 0 at the beginning to output 0,1,2,3,4

        System.out.println(Arrays.toString(array));

        for (int i = array.length - 2; i >= 0; i--) {

            array[i + 1] = array[i];

        }
        array[0] = 0;
        System.out.println(Arrays.toString(array));

    }

}
