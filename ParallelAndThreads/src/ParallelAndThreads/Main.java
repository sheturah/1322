package ParallelAndThreads;

public class Main {

	public static void main(String[] args) {
	
		Weather KennWeather = new Weather();
		Thread t1 = new Thread(KennWeather);
		t1.start();
		
		
		
		
	}

}
