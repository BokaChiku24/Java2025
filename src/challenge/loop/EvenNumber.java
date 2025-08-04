package challenge.loop;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 5;
        int j = 4;
        int evenNumber = 0;
        int oddNumber = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(STR."Even number is: \{number}");
            }
            number++;
        }
        System.out.println(STR."----------------------------");
        while (j <= 30) {
            j++;
            if (!isEvenNumber(j)) {
                oddNumber++;
                continue;
            }
            System.out.println(STR."Even number is: \{j}");
            evenNumber++;
            if(evenNumber == 5) {
                break; // Stop the loop after finding 5 even numbers
            }

        }
        System.out.println(STR."Odd number is: \{oddNumber}");
        System.out.println(STR."Even number is: \{evenNumber}");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
