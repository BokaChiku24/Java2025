package objectclass;

public class Main extends Object {

    public static void main(String[] args) {

        StudentClass max = new StudentClass("Max", 21);
        System.out.println(max);

        PrimarySchoolStudentClass jimmy = new PrimarySchoolStudentClass("Jimmy", 8,
                "Carole");
        System.out.println(jimmy);
    }
}

class StudentClass {

    private String name;
    private int age;

    StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudentClass extends Student {

    private String parentName;

    PrimarySchoolStudentClass(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
