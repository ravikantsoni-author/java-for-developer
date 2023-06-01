package com.github.ravikantsoni.predefined_functional_interface;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	
	public static void main(String[] args) {
		beforeJava8(); // without Function functional interface
		fromJava8(); // with Function functional interface
	}

	private static void beforeJava8() {
		int usd = 10;
		Double 	inrValue = convertUsdToInr(usd);
		System.out.println("beforeJava8 - Usd : " + usd + " to Inr: " + inrValue);
	}

	private static Double convertUsdToInr(int usd) {
		double coverionRate = 71.5;
		return coverionRate * usd;
	}

	private static void fromJava8() {
		double coverionRate = 71.5;
		Function<Integer, Double> function = usd -> usd * coverionRate;
		
		System.out.println("fromJava8 - Usd : 10  to Inr: " + function.apply(10));
	}

}
