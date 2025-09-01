package oops.inheritance.animalsuper;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Fish moving muscles.");
    }

    private void moveBackFin(){
        System.out.println("Fish swimming.");
    }

    public void move(String speed) {
        super.move(speed);
        if(speed == "fast") {
            moveMuscles();
            moveBackFin();
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
