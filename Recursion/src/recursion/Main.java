package recursion;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int one = 0; 
		int two = 0;
		int userChoice = -1;
		int answer= 0;
		
		do {
			System.out.println("\nChoose from the following:\r\n"
					+ "0. Quit\r\n"
					+ "1. Multiply 2 numbers\r\n"
					+ "2. Div 2 numbers\r\n"
					+ "3. Mod 2 numbers\r\n"
					+ "");
			userChoice = scan.nextInt();
			
			if(userChoice == 1|| userChoice == 2 || userChoice == 3)
			{
			System.out.println("Enter first number: ");
			one = scan.nextInt();
			System.out.println("Enter second number: ");
			two = scan.nextInt();
			
			switch(userChoice)
			{
			case 1:
				answer = recursive_multiply(one, two);
				break;
			case 2:
				answer = recursive_div(one, two);
				break;
			case 3:
				answer = recursive_mod(one, two);
				break;
			}
			System.out.println("Answer: " + answer);
			}
			else if(userChoice<0 || userChoice>3)
			{
				System.out.println("Error: invalid input. Try again.");
			}
		}while(userChoice != 0);

	}
	public static int recursive_multiply(int first, int second)
	{
		//System.out.println("First: " + first + " Second: " + second);
		if(first == 0 || second == 0 )
		{
	return 0;		
		}
		else if(first == 1)
		{
			return second;
		}
		else
		{
			return(recursive_multiply(first-1,second) + second);
		}
	}
	
	
	public static int recursive_div(int first, int second)
	{
		//System.out.println("First: " + first + " Second: " + second);
		if(first == 0 || second == 0 )
		{
	return 0;		
		}
		else if(first == second)
		{
			return 1;
		}
		else if(first < second)
		{
			return 0;
		}
		else if(second == 1)
		{
			return first;
		}
		else
		{ 
			
			return(recursive_div(first - second,second) + 1);
		}
	}
	
	public static int recursive_mod(int first, int second)
	{
		if(first == 0 || second == 0 )
		{
	return -1;		
		}
		else if(first == second)
		{
			return 0;
		}
		else if(first < second)
		{
			return first;
		}
		else
		{
			return recursive_mod(first - second,second);
		}
		
	}

}
