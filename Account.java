package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private List<Transaction> transactions; // List to hold transaction history

    public Account() {
        this.balance = 0;
        this.transactions = new ArrayList<>(); // Initialize the transaction list
    }

    public void setBalance(int amount) {
        balance = amount;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        setBalance(getBalance() + amount);
        transactions.add(new Transaction("Deposit", amount)); // Log the deposit transaction
        System.out.printf("Your deposit was successful\n");
        System.out.println("--------------------------------");
    }

    public void debit(int amount) {
        if (amount > getBalance()) {
            System.out.println("Debit amount exceeded account balance");
            System.out.println("--------------------------------");
        } else {
            setBalance(getBalance() - amount);
            transactions.add(new Transaction("Withdrawal", amount)); // Log the withdrawal transaction
            System.out.printf("Withdrawal complete\n");
            System.out.println("--------------------------------");
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactions; // Return the list of transactions
    }
}
