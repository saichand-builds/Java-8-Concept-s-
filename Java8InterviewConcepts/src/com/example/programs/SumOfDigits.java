package com.example.programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 5699;

//		int sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));

		int sum = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sum();
		
		System.out.println("Sum of digits " + sum);

	}

}
