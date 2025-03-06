package com.java8works;

import java.util.Arrays;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        listOfIntegers.stream().distinct().forEach(System.out::println);
	}

}
