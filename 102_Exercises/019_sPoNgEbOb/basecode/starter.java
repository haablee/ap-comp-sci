/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence or a phrase:");
		String sentence = sc.nextLine();
		
		String lc = sentence.toLowerCase();
		String scsentence = "";
		
		while(true){
			if(lc.indexOf(" ") == -1){
				scsentence = scsentence + " " + spongeCase(lc);
				break;
			}
			int space = lc.indexOf(" ");
			String word = lc.substring(0, space);
			scsentence = scsentence + " " + spongeCase(word);
			
			lc = lc.substring(space + 1);
		}
		System.out.println(scsentence);
	}
	
	public static String spongeCase(String word){
		String translated = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			translated = translated + letter;
		}
		return translated;
	}
	
	
}
