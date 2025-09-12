package arrays.interdimensional;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++){
            var innerArray = array[i];
            for(int j = 0; j < innerArray.length; j++){
                // System.out.print(array[i][j] + " ");
                array[i][j] = (i*10) + (j+1);
            }
        }
        array[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[]{"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"},
                {"6","7","8","9"}
        };

        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object object : anyArray){
            System.out.println("Element type = " + object.getClass().getSimpleName());
            System.out.println("Element toString() = " + object);
            System.out.println(Arrays.deepToString((Object[])object));
        }

    }
}
