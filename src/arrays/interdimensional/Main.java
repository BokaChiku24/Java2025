package arrays.interdimensional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        System.out.println((array.length));

        for(int[] outer : array){
            System.out.println(outer);
        }

        for(int[] outer : array){
            for(int num : outer){
                System.out.print(num + "\n");
            }
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array.length; i++){
            var innerArray = array[i];
            for(int j = 0; j < innerArray.length; j++){
                // System.out.print(array[i][j] + " ");
                array[i][j] = (i*10) + (j+1);
            }
        }

        for(var outer : array){
            for(var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));
    }
}
