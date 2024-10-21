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
		System.out.printf("Your current balance is %d" , getBalance());
	}
	
public void debit(int amount ) {
	
	if(amount>getBalance()) {
		System.out.println("Debit amount exceeded account balnce");
		}
	else{
		 setBalance(getBalance()- amount);
		System.out.printf("Your current balance is %d" , getBalance());
		}
}
}
