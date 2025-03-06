package com.java8works;

import java.util.Arrays;
import java.util.List;

public class SortingWithLength {

	public static void main(String[] args) {
		// 15) Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted((s1,s2)->Integer.compare(s1.length(), s2.length())).forEach(System.out::println);
        
        //sorting of strings in ascending order
        listOfStrings.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);


	}

}
