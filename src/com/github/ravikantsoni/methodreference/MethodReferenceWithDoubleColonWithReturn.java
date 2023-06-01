package com.github.ravikantsoni.methodreference;

@FunctionalInterface
interface MethodReferenceNew{
	void helloMethodReference();
}

public class MethodReferenceWithDoubleColonWithReturn {
	
	static int helloMethodReference() {
		System.out.println("From Hello Method Reference!");
		return 1;
	}
	
	public static void main(String[] args) {
		MethodReferenceNew methodReference = MethodReferenceWithDoubleColon::helloMethodReference;
		methodReference.helloMethodReference();
	}

}
