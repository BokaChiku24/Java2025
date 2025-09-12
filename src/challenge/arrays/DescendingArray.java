package challenge.arrays;

import java.util.Arrays;
import java.util.Random;

public class DescendingArray {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = sortIntegerArray(new int[]{7,30,6,1,0,10,9,3,-1});
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] array = new int[len];
        for(int i = 0; i< len; i++){
          array[i] = random.nextInt(100);
        }
        return array;
    }

    private static int[] sortIntegerArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
