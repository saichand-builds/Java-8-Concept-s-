package com.example.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FIrstNonRepetedchars {

	public static void main(String[] args) {

		String str = "aaaiddgjj";

		Map<Character, Integer> freqMap = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

		}

		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

			if (entry.getValue() == 2) {
				System.out.println("First Non Reapected value is " + entry.getKey());
				break;
			}

		}
	}

}
