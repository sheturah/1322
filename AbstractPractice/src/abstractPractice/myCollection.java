package abstractPractice;
import java.util.*;

public class myCollection {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Item [] items = new Item[5];
		String text;
		
		String title;
		double ISBN;
		String author;
		
		int IssueNumber;
		
		
		
		
		for(int i = 0; i<5; i++)
		{
			System.out.println("Please enter B for Book or P for Periodical.");
			text = scan.nextLine();
			//text = text.toUpperCase();
			
			if (text.equals("B"))
			{
				System.out.println("Please enter the name of the Book.");
				title = scan.nextLine();
				System.out.println("Please enter the author of the Book. ");
				author = scan.nextLine();
				System.out.println("Please enter the ISBN of the Book. ");
				ISBN = scan.nextDouble();
				
				Book b1 = new Book(title, ISBN, author);
				items[i] = b1;
			}
			else if (text.equals("P"))
			{
				System.out.println("Please enter the name of the Periodical.");
				title = scan.nextLine();
				System.out.println("Please enter the issue number. ");
				IssueNumber = scan.nextInt();
				
				Periodical p1 = new Periodical(title, IssueNumber);
				items[i] = p1;
			}
			else
			{
				System.out.println("That was incorrect");
			}
		}
		
		for(Item i : items)
		{
			System.out.println(i);
		}

	}

}
