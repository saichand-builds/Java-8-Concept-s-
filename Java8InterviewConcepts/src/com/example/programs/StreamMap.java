package com.example.programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		Stream.of("a,b", "c").map(s -> s.split(",")).map(Arrays::asList).forEach(System.out::println);
	}

}
