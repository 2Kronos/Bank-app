package bank;

public class Account {

// public static void miniMenu(){
// 	System.out.printf("===========Main menu========== \n");
// 	System.out.println("\n1. Deposit \n2. Withdraw \n3. Balance Inquiry");
// 	} 

	// Balance

private int balance;
	
public void setBalance(int amount) {
	balance = amount;
	}
	
public int getBalance() {
	return balance;
	}
	
	public void credit(int amount) {
		setBalance(getBalance()+ amount);
		System.out.printf("Your deposit was succesful\n" );
	}
	
public void debit(int amount ) {
	
	if(amount>getBalance()) {
		System.out.println("Debit amount exceeded account balnce");
		}
	else{
		 setBalance(getBalance()- amount);
		System.out.printf("Withdrawal complete \nNew balance = %d\n" , getBalance());
		}
}
}
