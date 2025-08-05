package challenge.loop;
/*
Evaluating The Last Digit For Multiple Integer Comparisons
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

EXAMPLE INPUT/OUTPUT:
hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
EXAMPLE INPUT/OUTPUT
isValid(10); → should return true since 10 is within the range of 10-1000
isValid(468); → should return true since 468 is within the range of 10-1000
isValid(1051); → should return false since 1051 is not within the range of 10-1000
 */
public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(777, 771, 77));
        System.out.println(isValid(100));
        System.out.println(isValid(1));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first >= 10 && first < 1000) && (second >= 10 && second < 1000) && (third >= 10 && third < 1000)) {
            int firstLastDigit = first % 10;
            int secondLastDigit = second % 10;
            int thirdLastDigit = third % 10;
            if ((firstLastDigit == secondLastDigit) || (secondLastDigit == thirdLastDigit) || (firstLastDigit == thirdLastDigit)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
