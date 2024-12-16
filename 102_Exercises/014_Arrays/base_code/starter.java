/*
 *	Author: Haabee Lee
 *  Date: 2024/11/05
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] x = new int [1001];
		 
		int i = 0;
		int y = 0;
		while(i < 1001){
		 	y = y + 3;								// x[i] = (c+1)*3;
		 	x[i] = y;
		 	System.out.println(x[i]);
			i++;
		}
		
		int [] a = new int [1001];
		 
		int c = 0;
		int b = 1001;
		while(c < 1001){
		 	b = b - 1;								// x[c] = x.length - 1;
		 	a[c] = b;
		 	System.out.println(a[c]);
		 	c++;
		}
	}
}
