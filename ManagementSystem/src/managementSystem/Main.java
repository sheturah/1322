package managementSystem;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
			int choice = 0;
			boolean stillGoing = true;
			JobLeadsList leaders = new JobLeadsList();
			
			while(stillGoing)
			{
				System.out.println("\n1 – Add lead to head of list\n"
						+ "2 – Add lead to tail of list\n"
						+ "3 – Delete a lead\n"
						+ "4 – Print list from head to tail\n"
						+ "5 – Print list from tail to head\n"
						+ "6 – Exit");
				choice = scan.nextInt();
				
				do {
				if(choice < 1 || choice > 6)
				{
					  System.out.println("Error: Please enter a valid choice(1 thru 6)");
		                System.out.print("Enter Choice: ");
		                choice = scan.nextInt();
				}
				
				
			}while(choice < 1 || choice > 6);
				
				switch (choice) {
				case 1: 
					AddLeader(leaders, 1);
					break;
					
				case 2: 
					AddLeader(leaders, 2);
					break;
				case 3: 
					deleteLeader(leaders);
					break;
				case 4: 
					leaders.printHeadToTail();
					break;
					//why isn't this working
				case 5: 
					leaders.printTailToHead();
					break;
				case 6: 
					stillGoing = false;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			}
						}catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}

	}
	
	//this works well
	public static void AddLeader(JobLeadsList leaders, int choice)
	{
		String company_name;
		String contact_name;
		String contact_phone;
		String job_title;
		String job_description;
		
		try {
		
		 System.out.print("Enter company name: ");
         company_name = scan.next();
         company_name += scan.nextLine();
         
         System.out.print("Enter contact name: ");
         contact_name = scan.next();
         contact_name += scan.nextLine();
         
         System.out.print("Enter contact phone: ");
         contact_phone = scan.next();
         
         System.out.print("Enter job title: ");
         job_title = scan.next();
         job_title += scan.nextLine();
         
         System.out.print("Enter job description: ");
         job_description = scan.next();
         job_description += scan.nextLine();
         
         if (choice == 1)
         {
         leaders.addToFront(company_name, contact_name, contact_phone, job_title, job_description);
         }
         else
         {
         leaders.addToTail(company_name, contact_name, contact_phone, job_title, job_description); 
         }
		}catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
         
	}
	//this possibly works but the method from linkedList doesnt
	public static void deleteLeader(JobLeadsList leaders)
	{
		String companyName;
		String contactName;
		
		try {
			
		System.out.println("Enter Company Name: ");
		companyName = scan.next();
		companyName += scan.nextLine();
		
		System.out.println("Enter Contact Name: ");
		contactName = scan.next();
		contactName += scan.nextLine();
		
		leaders.removeLead(companyName, contactName);
		
		}catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}
