package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("India", "USA", "Canada", "India", "Uk", "UK");

		Map<String, Long> frequency = countries.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Frequency is  : " + frequency);

	}

}
