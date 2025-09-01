package challenge.objectclass;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "01/01/1990", "01/01/2000");
        System.out.println(employee);
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee pay: " + employee.collectPay());


        SalaryEmployee employee2 = new SalaryEmployee("Tom Moore", "01/01/1995", "01/01/2005", 35000D, false);
        System.out.println(employee2);
        System.out.println("Employee age: " + employee2.getAge());
        System.out.println("Employee pay: " + employee2.collectPay());
        System.out.println("Tom Moore pay check:" + employee2.collectPay());
        employee2.setRetired();
        System.out.println("Tom Moore pay check after retirement:" + employee2.collectPay());

        HourlyEmployee employee3 = new HourlyEmployee("Jane Smith",
                "01/01/2000", "01/01/2010", 10D, 40);
        System.out.println(employee3);
        System.out.println(employee3.collectPay());
        System.out.println(employee3.getDoublePay());
    }
}
