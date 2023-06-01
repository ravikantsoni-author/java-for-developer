package com.github.ravikantsoni.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndFilterDemo {

	public static void main(String[] args) {
		List<Integer> javaVersion = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		withoutStreamFitering(javaVersion);
		withStreamFitering(javaVersion);

		detailsStreamsFiltering(javaVersion);
	}

	private static void withoutStreamFitering(List<Integer> javaVersion) {
		System.out.println("without Streams Fitering");
		List<Integer> evenJavaVersion = new ArrayList<>();
		for (int i : javaVersion) {
			if (i % 2 == 0) {
				evenJavaVersion.add(i);
			}
		}
		System.out.println(evenJavaVersion);

	}

	private static void withStreamFitering(List<Integer> javaVersion) {
		System.out.println("with Streams Fitering");
		List<Integer> evenJavaVersion = javaVersion.stream().filter((i) -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(evenJavaVersion);
	}

	private static void detailsStreamsFiltering(List<Integer> javaVersion) {
		System.out.println("detail Streams Fitering");
		Stream<Integer> stream = javaVersion.stream();
		Stream<Integer> evenStream = stream.filter(i -> (i % 2 == 0));
		List<Integer> evenJavaVersion = evenStream.collect(Collectors.toList());
		System.out.println(evenJavaVersion);
	}

}
