package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab11Two {

	public static void main(String[] args) throws FileNotFoundException {
	
		try {
			
			//makes the files local
		String directory = "C:\\Users\\ssims\\OneDrive\\Desktop\\Tester1.txt";
		String directory2 = "C:\\Users\\ssims\\OneDrive\\Desktop\\Tester2.txt";
		File Tester1File = new File(directory);
		File Tester2File = new File(directory2);
		
		//scans the files
		Scanner scan = new Scanner(Tester1File);
		Scanner scan2 = new Scanner(Tester2File);
		
		String Tester1Lines ="";
		String Tester2Lines ="";
		int lineCounter = 1;
		
		/*go through the file
		 * keep track of the line
		 * and print out where the lines differ*/
		
		while(scan.hasNextLine())
		{
			Tester1Lines = scan.nextLine();
			
			Tester2Lines = scan2.nextLine();
			
			if(!Tester1Lines.equals(Tester2Lines))
			{
				System.out.println("Line " + lineCounter);
				System.out.println("<" + Tester1Lines);
				System.out.println(">" + Tester2Lines);
				
			}
			lineCounter++;
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
	}

}}
