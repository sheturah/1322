package loan;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
public static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		ArrayList <Loan> Li = new ArrayList<Loan>();
		int userChoice;
		
		do {
			System.out.println("1 – Add Loan\r\n"
					+ "2 – Delete Loan\r\n"
					+ "3 – Calculate Monthly Payments\r\n"
					+ "4 – Print Loans\r\n"
					+ "5 – Exit");
			System.out.print("\nEnter Choice: ");
			userChoice = scan.nextInt();
			
			if(userChoice<6 && userChoice>0) {
			switch(userChoice)
			{
			case 1:
				addLoan(Li);
				break;
			case 2:
				deleteLoan(Li);
				break;
			case 3:
				calculateMonthlyLoanPayment(Li);
				break;
			case 4:
				PrintLoans(Li);
				break;
			case 5:
				break;
			}
			}
			else {
				System.out.println("ERROR: Please enter valid input.");
			}
			System.out.println(" ");
			
		}while(userChoice != 5);
		
		
	}
	
	public static void addLoan(ArrayList<Loan> li)
	{
		int loanType;
		String name;
		double loanBalance;
		double interest;
		int months;
		String Deferment;
		boolean isDeffered;
		double downPayment;
		
		System.out.println("Enter Loan Type (1- Student, 2 -Auto)");
		loanType = scan.nextInt();
		System.out.println("Enter Customer Name: ");
		scan.nextLine();
		name = scan.nextLine();
		 System.out.println("Enter Loan Amount: ");
		 loanBalance = scan.nextDouble();
		 System.out.println("Enter Interest Rate: ");
		 interest = scan.nextDouble();
		 System.out.println("Enter Number of Monthly Payments: ");
		 months = scan.nextInt();
		 
		 if(loanType == 1)
		 {
			 System.out.println("Is Loan Deferred? (Y or N): ");
			 scan.nextLine();
			 Deferment = scan.nextLine();
			 Deferment = Deferment.toUpperCase();
			 
			 if(Deferment.charAt(0) == ('Y'))
			 {
				 isDeffered =true;
			 }
			 else
			 {
				 isDeffered = false;
			 }
			
			 StudentLoan stu = new StudentLoan(name, loanBalance, interest, months, isDeffered);
			 li.add(stu);
		 }
		 
		 if(loanType == 2)
		 {
			 System.out.println("Enter Amount of Down Payment: ");
			 downPayment = scan.nextDouble();
			 AutoLoan aut = new AutoLoan(name, loanBalance, interest, months, downPayment);
			 li.add(aut);
			 
		 }
		
	}
	
	public static void deleteLoan(ArrayList<Loan> li)
	{
		String name;
		System.out.println("Enter Customer Name: ");
		scan.nextLine();
		name = scan.nextLine();
		boolean isFound = false;
		
		for(int i = 0; i <li.size(); i++)
		{
			if((li.get(i).getCustomerName()).equals(name))
			{
				isFound = true;
				li.remove(i);
			Loan.decreaseNumberOfLoans();
			}
		}
		
		if(isFound == false)
		{
			System.out.println("That customer wasn't found.");
		}
	}
	
	public static void calculateMonthlyLoanPayment(ArrayList<Loan> li)
	{
		for(int i = 0; i < li.size(); i++)
		{
			li.get(i).calculateMonthlyPayment();
		}
	}
	
	public static void PrintLoans(ArrayList<Loan> li)
	{
		for(Loan i : li)
		{
			System.out.println(i);
		}
	}
}
