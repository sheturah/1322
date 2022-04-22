package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainTwo {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
		//creates the file
		String directory = "C:\\Users\\ssims\\OneDrive\\Desktop\\Grades.txt";
		File myFile = new File(directory);
		
		//reads the file
		Scanner scan = new Scanner(myFile);
		String line ="";
		
		int quizSum = 0;
		int quizCount=0;
		
		
		while(scan.hasNextLine()) {
			line=scan.nextLine();
			System.out.println(line);
			
			if(line.contains("quiz"))
			{
				String[] grade = line.split(":");
				int gradeScore = Integer.parseInt(grade[1]);
				quizSum += gradeScore;
				quizCount++;
			}
		}
		float gradeAvg = quizSum/quizCount;
		System.out.println("The average score was " + gradeAvg + "\nThere were " + quizCount + " quizzes taken");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
