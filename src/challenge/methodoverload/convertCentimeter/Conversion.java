package challenge.methodoverload.convertCentimeter;

public class Conversion {

    public static void main(String[] args) {
        System.out.println("Height in centimeter: " + convertToCentimeters(6));
        System.out.println("Height in centimeter: " + convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int heightInches) {
        // 1 inch = 2.54 centimeters
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        // 1 inch = 2.54 centimeters
        // 1 foot = 12 inches
        return convertToCentimeters((heightInFeet * 12) + heightInInches) ;
    }

}
