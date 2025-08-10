package oops.inheritance;

public class Vehicle {

    public String color = "red";

    public void gear(){
        System.out.println("Vehicle gear");
    }

    public void engine(){
        System.out.println("Vehicle engine");
    }

    public void breaks(){
        System.out.println("Vehicle break");
    }

    public void audioSystem(){
        System.out.println("Vehicle audio system");
    }

    public static void main(String[] args) {
        Vehicle object = new Vehicle();
        object.gear();
        object.breaks();
        object.audioSystem();
        object.engine();
    }
}
