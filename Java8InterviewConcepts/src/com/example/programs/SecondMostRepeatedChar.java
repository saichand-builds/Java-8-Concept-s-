package com.example.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondMostRepeatedChar {

	public static void main(String[] args) {
		String input = "aravdsgTgRRRRseeeeeedG";
		Map<Character, Integer> freqmap = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);

		}

		List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqmap.entrySet());

		list.sort((a, b) -> b.getValue() - a.getValue());
		
		if(list.size()>=2) {
			System.out.println("2 nd most repeated charater  "  +list.get(1).getKey());
		}
		else {
			System.out.println("not enough  unquie character");
		}

	}

}
