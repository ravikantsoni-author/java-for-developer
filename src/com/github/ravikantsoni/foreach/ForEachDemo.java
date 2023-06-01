package com.github.ravikantsoni.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		withOutForEach();

		withForEach();

	}

	private static void withForEach() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("with lambda");
		list.forEach(i -> System.out.println(i));

		System.out.println("method reference");
		list.forEach(System.out::println);

	}

	private static void withOutForEach() {

		System.out.println("without foreach");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		for (int i : list) {
			System.out.println(i);
		}

	}

}
