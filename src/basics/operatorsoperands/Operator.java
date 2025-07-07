package basics.operatorsoperands;

public class Operator {
    public static void main(String[] args) {
        long total;
        byte byteValue = 10;
        short shortValue = 10;
        int intValue = 10;
        total = 50000L + 10L * (byteValue+shortValue+intValue);
        System.out.println("Total is: " + total);
    }
}
