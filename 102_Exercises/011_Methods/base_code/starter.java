/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
	
	public static boolean isLeapYear(int year){
		//return year % 4 == 0; --> instead of the if statement
		
		if(year % 4 == 0){
		}
		else{
			return false;
		}
		return true;
	}
	
	public static int getDigitSum(int number){
		int theSum = 0;
		while(number > 0){
			//theSum = theSum + (number % 10); --> instead of lines 67 and 68
			
			int digit = number % 10;
			theSum = theSum + digit;
			number = number/10;
		}
		return theSum;
	}
	
	public static void printIfConsecutive(int x, int y, int z){
		boolean check = (x + 1 == y) && (y + 1 == z);
		
		if(check == true){
			System.out.println("The three numbers are consecutive!");
		}
		else{
			System.out.println("The three numbers are not consecutive.");
		}
	}
}
