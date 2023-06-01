package com.github.ravikantsoni.predefined_functional_interface;

import java.util.function.Function;

public class Compose_DefaultMethodInFunctionFunctionalInterface {
	
	public static void main(String[] args) {
		example1();
		example2();
	}

	private static void example1() {
		Function<String, String> function1 = str -> str.toUpperCase();
		Function<String, String> function2 = str -> str + " word!";
		Function<String, String> function3 = str -> "Welcome to " + str;
		
		System.out.println("function1 Apply - Output of word 'Ravi' is : " + function1.apply("Ravi"));
		
		// output of first function will be the input of second function
		// whatever the output return by function1, apply function2 on that output
		System.out.println("function2 AndThen - Output of word 'Hello' is : " + function1.andThen(function2).apply("Hello"));
		
		// reverse order
		System.out.println("function2 Compose - Output of word 'Hello' is : " + function1.compose(function2).apply("Hello"));
		
		// Compose and AndThen
		System.out.println("function2 Compose - Output of word 'Hello' is : " + function1.compose(function2).andThen(function3).apply("Hello"));
	}

	private static void example2() {
		Function<Integer, Integer> functionSum = num -> num + num;
		Function<Integer, Integer> functionMultiply = num -> num * num;
		
		System.out.println("function1 Apply - Sum of 10 : " + functionSum.apply(10));
		System.out.println("function2 AndThen - Multiply after Sum of 10 : " + functionSum.andThen(functionMultiply).apply(10));
		
		// reverse order
		System.out.println("function2 Compose - Sum after Multiple, reverse order - of 10 : " + functionSum.compose(functionMultiply).apply(10));
		
	}

}