// Author: Julia Green
// This program is a combination of both the PairOfDice and StatCalc classes in
// order to roll a pair of dice and record the statistics for the rolls.
import java.util.Scanner;

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

class StatCalc {
    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
	private double max = Double.NEGATIVE_INFINITY; 
    private double min = Double.POSITIVE_INFINITY;  

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
		if (num > max)
            max = num;
        if (num < min)
            min = num;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;  
    }

    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }
 
    public double getMin() {
      return min;
    }
   
    public double getMax() {
      return max;
    }
}  // end class StatCalc

public class DiceRoll {
    static final int NUM_OF_EXPERIMENTS = 10000;
    private static PairOfDice dice = new PairOfDice();

	// Rolls untill the sum of the dice is equal to n.
    static int rollFor(int n) {
        int rollCount = 0;
        do {
            dice.roll();
			rollCount++;
        } while (dice.totalSum() != n);
        return rollCount;
    }
   
    public static void main(String[] args) {
        System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
        System.out.println("----------   --------------   ----------------   --------------");

        for (int total = 2;  total <= 12;  total++) {
            StatCalc dieStats;
            dieStats = new StatCalc();
            for (int i = 0; i < NUM_OF_EXPERIMENTS; i++) {
				dieStats.enter(rollFor(total));
            }
			System.out.printf("%6d", total);
			System.out.printf("%18.3f", dieStats.getMean());
			System.out.printf("%19.3f", dieStats.getStandardDeviation());
			System.out.printf("%16.3f", dieStats.getMax());
			System.out.println();
        }
    } // end main
}  // end class DiceRoll