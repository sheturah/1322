package interfacePractice;

public class FibFormula implements FindFib{

	public int calculate_fib(int numb)
	{
		int fibAnswer = (int) ((Math.pow((1+Math.sqrt(5))/2,numb) - (Math.pow((1-Math.sqrt(5))/2,numb)))/Math.sqrt(5));

		return fibAnswer;
	}
}
