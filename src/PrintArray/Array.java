package PrintArray;

import java.util.Arrays;

public class Array {

    public static void main(String[] args){

        Array array = new Array();
        int[] pi = array.numbers();

        //This way to print raw contents in a row in format [1, 3, 5, 7]
        System.out.println (Arrays.toString(pi));

        //This way will print out each value only
        for(int temp : pi){
            System.out.println(temp);
        }
    }

    private int[] numbers(){

        int[] values = {1, 3, 5, 7};

        return values;
    }


}
