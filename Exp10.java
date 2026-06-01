public class Exp10
{
    public static void main(String[] args)
    {
    // Savings Account Object
        SavingsAccount s1 = new SavingsAccount(
                101,
                "Rahul Sharma",
                50000
        );
        s1.deposit(10000);
        s1.displayDetails();
        System.out.println("Interest: ₹" + s1.calculateInterest());
        System.out.println();
        // Current Account Object
        CurrentAccount c1 = new CurrentAccount(
                201,
                "Priya Verma",
                80000
        );
        c1.deposit(20000);
        c1.displayDetails();
        System.out.println("Interest: ₹" + c1.calculateInterest());
    }
}
// ABSTRACT CLASS
abstract class BankAccount
{
    // Encapsulation
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    // Constructor
    public BankAccount(
            int accountNumber,
            String accountHolderName,
            double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    // Getter Methods
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public double getBalance()
    {
        return balance;
    }
    // Setter Method
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    // Deposit Method
    public void deposit(double amount)
    {
        balance += amount;
    }
    // Display Method
    public void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
    // Abstract Method
    abstract double calculateInterest();
}
// SAVINGS ACCOUNT CLASS
class SavingsAccount extends BankAccount
{
    public SavingsAccount(
        int accountNumber,
        String accountHolderName,
        double balance)
    {
        super(accountNumber,accountHolderName,balance);
    }
    // Implement Abstract Method
    double calculateInterest()
    {
        return getBalance() * 0.05;
    }
}
// CURRENT ACCOUNT CLASS
class CurrentAccount extends BankAccount
{
    public CurrentAccount(
        int accountNumber,
        String accountHolderName,
        double balance)
    {super(accountNumber,accountHolderName,balance);}
    // Implement Abstract Method
    double calculateInterest()
    {return getBalance() * 0.03;}
}