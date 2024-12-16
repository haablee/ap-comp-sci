/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-17
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int x = sc.nextInt();
		
		System.out.print("Please enter another number: ");
		int y = sc.nextInt();
		sc.nextLine();
		
		if(x == y){
			System.out.println("Woah, your numbers are the same!");
		}
		
		else{
			System.out.print("Your numbers are two different numbers!");
		}
		
	}
}
