package challenge.oops.polymorphism.billburgerchallange;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("Drink", "Coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping","avocado",1.50);
        avocado.printItem();
    }
}
