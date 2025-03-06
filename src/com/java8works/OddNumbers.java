package com.java8works;

import java.util.stream.Stream;

public class OddNumbers {

	public static void main(String[] args) {
		// odd numbers
		Stream.iterate(new int[] {1,3}, f->new int[] {f[1],f[1]+2}).limit(15).map(f->f[0]).forEach(System.out::println);
	}

}
