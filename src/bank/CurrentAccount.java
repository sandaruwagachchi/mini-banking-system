package bank;

public class CurrentAccount extends Account
{

    public CurrentAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException
    {
     if (amount > balance) {
           throw new InsufficientFundsException("Insufficient funds for withdrawal.");
       }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}
