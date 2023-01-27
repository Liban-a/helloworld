package introtojava;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println( "Please enter your string");
		
		String input = scanner.nextLine();
		
		String reverse = "";
		
		for (int i = input.length() - 1; i >=0; i--) {
			
			reverse += input.charAt(i); // takes each letter/digit and stores in vairable "reverse"
			
		}
		
		System.out.println(reverse);
		if (input.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println( "String is not palindrome ");
		}

	}

}
