package com.github.ravikantsoni.methodreference;

@FunctionalInterface
interface MethodReference{
	void helloMethodReference();
}

public class MethodReferenceWithDoubleColon {
	
	static void helloMethodReference() {
		System.out.println("From Hello Method Reference!");
	}
	
	public static void main(String[] args) {
		MethodReference methodReference = MethodReferenceWithDoubleColon::helloMethodReference;
		methodReference.helloMethodReference();
	}

}
