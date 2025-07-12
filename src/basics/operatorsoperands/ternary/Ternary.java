package basics.operatorsoperands.ternary;

public class Ternary {
    public static void main(String[] args){
        String makeCar = "BMW";
        boolean isDomestic = (makeCar == "BMW" ? true : false);
        System.out.println(isDomestic);

        if(isDomestic){
            System.out.println("This car is domestic to our country!");
        }

        // Simple way
        isDomestic = makeCar != "BMW";
        System.out.println(isDomestic);

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Age text is: " + ageText);

        // Ternary with String
        String text = (isDomestic) ? "This car is domestic to our country!" : "This car is not domestic to our country!";
        System.out.println(text);
    }
}
