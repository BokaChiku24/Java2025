package basics.controlflow.switchstatement;

public class SwitchMonths {
    public static void main(String[] args) {
        System.out.println(getQuarter("January"));   // First Quarter
        System.out.println(getQuarter("April"));     // Second Quarter
        System.out.println(getQuarter("July"));      // Third Quarter
        System.out.println(getQuarter("October"));   // Fourth Quarter
        System.out.println(getQuarter("Invalid"));   // Invalid month
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "First Quarter";
            case "April":
            case "May":
            case "June":
                return "Second Quarter";
            case "July":
            case "August":
            case "September":
                return "Third Quarter";
            case "October":
            case "November":
            case "December":
                return "Fourth Quarter";
        }
        return "Invalid month";
    }
}
