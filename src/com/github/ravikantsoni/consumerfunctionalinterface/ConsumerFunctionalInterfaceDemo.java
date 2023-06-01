package com.github.ravikantsoni.consumerfunctionalinterface;

import java.util.function.Consumer;

// takes single input, returns nothing i.e void
public class ConsumerFunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		withoutConsumer();
		withConsumer();
	}

	private static void withoutConsumer() {
		System.out.println("without Consumer");
		String str = "Ravi Kant Soni";
		displayInUpperCase(str);
	}

	private static void displayInUpperCase(String str) {
		String str1 = str.toUpperCase();
		System.out.println(str1);
	}

	private static void withConsumer() {
		System.out.println("with Consumer");
		String str1 = "Ravi Kant Soni";
		Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
		consumer.accept(str1);
	}

}
