package basics.controlflow.enhancedswitch;

public class EnhancedSwitchMonths {
    public static void main(String[] args) {
        String month = "January";
        System.out.println(STR."\{month} is in the \{getQuarter(month)}");   // First Quarter
        month = "April";
        System.out.println(STR."\{month} is in the  \{getQuarter(month)}");     // Second
        month = "July";
        System.out.println(STR."\{month} is in the \{getQuarter(month)}");
        // Third
        month = "October";
        System.out.println(STR."\{month} is in the \{getQuarter(month)}");   // Fourth
        month = "Invalid";
        System.out.println(STR."\{month} is in the \{getQuarter(month)}");   // Invalid
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> {
                yield "First Quarter";
            }
            case "April", "May", "June" -> {
                yield "Second Quarter";
            }
            case "July", "August", "September" -> {
                yield "Third Quarter";
            }
            case "October", "November", "December" -> {
                yield "Fourth Quarter";
            }
            default -> {
                String badMonthPass = STR."\{month} is not a valid month";
                yield badMonthPass; // Using yield to return a value in a switch expression
            }
        };
    }
}
