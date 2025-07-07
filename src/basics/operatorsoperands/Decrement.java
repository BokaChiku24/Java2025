package basics.operatorsoperands;

public class Decrement {
    public static void main(String[] args) {
        int result = 1;
        result = result - 1;
        System.out.println("Result is: " + result); // 0

        // Pre-Decrement
        int newResult = 2;
        System.out.println("Result is: " + --newResult); // 1

        // Post-Decrement
        int newResultNumber = 3;
        System.out.println("Result is: " + newResultNumber--); // 3
        System.out.println("Result is: " + newResultNumber); // 2
    }
}
