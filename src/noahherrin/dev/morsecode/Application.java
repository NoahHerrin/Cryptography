package noahherrin.dev.morsecode;

import java.util.Scanner;

public class Application {
	
	public final static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public final static String[] morseAlphabet = {".-", "-...", "-.-.", "-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	/*
	 * Noah Herrin
	 * 10/5/2018
	 * This program will translate English into Morse code
	 * and vice versa.
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String input = "";
		while(!input.equalsIgnoreCase("quit")) {
			System.out.print("Input: ");
			input = console.nextLine();
			System.out.println("Output: " + EtoM(input));
		}

	}
	//Converts s into Morse code
	public static String EtoM(String s) {
		String value = "";
		int index = 0;
		for(char c: s.toCharArray()) {
			if (c != ' ')  {
				index = getIndex(alphabet,c);
				if(index != -1) {
				value += morseAlphabet[index];
				value += " ";
				} else {
					return "Invalid String";
				}
			} else {
				value += "  ";
			}
		}
		return value;
	}
	// returns the index of value inside of array
	public static int getIndex(String[] array, char value) {
		String v = "" + value;
		for(int i = 0; i < array.length; i++) {
			if(v.equalsIgnoreCase(array[i])) {
				return i;
			}
		}
		//if value was not in the array
		return -1;
	}
}
