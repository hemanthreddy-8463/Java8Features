package com.java8works;

import java.util.Arrays;
import java.util.List;

public class IsDigit {

	public static void main(String[] args) {
//		24) Given a list of strings, find out those strings which start with a number?
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(s->Character.isDigit(s.charAt(0))).forEach(System.out::println);
	}

}
