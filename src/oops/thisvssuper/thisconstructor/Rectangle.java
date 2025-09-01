package oops.thisvssuper.thisconstructor;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(){
        this(0, 0); // calls 2nd constructor
    }
    public Rectangle(int width, int height){
        this(0, 0, width, height); // calls 3rd constructor
    }

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static void main() {
        Rectangle rectangle = new Rectangle(10, 5, 50, 30);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

    private String calculatePerimeter() {
        return "Perimeter: " + (2 * (width + height));  // Using 'this' to refer to instance variables
    }

    private String calculateArea() {
        return "Area: " + (width * height);
    }
}
