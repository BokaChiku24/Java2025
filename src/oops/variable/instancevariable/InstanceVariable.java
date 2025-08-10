package oops.variable.instancevariable;

public class InstanceVariable {
    private String name;

    public InstanceVariable(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){
        InstanceVariable object = new InstanceVariable("John Doe");
        InstanceVariable object2 = new InstanceVariable("Kunal Chavan");
        object.printName();  // prints: John Doe
        object2.printName(); // prints: Kunal Chavan
    }


}
