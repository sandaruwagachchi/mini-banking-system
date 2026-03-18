package bank;

public class SavingAccount extends Account
{

    public SavingAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException
    {
        double minimumBalance = 500;
        if (balance - amount < minimumBalance) {
          throw new InsufficientFundsException("Insufficient funds for withdrawal.");
      }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}
