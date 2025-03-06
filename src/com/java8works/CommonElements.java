package com.java8works;

import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
//		17) How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
        list1.stream().filter(n->list2.contains(n)).forEach(System.out::println);



	}

}
