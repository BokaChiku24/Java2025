package oops.variable.staticvariable;

public class StaticVariable {
    private static String name;

    public StaticVariable(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){
        StaticVariable object = new StaticVariable("John Doe");
        StaticVariable object2 = new StaticVariable("Kunal Chavan");
        object.printName();  // prints: Kunal Chavan
        object2.printName(); // prints: Kunal Chavan
    }


}
