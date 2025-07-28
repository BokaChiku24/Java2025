package challenge.controlflow.enhancedswitchchallange;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfWeek(0); // Should print "Day 0 is Sunday"
        printDayOfWeek(1); // Should print "Day 1 is Monday"
        printDayOfWeek(2); // Should print "Day 2 is Tuesday"
        printDayOfWeek(3); // Should print "Day 3 is Wednesday"
        printDayOfWeek(4); // Should print "Day 4 is Thursday"
        printDayOfWeek(5); // Should print "Day 5 is Friday"
        printDayOfWeek(6); // Should print "Day 6 is Saturday"
        printDayOfWeek(7); // Should print "Day 7 is Invalid day"
        printWeekOfDay(0);
        printWeekOfDay(1);
        printWeekOfDay(2);
        printWeekOfDay(3);
        printWeekOfDay(4);
        printWeekOfDay(5);
        printWeekOfDay(6);
        printWeekOfDay(7); // Should print "Day 7 is Invalid day"
        printDayOfWeekWithIfElse(0); // Should print "Day 0 is Sunday"
        printDayOfWeekWithIfElse(1); // Should print "Day 1 is Monday"
        printDayOfWeekWithIfElse(2); // Should print "Day 2 is Tuesday"
        printDayOfWeekWithIfElse(3); // Should print "Day 3 is Wednesday"
        printDayOfWeekWithIfElse(4); // Should print "Day 4 is Thursday"
        printDayOfWeekWithIfElse(5); // Should print "Day 5 is Friday"
        printDayOfWeekWithIfElse(6); // Should print "Day 6 is Saturday"
        printDayOfWeekWithIfElse(7); // Should print "Day 7 is Invalid day"
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 0 -> dayOfWeek = "Sunday";
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
            default -> dayOfWeek = "Invalid day";
        };
        System.out.println(STR."Day \{day}  is  \{dayOfWeek}");
    }

    public static void printWeekOfDay(int day){
        switch (day){
            case 0:
                System.out.println("Day 0 is Sunday");
                break;
            case 1:
                System.out.println("Day 1 is Monday");
                break;
            case 2:
                System.out.println("Day 2 is Tuesday");
                break;
            case 3:
                System.out.println("Day 3 is Wednesday");
                break;
            case 4:
                System.out.println("Day 4 is Thursday");
                break;
            case 5:
                System.out.println("Day 5 is Friday");
                break;
            case 6:
                System.out.println("Day 6 is Saturday");
                break;
            default:
                System.out.println(STR."Day \{day} is Invalid day");
                break;
        }
    }

    public static void printDayOfWeekWithIfElse(int day) {
        String dayOfWeek;
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "Invalid day";
        }
        System.out.println(STR."Day \{day} is \{dayOfWeek}");
    }
}
