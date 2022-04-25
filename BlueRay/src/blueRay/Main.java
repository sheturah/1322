package blueRay;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		BlueRayCollection brc = new BlueRayCollection();
		int userChoice = 2;
		boolean done = false;
		
		while(done == false)
		{
		try {
			
			System.out.println("\n0. Quit\r\n"
					+ "1. Add BlueRay to collection\r\n"
					+ "2. See collection");
			userChoice = scan.nextInt();
			
			System.out.println(userChoice);
			if(userChoice < 0 || userChoice >2)
			{
				throw new Exception("That input was valid, please try again!");
			}
			else
			{
				userChoice++;
				switch(userChoice)
				{
				case 1:
				done = true;
					break;
					
				case 2:
					addBlueRay(brc);
					break;
					
				case 3:
					brc.show_all();
					break;
					
				}
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}

	}
	
	public static void addBlueRay(BlueRayCollection b1)
	{
		//add(String title, String director, int yearOfRelease, double cost)
		
		System.out.println("What is the title?\n");
		String title = scan.next();
		title+= scan.nextLine();
		
		System.out.println("Who is the director?\n");
		String director = scan.next();
		director+= scan.nextLine();
		
		System.out.println("What is the year of release?\n");
		int year = scan.nextInt();
		
		System.out.println("What is the cost?\n");
		double cost = scan.nextDouble();
		
		b1.add(title, director, year, cost);
	
	}

}
