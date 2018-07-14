package Snippets;

import java.util.Arrays;

public class Array {

    public static void main(String[] args){

        Array array = new Array();
        int[] pi = array.numbers();

        System.out.println (Arrays.toString(pi));
    }

    private int[] numbers(){

        int[] values = {1, 3, 5, 7};

        return values;
    }


}
