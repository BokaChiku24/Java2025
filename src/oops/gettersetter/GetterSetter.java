package oops.gettersetter;

public class GetterSetter {
    private String color = "Yellow";
    private String make = "Toyota";
    private String model = "Camry";
    private int doors = 4;
    private boolean isConvertible = false;

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake) {
            case "holden", "porsche", "Ford", "Tesla" -> this.make = make;
            default -> {
                this.make = "Invalid make";
            }
        }
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public boolean isConvertible(boolean convertible) {
        this.isConvertible = convertible;
        return isConvertible;
    }

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
