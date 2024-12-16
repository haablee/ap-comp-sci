/*
 *	Author: Haabee Lee
 *  Date: 2024/10/08
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number. This program will output all prime numbers until it reaches that number: ");
		int a = sc.nextInt();
		
		printPrimes(a);

	}
	
	public static boolean checkPrime(int a){
		int y = a - 1;
		
		while(y > 1){
			int check = a%y;
			
			if(check != 0){
				y--;
			}
			else if(check == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int a){
		int b = a;
		
		while(b > 1){
			boolean broPLS = checkPrime(b);
			
			if(broPLS == true){
				System.out.println(b);
			}
			b--;
		}
	
	}
	
}