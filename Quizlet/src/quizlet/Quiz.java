package quizlet;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	private static ArrayList<Question> questions = new ArrayList<Question>();
	
	//text, answer, difficulty
	
	public static void add_question()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the question Text? ");
		String text = scan.nextLine();
		System.out.println("What's the answer? ");
		String answer = scan.nextLine();
		answer = answer.toLowerCase();
		System.out.println("How Difficult(1-3)? ");
		int difficult = scan.nextInt();
		
		questions.add(new Question(text, answer, difficult));
		
	}
	
	public static void remove_question() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What question would you like to remove?");
		
		for(int i = 0; i< questions.size(); i++)
		{
			System.out.println((i+1) + ". " + questions.get(i).getText());
		}
		int remove = scan.nextInt();
		remove--;
		questions.remove(remove);
		
		
	}
	
	public static void modify_question()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What question would you like to modify?");
		
		for(int i = 0; i< questions.size(); i++)
		{
			System.out.println((i+1) + ". " + questions.get(i).getText());
		}
		int modify = scan.nextInt();
		modify--;
		questions.remove(modify);
		add_question();
		
		
	}
	
	public static void give_quiz()
	{
		Scanner scan = new Scanner(System.in);
		String givenAnswer;
		int correct = 0;
		int incorrect = 0;
		
		for(int i = 0; i< questions.size(); i++)
		{
			System.out.println((i+1) + ". " + questions.get(i).getText());
			givenAnswer = scan.nextLine();
			givenAnswer = givenAnswer.toLowerCase();
			
			if(questions.get(i).getAnswer().equals(givenAnswer))
			{
				System.out.println("Correct!");
				correct++;
			}
			else
			{
				System.out.println("Incorrect!");
				incorrect++;
			}
		}
		System.out.println("You got " + correct + " out of " + (correct+incorrect));
		
	}

}
