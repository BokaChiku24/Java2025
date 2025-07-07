package basics.stringclass;

public class StringConcatenation {
    public static void main(String[] args) {
        String myFirstName = "Kunal";
        String myLastName = "Chavan";
        System.out.println("My full name is: " + (myFirstName + " " + myLastName));

        // Integer
        int myFirstNumber = 10;
        System.out.println(myFirstNumber + myFirstName); // 10Kunal

        // String + Integer
        System.out.println(myFirstName + myFirstNumber); // Kunal10

        // Integer + integer
        System.out.println((myFirstNumber + 10) + " " + myFirstName); // 20 Kunal
    }
}
