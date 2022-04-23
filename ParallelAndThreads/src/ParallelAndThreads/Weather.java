package ParallelAndThreads;
import java.net.URL;
import java.util.Scanner;

import org.json.*;

public class Weather implements Runnable{

	public void run()
	{
		try {
			
			
			while(true)
			{
				URL url = new URL("https://api.weather.gov/stations/KRYY/observations/latest");
				Scanner scan =new Scanner(url.openStream());
				String lines = "";
				
				while(scan.hasNextLine())
				{
					lines+=scan.nextLine();
				}
				
				JSONObject obj = new JSONObject(lines);
				String timestamp = obj.getJSONObject("properties").getString("timestamp");
				String conditions =obj.getJSONObject("properties").getString("textDescription");
				double temperature = obj.getJSONObject("properties").getJSONObject("temperature").getDouble("value");
				double tempF = (temperature*9/5)+32;
				
				System.out.println("Time: " + timestamp);
				System.out.println("Conditions: " + conditions);
				System.out.println("Temp in F: " + tempF);
				Thread.sleep(900000);
				
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
