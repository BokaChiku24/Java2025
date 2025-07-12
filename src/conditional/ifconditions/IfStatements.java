package conditional.ifconditions;

public class IfStatements {
    public static void main(String[] ignoredArgs) {
        System.out.println("If statement example");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        if (isAlien == false);
            System.out.println("It is not an alien!");

        if (isAlien == true)
            System.out.println("It is not an alien!");

        if (!isAlien == true)
            System.out.println("It is an alien!");

        if (!isAlien == true) {
            System.out.println("It is an alien!");
            System.out.println("I am scared of aliens!");
        }
    }
}
