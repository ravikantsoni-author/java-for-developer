package com.github.ravikantsoni.consumerfunctionalinterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		Consumer<String> consumer = message -> EmailUtility.emailSend(message);
		consumer.accept("Your Account has been credited!");

	}

}

class EmailUtility {

	public static void emailSend(String message) {
		System.out.println("Successfully sent an email with message : " + message);
	}

}