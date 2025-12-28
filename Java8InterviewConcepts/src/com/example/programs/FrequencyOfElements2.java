package com.example.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements2 {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("india", "uk", "potatal", "Uk", "india", "canada", "Japan");
		Map<String, Long> frequncy = countries.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(frequncy);

		// sort by value

		Map<String, Long> sortedbyvalue = frequncy.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

		System.out.println(sortedbyvalue);

	}

}
