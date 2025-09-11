package arrays.binarysearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        if (Arrays.binarySearch(stringArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] s2 = Arrays.copyOf(s1, s1.length);

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
