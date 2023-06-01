package com.github.ravikantsoni.PrefdicateFunctionaInterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		withoutPedicate();
		withPredicate();
	}

	private static void withoutPedicate() {
		System.out.println("Without Predicate");
		Integer transaction = 20000;
		if (isGreaterMethd(transaction)) {
			System.out.println("Transaction amount is greater than 10000");
		} else {
			System.out.println("Transaction amount is less than 10000");
		}

	}

	private static Boolean isGreaterMethd(Integer transaction) {
		if (transaction > 10000) {
			return true;
		} else {
			return false;
		}

	}

	private static void withPredicate() {
		System.out.println("With Predicate");

		Predicate<Integer> predicate = num -> num > 10000;

		if (predicate.test(20000)) {
			System.out.println("Transaction amount is greater than 10000");
		} else {
			System.out.println("Transaction amount is less than 10000");
		}
	}

}
