package bankManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws CustomerAccountNotFoundException, InvalidPasswordFormatException, NegativeDollarAmountException, InsufficientFundsException {
	int userInput = 0;
	ArrayList<Bank_Account> customers = new ArrayList<Bank_Account>();
	try {
		do {
			System.out.println("\n~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~");
			System.out.println("\n1 – Create An Account\r\n"
					+ "2 – Delete An Account\r\n"
					+ "3 – Make An Account Deposit\r\n"
					+ "4 – Make An Account Withdrawal\r\n"
					+ "5 – Check An Account Balance\r\n"
					+ "6 – Exit");
			System.out.print("\nEnter Choice: ");
			userInput = scan.nextInt();
			
			if(userInput<1 || userInput>6)
			{
				System.out.println("Error: Please enter a valid choice (1 thru 6)");
			}
			
		
		switch(userInput)
		{
		case 1:		
			createAnAccount(customers);
			break;
		case 2:
			customers.remove(deleteAnAcocunt(customers));
			Bank_Account.decreaseNumberOfAccounts();
			break;
		case 3:
			customers = checkAcocuntDeposit(customers);
			break;
		case 4:
			customers = checkAcocuntWithdraw(customers);
			break;
		case 5:
			PrintCustomerBalance(customers);
			break;
		case 6:
		
		}
		
		System.out.println();
		for(int i = 0; i <customers.size(); i++)
		{
			System.out.println((i+1) + ": " + customers.get(i).ToString());
		}
		}while(userInput != 6);
	}
	catch(Exception e)
	{
		System.out.println("Problem Occured!");
	}
	}
	
	//method for creating a account
	//Works Perfectly CASE-1
	public static void createAnAccount(ArrayList<Bank_Account> customers) throws InvalidPasswordFormatException
	{
		String name = "";
		String userID = "";
		String password = "";
		
		try {
		System.out.print("\nEnter Customer Name: ");
		name = scan.next();
		name += scan.nextLine();
		
		System.out.print("\nEnter User ID: ");
		userID = scan.next();
		
		System.out.print("\nEnter User Password: ");
		password = scan.next();
		
		//checks user name and password
				if (password.length() < 8|| !password.contains("*"))
				{
					throw new InvalidPasswordFormatException("Error: Must Enter a Valid User ID and Password");
				}
				else
				{
					Checking_Account c1 = new Checking_Account(name, userID, password);
					customers.add(c1);
				}
		}
		catch(Exception e)
		{
			System.out.println("An Error Occured! " + e);
		}
		

	
		
	}
	//method for deleting an account
	//CASE 2 works perfectly
	public static int deleteAnAcocunt(ArrayList<Bank_Account> customers) throws CustomerAccountNotFoundException, InvalidPasswordFormatException
	{
		int index = 0;
		String userID = "";
		String password = "";
		boolean isFound = false;
		
		try {
		System.out.print("\nEnter User ID: ");
		userID = scan.next();
		
		System.out.print("\nEnter User Password: ");
		password = scan.next();
		
		//checks userID and password
		if (password.length() < 8 || !password.contains("*"))
		{
			throw new InvalidPasswordFormatException("Error: Must Enter a Valid User ID and Password");
		}
		
		//transverse the array and finds out if the array exist and stores the index of the array
		for(int i = 0; i<customers.size(); i++)
		{
			if(customers.get(i).getUserID().equals(userID) && customers.get(i).getUserPassword().equals(password))
				{
				index = i;
				isFound = true;
				};
		}
		if(isFound == false)
		{
			throw new CustomerAccountNotFoundException("CustomerAccountNotFoundException: Customer Account Not Found");
		}
		}
		catch(Exception e)
		{
			System.out.println("An Error Occured! " + e);
		}
		
	
		return index;
		
	}
	//method for making an account deposit
	//CASE 3 works perfectly
	public static ArrayList<Bank_Account> checkAcocuntDeposit(ArrayList<Bank_Account> customers) throws CustomerAccountNotFoundException, InvalidPasswordFormatException, NegativeDollarAmountException
	{
		String userID = null;
		String password = null;
		double accountDeposit = 0;
		int index;
		boolean isFound = false;
		double newBalance;
		
		try {
			System.out.print("\nEnter User ID: ");
			userID = scan.next();
			
			System.out.print("\nEnter User Password: ");
			password = scan.next();
			
			System.out.print("\nEnter Amount: ");
			accountDeposit = scan.nextDouble();
			
			//checks userID and password
			if (password.length() < 8 || !password.contains("*"))
			{
				throw new InvalidPasswordFormatException("Error: Must Enter a Valid User ID and Password");
			}
			
			//checks to see if the deposit entered is negative
			if(accountDeposit < 0)
			{
				throw new NegativeDollarAmountException("NegativeDollarAmountException: Negative Dollar Amount");
			}
			
			//checks to see if the user name and password exist and match then make the deposit
			
			for(int i = 0; i<customers.size(); i++)
			{
				if(customers.get(i).getUserID().equals(userID) && customers.get(i).getUserPassword().equals(password))
					{
					index = i;
					isFound = true;
					newBalance = customers.get(index).getAccountBalance() + accountDeposit;
					customers.get(index).setAccountBalance(newBalance);
					};
			}
			if(isFound == false)
			{
				throw new CustomerAccountNotFoundException("CustomerAccountNotFoundException: Customer Account Not Found");
			}
			}
			catch(Exception e)
			{
				System.out.println("An Error Occured! " + e);
			}

		
		return customers;
	}
	
	//method for making a account withdraw
	//CASE 4 works perfectly
	public static ArrayList<Bank_Account> checkAcocuntWithdraw(ArrayList<Bank_Account> customers) throws CustomerAccountNotFoundException, InvalidPasswordFormatException, NegativeDollarAmountException, InsufficientFundsException
	{
		String userID = null;
		String password = null;
		double accountWithraw = 0;
		int index;
		double newBalance;
		boolean isFound = false;
		
		
		try {
			System.out.print("\nEnter User ID: ");
			userID = scan.next();
			
			System.out.print("\nEnter User Password: ");
			password = scan.next();
			
			System.out.print("\nEnter Amount: ");
			accountWithraw = scan.nextDouble();
			
			//checks userID and password
			if (password.length() < 8 || !password.contains("*"))
			{
				throw new InvalidPasswordFormatException("Error: Must Enter a Valid User ID and Password");
			}
			
			//checks to see if the withdraw entered is negative
			if(accountWithraw < 0)
			{
				throw new NegativeDollarAmountException("NegativeDollarAmountException: Negative Dollar Amount");
			}
			
			//checks to see if the user name and password exist and match then make the withraw
			for(int i = 0; i<customers.size(); i++)
			{
				if(customers.get(i).getUserID().equals(userID) && customers.get(i).getUserPassword().equals(password))
					{
					index = i;
					isFound = true;
					if(customers.get(index).getAccountBalance()> accountWithraw)
					{
						
						newBalance = customers.get(index).getAccountBalance() - accountWithraw;
						
						customers.get(index).setAccountBalance(newBalance);
					}
					else
					{
						throw new InsufficientFundsException("Error: Must Withdraw an Amount Less Than Your Balance\r\nInsufficientFundsException: Insufficient Funds");
					}
					
			}		}	
				if(isFound == false)
				{
				throw new CustomerAccountNotFoundException("CustomerAccountNotFoundException: Customer Account Not Found");
			     }
				}

			catch(Exception e)
			{
				System.out.println("An Error Occured! " + e);
			}

		
		return customers;
	}
	
	
	//method for checking the account balance
	//CASE 5
	public static void PrintCustomerBalance(ArrayList<Bank_Account>customers) throws InvalidPasswordFormatException, CustomerAccountNotFoundException
	{
		String userID = null;
		String password = null;
		int index;
		boolean isFound = false;
		
		try {
			System.out.print("\nEnter User ID: ");
			userID = scan.next();
			
			System.out.print("\nEnter User Password: ");
			password = scan.next();
			
			//checks userID and password
			if (password.length() < 8 || !password.contains("*"))
			{
				throw new InvalidPasswordFormatException("Error: Must Enter a Valid User ID and Password");
			}
			
			//checks to see if the user name and password exist and match then make the deposit
			for(int i = 0; i<customers.size(); i++)
			{
				if(customers.get(i).getUserID().equals(userID) && customers.get(i).getUserPassword().equals(password))
					{
					index = i;
					isFound = true;
					System.out.println(customers.get(index).ToString());
					};
			}
			if(isFound == false)
			{
				throw new CustomerAccountNotFoundException("CustomerAccountNotFoundException: Customer Account Not Found");
			}
			
			}
			catch(Exception e)
			{
				System.out.println("An Error Occured! " + e);
			}
	
	}

}
