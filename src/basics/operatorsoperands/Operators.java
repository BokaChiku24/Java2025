package basics.operatorsoperands;

public class Operators {
    public static void main(String[] args) {
        // == - Equal to
        int highScore = 100;
        if (highScore == 100) {
            System.out.println("I score highest score!");
        }

        // != - Not equal to
        if (highScore != 100) {
            System.out.println("I don't score highest score!");
        }

        // >= - Greater than equal to
        if (highScore >= 100) {
            System.out.println("I score more than or equal to highest score!");
        }

        // <= - Less than equal to
        if (highScore <= 100) {
            System.out.println("I score less than or equal to highest score!");
        }

        // > - Greater than
        if (highScore > 50) {
            System.out.println("I score highest score!");
        }

        // < - Less than
        if (highScore < 50) {
            System.out.println("I don't score highest score!");
        }

        int score = 90;
        if (highScore > score && score < highScore) {
            System.out.println("We are inside the if block");
        }

        int secoundTopScore = 120;
        if (score > secoundTopScore && score < secoundTopScore) {
            System.out.println("We are inside the 2nd if block");
        }

    }
}
