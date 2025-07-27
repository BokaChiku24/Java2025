package challenge.methodoverload.areacalculator;

public class Area {
    public static void main(String[] args) {
        System.out.println("Area of circle with radius 5: " + area(5));
        System.out.println("Area of rectangle with width 5 and height 10: " + area(5, 10));
        System.out.println("Area of circle with radius -1: " + area(-1));
        System.out.println("Area of rectangle with width -5 and height 10: " + area(-5, 10));
        System.out.println("Area of rectangle with width 5 and height -10: " + area(5, -10));
        System.out.println("Area of rectangle with width -5 and height -10: " + area(-5, -10));
        System.out.println("Area of circle with radius 0: " + area(0));
    }

    public static double area(double radious) {
        if (radious < 0) {
            return -1.0d;
        }
        return Math.PI * radious * radious;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0d;
        }
        return x * y;
    }
}
