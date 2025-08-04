package challenge.loop;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int countOfMatches = 0;
        for (int i = 0; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i; // Add the number to the sum if it is divisible by 3 or 5
                countOfMatches++;
            }
        }
        System.out.println(STR."The sum of all numbers between 0 and 1000 that are divisible by 3 or 5 is: \{sum}");
        System.out.println(STR."The count of numbers between 0 and 1000 that are divisible by 3 or 5 is: \{countOfMatches}");
    }
}
