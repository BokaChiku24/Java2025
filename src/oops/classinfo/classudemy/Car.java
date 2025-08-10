package oops.classinfo.classudemy;

public class Car {
    private String color;
    private String make;
    private String model;
    private int doors;
    private boolean isConvertible;

    public void describeCar() {
        System.out.println(doors + " -  " +
                color + " -  " +
                make + " - " +
                model + " - " +
                (isConvertible
                        ? " Convertible " : "Not Convertible"));
    }

    public void description() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
