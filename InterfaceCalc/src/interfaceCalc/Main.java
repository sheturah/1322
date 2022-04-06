package interfaceCalc;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		PrintCal();

	}
	
	public static void PrintCal()
	{
		Scanner scan = new Scanner(System.in);
		int option;
		
		System.out.println("0 - Exit\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
		System.out.println("Please Choose an Option: ");
		option = scan.nextInt();
		
		if(option>0)
		{
			CalculateNumb(option);
		}

		
		}
		
		public static void CalculateNumb(int option)
		{
			Scanner scan = new Scanner(System.in);
			float num1, num2;
			Calculator Cal = new Calculator();	
			float answer;
			
			System.out.println("Please enter the first number: ");
			num1 = scan.nextInt();
			System.out.println("Please enter the second number: ");
			num2 = scan.nextInt(); 
			
			//call method and print out answer
			switch(option)
			{
			case 1:	
				answer = Cal.add(num1, num2);
			 System.out.println(answer);
				break;
			case 2:
				answer = Cal.subtract(num1, num2);
				 System.out.println(answer);
				break;
			case 3:
				answer = Cal.multiply(num1, num2);
				 System.out.println(answer);
				break;
			case 4:
				answer = Cal.divide(num1, num2);
				 System.out.println(answer);
				break;
				}
			
			PrintCal();
			
		}
		
	

}
