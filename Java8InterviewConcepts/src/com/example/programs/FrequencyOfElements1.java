package com.example.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements1 {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("india", "uk", "uk", "canada", "Srilanka", "Australia");
		Map<String, Long> frequeny = countries.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequeny);
		// sorted by the key

		Map<String, Long> sortedbykey = frequeny.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(a,b) ->a,LinkedHashMap :: new
						));
		
		
		System.out.println(sortedbykey);

	}

}
