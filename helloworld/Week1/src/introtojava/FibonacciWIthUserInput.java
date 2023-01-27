package introtojava;

import java.util.Scanner;

public class FibonacciWIthUserInput {
	
	public static void main (String [] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	int num1 = 0;
	int num2= 1;
	int num3;
	
	System.out.println("How many fibonacci digits?");
	int length = scanner.nextInt();
	
	while (length <=0) {
		System.out.print("Please Enter a Positive number");
		 length = scanner.nextInt();
		
	}
	System.out.print( num1+ ", "+num2+", ");
	for ( int i = 3; i<= length;i++) {
		
		num3= num1+num2;
		
		if (i == length) {
			System.out.println(num3);
		} else{
			System.out.print(num3 + ", ");
		
		}
		num1=num2;
		num2= num3;
	}
	scanner.close();	
	}
	

}
