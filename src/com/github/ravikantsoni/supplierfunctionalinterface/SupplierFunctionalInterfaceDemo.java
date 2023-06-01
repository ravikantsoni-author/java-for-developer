package com.github.ravikantsoni.supplierfunctionalinterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		withoutSupplier();
		withSupplier();
	}

	private static void withoutSupplier() {
		System.out.println("withoutSupplier");
		double inrRate = getInrRate();
		System.out.println("InrRate is : " + inrRate);
	}

	private static double getInrRate() {
		double inrRate = 71.0;
		return inrRate;
	}

	// no input, return output
	private static void withSupplier() {
		System.out.println("with Supplier");
		Supplier<Double> supplier = () -> 71.0;
		System.out.println("InrRate is : " + supplier.get());
	}

}
