package com.java8works;

import java.util.Arrays;

public class AverageOfAllNumbers {

	public static void main(String[] args) {
	//		16) Given an integer array, find sum and average of all elements?
		
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sumofNumbers=Arrays.stream(a).sum();
        System.out.println("Sum "+sumofNumbers);

        double asDouble = Arrays.stream(a).average().getAsDouble();
        System.out.print("Average "+asDouble);

	}

}
