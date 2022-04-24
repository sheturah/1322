package parrallelProcessing;

public class CreditCard {
	
	private double balance = 5000.00;
	
	public double getBalance()
	{
		return balance;
	}
	
	public void Withdraw(double withdrawAmount)
	{
		balance -= withdrawAmount;
	}


}
