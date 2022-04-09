package loan;

public class StudentLoan extends Loan{

	private boolean isDeffered;
	
	StudentLoan(String name, double amount, double rate, int months, boolean isDef)
	{
		super(name, amount, rate, months);
		isDeffered = isDef;
		
	}

	public boolean isDeffered() {
		return isDeffered;
	}

	public void setDeffered(boolean isDeffered) {
		this.isDeffered = isDeffered;
	}
	
	@Override
	public void calculateMonthlyPayment()
	{
		if(isDeffered)
		{
			super.setMonthlyPayment(0);
		}
		else {
		 super.calculateMonthlyPayment();
		
		}
	}
	
	@Override
	public String toString()
	{
		String statement = super.toString() + "Deferment: " + isDeffered +"\n";
		return statement;
	}
}
