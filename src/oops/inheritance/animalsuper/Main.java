package oops.inheritance.animalsuper;

public class Main {

    public static void main(String[] args){
        Animal animal = new Animal("Bull Dog", "Large", 150);
        doAnimalStuff(animal, "Fast");

        Dog dog = new Dog("Golden Retriever", 200, "25", "10");
        doAnimalStuff(dog, "Slow");
        dog.makeNoise();

        Dog fox = new Dog("fox", 15);
        doAnimalStuff(fox, "Medium");
        fox.move("25");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________________________________");
    }

}
