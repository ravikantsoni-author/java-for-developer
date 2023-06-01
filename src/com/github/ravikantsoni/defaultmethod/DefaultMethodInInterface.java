package com.github.ravikantsoni.defaultmethod;

interface DefaultMethodInterface {

	default public int addTwoNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	default public int multiplyTwoNumbers(int a, int b) {
		int sum = a * b;
		return sum;
	}

	default public int divideTwoNumbers(int a, int b) {
		int sum = a / b;
		return sum;
	}

}

class Class1 implements DefaultMethodInterface{
	
	public int addNumbers(int x, int y) {
		return addTwoNumbers(x, y);
	}
	
	public int multilyNumbers(int x, int y) {
		return multiplyTwoNumbers(x, y);
	}
	
	public int divideNumbers(int x, int y) {
		return divideTwoNumbers(x, y);
	}
}

class Class2 implements DefaultMethodInterface{
	
	public int addNumbers(int x, int y) {
		return addTwoNumbers(x, y);
	}
	
	public int multilyNumbers(int x, int y) {
		return multiplyTwoNumbers(x, y);
	}
	
	public int divideNumbers(int x, int y) {
		return divideTwoNumbers(x, y);
	}
}


public class DefaultMethodInInterface {
	
	public static void main(String[] args) {
		
		Class1 class1 = new Class1();
		int result = class1.addNumbers(100, 200);
		System.out.println("Sum of two numbers: " + result);
	}

}
