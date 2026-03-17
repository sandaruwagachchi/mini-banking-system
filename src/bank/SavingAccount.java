package bank;

public class SavingAccount extends Account
{

    public SavingAccount(String accNumber, double balance) {
        super(accNumber, balance);
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
