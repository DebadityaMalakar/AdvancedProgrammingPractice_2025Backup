import java.util.ArrayList;
import java.util.List;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class OOPBanking {
    public static void main(String[] args) {
        List<Account> savingsAccounts = new ArrayList<>();
        savingsAccounts.add(new Account(1500.50));
        savingsAccounts.add(new Account(3200.75));
        savingsAccounts.add(new Account(890.00));
        savingsAccounts.add(new Account(2700.30));

        double total = calculateTotalBalance(savingsAccounts);
        System.out.println("Total Savings Balance: ₹" + total);
    }

    public static double calculateTotalBalance(List<Account> accounts) {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
