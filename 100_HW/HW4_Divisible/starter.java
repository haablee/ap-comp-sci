/*
 *	Author: Haabee Lee
 *  Date: 2024-09-26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Enter another number: ");
		int ber = sc.nextInt();
		System.out.println();
		
		
		if((num%2) == 0){
			System.out.println("Your number is even");
		}
		else{
			System.out.println("Your number is odd");
		}
		
		
		if((ber%2) == 0){
			System.out.println("Your second number is even");
		}
		else{
			System.out.println("Your second number is odd");
		}
		
		
		if(((num%3) == 0) && ((num%4) == 0) && ((num%5) == 0)){
			System.out.println("Your first number is divisible by 3, 4, and 5");
		}
		else{
			System.out.println("Your first number is not divsible by 3, 4, and 5");
		}
		
		
		if(((ber%3) == 0) && ((ber%4) == 0) && ((ber%5) == 0)){
			System.out.println("Your second number is divisible by 3, 4, and 5");
		}
		else{
			System.out.println("Your second number is not divisble by 3, 4, and 5");
		}
		
	}
}
