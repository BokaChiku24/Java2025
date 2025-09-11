package arrays.objectarray;

import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[5];

        for(int i =0; i< newArray.length;i++){
            newArray[i] = newArray.length - i;
        }

       Object[] objectArray = new Object[3];
       objectArray[0] = "Hello";
       objectArray[1] = new StringBuilder("World");
       objectArray[2] = Arrays.toString(newArray);
       System.out.println(Arrays.toString(objectArray));
    }
}
