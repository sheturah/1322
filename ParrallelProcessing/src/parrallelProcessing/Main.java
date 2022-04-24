package parrallelProcessing;

public class Main {

	public static void main(String[] args) {
		
		CreditCard card1 = new CreditCard();
		CardHolder customer1 = new CardHolder(card1);
		
		Thread John = new Thread(customer1);
		Thread Mary = new Thread(customer1);
		
		John.start();
		Mary.start();

	}

}
