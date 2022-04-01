package encapsulation;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//description, price quantity
		StockItem Milk  = new StockItem("1 Gallon of Milk", 3.60, 15);
		StockItem Bread = new StockItem("1 Loaf of Bread", 1.98, 30);
		
		double newPrice;
		int newInventory;
		
		int input = 0;
		
		while(input != 8)
		{
		input = displayInventory();
		
		
		switch(input)
		{
		case 1: 
			
			Milk.setLowerQuantity(1);
			break;
			
		case 2:
			
			Bread.setLowerQuantity(1);
			break;
			
		case 3:
			
		System.out.println("What is the new price for Milk: ");
		newPrice = scan.nextDouble();
		Milk.setPrice(newPrice);
			break;
			
		case 4:
			
			System.out.println("What is the new price for Bread: ");
			newPrice = scan.nextDouble();
			Bread.setPrice(newPrice);
			break;
			
		case 5:
			
			System.out.println("How man milks did we recieve? ");
			newInventory = scan.nextInt();
			Milk.setHigherQuantity(newInventory);
			break;
			
		case 6:
			
			System.out.println("How man breads did we recieve? ");
			newInventory = scan.nextInt();
			Bread.setHigherQuantity(newInventory);
			break;
			
		case 7:
			
			System.out.println("Milk" + Milk);
			System.out.println("Bread" + Bread);
			break;
			
		case 8:
			
			break;
		}
		}

	}
	
	public static int displayInventory()
	{
		Scanner scan= new Scanner(System.in);
		int input = 0;
		boolean error;

		do {
			error = false;
		try {
			 System.out.println("\n****** MENU *****");
			System.out.println("1. Sold One Milk\n" +
					"2. Sold One Bread\n" +
					"3. Change price of Milk\n" +
					"4. Change price of Bread\n" +
					"5. Add Milk to Inventory\n" +
					"6. Add Bread to Inventory\n" +
					"7. See Inventory\n" +
					"8. Quit");
			 System.out.print("Enter your selection : ");
			input = scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter a number 1-8");
			
			error = true;
			scan.nextLine();
		}
           if(input == 8)
		   {
			   System.out.println("Have a great day");
		   }
           else if(input > 0 && input < 8 )
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
