package com.github.ravikantsoni.methodreference;

@FunctionalInterface
interface FunctionalMethodReference{
	void helloMethodReference();
}

public class MethodReferenceWithFunctionalInterface {
	
	static void helloMethodReference() {
		System.out.println("From Hello Method Reference!");
	}
	
	public static void main(String[] args) {
		//MethodReference methodReference = MethodReferenceWithDoubleColon::helloMethodReference;
		
		FunctionalMethodReference functionalMethodReference = () -> MethodReferenceWithFunctionalInterface.helloMethodReference();
		
		functionalMethodReference.helloMethodReference();
	}

}
