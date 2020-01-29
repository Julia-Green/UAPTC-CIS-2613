// Author: Julia Green
// This program is an extention of the PairOfDice class and adds more functionallity.

class PairOfDice {
    private int die1;  
    private int die2;  

    public PairOfDice() {
        roll();
    }

    public PairOfDice(int val1, int val2) {
        die1 = val1;  
        die2 = val2;
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }
	
	public int getdie1() {
		return die1;
	}

	public void setdie1(int value) {
		while(value < 1 || value > 6) {
			value = (int)(Math.random() * 6) + 1;
		}
		die1 = value;
	}
	
	public int getdie2() {
		return die2;
	}

	public void setdie2(int value) {
		while(value < 1 || value > 6) {
			value = (int)(Math.random() * 6) + 1;
		}
		die2 = value;
	}
	
	public String toString() {
		if (die1 == die2)
			return "You rolled double " + die1 + "s.";
        else
            return "You rolled a " + die1 + " and a " + die2 + ".";
    }
	
	public int totalSum() {
		return die1 + die2;
	}
} // end class PairOfDice

public class Main {
    public static void main(String[] args) {         
		PairOfDice dice = new PairOfDice();  // Create the PairOfDice object.
        int rollNum = 0;   
		
        do {
			dice.roll();
            System.out.println(dice);
			System.out.println(); 
			rollNum++;
        } while (dice.totalSum() != 2);
           
        System.out.println("It took " + rollNum + " rolls to get a 2.");
        System.out.println();     
		
        System.out.println("This is what the program does if the dice value is set higher than the possible ammount.");
        System.out.println("Let's set the value of die 1 to be 23.");
        dice.setdie1(23);
        System.out.println("The program automatically changes the value of the die if it is set to an impossible value.");
        System.out.println("The new value of die 1 and the randomized value of die 2 are:");
        System.out.println(dice);
		System.out.println();
    }
} // end class Main
