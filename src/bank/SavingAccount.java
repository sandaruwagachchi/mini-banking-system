package bank;

public class SavingAccount extends Account
{

    public SavingAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
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
