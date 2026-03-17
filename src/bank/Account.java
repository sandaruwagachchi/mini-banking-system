package bank;

public abstract class Account
{
    private String accNumber;
    private double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public double getBalance() {
        return balance;
    }
}
