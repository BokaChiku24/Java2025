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

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int cylinders = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int cylinders){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Electric car -> All %d cylinders are fired up, Ready !%n" , cylinders);
    }

    @Override
    public void runEngine() {
        super.runEngine();
        System.out.printf("Electric Car -> usage exceed the average: %.2f %n" , avgKmPerCharge);

    }
}

class HybridCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize){
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Hybrid -> %d cylinders are fired up, Ready !%n" , cylinders);
        System.out.printf("Hybrid -> Switch %d kWh battery on, Ready !%n" , batterySize);
    }

    @Override
    public void runEngine() {
        super.runEngine();
        System.out.printf("Hybrid -> usage exceed the average: %.2f %n" , avgKmPerLiter);

    }
}
