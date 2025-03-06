package com.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {

//	2) How do you remove duplicate elements from a list using Java 8 streams?


	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().distinct().forEach(System.out::println);;

	}

}
