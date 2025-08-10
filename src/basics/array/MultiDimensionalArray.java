package basics.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // 2D array
        int [][] myArray = new int[3][2];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[1][0] = 3;
        myArray[1][1] = 4;
        myArray[2][0] = 5;
        myArray[2][1] = 6;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();  // Print new line after each row to separate them.
        }
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : myArray2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();  // Print new line after each row to separate them.
        }
    }

}
