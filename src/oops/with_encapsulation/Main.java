package oops.with_encapsulation;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer kunal = new EnhancedPlayer("Kunal");
        System.out.println("Remaining health: " + kunal.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Remaining health: " + tim.healthRemaining());
    }
}
