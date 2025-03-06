package com.java8works;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummOfAllDigits {

	public static void main(String[] args) {
//		13) Find sum of all digits of a number in Java 8?
		int number=1245;
		Integer res=Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("sum of all digits "+res);
		
		
		int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .reduce(0, Integer::sum); // Reduce operation to sum values

		System.out.println("Sum of digits: " + sum);
		
		
		int s=String.valueOf(number).chars().map(Character::getNumericValue).sum();
		System.out.println("Sum of digits: " + s);
		
	}

}
