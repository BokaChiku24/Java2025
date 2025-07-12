package challenge.operators;

public class TestOperators {
    public static void main(String[] args) {
        double value = 20.00d;
        double secoundValue = 80.00d;
        double total = (value + secoundValue) * 100.00d;
        double remainder = total % 40.00d;
        boolean isRemainder = (remainder == 0) ? true : false;
        System.out.println(isRemainder);
        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
