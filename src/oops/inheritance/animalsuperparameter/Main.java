package oops.inheritance.animalsuperparameter;

public class Main {

    public static void main(String[] args){
        Animal animal = new Animal("Bull Dog", "Large", 150);
        doAnimalStuff(animal, "Fast");

        Dog dog = new Dog("Golden Retriever", "Large", 200);
        doAnimalStuff(dog, "Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________________________________");
    }

}
