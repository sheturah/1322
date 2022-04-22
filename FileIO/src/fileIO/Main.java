package fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
	
		//Reads any text file on my desktop
		try {
	
		System.out.println("Enter the first file name: ");
		String fileOne = scan.next();
	
		String fileDirectory = "C:\\Users\\ssims\\OneDrive\\Desktop\\" + fileOne;
		String line ="";
		
		//opens the directory to the file
		File myFile = new File(fileDirectory);
		Scanner file = new Scanner(myFile);
		
		System.out.println("\nThis is whats in the file: ");
		
		//prints what's currently in the file
		while(file.hasNextLine())
		{
			
			System.out.println(file.nextLine());
			
		}
		
		System.out.println("\nThis is whats save under the line string: " + line);
		
		
		//how to save what's already in the file
		
		//writes to the file 
		FileWriter fileWrite = new FileWriter(fileDirectory);
		
		System.out.println("What do you want the file to say? ");
		String addedToFile = scan.next();
		addedToFile += scan.nextLine();
		
		//This overwrites what's on the file and saves it
		fileWrite.write(line.concat(addedToFile));
		fileWrite.close();
		
		//New Words
		PrintWriter printFileWriter = new PrintWriter(fileWrite);
		printFileWriter.print(printFileWriter);
		printFileWriter.close();
		}
		catch(Exception e)
		{
		System.out.println("Error: there was a problem: " + e);	
		}
		//prints what I added to the file
		
		//PrintWriter filePrint = new PrintWriter(addedToFile);
		//fileWrite.toString();
		//filePrint.print(add);
		
		//checks to see if there is any difference in the text files
		
		
	}

}
