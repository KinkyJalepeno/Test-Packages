package BinarySearch;

public class MainClass {

    public static void main(String[] args) {

        int[] list = {11, 19, 24, 34, 55, 60, 72, 83, 90};
        int index = binarySearch(list, 0, 8, 100);

        System.out.println("index " + index);

    }


    private static int binarySearch(int[] list, int low, int high, int key) {

        if (low == high) { // are the two indexes equal?

            if (key == list[low]) { // is the key equal to value in low ( high is same)

                return low; // if yes return the index as key has been found
            } else {
                System.out.println("key " + key + " does not appear in array. ");
                return -1; // if low and high indexes are same and key != values in low or high then its not present in array
            }
        }

        int mid = (low + high) / 2; // find array mid point

        if (key == list[mid]) { // is the value at mid point = key?
            return mid; // if yes it's found so return the index

        } else if (key > list[mid]) { // is the key value higher than the value in the mid point
            return binarySearch(list, mid + 1, high, key); // if it is then recursively loop back from mid + 1
        } else {
            return binarySearch(list, low, mid - 1, key); // if above is false then key has to be in lower half
        }
    }
}
