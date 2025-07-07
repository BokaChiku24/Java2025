package basics.operatorsoperands;

public class Increment {
    public static void main(String[] args) {
        int result = 0;
        result = result + 1;
        System.out.println("Result is: " + result);

        // Pre-Increment
        int resultNumber = 0;
        System.out.println("Result is: " + ++resultNumber);

        // Post-Increment
        System.out.println("Result is: " + resultNumber++); // 1
        System.out.println("Updated result is: " + resultNumber); // 2

    }
}
