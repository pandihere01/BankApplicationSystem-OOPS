public class Customer {

    String customerName;
    int customerAge;

    public Customer(String customerName, int customerAge) {
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    public String getName() {
        return customerName;
    }

    public int getAge() {
        return customerAge;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + customerAge);
    }
}