package challenge.ifelse;

public class IfElseChallange {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            // shorthand = finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            // shorthand = finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        /*
        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            // shorthand = finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
        */

       /* boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if(newGameOver){
            newFinalScore += (newLevelCompleted * newBonus);
            // shorthand = finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was: " + newFinalScore);
        }
        */
    }
}
