package challenge.objectclass;

public class SalaryEmployee extends Employee {
    double annualSalary;
    boolean isRetried;

    public SalaryEmployee(String name, String dateOfBirth, String hireDate, double annualSalary, boolean isRetried) {
        super(name, dateOfBirth, hireDate);
        this.annualSalary = annualSalary;
        this.isRetried = isRetried;
    }

    @Override
    public double collectPay() {
        double pay = annualSalary / 26;
        double adjustedPay = (isRetried? pay * 0.9 : pay);
        return (int) adjustedPay;
    }


    public void setRetired() {
        terminate("10/10/2056");
        this.isRetried = true;

    }
}
