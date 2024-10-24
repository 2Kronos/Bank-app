package bank;

import java.util.Scanner;

public class Prompts {

  public void menu() {
    System.out.println("\n================================");
    System.out.println("        Main Menu        ");
    System.out.println("================================");
    // Print table headers with columns for "Number" and "Option"
    System.out.printf("%-10s %-20s\n", "Number", "Option");
    System.out.println("--------------------------------");
    // Print the menu options in rows
    System.out.printf("%-10d %-20s\n", 1, "Deposit");
    System.out.printf("%-10d %-20s\n", 2, "Withdraw");
    System.out.printf("%-10d %-20s\n", 3, "Balance Inquiry");
    System.out.printf("%-10d %-20s\n", 4, "Exit");
    System.out.println("================================");
  }

  public void miniMenu(Scanner input, Account bank, Prompts message) {
    boolean exitMiniMenu = false;
    while (!exitMiniMenu) {
      // Show mini menu options
      System.out.println("\n================================");
      System.out.println("        Mini Menu        ");
      System.out.println("================================");
      // Print table headers with columns for "Number" and "Option"
      System.out.printf("%-10s %-20s\n", "Number", "Option");
      System.out.println("--------------------------------");
      // Print the mini menu options in rows
      System.out.printf("%-10d %-20s\n", 1, "Main menu");
      System.out.printf("%-10d %-20s\n", 2, "Balance Inquiry");
      System.out.printf("%-10d %-20s\n", 3, "Exit");
      System.out.println("================================");
      int miniOption = input.nextInt();

      switch (miniOption) {
        case 1: // Return to Main Menu
          exitMiniMenu = true; // Exit the miniMenu loop and return to main menu
          break;
        case 2: // Check Balance
          System.out.printf("Balance: %d%n", bank.getBalance());
          exitMiniMenu = true; // Exit the miniMenu loop and return to main menu
          break;
        case 3: // Go back to Main Menu
          exitMiniMenu = true; // Go back to the main menu
          System.out.println("Exiting mini menu.");
          break;
        default:
          System.out.println("Invalid option. Please try again.");
      }
    }
  }
}
