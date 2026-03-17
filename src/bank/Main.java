package bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount("SA100", 5000));
        accounts.add(new CurrentAccount("CA200", 3000));

        for (Account acc : accounts) {
            acc.deposit(1000);  // deposit money

            try {
                acc.withdraw(2000);
                acc.withdraw(5000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(acc.accNumber + " balance: " + acc.getBalance());
            System.out.println("----------------------");
    }
    }
}