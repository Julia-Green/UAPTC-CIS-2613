// Author: Julia Green

public class dice {
	public static int rollNumber() {
		int numberOfRolls = 0;
		int die1;
		int die2;
		do {
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			numberOfRolls++;
		}
		while (die1 != 1 && die2 != 1);
		return numberOfRolls;
	} // rollNumber end
	
	public static void main(String[] args) {
		System.out.println("Number of times the dice rolled before rolling snake eyes is: " + rollNumber() + ".");
	} // main end
} // class end