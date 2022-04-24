package parrallelProcessing;

public class CardHolder implements Runnable{

	private CreditCard customersCreditCard;
	
	public CardHolder(CreditCard c1)
	{
		customersCreditCard = c1;
	}
	@Override
	public void run()
	{
		try {
		for(int i = 1; i<=6; i++)
		{
			makeWithdraw(500);
			
			if(customersCreditCard.getBalance() < 0)
			{
				throw new Exception("Error: Insufficient Funds");
			}
		}
		}catch(Exception e)
		{
			System.out.println("An error occured: " + e.getMessage());
		}
	}
	
	private synchronized void makeWithdraw(double withdrawAmount) 
	{
		/*1)if the account balance is less than the withdraw amount
		 * print an error message that contains the thread name, Withdraw
		 amount, and account balance*/
		boolean ableToWithdraw = false;
		try {
		if(customersCreditCard.getBalance() < withdrawAmount)
		{
			throw new Exception("Not enough in: thread" + Thread.currentThread().getName() + " to withdraw:S" +withdrawAmount
					+ ", Balance:$" + customersCreditCard.getBalance());
		}
		
		if(customersCreditCard.getBalance() >= withdrawAmount)
		{
			System.out.println("Thread " + Thread.currentThread().getName() + " before withdarawing $" + withdrawAmount + ", Balance: $" + customersCreditCard.getBalance());
			ableToWithdraw = true;
			Thread.sleep(6000);
		}
		
		}catch(Exception e)
		{
			System.out.println("An error occured: " + e.getMessage());
		}
		
		if(ableToWithdraw)
		{
			customersCreditCard.Withdraw(500);
			System.out.println("Thread " + Thread.currentThread().getName() + ", after withdarawing $" + withdrawAmount + ", Balance: $" + customersCreditCard.getBalance());
		}
	}
}
