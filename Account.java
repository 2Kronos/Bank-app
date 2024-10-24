package bank;

public class Account {


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
		System.out.println("--------------------------------");
	}
		
	public void debit(int amount ) {
		
		if(amount>getBalance()) {
			System.out.println("Debit amount exceeded account balnce");
			System.out.println("--------------------------------");
		}
		else{
			setBalance(getBalance()- amount);
			System.out.printf("Withdrawal complete \n");
			System.out.println("--------------------------------");
		}
	}
}
