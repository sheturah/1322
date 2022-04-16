package bankManagement;

public class Checking_Account extends Bank_Account{

	private double withdrawLimit;

	public Checking_Account(String customerName, String userID, String userPassword) {
		super(customerName, userID, userPassword);
		this.withdrawLimit = 300;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
}
