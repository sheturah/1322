package threadingBaby;
import java.util.Random;

public class Baby implements Runnable{

	private int time;
	private String name;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Random ran = new Random();
	
	Baby()
	{
	
	}
	
	Baby(String name)
	{
		this.name = name;
		time = ran.nextInt(5000);
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
			Thread.sleep(time);
			System.out.println("My name is " + name + ", I am awake, feed me!!!");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
