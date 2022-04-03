package encrypApp;

import java.util.ArrayList;
import java.util.Scanner;
class Encryption
{
 ArrayList<Character> symbols = new ArrayList<Character>();
 ArrayList<Character> alphabets = new ArrayList<Character>();
 
 public Encryption()
 {
	 symbols.add('!');
	 symbols.add('@');
	 symbols.add('#');
	 symbols.add('$');
	 symbols.add('^');
	 symbols.add('&');
	 symbols.add('*');
	 symbols.add('(');
	 symbols.add(')');
	 symbols.add('_');
	 symbols.add('-');
	 symbols.add('+');
	 symbols.add('=');
	 symbols.add('?');
	 symbols.add(',');
	 symbols.add('{');
	 symbols.add('}');
	 symbols.add('[');
	 symbols.add(']');
	 symbols.add('/');
	 symbols.add('|');
	 symbols.add(';');
	 symbols.add(':');
	 symbols.add('.');
	 symbols.add('<');
	 symbols.add('>');
	 for(char letter='a';letter<='z';letter++)
	 {
	 alphabets.add(letter);
	 }
	 

	 
 }
 //changes numb to letter 
 public char return_alphabet(int numb)
 {
	 char symbol = alphabets.get(numb);

	 
	 return symbol;
 }
 
 //returns the letters place in the arraylist
 public int return_alphabet_index(char symbol)
 {
	 int index = alphabets.indexOf(symbols);
	 
	 return index;
 }
 
 //takes an int(position) and returns the symbol stored at that position
 public char return_symbol(int index)
 {
	 char symbol = symbols.get(index);
	 return symbol;
	 
 }
 
 //takes the symbol and returns the position in the arraylist
 public int return_symbol_index(char symbol)
 {
	 int index = symbols.indexOf(symbol);
	 return index;
 }
 
 //takes in a plain text and returns an encrypted message
 public String encrypt_message(String plainText)
 {
	 
	 String secretMessage = "";
	 
	 
	 
	 return secretMessage;
 }
 
 //takes in an encrypted message and returns plain text
 public String decrypt_message(String secretMessage)
 {
	 String plainText ="";
	 
	return plainText;
	 
 }
 
}
