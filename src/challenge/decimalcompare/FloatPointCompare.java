package challenge.decimalcompare;

public class FloatPointCompare {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean flag = false;

        int number1 = (int) (num1 * 1000);
        int number2 = (int) (num2 * 1000);

        if (number1 == number2) {
            flag = true;
        }

        return flag;
    }
}
