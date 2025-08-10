package oops.methods.instancemethod;

class Dog {
    public void bark(){
        System.out.println("Woof!");
    }
}

public class InstanceMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); // Output: Woof!
    }
}
