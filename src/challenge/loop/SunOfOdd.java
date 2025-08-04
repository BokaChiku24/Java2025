package challenge.loop;

public class SunOfOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(12, 5)); // Output: -1
        System.out.println(sumOdd(1, 100)); // Output: 2500
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (((start > 0) && (end > 0)) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
