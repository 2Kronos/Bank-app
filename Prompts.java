package bank;

import java.util.List;
import java.util.Scanner;

public class Prompts {

    public void menu() {
        System.out.println("\n================================");
        System.out.println("        Main Menu        ");
        System.out.println("================================");
        System.out.printf("%-10s %-20s\n", "Number", "Option");
        System.out.println("--------------------------------");
        System.out.printf("%-10d %-20s\n", 1, "Deposit");
        System.out.printf("%-10d %-20s\n", 2, "Withdraw");
        System.out.printf("%-10d %-20s\n", 3, "Balance Inquiry");
        System.out.printf("%-10d %-20s\n", 4, "View Transaction History");
        System.out.printf("%-10d %-20s\n", 5, "Exit");
        System.out.println("================================");
    }

    public void miniMenu(Scanner input, Account bank, Prompts message) {
        boolean exitMiniMenu = false;
        while (!exitMiniMenu) {
            System.out.println("\n================================");
            System.out.println("        Mini Menu        ");
            System.out.println("================================");
            System.out.printf("%-10s %-20s\n", "Number", "Option");
            System.out.println("--------------------------------");
            System.out.printf("%-10d %-20s\n", 1, "Main menu");
            System.out.printf("%-10d %-20s\n", 2, "Balance Inquiry");
            System.out.printf("%-10d %-20s\n", 3, "View Transaction History");
            System.out.printf("%-10d %-20s\n", 4, "Exit");
            System.out.println("================================");
            int miniOption = input.nextInt();

            switch (miniOption) {
                case 1: // Return to Main Menu
                    exitMiniMenu = true;
                    break;
                case 2: // Check Balance
                    System.out.printf("Balance: %d%n", bank.getBalance());
                    exitMiniMenu = true;
                    break;
                case 3: // View Transaction History
                    viewTransactionHistory(bank);
                    exitMiniMenu = true;
                    break;
                case 4: // Go back to Main Menu
                    exitMiniMenu = true;
                    System.out.println("Exiting mini menu.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void viewTransactionHistory(Account bank) {
        List<Transaction> history = bank.getTransactionHistory();
        if (history.isEmpty()) {
            System.out.println("No transaction history available.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : history) {
                System.out.println(transaction);
            }
        }
    }
}
