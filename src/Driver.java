
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Checking check1 = new Checking();
		Savings save1 = new Savings();
		
		check1.setAccountNumber(10001);
		save1.setAccountNumber(10002);
		
		double cash;
		int input = 0;
		
		while(input != 8)
		{
		input = displayAccount();
		
		
		switch(input)
		{
		case 1: 
			System.out.println("How much would you like to withdraw from Checking? ");
			cash = scan.nextDouble();
			check1.withdrawl(cash);
			System.out.println("Doing default withdraw");
			break;
			
		case 2:
			System.out.println("How much would you like to withdraw from Savings? ");
			cash = scan.nextDouble();
			save1.withdrawl(cash);
			System.out.println("Doing default withdraw");
			break;
			
		case 3:
			System.out.println("How much would you like to deposit to Checking? ");
			cash = scan.nextDouble();
			check1.deposit(cash);
			System.out.println("Doing default deposit");
			break;
			
		case 4:
			System.out.println("How much would you like to deposit to Savings? ");
			cash = scan.nextDouble();
			save1.deposit(cash);
			System.out.println("Doing default deposit");
			break;
			
		case 5:
			System.out.println("Your balance for checking "+ check1.getAccountNumber()+" is "+check1.getBalance());
			break;
			
		case 6:
			System.out.println("Your balance for savings "+save1.getAccountNumber()+" is "+save1.getBalance());
			break;
			
		case 7:
			save1.interest();
			break;
		case 8:
			
			break;
		}

	}
	}
	public static int displayAccount()
	{
		Scanner scan= new Scanner(System.in);
		int input = 0;
		boolean error;

		do {
			error = false;
		try {
			 System.out.println("\n****** MENU *****");
			System.out.println("1. Withdraw from Checking\n" +
					"2. Withdraw from Savings\n" +
					"3. Deposit to Checking\n" +
					"4. Deposit to Savings\n" +
					"5. Balance of Checking\n" +
					"6. Balance of Savings\n" +
					"7. Award Interest to Savings now\n" +
					"8. Quit");
			 System.out.print("Enter your selection : ");
			input = scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter a number 1-8");
			
			error = true;
			scan.nextLine();
		}
           if(input == 8)
		   {
			   System.out.println("Have a great day");
		   }
           else if(input > 0 && input < 8 )
           {
        	   error = false;
        	
        	   
           }
           else
           {
        	  error = true;
        	  
           }
		}while(error);
		
		return input;
		
	}
	
	}
