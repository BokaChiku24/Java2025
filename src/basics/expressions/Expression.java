package basics.expressions;

public class Expression {
    public static void main(String[] args) {
        double kilometer = (100 * 1.609344d);

        int highScore = 50;

        if(highScore > 25){
            highScore = 1000 + highScore; // add bouns point
        }

        int health = 100;

        if((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
    }
}
