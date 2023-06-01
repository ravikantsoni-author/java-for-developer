package com.github.ravikantsoni.lambda_expression;

@FunctionalInterface
interface SumOfTwoNumber {
	public int addNumbers(int a, int b);
}

public class SumOfTwoNumberWithLambda {

	public static void main(String[] args) {
		System.out.println("Start Main");

		SumOfTwoNumber sumOfTwoNumber = (a, b) -> {
			System.out.println("Inside Lambda");
			int result = a + b;
			return result;
		};

		System.out.println("Before calling Lambda Expression");
		addTwoNumbers(sumOfTwoNumber);
		System.out.println("After calling Lambda Expression");
		System.out.println("End Main");
	}

	public static void addTwoNumbers(SumOfTwoNumber sumOfTwoNumber) {
		System.out.println("Start add two number");
		System.out.println("Sum of two numbers: " + sumOfTwoNumber.addNumbers(100, 200));
		System.out.println("End add two number");
	}

}
