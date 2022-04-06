package interfacePractice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to find the Fibonacci Series for: ");
		int answer = scan.nextInt();
		
		FibIteration fib = new FibIteration();
		int fibAnswer = fib.calculate_fib(answer);
		
		System.out.println("Fib of "+ answer + "by iteration is: " + fibAnswer);
		
		FibFormula form = new FibFormula();
		int formula = form.calculate_fib(answer);
		System.out.println("Fib of "+ answer + "by formula is: " + formula);
	}

}
