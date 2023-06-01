package com.github.ravikantsoni.methodreference;

@FunctionalInterface
interface MethodReferenceForNonStaticMethod {
	void helloMethodReference();
}

public class MethodReferenceWithDoubleColonAndNonStaticMethod {

	void helloMethodReference() {
		System.out.println("From Hello Method Reference!");
	}

	public static void main(String[] args) {
		MethodReferenceWithDoubleColonAndNonStaticMethod mAndNonStaticMethod = new MethodReferenceWithDoubleColonAndNonStaticMethod();
		MethodReferenceForNonStaticMethod methodReference = mAndNonStaticMethod::helloMethodReference;
		methodReference.helloMethodReference();
	}

}
