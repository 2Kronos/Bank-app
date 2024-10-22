 package bank;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
					Account bank = new Account();
					Prompts message = new Prompts();
					boolean exit = false;
					message.menu();
					int option = input.nextInt();

			while (!exit) {
		
	// Deposit
					switch (option) {
						case 1:
							System.out.println("Enter the amount");
							int depositAmount = input.nextInt();
							bank.credit(depositAmount); 
							message.miniMenu();
							break;
	// Withdraw						
						case 2:
						System.out.println("Enter the amount");
						int withdrawAmount = input.nextInt();
						bank.debit(withdrawAmount);
						message.miniMenu();
						break;
	// Balance Inquiry
						case 3:
						System.out.printf("Balance: %n", bank.getBalance());
						message.miniMenu();
						break;
			
	// Invalid option
					default:
						System.out.println("Invalid option");
						message.menu();
						break;
					}
				
			}	
			
		}

	}
}
