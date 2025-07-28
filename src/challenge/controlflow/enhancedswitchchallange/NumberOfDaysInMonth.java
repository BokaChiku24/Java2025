package challenge.controlflow.enhancedswitchchallange;


public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020)); // Should return 29
        System.out.println(getDaysInMonth(1, 2020)); // Should return 31
        System.out.println(getDaysInMonth(4, 2021)); // Should return 30
        System.out.println(getDaysInMonth(2, 2021)); // Should return 28
        System.out.println(getDaysInMonth(13, 2021)); // Should return -1 (invalid month)
        System.out.println(getDaysInMonth(2, 10000)); // Should return -1 (invalid year)
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            boolean flag = isLeapYear(year);
            System.out.println(flag ? "Leap year" : "Not a leap year");
            if (flag && (month == 2)) {
                days = 29;
            } else {
                days = 28;
            }

            return switch (month) {
                case 1 -> 31;
                case 2 -> days;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> 0;
            };
        }

    }
}