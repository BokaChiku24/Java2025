package challenge.oops.composition;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getDishWasher().serHasWorkToDo(true);
        kitchen.getIceBox().serHasWorkToDo(true);
        kitchen.getBreMaster().serHasWorkToDo(true);
        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBreMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
