package insurance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<InsurancePolicy> ins = new ArrayList<InsurancePolicy>();
		
		int userChoice;
		String policyHolder;
		double deductibleAmount;
		double coPayAmount;
		double outOfPocketAmount;
		boolean hasMetDeductible = true;
		boolean hasMetTotalOutOfPocket = true;
		
		String beneficiary;
		int term;
		double termPayout;
		
		do
		{
		System.out.println("1 – Create Health Insurance Policy\r\n"
				+ "2 – Create Term-Life Insurance Policy\r\n"
				+ "3 – Exit");	
		System.out.print("\nEnter Choice: ");
		userChoice = scan.nextInt();
		
		if (userChoice == 1 )
		{
			
			System.out.println("\nEnter name of policy holder:");
			scan.nextLine();
			policyHolder = scan.nextLine();
			System.out.println("Enter deductible amount: ");
			deductibleAmount = scan.nextDouble();
			System.out.println("Enter co-payment amount: ");
			coPayAmount = scan.nextDouble();
			System.out.println("Enter total out-of-pocket amount: ");
			outOfPocketAmount = scan.nextDouble();
			HealthInsurancePolicy h1 = new HealthInsurancePolicy(policyHolder, deductibleAmount, coPayAmount, outOfPocketAmount);
			hasMetDeductible = h1.hasMetDeductible();
			hasMetTotalOutOfPocket = h1.hasMetTotalOutOfPocket();
			ins.add(h1);
		}
		else if(userChoice == 2)
		{
			System.out.println("\nEnter name of policy holder:");
			scan.nextLine();
			policyHolder = scan.nextLine();
			System.out.println("Enter name of beneficiary: ");
			beneficiary = scan.nextLine();
			
			System.out.println("Enter number of years in term: ");
			term = scan.nextInt();
			System.out.println("Enter amount of payout: ");
			termPayout = scan.nextDouble();
			TermLifeInsurancePolicy t1 = new TermLifeInsurancePolicy(policyHolder, beneficiary, term, termPayout);
			ins.add(t1);
		}
		else if(userChoice> 3 || userChoice <1)
		{
			System.out.println("Error: Please enter valid input");
		}
		}while(userChoice != 3);
		
		for(int i = 0; i < ins.size(); i++)
		{
			System.out.print(ins.get(i).getPolicyHolder() + " " + ins.get(i).getPolicyNumber());
		if (ins.get(i) instanceof HealthInsurancePolicy)
		{
			System.out.println(" Met Deductible: " + hasMetDeductible + ", Met Total Out-of-Pocket: " + hasMetTotalOutOfPocket);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
