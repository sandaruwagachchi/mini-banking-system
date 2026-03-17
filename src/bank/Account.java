package bank;

public abstract class Account
{
    protected String accNumber;
    protected double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public double getBalance() {
        return balance;
    }
}
