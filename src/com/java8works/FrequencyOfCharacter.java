package com.java8works;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hello world";
		Map<Character, Long> collect = input.chars().mapToObj(c->(char)c).
				filter(c->c!=' ').
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		collect.forEach(
				(k,v)->System.out.println(k+" "+v));
	}

}
