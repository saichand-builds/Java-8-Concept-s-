package com.example.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Charaterscount {

	public static void main(String[] args) {

		String str = "sfygHjHBSDFSdsfbbdds";

		Map<Character, Long> charaterscount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		
		charaterscount.forEach((k,v) -> System.out.print(k +  "  ->"+ v+ " ,"));

	}

}
