package recursiveHexaDec;

import java.util.Scanner;

public class Main {
	
public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
int userChoice = 0;
String answer;
final int index =3;
		do
		{
		System.out.println("1 – Convert Decimal Number to Binary Number\r\n"
				+ "2 – Convert Decimal Number to Hexadecimal Number\r\n"
				+ "3 – Convert Decimal IP Address to Binary IP Address\r\n"
				+ "4 – Convert Decimal MAC Address to Hexadecimal MAC Address\r\n"
				+ "5 – Exit");
		System.out.println("Enter Choice: ");
		userChoice = scan.nextInt();
		
		if(userChoice == 1|| userChoice == 2|| userChoice == 3|| userChoice == 4 || userChoice == 5)
		{
			switch(userChoice)
			{
			
			//converts decimal to binary
			case 1:
				System.out.println("Enter Decimal Integer: ");
				int decimal = scan.nextInt();
				System.out.println("Decimal Number: "+decimal);
				answer = decimal2Binary(decimal);
				System.out.println("Binary Number: " + answer);
				break;
				
				//converts decimal to hexadecimal
			case 2: 
				System.out.println("Enter Decimal Integer: ");
				int decimals = scan.nextInt();
				System.out.println("Decimal Number: " + decimals);
				answer = decimal2Hexadecimal(decimals);
				System.out.println("Binary Number: " + answer);
				break;
				
				//converts IP address to binary
			case 3: 
				System.out.println("Enter Decimal IP Address (i.e. 192.168.35.10): " );
				String ip = scan.next();
				String [] Ip = convertIPtoArray(ip);
				System.out.println("Decimal IP Address: " + ip);
				ip = convertIpAddress(Ip, index);
				System.out.println("Binary IP Address: " + ip);
				
				break;
				
				//converts MAC address to hexadecimal
			case 4: 
				System.out.println("Enter Decimal MAC Address (i.e. 203:65:157:93:13:7): " );
				String mac = scan.next();
				String [] Mac = mac.split(":");
				System.out.println("Decimal IP Address: " + mac);
				mac = converMacAddress(Mac, 5);
				System.out.println("Binary MAC Address: " + mac);
				break;
				
			case 5:
				
			}
			
		}
		else
		{
			System.out.println("Error: Please enter a valid choice!");
		}
		System.out.println();
		}while(userChoice != 5);
	}
	//converts a decimal to binary
	public static String decimal2Binary(int number)
	{
		
	      if(number == 0) {
              return "";
      }else {
              int rem = (number%2);

              return decimal2Binary(number/2) + Integer.toString(rem) ;
      }
	}
	
	//converts decimal to hexadecimal
	public static String decimal2Hexadecimal(int num)
	{

        int rem = num % 16;

        if(num!=0) {
                switch(rem) {
                case 10:
                        return decimal2Hexadecimal(num/16) + "A";
                case 11:
                        return decimal2Hexadecimal(num/16) + "B";
                case 12:
                        return decimal2Hexadecimal(num/16) + "C";
                case 13:
                        return decimal2Hexadecimal(num/16) + "D";
                case 14:
                        return decimal2Hexadecimal(num/16) + "E";
                case 15:
                        return decimal2Hexadecimal(num/16) + "F";
                default:
                        return decimal2Hexadecimal(num/16) + rem;
                }
        }else {
                return "";
		}
	}
	//converts IP address to binary
	public static String convertIpAddress(String[]ip, int index)
	{
		int number;
		if (index == 0)
		{
			number = Integer.parseInt(ip[0]);
			ip[0] = decimal2Binary(number);
			return ip[0];
		}
		else
		{
			number = Integer.parseInt(ip[index]);
			ip[index] = decimal2Binary(number);
			return convertIpAddress(ip, index-1) + "."+ ip[index] ;
		}
	}
	//converts MAC address to hexadecimal
	public static String converMacAddress(String[] mac, int index)
	{
		int number;
		if (index == 0)
		{
			number = Integer.parseInt(mac[0]);
			mac[0] = decimal2Hexadecimal(number);
			return mac[0];
		}
		else
		{
			number = Integer.parseInt(mac[index]);
			mac[index] = decimal2Hexadecimal(number);
			return converMacAddress(mac, index-1) + ":"+ mac[index] ;
		}
	}
	//converts IP address string into a array
	public static String[] convertIPtoArray(String ip)
	{
		String[] IP = new String[4];
		StringBuilder ipAdd = new StringBuilder(ip);
		//deletes the . in the IP Address
		for (int i = 0; i<ipAdd.length(); i++)
		{
			if(ipAdd.charAt(i) == '.')
			{
				ipAdd.deleteCharAt(i);
			}
		}
		
		System.out.println(ipAdd);
		//Stores the numbers in the array
		for(int i = 0; i<4; i++)
		{
			if(i == 0)
			{
			IP[i] = ipAdd.substring(0,3);
			}
			else if(i == 1)
			{
				IP[i] = ipAdd.substring(3,6);
			}
			else if(i == 2)
			{
				IP[i] = ipAdd.substring(6,8);
			}
			else 
			{
				IP[i] = ipAdd.substring(8,10);
			}
		}
		
		return IP;
	}
	

	

}
