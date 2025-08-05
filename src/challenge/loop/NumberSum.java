package challenge.loop;

public class NumberSum {
    public static void main(String[] args) {
        System.out.println(STR."Sum of digits in 12345: \{sum(12345)}");
        System.out.println(STR."Sum of digits in 10000: \{sum(10000)}");
        System.out.println(STR."Sum of digits in 1: \{sum(1)}");
        System.out.println(STR."Sum of digits in 0: \{sum(0)}");
        System.out.println(STR."Sum of digits in -1: \{sum(0)}");

        System.out.println("----------------------");

        System.out.println(STR."Sum of digits in 12345: \{sumTwo(12345)}");
        System.out.println(STR."Sum of digits in 10000: \{sumTwo(10000)}");
        System.out.println(STR."Sum of digits in 1: \{sumTwo(1)}");
        System.out.println(STR."Sum of digits in 0: \{sumTwo(0)}");
        System.out.println(STR."Sum of digits in -1: \{sumTwo(-1)}");
    }

    public static int sum(int number) {
        String[] num = String.valueOf(number).split("");
        if (number < 0) {
            return -1;
        } else if (number > 1) {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum = sum + Integer.parseInt(num[i]);
            }
            return sum;
        } else {
            return number;
        }
    }

    public static int sumTwo(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 1) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10; // Add the last digit to sum
                number /= 10; // Remove the last digit
            }
            return sum;
        } else {
            return number;
        }
    }
}
