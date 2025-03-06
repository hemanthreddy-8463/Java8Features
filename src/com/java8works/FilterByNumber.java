package com.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByNumber {

	public static void main(String[] args) {
//		7) From the given list of integers, print the numbers which are multiples of 5?
		List<Integer> listOfNumbers=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		listOfNumbers.stream().filter(n->n%5==0).forEach(System.out::println);

	}

}
