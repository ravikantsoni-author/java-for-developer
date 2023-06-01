package com.github.ravikantsoni.predefined_functional_interface;

import java.util.function.Function;

public class FunctionInterface_SquareOfNumber {

	public static void main(String[] args) {
		beforeJava8(); // without Function functional interface
		fromJava8(); // with Function functional interface
	}

	private static void beforeJava8() {
		int num = 8;
		Integer result = squareOfNumber(num);
		System.out.println("beforeJava8 - Sqr of : " + num + " is: " + result);
	}

	private static Integer squareOfNumber(int num) {
		Integer result = num * num;
		return result;
	}

	private static void fromJava8() {
		Function<Integer, Integer> function = num -> num * num;

		System.out.println("fromJava8 - Sqr of : 8 is: " + function.apply(8));
	}

}