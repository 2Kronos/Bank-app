package bank;

import java.io.Console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Account bank = new Account();
			Prompts message = new Prompts();
			Authentication auth = new Authentication();
			Console console = System.console();
			
			// Sign-up process
			System.out.println("Create a username:");
			String username = input.nextLine();

			String password;
			if (console != null) {
				System.out.println("Create a password:");
				password = new String(console.readPassword()); // Password is hidden while typing
			} else {
				System.out.println("Create a password (Warning: Password will be visible due to unsupported console):");
				password = input.nextLine(); // Fallback for unsupported environments
			}
			auth.signUp(username, password);

			// Sign-in loop
			boolean signedIn = false;
			while (!signedIn) {
				System.out.println("Enter username:");
				String inputUsername = input.nextLine();

				String inputPassword;
				if (console != null) {
					System.out.println("Enter password:");
					inputPassword = new String(console.readPassword()); // Password is hidden while typing
				} else {
					System.out.println("Enter password (Warning: Password will be visible due to unsupported console):");
					inputPassword = input.nextLine(); // Fallback for unsupported environments
				}

				if (auth.signIn(inputUsername, inputPassword)) {
					System.out.println("Sign-in successful. Welcome!");
					signedIn = true;
				} else {
					System.out.println("Incorrect username or password. Please try again.");
				}
			}

			boolean exit = false;
			while (!exit) {

				message.menu();
				int option = input.nextInt();
				// Deposit
				switch (option) {
					case 1:
						System.out.println("Enter the amount\n");
						System.out.println("--------------------------------");
						int depositAmount = input.nextInt();
						bank.credit(depositAmount);
						message.miniMenu(input, bank, message);
						break;
					// Withdraw
					case 2:
						System.out.println("Enter the amount\n");
						System.out.println("--------------------------------");
						int withdrawAmount = input.nextInt();
						bank.debit(withdrawAmount);
						message.miniMenu(input, bank, message);
						break;
					// Balance Inquiry
					case 3:
						System.out.printf("Balance: %d\n", bank.getBalance());
						System.out.println("--------------------------------");
						message.miniMenu(input, bank, message);
						break;
					// View Transaction History
					case 4:
					message.viewTransactionHistory(bank);
						break;
					case 5:
						exit = true;
						System.out.println("Exiting...\n");
						System.out.println("--------------------------------");
						break;
					// Invalid option
					default:
						System.out.println("Invalid option\n");
						System.out.println("--------------------------------");

						break;
				}

			}

		}

	}
}
