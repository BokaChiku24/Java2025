package basics.controlflow.switchstatement;

public class EnhancedSwitchMonths {
    public static void main(String[] args) {
        String month = "January";
        System.out.println(month + " is in the " + getQuarter(month));   // First Quarter
        month = "April";
        System.out.println(month + " is in the " + getQuarter(month));     // Second
        month = "July";
        System.out.println(month + " is in the " + getQuarter(month));      // Third
        month = "October";
        System.out.println(month + " is in the " + getQuarter(month));   // Fourth
        month = "Invalid";
        System.out.println(month + " is in the " + getQuarter(month));   // Invalid
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "First Quarter";
            case "April", "May", "June" -> "Second Quarter";
            case "July", "August", "September" -> "Third Quarter";
            case "October", "November", "December" -> "Fourth Quarter";
            default -> {
                String badmonthPass = month + " is not a valid month";
                yield badmonthPass; // Using yield to return a value in a switch expression
            }
        };
    }
}
