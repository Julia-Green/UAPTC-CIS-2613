// Author: Julia Green

import textio.TextIO;

public class basicCalculations {
    public static void main(String[] args) {
		double num1;
		char operation;
		double num2;
		double result;
		System.out.println("Welcome to the Basic Calculator!");
		System.out.println("Please enter an expression using one of the following operators: +, -, *, /.");
		System.out.println("Enter a 0 if you wish to exit.");
		
		// Inputs
		System.out.println("Please enter the first number.");
		num1 = TextIO.getDouble();
		if (num1 == 0) {
			break;
		}
		System.out.println("Please enter the operator.");
		operation = TextIO.getChar();
		System.out.println("Please enter the second number.");
		num2 = TextIO.getlnDouble();
		
		while (true) {
			switch (operation) {
				case "+":
					result = num1 + num2;
					break;
					
				case "-":
					result = num1 - num2;
					break;
				
				case "*":
					result = num1 * num2;
					break;
				
				case "/":
					result = num1 / num2;
					break;
				
				default:
					System.out.println("Invalid Input! Please re-enter your expression.");
					continue;
			} // switch end
		} // while end
		System.out.println("Thanks for using the Basic Calculator!");
	} // main end
} // class end