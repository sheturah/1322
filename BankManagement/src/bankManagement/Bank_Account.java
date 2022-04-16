package bankManagement;

public class Bank_Account {

	private String customerName;
	private int accountID;
	private static int numberOfAccounts = 0;
	private String userID;
	private String userPassword;
	private double accountBalance;
	
	public Bank_Account(String customerName, String userID, String userPassword) {
		super();
		this.customerName = customerName;
		this.userID = userID;
		this.userPassword = userPassword;
		numberOfAccounts++;
		accountID = numberOfAccounts;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public static int getNumberOAccounts()
	{
		return numberOfAccounts;
	}
	
	public static void decreaseNumberOfAccounts()
	{
		numberOfAccounts--;
	}
	
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String ToString()
	{
		return "\nCustomer Name: " + getCustomerName() +
 				"\nAccount Number: " + getAccountID() +
				"\nAccount Balance: " + getAccountBalance() + 
				"\nAccount Type: Checking" +
				"\nAccount Daily Withdrawal Limit: 300.00" +
				"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		
	}
}
