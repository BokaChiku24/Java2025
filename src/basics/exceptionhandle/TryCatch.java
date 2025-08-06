package basics.exceptionhandle;

import java.util.Scanner;

public class TryCatch {
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
        int age = scan.nextInt();
        System.out.println("Your age is " + age + " years old.");
        return "Hi " + name + "! Your age is " + age + ".";

    }
}
