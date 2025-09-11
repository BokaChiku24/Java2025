package challenge.oops.polymorphism.billburgerchallange.dev.lpa;

public class Main {
    private String type;
    public Main(String type){
        this.type = type;
    }
    public static void main(String[] args) {
        challenge.oops.polymorphism.billburgerchallange.dev.lpa.Main obj = new challenge.oops.polymorphism.billburgerchallange.dev.lpa.Main("Burger");
        System.out.println(obj.type);
    }
}
