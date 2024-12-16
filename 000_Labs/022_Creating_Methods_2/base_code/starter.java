/*
 *	Author:  Haabee Lee
 *  Date: 2024/10/08
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int answer = pow(2, 3);
		System.out.println(answer);
	}
	
	public static int pow(int a, int b){
		int exponent = 1;
		while(b > 0){
			exponent = exponent * a;
			b--;
		}
		return exponent;
	}
	
}
