package oops.inheritance.animalsperwithoutparameter;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " is moving at " + speed + " speed.");
    }

    public void makeNoise(){
        System.out.println(type + " is making a sound.");
    }
}
