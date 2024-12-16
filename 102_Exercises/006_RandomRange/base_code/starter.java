/*
 *	Author: Haabee Lee
 *  Date: 2024-09-16
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to create a range for your random number:");
		
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		
		System.out.print("Please enter another integer, greater than the first: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Your range is from " + num1 + " to " + num2 +".");
		System.out.println("Here are five numbers generated in that range:");
		System.out.print((int)(Math.random()*(num2-num1))+num1 + ", ");
		System.out.print((int)(Math.random()*(num2-num1))+num1 + ", ");
		System.out.print((int)(Math.random()*(num2-num1))+num1 + ", ");
		System.out.print((int)(Math.random()*(num2-num1))+num1 + ", ");
		System.out.print((int)(Math.random()*(num2-num1))+num1);
		
	}
}
