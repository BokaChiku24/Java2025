package oops.constructor;

public class CustomerMain {

    public static void main(String[] args){
        Customer customer = new Customer("John Doe", 25000.00D,
                "johndoe@example.com");
        System.out.println("Name: " + customer.getName());
        System.out.println("Credit Limit: " + customer.getCreditLimit());
        System.out.println("Email: " + customer.getEmail());
        Customer customer2 = new Customer();
        System.out.println("Name: " + customer2.getName());
        System.out.println("Credit Limit: " + customer2.getCreditLimit());
        System.out.println("Email: " + customer2.getEmail());
    }

}
