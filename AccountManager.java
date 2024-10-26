package bank;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<String, Account> accounts; // Map of account numbers to Account objects

    public AccountManager() {
        accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber) {
        accounts.put(accountNumber, new Account(accountNumber));
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }
}
