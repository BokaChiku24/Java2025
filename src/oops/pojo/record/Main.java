package oops.pojo.record;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                continue;
            }
            Student student = new Student("S923000" + i, switch (i) {
                case 1 -> "John Doe";
                case 2 -> "Jane Smith";
                case 3 -> "David Johnson";
                case 4 -> "Emily Williams";
                case 5 -> "Michael Brown";
                case 6 -> "Sarah Davis";
                case 7 -> "Daniel Garcia";
                case 8 -> "Patricia Lee";
                case 9 -> "Robert Taylor";
                case 10 -> "Christopher Wilson";
                default -> "Unknown";
            }, "2000-01-1" + i, "Java Master Class");
            System.out.println(student);
        }
    }
}
