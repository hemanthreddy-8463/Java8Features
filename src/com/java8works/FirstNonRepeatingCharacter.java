package com.java8works;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
//	Find first non-repeated character in a string?
        String inputString = "aava Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String, Long> data = Stream.of(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        String fristNonRepeat=data.entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).findFirst().get();
        System.out.print(fristNonRepeat);
		


	}

}
