package basics.overflow;

public class OverflowExample {
    public static void main(String[] args) {
        int myMaxIntNumber = (Integer.MAX_VALUE + 1);
        System.out.println("My max integer number: " + myMaxIntNumber);

        int myMaxInt = (2147483647 + 1);
        System.out.println("My max integer number: " + myMaxInt);

    }
}
