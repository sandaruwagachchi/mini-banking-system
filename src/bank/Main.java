package bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount("Sanda123", 5000));
        accounts.add(new CurrentAccount("Waga123", 2000));

        for (Account acc : accounts) {

            try {
                acc.deposit(1000);
                acc.withdraw(5000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(acc.accNumber + " balance: " + acc.getBalance());
            System.out.println("----------------------");
    }
    }
}