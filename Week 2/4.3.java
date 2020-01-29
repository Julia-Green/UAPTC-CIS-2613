// Author: Julia Green

public class roll {	
	public static int diceRoll(int r) {
		int dice1;
		int dice2;
		int rollAmt;
		int rollCount = 0;
		
		if (r >= 2 && r <= 12) { 
			do {
				dice1 = (int)(Math.random()*6) + 1;
				dice2 = (int)(Math.random()*6) + 1;
				rollAmt = dice1 + dice2;
				rollCount++;			
			} while (rollAmt != r);
		}
		
		else {
			System.out.println("Two dice cannot roll this ammount.");
		}
		return rollCount;
	} // roll end
	
	public static void main(String[] args) {
		System.out.print("It took ");
		diceRoll(2);
		System.out.print(" rolls to get snake eyes.");
	} // main end
} // class end