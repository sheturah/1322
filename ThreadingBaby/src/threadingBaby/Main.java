package threadingBaby;

public class Main {

	public static void main(String[] args) {
		Baby noah = new Baby("Noah");
		Thread b1 = new Thread(noah);
		
		Baby olivia = new Baby("Olivia");
		Thread b2 = new Thread(olivia);
		
		Baby liam = new Baby("Liam");
		Thread b3 = new Thread(liam);
		
		Baby emma = new Baby("Emma");
		Thread b4 = new Thread(emma);
		
		Baby amelia = new Baby("Amelia");
		Thread b5 = new Thread(amelia);
		
		b1.start();
		b2.start();
		b3.start();
		b4.start();
		b5.start();
		
	}

}
