package challenge.loop;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123456));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstNumber = 0;
        int lastNumber = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return number;
        } else if (number / 10 == 0) {
            return number + number;
        } else {
            lastNumber = number % 10; // Capture the last digit
            while (number >= 10) {
                number = number / 10;
            }
            firstNumber = number; // Capture the first digit
        }
        return firstNumber + lastNumber;
    }

    public static int sumFirstAndLastDigitTwo(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // use % 10 to get last digit in a number.
        while (number >= 10) {
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }

        int firstDigit = number; // this is not necessary, but this makes it clear that number is now the first digit.
        return firstDigit + lastDigit;
    }
}


