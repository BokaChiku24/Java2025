package methods.overloading;

public class CalculateScore {

    public static void main(String[] args) {
        int newScore = calcuateScore("Kunal", 1500);
        System.out.println("My new score: " + newScore);

        System.out.println();

        newScore = calcuateScore(75);
        System.out.println("Unnamed player new score: " + newScore);

        System.out.println();

        newScore = calcuateScore();
        System.out.println("No player name, no score: " + newScore);

    }

    public static int calcuateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calcuateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        calcuateScore("Annonymous", score);
        return score * 1000;
    }

    public static int calcuateScore() {
        return 0;
    }

}
