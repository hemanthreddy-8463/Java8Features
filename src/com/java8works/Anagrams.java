package com.java8works;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

	public static void main(String[] args) {
		// Java 8 program to check if two strings are anagrams or not?
		String s1 = "RaceCar";
        String s2 = "CarRae";
        s1 = Stream.of(s1.split("")).map(s->s.toUpperCase()).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(s->s.toUpperCase()).sorted().collect(Collectors.joining());
        
        
        Boolean res=s1.equals(s2)?true:false;
        if(res) {
        	System.out.print("Anagrams");
        }else {
        	System.out.print("not a anagrams");
        }






	}

}
