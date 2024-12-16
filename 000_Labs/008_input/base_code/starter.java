/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-10
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your birthday month?");
		String month = sc.nextLine();
		
		System.out.println("What is your birthdate?");
		int day = sc.nextInt();
		
		System.out.println("What is your birth year?");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
		
		
	}
}
