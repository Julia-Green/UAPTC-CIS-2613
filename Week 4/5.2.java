// Author: Julia Green
// This program is an extention of the StatCalc class and a test program.
import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {         
        Scanner in = new Scanner(System.in);
        StatCalc calc;
        calc = new StatCalc();
        double temp;
   
        System.out.println("Please enter your numbers. Enter 0 to end.");
        System.out.println();
        do {
            temp = in.nextDouble();
            if (temp != 0)
				calc.enter(temp);
        } while (temp != 0);
   
		System.out.println();
        System.out.println("Your Statistics:");
		System.out.println();
        System.out.println("Count: " + calc.getCount());
        System.out.println("Sum: " + calc.getSum());
        System.out.println("Minimum: " + calc.getMin());
        System.out.println("Maximum: " + calc.getMax());
        System.out.println("Average: " + calc.getMean());
        System.out.println("Standard Deviation: " + calc.getStandardDeviation());
    }
} // end class Main