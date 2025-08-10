package oops.pojo;

import oops.pojo.record.LPAStudent;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                continue;
            }
            LPAStudent student = new LPAStudent("S923000" + i, switch (i) {
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
        Student pojoStudent = new Student("S9230001", "Kunal Chavan", "1990-05-15", "Java Master Class");
        LPAStudent lpaStudent = new LPAStudent("S9230002", "Rahul Davis", "2000-01-12", "Java Master Class");
        System.out.println(pojoStudent);
        System.out.println(lpaStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Python Master Class");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(lpaStudent.name() + " is taking " + lpaStudent.classList());

    }
}
