package com.github.ravikantsoni.lambda_expression;

// functional interface
@FunctionalInterface
interface Functional_Interface {
	public void displayHello();
}

// no need to have extra implementation class

// main class
public class HelloWithLambda {

	public static void main(String[] args) {

		Functional_Interface functional_Interface = ( ) -> System.out.println("Hello with Lambda");
		functional_Interface.displayHello();

	}
}


