package com.github.ravikantsoni.staticmethodinterface;

interface StaticcMethodInterface {

	// static method
	static public void staticUtiityMethod() {
		System.out.println("Static Utility Methd");
	}
	
	// non-static method
	default public void defaultMethod() {
		System.out.println("Default method");
	}
}

public class StaticMethoInInterfaceDemo implements StaticcMethodInterface {
	
	// can't override static
	//@Override - compiler error
	private void staticUtiityMethod() {
		System.out.println("Not Static Method");
	}
	
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		StaticcMethodInterface.super.defaultMethod();
		System.out.println("Added overriden details");
	}

	public static void main(String[] args) {
		
		// static method using Interface
		StaticcMethodInterface.staticUtiityMethod();
		
		// default method using object
		StaticMethoInInterfaceDemo staticMethoInInterfaceDemo = new StaticMethoInInterfaceDemo();
		staticMethoInInterfaceDemo.defaultMethod();
		
		// non static
		staticMethoInInterfaceDemo.staticUtiityMethod();
	}

}
