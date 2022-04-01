package encapsulation;

public class StockItem {

	private String description;
	private int id = 1000;
	private static int NewId;
	private double price;
	private int quantity;

	public StockItem() {

	}

	public StockItem(String description, double price, int quantity) {

		this.description = description;
		id = NewId;
		NewId++;
		this.price = price;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("The price entered was invalid!");
		}
	}

	public int getQuantity() {
		return quantity;
	}

	//Lowers the quantity
	public void setLowerQuantity(int quantity) {
		
		
		if(this.quantity == 0)
		{
			System.out.println("Sorry, there are no more left in inventory.");
		}	
		else
		{
			this.quantity --;
		}
		
	}
	
	//Higher the quantity
	public void setHigherQuantity(int quantity) {
		
		
		this.quantity += quantity;
		
		
	}
	
	@Override
	
	public String toString()
	{
		return  ": Item number: " + getId() + " is " + getDescription() +" has price $" + getPrice() + 
				" we currently have " + getQuantity() + " in stock";
		
	}

}
