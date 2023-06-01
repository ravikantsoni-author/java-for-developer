package com.github.ravikantsoni.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		List<String> javaVersion = Arrays.asList("Java 1", "Java 2", "Java 3", "Java 4", "Java 5", "Java 6", "Java 7",
				"Java 8", "Java 9");
		System.out.println(javaVersion);

		upperCaseWithStreamsMap(javaVersion);
		lowerCaseWithStreamsMap(javaVersion);
	}
	
	private static void upperCaseWithStreamsMap(List<String> javaVersionList) {
		
		List<String> javaVersionUpperCaseList = 
				javaVersionList
				.stream()
				.map(javaVersion -> javaVersion.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(javaVersionUpperCaseList);
	}
	
	private static void lowerCaseWithStreamsMap(List<String> javaVersionList) {
		
		List<String> javaVersionLowerCaseList = 
				javaVersionList
				.stream()
				.map(javaVersion -> javaVersion.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(javaVersionLowerCaseList);
	}

}
