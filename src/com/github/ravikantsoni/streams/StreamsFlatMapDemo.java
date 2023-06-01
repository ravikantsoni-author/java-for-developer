package com.github.ravikantsoni.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFlatMapDemo {

	public static void main(String[] args) {
		List<String> javaVersion = Arrays.asList("Java 1", "Java 2", "Java 3", "Java 4", "Java 5", "Java 6", "Java 7",
				"Java 8", "Java 9");
		System.out.println(javaVersion);

		WithStreamsFlatMap(javaVersion);
	}

	private static void WithStreamsFlatMap(List<String> javaVersionList) {

		List<String> javaVersionUpperCaseList = 
				javaVersionList
				.stream()
				.flatMap(javaVersion -> 
					Stream.of(
							javaVersion.toUpperCase(), 
							javaVersion.toLowerCase(), 
							javaVersion.concat(" JFF")
							)
					)
				.collect(Collectors.toList());
		System.out.println(javaVersionUpperCaseList);
	}
}