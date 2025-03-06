package com.java8works;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAndMaxWithLimit {

	public static void main(String[] args) {
//		11) How do you get three maximum numbers and three minimum numbers from the given list of integers?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        //min three numbers
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        //max three numbers
        listOfIntegers.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);


	}

}
