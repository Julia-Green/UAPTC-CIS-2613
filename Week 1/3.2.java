// Author: Julia Green

public class divisors {
    public static void main(String[] args) {
		int i;
		int numOfDivisors;
		int numWithMaxDivisors = 1;
		int numOfMaxDivisors = 1;
		
		for (i = 2; i <= 100000; i++) {
			int temp;
			numOfDivisors = 0;
			for (temp = 1; temp <= i; temp++) {
				if (i % temp == 0) {
					numOfDivisors++;
				}
			}
			
			if (numOfDivisors > numOfMaxDivisors) {
			    numWithMaxDivisors = i;
				numOfMaxDivisors = numOfDivisors;
			}
		}
		System.out.println("Between the numbers 1 and 10000, " + numWithMaxDivisors + " has the highest ammount of divisors with " + numOfMaxDivisors + " divisors.");
	} // main end
} // class end