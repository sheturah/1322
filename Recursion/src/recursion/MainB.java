package recursion;

import java.util.Scanner;

public class MainB {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//prints out this phrase using recursion 100 times
	System.out.println(repeatNTimes("I must study recursion until it makes sense", 100));
	
	for(int i = 0; i < 5; i++)
	{
		System.out.println("\n**Separate run, ignoring the first 100 lines…**");
	System.out.println("Enter first string: ");
	String first = scan.nextLine();
	
	System.out.println("Enter second string: ");
	String second = scan.nextLine();
	
	//compares two palindromes to determine if they are reverses of each other
	if (isReverse(first, second))
	{
		System.out.println(first + " is the reverse of " + second);
	}
	else
	{
		System.out.println(first + " is not the reverse of " + second);
	}
	}
	}
	
	public static String repeatNTimes(String word, int times)
	{
		System.out.println();
		if(times == 0)
		{
			return "";
		}
		else if(times == 1)
		{
			return word;
		}
		else
		{

			return repeatNTimes(word,times-1) +"\n"+ word;
		}
	}
	
	public static boolean isReverse(String first, String second)
	{
		
		if(first.equals(second) && first.length() < 2 && second.length() < 2)
		{
			return true;
		}
		else if(first.length() == second.length())
		{
			   int length = second.length();
		        char letter1 = first.charAt(0);
		        char letter2 = second.charAt(length - 1);
		        if (letter1 == letter2) {
		            return isReverse(first.substring(1), second.substring(0, length - 1));
		}}
		else 
		{
			return false;
		}
		return false;
	}

}
