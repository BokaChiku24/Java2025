package logical.orexample;

public class Or {
    public static void main(String[] args){
        int topScore = 80;
        int secondTopScore = 81;

        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore <= secondTopScore) || (topScore < 82)) {
            System.out.println("Else if block execute by true && true condition");
        }
    }
}
