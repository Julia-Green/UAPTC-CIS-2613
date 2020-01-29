// Author: Julia Green
import textio.TextIO;

public class capitalize {	
	public static void capitalizeString(String userString) {
		int letter;
		int letterBefore = "?";
		int i;
		for(i = 0;  i < userString.length();  i++) {
			letter = userString.charAt(i);
			if(Character.isLetter(letter)  &&  ! Character.isLetter(letterBefore) ) {
            System.out.print(Character.toUpperCase(letter));
			}
			
			else {
				System.out.print(letter);
			}
			letterBefore = letter;  
		}
	} // capitalizeString end
	
	public static void main(String[] args) {
		String userString;
		System.out.println("Please enter a few words.");
		userString = TextIO.getln();
		System.out.println("Capitalized Version: " + capitalizeString(userstring));
	} // main end
} // class end