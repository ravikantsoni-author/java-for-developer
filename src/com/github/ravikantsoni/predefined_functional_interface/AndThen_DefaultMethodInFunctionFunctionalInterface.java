package com.github.ravikantsoni.predefined_functional_interface;

import java.util.function.Function;

public class AndThen_DefaultMethodInFunctionFunctionalInterface {
	
	public static void main(String[] args) {
		example1();
		example2();
	}

	private static void example1() {
		Function<String, String> function1 = str -> str.toUpperCase();
		Function<String, String> function2 = str -> str + " word!";
		
		System.out.println("function1 - Output of word 'Ravi' is : " + function1.apply("Ravi"));
		
		// output of first function will be the input of second function
		// whatever the output return by function1, apply function2 on that output
		System.out.println("function2 - Output of word 'Hello' is : " + function1.andThen(function2).apply("Hello"));
	}

	private static void example2() {
		Function<Integer, Integer> functionSum = num -> num + num;
		Function<Integer, Integer> functionMultiply = num -> num * num;
		
		System.out.println("Sum of 10 : " + functionSum.apply(10));
		System.out.println("Multiply after Sum of 10 : " + functionSum.andThen(functionMultiply).apply(10));
		
	}

}
