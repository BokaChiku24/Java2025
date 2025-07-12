package conditional.ifesleifelsecondition;

public class Test {
    public static void main(String[] args) {

        /*
        if (firstCondition) {
        // code in the blocck will execute only if firstCondition is true
        } else if (secoundCondition) {
        // code in the blocck will execute only if firstCondition is false
        // and secoundCondition is true
        // there is no limit to the number of conditions that can be tested
        } else {
        // code in the blocck will execute only if all conditions above
        // else block must be at last and it is optional
        }
         */

        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 100) {
            // code in block will execute only if condition is true
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score >= 5000) {
            // code in block will execute only if condition is false
            System.out.println("Your score was more than or equal to 5000");
        } else if (score < 5000) {
            // code in block will execute only if condition is false
            System.out.println("Your score was less than 5000");
        } else if (score <= 5000) {
            // code in block will execute only if condition is false
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Your score not matches above conditions");
        }

    }
}
