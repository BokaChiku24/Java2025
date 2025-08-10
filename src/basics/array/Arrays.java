package basics.array;

public class Arrays {
    public static void main(String[] args) {
        int number = 5; // Single integer variable
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
        int[] numbers2 = new int[5]; // Array of integers initialized with zeros
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(STR."Numbers Array: \{numbers2[i]}");
        }
        System.out.println(STR."Number Array: \{numbers[0]}");
    }
}
