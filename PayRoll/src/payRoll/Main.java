package payRoll;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Faculty> f1 = new ArrayList<Faculty>();
		int userChoice = 0;
		boolean validInput = false;
		
		do {
			
			do {
	System.out.println("1 – Add Faculty\r\n"
			+ "2 – Delete Faculty\r\n"
			+ "3 – Calculate Faculty Pay\r\n"
			+ "4 – Print Faculty\r\n"
			+ "5 – Exit");
			System.out.print("Enter Choice: ");
			userChoice = scan.nextInt();
			if(userChoice == 1 || userChoice == 2|| userChoice == 3|| userChoice == 4||userChoice == 5)
			{
				validInput = true;
			}
			else
			{
				System.out.println("Error: Please enter a valid input");
			}
			
			}while(validInput == false);
			
			switch(userChoice)
			{
			case 1: 
				addFaculty(f1);
				break;
			case 2: 
				removeFaculty(f1);
				break;
			case 3: 
				calculateFacultyPay(f1);
				break;
			case 4: 
				printFaculty(f1);
				break;
			case 5: 
				break;
			}
		}while(userChoice<5);
		
		
	}
	public static void addFaculty(ArrayList<Faculty> f1)
	{
		
		String name;
		double salary;
		double stipend;
		
		System.out.println("Enter Employee Name:");
		scan.nextLine();
		name = scan.nextLine();
		System.out.println("Enter Weekly Salary: ");
		salary = scan.nextDouble();
		System.out.println("Enter Weekly Stipend: ");
		stipend = scan.nextDouble();
		
		Faculty f2 = new Faculty(name, salary, stipend);
		f1.add(f2);
	}
	
	public static void removeFaculty(ArrayList<Faculty> f1)
	{
		System.out.println("Enter Employee Name: ");
		scan.nextLine();
		String name = scan.nextLine();
		boolean doesExist = false;
		

for(int i = 0; i<f1.size();i++)
{
	doesExist = name.equalsIgnoreCase(f1.get(i).getName());
	if(doesExist)
	{
		f1.remove(i);
		Employee.decreaseNumberOfEmployees();
	}
	}
		
		if(doesExist == false)
		{
			System.out.println("That employee doesnt exist");
		}
		
	}
	
	public static void  calculateFacultyPay(ArrayList<Faculty> f1)
	{
		for(Faculty f : f1)
		{
			f.calculateWeeklyPay();
		}
	}
	
	public static void  printFaculty(ArrayList<Faculty> f1)
	{
		for(Faculty f : f1)
		{
			System.out.println(f);
		}
	}

}
