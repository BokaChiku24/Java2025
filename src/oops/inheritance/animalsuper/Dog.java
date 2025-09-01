package oops.inheritance.animalsuper;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Preky", "Curly");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow") {
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println(" ");
    }

    @Override
    public void makeNoise() {
        if(type == "wolf"){
            System.out.println("Ow Wooooo! ");
        }
        bark();
        System.out.println(" ");
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void wagTail(){
        System.out.println("Dog Wagging Tail ");
    }
}
