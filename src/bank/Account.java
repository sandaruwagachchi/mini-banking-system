package bank;

public abstract class Account
{
    protected String accNumber;
    protected double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public double getBalance() {
        return balance;
    }
}
