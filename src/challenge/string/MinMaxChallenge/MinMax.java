package challenge.string.MinMaxChallenge;

import java.util.Scanner;

public class MinMax {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;
        while(true){
            System.out.print("Enter a number, or any charachter to exit");
            String nextEntry = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextEntry);
                if(loopCount == 0 || number < min){
                    min = number;
                }
                if(loopCount == 0 || number > max){
                    max = number;
                }
                loopCount++;
            }catch(NumberFormatException e){
                break;
            }
        }
        if(loopCount > 0){
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        }else{
            System.out.println("No numbers entered.");
        }
    }
}
