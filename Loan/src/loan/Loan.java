package loan;

public class Loan {
	private String customerName;
	private int accountNumber;
	private double loanBalance;
	private double monthlyPayment;
	private double interestRate;
	private int numberOfMonthlyPayments;
	private static int numberOfLoans = 0;
	
	public Loan(String customerName, double loanBalance, double interestRate, int numberOfMonthlyPayments) {
		super();
		this.customerName = customerName;
		this.loanBalance = loanBalance;
		this.interestRate = interestRate;
		this.numberOfMonthlyPayments = numberOfMonthlyPayments;
		accountNumber = ++numberOfLoans;
	}
	
	public static int getNumberOfLoans()
	{
		return numberOfLoans;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getNumberOfMonthlyPayments() {
		return numberOfMonthlyPayments;
	}

	public void setNumberOfMonthlyPayments(int numberOfMonthlyPayments) {
		this.numberOfMonthlyPayments = numberOfMonthlyPayments;
	}
	
	public int getnumberOfLoans()
	{
		return numberOfLoans;
	}
	
	public static void decreaseNumberOfLoans()
	{
		numberOfLoans--;
	}
	
	public void calculateMonthlyPayment()
	{
		 monthlyPayment = (interestRate / 100 * loanBalance)
        / (1 - Math.pow(1 + interestRate / 100, -numberOfMonthlyPayments));	
		 double roundOff = Math.round(monthlyPayment * 100.0) / 100.0;
		 monthlyPayment = roundOff;
	}
	
 @Override
 public String toString()
 {
	 String statement = "Customer Name: " + getCustomerName() + " Account Number: " + getAccountNumber() + " Loan Balance: " + getLoanBalance() + 
			 "\nMonthly Payment: " + getMonthlyPayment() + " Interest Rate: " + getInterestRate() + "\nNumber of Monthly Payments: " + getNumberOfMonthlyPayments()+ "\n";
	 return statement;
 }

}
