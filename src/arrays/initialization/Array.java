package arrays.initialization;

public class Array {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[4] = 10;
        System.out.println(myIntArray[4]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 3.14D;
        System.out.println(myDoubleArray[0]);
        System.out.println("Length of the array => " + myDoubleArray.length);


        float[] myFloatArray = new float[]{12.4f, 3.14f, 4.27f};
        System.out.println(myFloatArray[0]);
        System.out.println("Length of the array => " + myFloatArray.length);

        String[] myStringArray = {"abc", "cvf", "rtt", "kji"};
        System.out.println(myStringArray[0]);
        int length = myStringArray.length;
        System.out.println("Length of the array => " + length);
        // System.out.println("Value of the array => " + myStringArray[length]); // ArrayIndexOutOfBoundsException
        System.out.println("Value of the array => " + myStringArray[length - 1]);

        int[] myInt;
        myInt = new int[]{1, 2, 3, 4, 5};
        System.out.println(myInt[0]);
        length = myInt.length;
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(myInt[i] + " ");
        }
    }
}
