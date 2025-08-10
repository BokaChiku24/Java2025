package challenge.gettersetter.calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.24D);
        calculator.setSecondNumber(7.24D);
        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Subtraction: " + calculator.getSubtractionResult());
        System.out.println("Multiplication: " + calculator.getMultiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());
        System.out.println("Modulus: " + calculator.getModulusResult());
    }
}
