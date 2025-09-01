package challenge.objectclass;

public class HourlyEmployee extends Employee  {
    private double hourlyRate;
    private final int MAX_HOURS_WORKED = 40;

    public HourlyEmployee(String name, String dateOfBirth, String hireDate, double hourlyRate, int hoursWorked) {
        super(name, dateOfBirth, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay() {
        return hourlyRate * MAX_HOURS_WORKED;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
