// Author: Julia Green
import textio.TextIO;

public class quiz {
	private static int[] firstNums;
	private static int[] secondNums;
	private static int[] userInput;
	
	public static void makeQuiz() {
        firstNums = new int[10];
        secondNums = new int[10];
        for( int i = 0; i < 10; i++) {
            firstNums[i] = (int)(Math.random() * 50 + 1);
            secondNums[i] = (int)(Math.random() * 50);
        } 
	} // makeQuiz end
	
	public static void giveQuiz() {
		userInput = new int[10];
		System.out.println("Addition Quiz");
		for(int i = 0; i < 10; i++) {
			int question = i + 1;
			System.out.println(question + ".  " + firstNums[i] + " + " + secondNums[i] + " = ");
			userInput[i] = TextIO.getln();
		}
	} // giveQuiz end
	
	public static void calGrade() {
		int numCorrect;
		System.out.println();
		System.out.println("Correct Answers");
		for(int i = 0; i < 10; i++) {		
			correctAnswer = new int[10];
			correctAnswer = firstNums[i] + secondNums [i];
			int question = i + 1;
			if(userInput[i] = correctAnswer[i]) {
				System.out.println(question + ".  " + firstNums[i] + " + " + secondNums[i] + " = " + correctAnswer[i] + " | " + userInput + " is correct.");
				numCorrect++;
			}
			
			else {
				System.out.println(question + ".  " + firstNums[i] + " + " + secondNums[i] + " = " + correctAnswer[i] + " | " + userInput + " is incorrect.");
			}
		}
		int grade = numCorrect * 10;
		System.out.println();
		System.out.println("You answered " + numCorrect + " questions correct.");
		System.out.println("You got a " + grade + "%.");
	} // calGrade end
	
	public static void main(String[] args) {
		makeQuiz();
		giveQuiz();
		calGrade();
	} // main end
} // class end