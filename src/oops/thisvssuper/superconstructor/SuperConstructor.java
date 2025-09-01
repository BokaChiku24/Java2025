package oops.thisvssuper.superconstructor;

class Shape{
    private int x;
    private int y;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected String calculateArea(int width, int height) {
        return "Area: " + (width * height);  // Using 'this' to refer to instance variables
    }

    protected String calculatePerimeter(int width, int height) {
        return "Perimeter: " + (2 * (width + height));  // Using 'this' to refer to instance variables
    }
}

public class SuperConstructor extends Shape{
    private int width;
    private int height;
    public SuperConstructor(){
        this(0, 0); // calls the 1st constructor of Shape class
    }
    public SuperConstructor(int width, int height){
        this(0, 0, width, height); // calls the 3rd constructor of Shape class
    }

    public SuperConstructor(int x, int y, int width, int height){
        super(x, y); // calls the Shape class constructor with given x, y coordinates
        this.width = width;
        this.height = height;

    }

    public static void main(String[] args) {
        SuperConstructor superRectangle = new SuperConstructor(10, 5, 50, 30);
        System.out.println("Area: " + superRectangle.calculateArea(50,30));
        System.out.println("Perimeter: " + superRectangle.calculatePerimeter(50, 30));
    }
}
