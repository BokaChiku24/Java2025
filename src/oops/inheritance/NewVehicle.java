package oops.inheritance;

public class NewVehicle extends Vehicle{

    public void engine(){
        System.out.println("New Vehicle engine");
    }

    public void colorChange(){
        System.out.println("Vehicle color is:" + color);
    }

    public static void main(String[] args) {
        Vehicle object = new NewVehicle();
        object.gear();
        object.breaks();
        object.audioSystem();
        object.engine(); // This will call the overridden engine method in NewVehicle class
        // object.colorChange(); // This will not work because colorChange() is a new method in child class.
        NewVehicle newObject = new NewVehicle();
        newObject.colorChange(); // This will call the overridden colorChange() method in NewVehicle class
    }
}
