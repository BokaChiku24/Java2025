package objectclass;

public class ObjectClass extends java.lang.Object{
    public static void main(String[] args){
        Student student = new Student("John Doe", 25);
        System.out.println(student.toString());
        System.out.println(new PrimarySchoolStudent("Jane Doe", 20, 8, "Mrs. Smith").toString());
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."Student{name='\{name}', age=\{age}}";
    }
}

class PrimarySchoolStudent extends Student{
    int grade;
    String parentName;
    public PrimarySchoolStudent(String name, int age, int grade, String parentName){
        super(name, age);
        this.grade = grade;
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "grade=" + grade +
                ", parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}