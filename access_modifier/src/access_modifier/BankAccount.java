package access_modifier;

public class BankAccount {
	private String name;

	public double balance = 0.0D;

	public BankAccount(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Your current balance is: " + this.balance);
	}
	
	public void withdrawn(double amount) {
		if (this.balance < amount) {
			System.out.println("Maximum is: " + this.balance);
		} else {
			this.balance-=amount;
			System.out.println("Your withdrawn: " + amount);
			System.out.println("Your current balance is: " + this.balance);
		}
		
	}
}
