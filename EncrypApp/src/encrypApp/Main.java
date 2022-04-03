package encrypApp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Encryption encryption = new Encryption(); //create an encryption object

		Scanner input = new Scanner(System.in); //create a scanner object

		int choice = 0; //initialize the choice

		while (choice != 3) { //while the choice is not 3

		System.out.println("1 Encrypt a message");

		System.out.println("2 Decrypt a message");

		System.out.println("3 Quit\n");

		System.out.println("Enter Choice");

		choice = input.nextInt(); //get the choice

		if (choice == 1) {

		System.out.println("Enter the plain text message:");

		String message = input.next(); //get the message

		String encrypted_message = encryption.encrypt_message(message); //get the encrypted message

		System.out.println("\nEncrypted Msg: " + encrypted_message + "\n");

		} else if (choice == 2) {

		System.out.println("Enter the encrypted Message:");

		String encrypted_message = input.next(); //get the encrypted message

		String decrypted_message = encryption.decrypt_message(

		encrypted_message

		); //get the decrypted message

		System.out.println("\nDecrypted Msg: " + decrypted_message + "\n");

		} else if (choice != 3) {

		System.out.println("Error: Please enter valid input");

		}
	}
	
	
	
	}
	}

