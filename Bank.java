import java.util.*;

public class Bank{
    
    private ArrayList<AccountDetails> accounts;

    public Bank(){

        this.accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber , Customer customerName , String accountType){
        AccountDetails account = new AccountDetails(accountNumber , customerName , accountType);
        accounts.add(account);
        System.out.println("Account created successfully");
    }

    public void displayAllCustomerDetails(){

        for(AccountDetails account : accounts){

            account.displayAccountDetails();

            System.out.println();
        }
    }  
    public void depositMoney(String accountNumber, double amount) {
        for (AccountDetails account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.moneyDeposit(amount);
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }

    public void withdrawMoney(String accountNumber, double amount) {
        for (AccountDetails account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }    
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Bank Account");
            System.out.println("2. Display All Customer Details");
            System.out.println("3. Enter deposit money");
            System.out.println("4. Enter withdraw money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer age: ");
                    int customerAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter account type: ");
                    String accountType = scanner.nextLine();

                    Customer customer = new Customer(customerName, customerAge);
                    bank.createAccount(accountNumber, customer, accountType);
                    break;
                case 2:
                    bank.displayAllCustomerDetails();
                    break;
                case 3:{
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline character

                    bank.depositMoney(depositAccountNumber, depositAmount);
                    break;
                }
                case 4:{
                    System.out.print("Enter account number: ");
                    String withdrawAccountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline character

                    // Find the account and withdraw money
                    // This is just a basic example, you should implement a method in Bank class to handle this
                    // For demonstration, I'm assuming you have a method in Bank class named withdrawMoney
                    bank.withdrawMoney(withdrawAccountNumber, withdrawAmount);
                    break;
                }        
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}