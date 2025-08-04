package basics.continueexample;

public class ContinueExample {
    public static void main(String[] args) {
        int count = 0;

        for (; count <= 50; count += 5) {
            if (count % 25 == 0) {
                continue;
            }
            System.out.print(STR."\{count}_");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(STR."\{number}_");
        }
    }
}
