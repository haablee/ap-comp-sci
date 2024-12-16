/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-17
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any non-decimal number.");
		int a = sc.nextInt();
		System.out.println("Please enter another number.");
		int b = sc.nextInt();
		System.out.println("Last number :D");
		int c = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		if((a > b) && (a > c)){
			System.out.println(a + " is the biggest number of the three!");
		}
		else if((b > a) && (b > c)){
			System.out.println(b + " is the biggest number of the three!");
		}
		else if((c > a) && (c > b)){
			System.out.println(c + " is the biggest number of the three!");
		}
		if((a < b) && (a < c)){
			System.out.print(a + " is the smallest number of the three!");
		}
		else if((b < a) && (b < c)){
			System.out.print(b + " is the smallest number of the three!");
		}
		else if((c < a) && (c < b)){
			System.out.print(c + " is the smallest number of the three!");
		}
		
	}
}
