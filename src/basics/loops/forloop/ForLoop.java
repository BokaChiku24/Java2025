package basics.loops.forloop;

public class ForLoop {

    public static void main(String args[]) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        System.out.println(STR."10,000 at 1% interest = \{calculateInterest(10000, 1)}");
        System.out.println(STR."10,000 at 2% interest = \{calculateInterest(10000, 2)}");
        System.out.println(STR."10,000 at 3% interest = \{calculateInterest(10000, 3)}");
        System.out.println(STR."**************************************************************************");
        // Improve code by using a loop
        for (double counter = 1.0D; counter <= 5.0D; counter++) {
            double interestRate  = calculateInterest(10000 , counter );
            System.out.println(STR."10,000 at \{counter}% interest = \{interestRate}");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
