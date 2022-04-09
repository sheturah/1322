package loan;

public class AutoLoan extends Loan {

	private double downPayment;

	public AutoLoan(String customerName, double loanBalance, double interestRate, int numberOfMonthlyPayments,
			double downPayment) {
		super(customerName, loanBalance, interestRate, numberOfMonthlyPayments);
		this.downPayment = downPayment;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	@Override
	public void calculateMonthlyPayment()
	{
		double roundOff = Math.round((getInterestRate() / 100 * (getLoanBalance() - downPayment))
                / (1 - Math.pow(1 + getInterestRate() / 100, -getNumberOfMonthlyPayments())) * 100.0) / 100.0;
		 setMonthlyPayment(roundOff);
	}
	
	@Override
	public String toString()
	{
		String statement =super.toString() + "\nDown Payment: " + downPayment;
		return statement;
	}
}
