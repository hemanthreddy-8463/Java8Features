package com.java8works;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
	//4) How do you find frequency of each element in an array or a list?

	public static void main(String[] args) {
		List<String> listOfWords=Arrays.asList("hemanth","kalyan","praveen","kittu","hemanth","hemanth","kittu");
		Map<String, Long> collect = listOfWords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach((k,v)->System.out.println(k+" "+v));

	}

}
