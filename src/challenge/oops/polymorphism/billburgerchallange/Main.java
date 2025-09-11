package challenge.oops.polymorphism.billburgerchallange;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("Drink", "Coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping","avocado",1.50);
        avocado.printItem();

        Burger burger = new Burger("Regular", 4);
        burger.addTopping("BACON", "CHEESE", "MAYO");
        burger.printItem();

        MealOrder regularOrder = new MealOrder();
        regularOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularOrder.setDrinkSize("LARGE");
        regularOrder.printItemizedList();

        MealOrder secondOrder = new MealOrder("Turkey", "7-Up","Chili");
        secondOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondOrder.setDrinkSize("SMALL");
        secondOrder.printItemizedList();

        MealOrder deluxeOrder = new MealOrder("deluxe","7-Up","Chili");
        deluxeOrder.addBurgerToppings("AVOCADO", "BACON",
                "LETTUCE", "CHEESE", "MAYO");
        deluxeOrder.setDrinkSize("SMALL");
        deluxeOrder.printItemizedList();
    }
}
