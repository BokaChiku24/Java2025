package challenge.oops.polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    public void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is " + this.getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders){
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready !%n" , cylinders);
    }

    @Override
    public void runEngine() {
        super.runEngine();
        System.out.printf("Gas -> usage exceed the average: %.2f %n" , avgKmPerLiter);

    }
}
