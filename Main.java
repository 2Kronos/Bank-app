 package bank;
import java.util.Scanner;


public class Main {

public static void menu({})
	public static void main(String[] args) {
	// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			Account bank = new Account();
			
			
			System.out.printf("Pick an option \n1. Deposit \n 2. Withdraw");
			int option = input.nextInt();

		
// Deposit
			if (option == 1) {
				System.out.println("Enter the amount you want to deposit");
				int depositAmount = input.nextInt();
				bank.credit(depositAmount); 
			}
// Withdraw
			else if (option == 2) {
				System.out.println("Enter the amount you want to withdraw");
				int withdrawAmount = input.nextInt();
			bank.debit(withdrawAmount);
			}
// Invalid option
			else {
				System.out.println("Invalid option");
			}	
		
	}

}
