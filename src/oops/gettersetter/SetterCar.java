package oops.gettersetter;

public class SetterCar {
    public static GetterSetter myCar = null;
    public static void main(String[] args) {
        myCar = new GetterSetter();
        myCar.setColor("Red");
        myCar.setMake("Tesla");
        myCar.setDoors(6);
        myCar.setModel("Model S");
        myCar.setConvertible(true);
        myCar.describeCar();
        SetterCar mySetterCar = new SetterCar();
        mySetterCar.description();
    }

    public void description() {
        System.out.println(myCar.getDoors() + "-Door " +
                myCar.getColor() + " " +
                myCar.getMake() + " " +
                myCar.getModel() + " " +
                (myCar.isConvertible() ? "Convertible" : ""));
    }
}
