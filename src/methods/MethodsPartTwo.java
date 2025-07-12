package methods;

public class MethodsPartTwo {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("High score is: " + highScore);

        System.out.println("Secound high score is: "+calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            // shorthand = finalScore = finalScore + (levelCompleted * bonus);
        }
        return finalScore;
    }
}
