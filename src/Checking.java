
public class Checking extends Account{

	
	public Checking()
	{
		
	}
    public Checking(double balance)
    {
      super(balance);
    }

    @Override
    public void withdrawl(double withdrawl)
    {
       
        if(getBalance() - withdrawl <= 0)
        {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            super.withdrawl(20);

        }
        super.withdrawl(withdrawl);
    }
}
