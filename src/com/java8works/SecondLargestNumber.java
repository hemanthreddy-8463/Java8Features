package com.java8works;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// 14) Find second largest number in an integer array?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargestNumber=listOfIntegers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);

	}

}
