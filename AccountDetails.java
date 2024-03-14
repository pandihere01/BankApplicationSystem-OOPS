import java.util.*;
public class AccountDetails {
    
    String accountNumber;
    Customer customer;
    String accountType;
    double balance;

    public AccountDetails(String accountNumber, Customer customer, String accountType) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void moneyDeposit(double amount) {
        balance += amount;
        System.out.println(amount + " is deposited to the account number " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawal successful in the account number " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber + ". Available balance: " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Age: " + customer.getAge());
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}