/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence/phrase in English: ");
		String sentence = sc.nextLine();
		
		String translated = "";
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				translated = translated + " " + pigLatin(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			translated = translated + " " + pigLatin(word);
			
			sentence = sentence.substring(space + 1);
		}
		
		System.out.println(translated);
		
	}
	
	public static String pigLatin(String word){
		String translated = "";
		int i = 0;
		String letter = word.substring(i, i+1);
		String part = word.substring(i+1);
		
		if(letter.equals("A") || letter.equals("a") || letter.equals("E") || letter.equals("e") || letter.equals("I") || letter.equals("i") || letter.equals("O") || letter.equals("o") || letter.equals("U") || letter.equals("u")){
			translated = word + "-way";
		}
		else{
			translated = part + "-" + letter + "ay";
		}
		return translated;
	}
	
}
