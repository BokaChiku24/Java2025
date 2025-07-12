package operators.assignmentandequality;

public class AssignmentEquality {
    public static void main(String[] args) {
        int number = 50;
        /*
        if(number = 50){ // Required type:boolean , Provided:int
            System.out.println("You are in integer if block");
        }
        */

        if(number == 50){
            System.out.println("You are in integer if block because condition is true");
        }

        boolean isCar = false;
        // Condition 1
        if(isCar = true){
            // The value 'true' assigned to 'isCar' is never used
            // Assignment 'isCar = true' used as condition
            System.out.println("Assignment 'isCar = true' used as conditions");
        }

        // Condition 2
        if(isCar == true){
            System.out.println("Checking opposite value of isCar");
        }

        // Condition 3
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        // Condition 4
        if(!isCar){
            System.out.println("Checking opposite value of isCar");
        }

        // Condition 5
        if(isCar != true){
            System.out.println("Checking value of isCar");
        }

        // Condition 6
        if(isCar == false){
            System.out.println("Checking value of isCar");
        }
    }
}
