package challenge.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        Car ferrari = new GasPoweredCar("2025 Ferrari Sports",15.4,6);
        runRace(ferrari);
        Car tesla = new ElectricCar("2021 Red Tesla Model 3",568,75);
        runRace(tesla);
        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Straddle", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
