package arrays.loop;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[5];

        for(int i =0; i< newArray.length;i++){
            newArray[i] = newArray.length - i;
        }

        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }

        System.out.print("\n" + "Enhanced For Loop" );
        for(int element : newArray){
            System.out.println(element);
        }

        System.out.println(newArray); // Array Address

        System.out.println("Arrays class");

        String myStringArray = Arrays.toString(newArray);
        System.out.println(myStringArray);

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("Object Variable is really an int array");
        }


    }
}
