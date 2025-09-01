package challenge.objectclass;

public class Employee extends Worker {

    private long employeeId;

    private static long employeeNo = 1;

    private String hireDate;

    public Employee(String name, String dateOfBirth, String hireDate) {
        super(name, dateOfBirth);
        employeeId= Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
