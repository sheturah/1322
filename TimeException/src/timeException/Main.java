package timeException;

import java.util.Scanner;

public class Main {
	
public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InvalidTimeException {
		
		int difference =0;
		for(int i = 0; i < 5; i++ )
		{
			if (i>0)
			{
			System.out.println("\n****Separate Run****\n");	
			}
		System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS) ");
		String firstTime = scan.next();
		System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS) ");
		String secondTime = scan.next();
		
		difference = findSecondDifference(firstTime, secondTime);
		System.out.println("Difference in seconds: " + difference);
		}
	}
	
	public static int findSecondDifference(String firstTime, String secondTime) throws InvalidTimeException
	{
		int difference = 0;
		int firstSeconds = 0;
		int secondSeconds = 0;
		
		try {
		if(firstTime.length()>8|| secondTime.length()>8 || firstTime.length()<8 || secondTime.length()<8)
		{
			throw new InvalidTimeException("Time format not valid");
		}
		String [] first = firstTime.split(":");
		String [] second = secondTime.split(":"); 
		int[] firstHour = new int[3];
		int[] secondHour = new int[3];
		
		
		//changes the string to integer
		for(int i = 0; i<3; i++)
		{
		
			firstHour[i] = Integer.parseInt(first[i]);
			secondHour[i] = Integer.parseInt(second[i]);
			
		}
		//checks the hour
		if(firstHour[0]>23 || firstHour[0]<0 || secondHour[0]>23 || secondHour[0]<0)
		{
			throw new InvalidTimeException("Hour must be below 24");
		}
		//checks the minutes
		else if(firstHour[1]>59 || firstHour[1]<0 || secondHour[1]>59 || secondHour[1]<0)
		{
			throw new InvalidTimeException("Minutes must be less than 60");
		}
		//checks the seconds
		else if(firstHour[2]>59 || firstHour[2]<0 || secondHour[2]>59 || secondHour[2]<0)
		{
			throw new InvalidTimeException("Seconds must be less than 60");
		}
		firstSeconds = (firstHour[0]*60*60) + (firstHour[1]*60) + (firstHour[2]);
	    secondSeconds = (secondHour[0]*60*60) + (secondHour[1]*60) + (secondHour[2]);
		}
		catch(InvalidTimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		if(firstSeconds> secondSeconds)
		{
			difference = firstSeconds - secondSeconds;
		}
		else	
		{
			difference = secondSeconds - firstSeconds;
		}
		return difference;
	}

}
