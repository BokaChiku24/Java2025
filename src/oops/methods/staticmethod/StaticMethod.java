package oops.methods.staticmethod;

class Calculator {
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class StaticMethod {
   public static void main(String[] args) {
       Calculator.printSum(5, 10); // Output: Sum: 15
       printHello(); // Output: Hello World
    }

    public static void printHello() {
        System.out.println("Hello World");
    }
}
