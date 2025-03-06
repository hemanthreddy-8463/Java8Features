package com.java8works;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class MaxAndMinInList {

	public static void main(String[] args) {
//		8) Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer maxNumber = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max number in the list "+maxNumber);
        Integer minNumber = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("max number in the list "+minNumber);
        


	}

}
