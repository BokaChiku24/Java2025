package basics.scannerclass;

import java.util.Scanner;

public class ScannerExample {
     static int dateOfBirth = 1990;
     static String currentYear = String.valueOf(2022);
    public static void main() {
        try {
            System.out.println(getInputFromConsole());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println(getInputFromScanner());
        }
    }

    public static String getInputFromConsole() {
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hi " + name + ", Thanks for entering your name!");
        int age = Integer.parseInt(System.console().readLine("Enter your age: "));
        System.out.println("Your age is " + age + " years old.");
        return "Hi " + name + "! Your age is " + age + ".";
    }

    public static String getInputFromScanner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Hi " + name + ", Thanks for entering your name!");
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("Your age is " + age + " years old.");
        boolean validDOB = false;
        int ageNumber = 0;
        do{
            System.out.println("Enter a year of birth >= " + (Integer.parseInt(currentYear) - 125) + " and <= "
                    + (Integer.parseInt(currentYear)));
            try {
                ageNumber = checkData(Integer.parseInt(currentYear), scan.nextLine());
                validDOB = ageNumber < 0 ? false : true;
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }while(!validDOB);
        return "Hi " + name + "! Your age is " + age + ".";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
