package challenge.string.ReadeUserInput;
import java.util.Scanner;
public class ReadingUserInputChallange {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int counter = 1;
       int sum = 0;
       while(counter <= 5){
           System.out.println("Enter number #" + counter + ": ");
           String nextNumber = scan.nextLine();
           try {
               double number = Double.parseDouble(nextNumber);
               counter++;
               sum += number;
           }catch (NumberFormatException e){
               System.out.println("Invalid Number");
           }
       }

       System.out.println("Sum of entered numbers: " + sum);
    }
}
