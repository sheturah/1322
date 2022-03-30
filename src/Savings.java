
public class Savings extends Account{

    public int numbOfDeposits = 0;
	
    public Savings()
    {
    	
    }
    public Savings(double balance)
    {
       super(balance);
    }

    @Override
    public void withdrawl(double withdrawl)
    {

        if(getBalance()-withdrawl < 500)
        {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawl(10);
        }
        super.withdrawl(withdrawl);
    }
    
    @Override
    public void deposit(double deposit)
    {
       super.deposit(deposit);
        numbOfDeposits++;

        System.out.println("This is deposit " + numbOfDeposits + " to this account");

        if(numbOfDeposits >5)
        {
        	System.out.println("Charging a fee of $10");
            super.withdrawl(10);
        }
    }

    public void interest()
    {

    	double interest = (getBalance()/100.0)*1.5;
        super.deposit(interest);
      

        System.out.println("Customer earned " + interest + " in interest");

    }

}
