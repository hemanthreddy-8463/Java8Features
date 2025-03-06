package com.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArrays {

	public static void main(String[] args) {
//		9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};
        List<Integer> a1=Arrays.asList(4,2,7,1);
        List<Integer> b1=Arrays.asList(8,3,9,5,1);
        
        
        int[] b = new int[] {8, 3, 9, 5};
        
        int[] c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
        
        int[] c1=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();

        System.out.println("removed duplicates "+Arrays.toString(c1));


	}

}
