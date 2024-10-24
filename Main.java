package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Account bank = new Account();
			Prompts message = new Prompts();
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
						System.out.printf("Balance: %n\n", bank.getBalance());
						System.out.println("--------------------------------");
						message.miniMenu(input, bank, message);
						break;

					case 4:
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
