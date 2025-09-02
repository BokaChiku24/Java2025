package challenge.oops.composition;

public class SmartKitchen {
    private CoffeeMaker breMaster;
    private Rerigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        breMaster = new CoffeeMaker();
        iceBox = new Rerigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBreMaster() {
        return breMaster;
    }

    public Rerigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        breMaster.serHasWorkToDo(coffeeFlag);
        iceBox.serHasWorkToDo(fridgeFlag);
        dishWasher.serHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        breMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker{
private boolean hasWorkToDo;
public void serHasWorkToDo(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
}

public void brewCoffee(){
    if(hasWorkToDo){
        System.out.println("Brewing Coffee");
        hasWorkToDo = false;
    }
}
}

class Rerigerator{
    private boolean hasWorkToDo;
    public void serHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;
    public void serHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}