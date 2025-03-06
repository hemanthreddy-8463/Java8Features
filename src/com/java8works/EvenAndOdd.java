package com.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import java.util.stream.Collectors;

public class EvenAndOdd {

	
	//1) Given a list of integers, separate odd and even numbers?

	public static void main(String[] args) {
		List<Integer> listOfIntegers= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//		listOfIntegers.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
        for (Entry<Boolean, List<Integer>> entry : entrySet) 
        {
            System.out.println("--------------");
             
            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }
             
            System.out.println("--------------");
             
            List<Integer> list = entry.getValue();
             
            for (int i : list)
            {
                System.out.println(i);
            }
        }

		
	}

}
