package quizlet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		

		ArrayList<Question> questions = new ArrayList<Question>();
		
		
	int input = 0;
		
		while(input != 5)
		{
		input = displayQuiz();
		
		
		switch(input)
		{
		case 1: 
			Quiz.add_question();
			break;
			
		case 2:
			Quiz.remove_question();
			break;
			
		case 3:
			Quiz.modify_question();
			break;
			
		case 4:
			Quiz.give_quiz();
			break;
			
		case 5:
			
			break;
		}
		}
	
	}

	public static int displayQuiz()
	{
		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean error;

		do {
			error = false;
		try {
			 System.out.println("\nWhat would you like to do?");
			System.out.println("1. Add a question to the quiz\n" +
					"2. Remove a question from the quiz\n" +
					"3. modify a question in the quiz\n" +
					"4. Take the quiz\n" +
					"5. Quit\n");
			 System.out.print("Enter your selection : ");
			input = scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter a number 1-5");
			
			error = true;
			scan.nextLine();
		}
           if(input == 5)
		   {
			   System.out.println("Have a great day");
		   }
           else if(input > 0 && input < 5 )
           {
        	   error = false;
        	
        	   
           }
           else
           {
        	  error = true;
        	  
           }
		}while(error);
		
		return input;
		
	}

}
