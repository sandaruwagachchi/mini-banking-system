package bank;

public class CurrentAccount extends Account
{

    public CurrentAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }
    @Override
    public void withdraw(double amount) throws InsufficientFundsException
    {
        double overdraftLimit = 1000;

     if (balance-amount < -overdraftLimit) {
           throw new InsufficientFundsException("Overdraft limit exceeded.");
       }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}
