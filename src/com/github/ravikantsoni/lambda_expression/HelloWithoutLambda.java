package com.github.ravikantsoni.lambda_expression;

// interface
interface HelloInterface {	
	public void dispay();
}

// implementation
class HelloInterfaceImpl implements HelloInterface {

	@Override
	public void dispay() {
		System.out.println("Hello Without Lambda");
	}
	
}

// main class
public class HelloWithoutLambda {
	
	public static void main(String[] args) {
		
		HelloInterface helloInterface = new HelloInterfaceImpl();
		helloInterface.dispay();
	}

}
