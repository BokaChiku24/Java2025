package conditional.ifelseconditions;

public class IfElseStatementTwo {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*
        if(condition){
         // code in block will execute only if condition is true
        }else {
        // code in block will execute only if condition is false
        }
         */

        if(score == 5000){
            // code in block will execute only if condition is true
            System.out.println("Your score was 5000");
        }else {
            // code in block will execute only if condition is false
            System.out.println("Your score was not 5000");
        }

        if(score < 5000){
            // code in block will execute only if condition is true
            System.out.println("Your score was less than or equal to 5000");
        }else {
            // code in block will execute only if condition is false
            System.out.println("Your score was more than or equal to 5000");
        }
    }
}
