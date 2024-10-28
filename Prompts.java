package bank;

import java.util.List;
import java.util.Scanner;

public class Prompts {

    public void menu() {
        // Display the main menu options
        System.out.println("\n================================");
        System.out.println("        Main Menu        ");
        System.out.println("================================");
        System.out.printf("%-10s %-20s\n", "Number", "Option"); // Print headers
        System.out.println("--------------------------------");
        // Print each menu option with corresponding number
        System.out.printf("%-10d %-20s\n", 1, "Deposit");
        System.out.printf("%-10d %-20s\n", 2, "Withdraw");
        System.out.printf("%-10d %-20s\n", 3, "Balance Inquiry");
        System.out.printf("%-10d %-20s\n", 4, "View Transaction History");
        System.out.printf("%-10d %-20s\n", 5, "Exit");
        System.out.println("================================");
    }

    public void miniMenu(Scanner input, Account bank, Prompts message) {
        boolean exitMiniMenu = false; // Flag to control the mini menu loop
        while (!exitMiniMenu) {
            // Display the mini menu options
            System.out.println("\n================================");
            System.out.println("        Mini Menu        ");
            System.out.println("================================");
            System.out.printf("%-10s %-20s\n", "Number", "Option"); // Print headers
            System.out.println("--------------------------------");
            // Print each mini menu option with corresponding number
            System.out.printf("%-10d %-20s\n", 1, "Main menu");
            System.out.printf("%-10d %-20s\n", 2, "Balance Inquiry");
            System.out.printf("%-10d %-20s\n", 3, "View Transaction History");
            System.out.printf("%-10d %-20s\n", 4, "Exit");
            System.out.println("================================");
            int miniOption = input.nextInt(); // Get user input for mini menu option

            switch (miniOption) {
                case 1: // Return to Main Menu
                    exitMiniMenu = true; // Exit the mini menu loop
                    break;
                case 2: // Check Balance
                    System.out.printf("Balance: %d%n", bank.getBalance()); // Display account balance
                    exitMiniMenu = true; // Exit the mini menu loop
                    break;
                case 3: // View Transaction History
                    viewTransactionHistory(bank); // Call method to view transaction history
                    exitMiniMenu = true; // Exit the mini menu loop
                    break;
                case 4: // Go back to Main Menu
                    exitMiniMenu = true; // Exit the mini menu loop
                    System.out.println("Exiting mini menu."); // Inform user about exit
                    break;
                default: // Handle invalid option
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void viewTransactionHistory(Account bank) {
        List<Transaction> history = bank.getTransactionHistory(); // Retrieve transaction history
        if (history.isEmpty()) {
            System.out.println("No transaction history available."); // Inform user if history is empty
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : history) {
                System.out.println(transaction); // Print each transaction in history
            }
        }
    }
}
